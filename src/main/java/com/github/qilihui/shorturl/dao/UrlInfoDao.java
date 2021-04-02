package com.github.qilihui.shorturl.dao;

import com.github.qilihui.shorturl.pojo.UrlInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UrlInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(UrlInfo record);

    int insertSelective(UrlInfo record);

    UrlInfo selectByPrimaryKey(Long id);

    UrlInfo selectByShortKey(String shortKey);

    int updateByPrimaryKeySelective(UrlInfo record);

    int updateByPrimaryKey(UrlInfo record);
}