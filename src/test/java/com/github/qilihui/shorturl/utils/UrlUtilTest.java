package com.github.qilihui.shorturl.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author qilihui
 * @date 2021/1/21 13:13
 */
class UrlUtilTest {

    @Test
    void toBase62() {
        System.out.println(UrlUtil.toBase62(61));
    }

    @Test
    void toBase10() {
        System.out.println(UrlUtil.toBase10("z"));
    }

    @Test
    void insertRandomBitPer5Bits() {
        System.out.println(UrlUtil.insertRandomBitPer5Bits(60));
        System.out.println(UrlUtil.toBase62(UrlUtil.insertRandomBitPer5Bits(System.currentTimeMillis())));
    }

    @Test
    void numToShortUrl() {
        System.out.println(UrlUtil.numToShortUrl(5));
    }
}