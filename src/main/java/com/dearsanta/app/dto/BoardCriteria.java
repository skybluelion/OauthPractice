package com.dearsanta.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class BoardCriteria {
    private String selectId;
    private String keyword;
    private int pageNum;
    private int pageSize;
    private String sorted;
}