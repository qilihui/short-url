package com.github.qilihui.shorturl;

import com.github.qilihui.shorturl.pojo.UrlInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootTest
class ShortUrlApplicationTests {

    @Test
    void contextLoads() {
        int j = 1, k;
        k = j + (++j) + (++j);
        System.out.println(k);


        List<UrlInfo> list  = new ArrayList<>();
        list.sort(Comparator.comparing(UrlInfo::getId));
    }

}
