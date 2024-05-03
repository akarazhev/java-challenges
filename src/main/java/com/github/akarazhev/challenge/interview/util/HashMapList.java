package com.github.akarazhev.challenge.interview.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class HashMapList<T, E> {
    private final HashMap<T, ArrayList<E>> map = new HashMap<>();

    /**
     * Insert item into list at key.
     */
    public void put(final T key, final E item) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(item);
    }

    /**
     * Insert list of items at key.
     */
    public void put(final T key, final ArrayList<E> items) {
        map.put(key, items);
    }

    /**
     * Get list of items at key.
     */
    public ArrayList<E> get(final T key) {
        return map.get(key);
    }

    /**
     * Check if hashmap list contains key.
     */
    public boolean containsKey(final T key) {
        return map.containsKey(key);
    }

    /**
     * Check if list at key contains value.
     */
    public boolean containsKeyValue(final T key, final E value) {
        final ArrayList<E> list = get(key);
        if (list == null) {
            return false;
        }

        return list.contains(value);
    }

    /**
     * Get the list of keys.
     */
    public Set<T> keySet() {
        return map.keySet();
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
