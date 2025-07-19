package com.url.url_shortner_sb.dto;

import lombok.Data;

import java.time.LocalDate;

@Data

public class ClickEventDTO {
    private LocalDate clickDate;
    private Long count;
}
