package com.github.qilihui.shorturl.controller;

import com.github.qilihui.shorturl.pojo.UrlInfo;
import com.github.qilihui.shorturl.service.ShortenerService;
import com.github.qilihui.shorturl.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author qilihui
 * @date 2021/1/21 9:47
 */
@Controller
@Slf4j
public class ApiController {
    ShortenerService shortenerService;

    @Autowired
    public ApiController(ShortenerService shortenerService) {
        this.shortenerService = shortenerService;
    }

    @GetMapping("/{key}")
    public String lookup(@PathVariable String key) {
        UrlInfo urlInfo = shortenerService.lookup(key);
        if (null == urlInfo) {
            return "404";
        }
        String originalUrl = urlInfo.getOriginalUrl();
        log.info("key: {}, original_url: {}", key, originalUrl);
        return "redirect:" + originalUrl;
    }

    @GetMapping("/getShortUrl")
    @ResponseBody
    public ResultUtil getShortUrl(@RequestParam String url) {
        log.info(url);
        final UrlInfo urlInfo = shortenerService.getShortUrl(url);
        return ResultUtil.ok(urlInfo);
    }
}
