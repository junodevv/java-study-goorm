package sec13.chap03.ex01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Count {
    /** 보통 값이 하나일때는 이름을 value로 짓는다. */
    //int value(); // 기본값이 없을 때
    int value() default 1; // 💡 기본값 설정
}
