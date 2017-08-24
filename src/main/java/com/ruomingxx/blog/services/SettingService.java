package com.ruomingxx.blog.services;

import java.io.Serializable;

/**
 * Created by jicheng
 * on 8/24/2017.
 */
public interface SettingService {
    Serializable get(String key);
    Serializable get(String key, Serializable defaultValue);
    void put(String key, Serializable value);
}
