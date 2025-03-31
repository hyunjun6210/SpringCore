package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", //탐색할 위치 하위 패키지 검색
//        basePackageClasses = AutoAppConfig.class, //AutoppConfig package는 hello.core부터러 서치
        //default는 해당 Component scan의 하위 패키지 전부
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //기존 AppConfig 제외하기 위해 filter 사용
public class AutoAppConfig {



}
