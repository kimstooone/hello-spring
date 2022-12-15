package hello.hellospring;

import org.springframework.context.annotation.Configuration;

//자바 코드로 직접 스프링 빈 등록하기
//상황에 따라 구현 클래스를 변경해야 하면 설저을 통해 스프링 빈으로 등록한다.
@Configuration
public class SpringConfig {
   /* @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }*/
}
