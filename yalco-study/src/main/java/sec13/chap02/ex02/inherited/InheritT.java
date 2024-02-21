package sec13.chap02.ex02.inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited // ⭐ 자식클래스도 물려받게 하기
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritT { }