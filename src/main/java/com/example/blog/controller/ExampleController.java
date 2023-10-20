package com.example.blog.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller //컨트롤러라는 것을 명시적으로 표시
public class ExampleController {

    @GetMapping("/thyemleaf/example")
    public String thymeleafExample (Model model) {
        Person examplePerson = new Person();
        examplePerson.setId(1L);
        examplePerson.setName("홍길동");
        examplePerson.setAge(23);
        examplePerson.setHobbies(List.of("운동", "독서"));

        model.addAttribute("person", examplePerson);
        model.addAttribute("today", LocalDate.now());
        return "example"; // example.html 이라는 뷰 조회
    }

    @Getter
    @Setter
    static
    class Person {
        private Long id;
        private String name;
        private int age;
        private List<String> hobbies;
    }

}
