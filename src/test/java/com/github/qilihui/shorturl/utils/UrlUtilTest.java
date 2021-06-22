package com.github.qilihui.shorturl.utils;

import cn.hutool.core.util.RandomUtil;
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
//        System.out.println(UrlUtil.insertRandomBitPer5Bits(70));
        System.out.println(insertRandomBitPer5Bits(System.currentTimeMillis()));
//        System.out.println(UrlUtil.toBase62(Long.MAX_VALUE));
    }

    @Test
    void numToShortUrl() {
        System.out.println(UrlUtil.numToShortUrl(5));
    }

    @Test
    void test1(){
        int pos = 0;
        System.out.println(-1L>>>(64-5));
        System.out.println(-0x1);
    }

    private static long insertRandomBitPer5Bits(long val) {
        long result = val;
        long high = val;
        for (int i = 0; i < 10; i++) {
            if (high == 0) {
                break;
            }
            int pos = 5 + 5 * i + i;
            high = result >> pos;
            result = ((high << 1 | RandomUtil.randomInt(0, 2)) << pos)
                    | (result & (-1L >>> (64 - pos)));
        }
        return result;
    }
}