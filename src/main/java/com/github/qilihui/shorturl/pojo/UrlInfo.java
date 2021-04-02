package com.github.qilihui.shorturl.pojo;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * url_info
 * @author 
 */
@Data
public class UrlInfo implements Serializable {
    private Long id;

    private String shortKey;

    private String originalUrl;

    private static final long serialVersionUID = 1L;
}