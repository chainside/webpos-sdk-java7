package net.webpossdk.api;

import it.sdkboilerplate.exceptions.ConfigurationException;
import it.sdkboilerplate.lib.ApiContext;
import net.webpossdk.lib.CacheAdapterFactory;

import java.util.HashMap;

public class ChainsideApiContext extends ApiContext {
    public ChainsideApiContext(HashMap<String, Object> config) throws ConfigurationException {
        super(Hostnames.get(config.get("mode").toString()),
                ChainsideApiContext.fillConfig(config),
                CacheAdapterFactory.make(config.get("cacheDriver") == null ? "2k" : config.get("cacheDriver").toString()));

    }

    private static HashMap<String, Object> fillConfig(HashMap<String, Object> config) {
        if (config.get("version") == null) config.put("version", "v1");
        if (config.get("accessTokenKey") == null) config.put("accessTokenKey", "___chainside.access.token___");
        if (config.get("timeout") == null) config.put("timeout", 10);
        if (config.get("verifySSl") == null) config.put("verifySSL", true);
        if (config.get("cacheDriver") == null) config.put("cacheDriver", "2k");
        return config;
    }
}
