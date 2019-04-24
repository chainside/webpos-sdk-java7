package net.webpossdk.lib;

import it.sdkboilerplate.cache.CacheAdapter;

public class CacheAdapterFactory {
    public static CacheAdapter make(String type) {
        return new TwoKCacheAdapter();
    }
}
