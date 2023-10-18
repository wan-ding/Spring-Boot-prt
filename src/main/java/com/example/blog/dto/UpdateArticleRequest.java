package com.example.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 값을 받는 내용
@Getter
public class UpdateArticleRequest {
    private String title;
    private String content;
}
