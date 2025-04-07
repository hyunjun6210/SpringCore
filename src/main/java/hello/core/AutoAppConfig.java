package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", //탐색할 위치 하위 패키지 검색
//        basePackageClasses = AutoAppConfig.class, //AutoppConfig package는 hello.core부터러 서치
        //default는 해당 Component scan의 하위 패키지 전부
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //기존 AppConfig 제외하기 위해 filter 사용
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
