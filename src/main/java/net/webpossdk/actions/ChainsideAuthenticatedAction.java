package net.webpossdk.actions;

import it.sdkboilerplate.exceptions.SdkException;
import it.sdkboilerplate.exceptions.SdkHttpException;
import it.sdkboilerplate.hooks.PreSendHook;
import it.sdkboilerplate.lib.ApiContext;
import it.sdkboilerplate.objects.SdkBodyType;
import net.webpossdk.api.ChainsideApiContext;
import net.webpossdk.exceptions.AccessTokenExpiredException;
import net.webpossdk.exceptions.TooManyRerunsException;
import net.webpossdk.hooks.AuthorizationHook;
import net.webpossdk.objects.ClientCredentials;
import net.webpossdk.objects.ClientCredentialsLoginResponse;

import java.util.ArrayList;

/**
 * Superclass for actions which require authorization. It declares the AuthorizationHook as a pre-send hook.
 */
public abstract class ChainsideAuthenticatedAction extends ChainsideAction {
    private Integer runs = 0;


    public ChainsideAuthenticatedAction(ApiContext ctx) {
        super(ctx);
    }


    @Override
    public ArrayList<Class<? extends PreSendHook>> getPreSendHooks() {
        ArrayList<Class<? extends PreSendHook>> preSendHooks = new ArrayList();
        preSendHooks.add(AuthorizationHook.class);
        preSendHooks.addAll(super.getPreSendHooks());
        return preSendHooks;
    }

    @Override
    public SdkBodyType run() throws SdkException {
        try {
            return super.run();
        } catch (AccessTokenExpiredException e) {
            if (this.runs > 0) throw new TooManyRerunsException();
            this.runs += 1;
            ChainsideAuthenticatedAction.login(this.getContext());
            return this.run();
        }
    }

    /**
     * Wrapping method for the authentication which performs the ClientCredentialsLogin action and caches the accessToken
     *
     * @param ctx Action api context
     * @throws SdkHttpException             If the server responds with a status code != 200
     * @throws SdkException                 If any error occurs during the serialization / deserialization of objects
     */
    public static void login(ApiContext ctx) throws SdkHttpException, SdkException {

        net.webpossdk.objects.ClientCredentials credentials = new ClientCredentials();
        credentials.setGrantType("client_credentials");
        credentials.setScope("*");

        net.webpossdk.actions.ChainsideActionFactory factory = new ChainsideActionFactory((ChainsideApiContext) ctx);
        ClientCredentialsLoginAction action = (ClientCredentialsLoginAction) factory.make("clientCredentialsLogin");
        action.setClientCredentials(credentials);
        String accessToken = ((ClientCredentialsLoginResponse) action.run()).getAccessToken();
        ctx.getCache().set(ctx.getConfig().get("accessTokenKey").toString(), accessToken);

    }
}
