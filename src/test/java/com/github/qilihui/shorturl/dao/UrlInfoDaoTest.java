package com.github.qilihui.shorturl.dao;

import com.github.qilihui.shorturl.pojo.UrlInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author qilihui
 * @date 2021/3/31 18:37
 */
@SpringBootTest
class UrlInfoDaoTest {

    @Autowired
    UrlInfoDao urlInfoDao;

    @Test
    void insertSelective() {
        UrlInfo urlInfo = new UrlInfo();
        urlInfo.setShortKey("c");
        urlInfo.setOriginalUrl("c");
        int i = urlInfoDao.insertSelective(urlInfo);
        System.out.println(i);
        System.out.println(urlInfo.getId());
    }
}