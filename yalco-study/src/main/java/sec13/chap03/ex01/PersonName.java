package sec13.chap03.ex01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PersonName {
    String first();
    String last();
    /** 이렇게 메소드 처럼 변수를 만듦*/
}