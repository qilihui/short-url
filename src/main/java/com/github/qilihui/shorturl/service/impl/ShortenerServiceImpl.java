package com.github.qilihui.shorturl.service.impl;

import com.github.qilihui.shorturl.dao.UrlInfoDao;
import com.github.qilihui.shorturl.pojo.UrlInfo;
import com.github.qilihui.shorturl.service.ShortenerService;
import com.github.qilihui.shorturl.utils.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qilihui
 * @date 2021/1/21 10:05
 */
@Service
public class ShortenerServiceImpl implements ShortenerService {
    UrlInfoDao urlInfoDao;

    @Autowired
    public ShortenerServiceImpl(UrlInfoDao urlInfoDao) {
        this.urlInfoDao = urlInfoDao;
    }

    @Override
    public UrlInfo lookup(String key) {
        return urlInfoDao.selectByShortKey(key);
    }

    @Override
    @Transactional
    public UrlInfo getShortUrl(String url) {
        final UrlInfo urlInfo = new UrlInfo();
        urlInfoDao.insert(urlInfo);
        final Long id = urlInfo.getId();
        final String s = UrlUtil.numToShortUrl(id);
        urlInfo.setShortKey(s);
        urlInfo.setOriginalUrl(url);
        urlInfoDao.updateByPrimaryKeySelective(urlInfo);
        return urlInfo;
    }
}
