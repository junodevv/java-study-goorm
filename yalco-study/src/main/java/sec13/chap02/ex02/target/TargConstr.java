package sec13.chap02.ex02.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@TargAnnot // ⭐️ => @Target(ElementType.ANNOTATION_TYPE) 라서 가능!
@Target(ElementType.CONSTRUCTOR)
public @interface TargConstr {
}