package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    // 생성자 단축키 Fn + alt + insert
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
