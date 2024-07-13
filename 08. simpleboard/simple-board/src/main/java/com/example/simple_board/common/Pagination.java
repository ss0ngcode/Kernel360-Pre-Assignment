package com.example.simple_board.common;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagination {

    private Integer page;               // 현재 페이지

    private Integer size;               // 사이즈

    private Integer currentElements;    // 현재 가지고 있는 Element가 몇 개

    private Integer totalPage;          // 전체 페이지 갯수

    private Long totalElements;      // 전체 Element 갯수
}
