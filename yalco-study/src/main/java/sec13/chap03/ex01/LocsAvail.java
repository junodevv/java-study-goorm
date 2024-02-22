package sec13.chap03.ex01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface LocsAvail {
    /** 배열을 받는 어노테이션*/
    String[] visit();
    String[] delivery();
    String[] quick();
}