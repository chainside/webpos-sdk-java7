package net.webpossdk.hooks;

import it.sdkboilerplate.hooks.PreSendHook;
import it.sdkboilerplate.http.Headers;
import it.sdkboilerplate.http.SdkRequest;
import it.sdkboilerplate.lib.ApiContext;

public class AuthorizationHook extends PreSendHook {
    public AuthorizationHook(ApiContext ctx, SdkRequest sdkRequest) {
        super(ctx, sdkRequest);
    }

    public void run() {
        String accessToken = this.ctx.getCache().get(this.ctx.getConfig().get("accessTokenKey").toString());
        this.sdkRequest.setHeader(Headers.AUTHORIZATION, "Bearer " + accessToken);
    }

}
