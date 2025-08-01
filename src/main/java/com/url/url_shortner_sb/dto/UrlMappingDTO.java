package com.url.url_shortner_sb.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlMappingDTO {

    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdDate;
    private String username;
}
