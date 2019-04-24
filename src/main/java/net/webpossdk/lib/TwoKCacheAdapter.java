package net.webpossdk.lib;

import it.sdkboilerplate.cache.CacheAdapter;
import org.cache2k.Cache;
import org.cache2k.Cache2kBuilder;

public class TwoKCacheAdapter extends CacheAdapter {
    private Cache<String, String> cache;

    @Override
    public String get(String value) {
        return this.cache.get(value);
    }

    @Override
    public void set(String key, String value) {
        this.cache.put(key, value);
    }

    @Override
    public void delete(String key) {
        this.cache.remove(key);
    }

    public TwoKCacheAdapter() {
        this.cache = new Cache2kBuilder<String, String>() {
        }.build();
    }
}
