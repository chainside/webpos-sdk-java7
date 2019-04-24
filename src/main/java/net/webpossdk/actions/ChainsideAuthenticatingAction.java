package net.webpossdk.actions;

import it.sdkboilerplate.hooks.PreSendHook;
import it.sdkboilerplate.lib.ApiContext;
import net.webpossdk.hooks.AuthenticationHook;

import java.util.ArrayList;

/**
 * SuperClass for actions which provide authentication. It defines the AuthenticationHook as a pre-send hook
 */
public abstract class ChainsideAuthenticatingAction extends ChainsideAction {
    public ChainsideAuthenticatingAction(ApiContext ctx) {
        super(ctx);
    }

    public ArrayList<Class<? extends PreSendHook>> getPreSendHooks() {
        ArrayList<Class<? extends PreSendHook>> preSendHooks = new ArrayList();
        preSendHooks.add(AuthenticationHook.class);
        preSendHooks.addAll(super.getPreSendHooks());
        return preSendHooks;
    }
}

/*

 */

