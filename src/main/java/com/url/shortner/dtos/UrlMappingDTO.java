package com.url.shortner.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlMappingDTO {

    private Long id;
    private String originalUrl;
    private String shortUrls;
    private int clickCount;
    private LocalDateTime createdDate;
    private String username;

}
