package com.example.blog.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) // title이라는 not null 컬럼과 매핑
    private String title;

    @Column(name = "content", nullable = false) // content라난 not null 컬럼과 매핑
    private String content;

    @Builder
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //글 수정하는 비즈니스 로직
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
