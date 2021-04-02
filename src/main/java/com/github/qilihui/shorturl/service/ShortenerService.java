package com.github.qilihui.shorturl.service;

import com.github.qilihui.shorturl.pojo.UrlInfo;

/**
 * @author qilihui
 * @date 2021/1/21 10:01
 */
public interface ShortenerService {
    UrlInfo lookup(String key);

    UrlInfo getShortUrl(String url);
}
