package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    //필드주입
    // @Autowired  private MemberService memberService;

    //setter 주입
/*    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
 */
    //생성자 주입
    @Autowired
    // 생성자 단축키 Fn + alt + insert
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
