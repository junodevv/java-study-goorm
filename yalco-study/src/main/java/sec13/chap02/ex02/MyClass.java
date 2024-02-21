package sec13.chap02.ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;
import sec13.chap02.ex02.inherited.InheritF;
import sec13.chap02.ex02.inherited.InheritT;
import sec13.chap02.ex02.repeatable.RepeatF;
import sec13.chap02.ex02.repeatable.RepeatT;
import sec13.chap02.ex02.retention.RetClass;
import sec13.chap02.ex02.retention.RetRuntime;
import sec13.chap02.ex02.retention.RetSource;
import sec13.chap02.ex02.target.TargConstr;
import sec13.chap02.ex02.target.TargField;
import sec13.chap02.ex02.target.TargMulti;

@CustomAnnt
@InheritF // 이건 MySubClass 에선 상속 못받는다
@InheritT
public class MyClass {
    /** Retention */
    @CustomAnnt
    int field;

    @RetSource
    int retSource;

    @RetClass
    int retClass;

    @RetRuntime
    int retRuntime;

    /** Target */
    @TargConstr // 생성자위에 사용가능
    public MyClass() { }

    @TargField
    @TargMulti // 필드에도 사용가능
    //@TargConstr ⚠️ 사용 불가
    int targField;

    @TargMulti // 메소드에도 사용가능
    public void targMethod () {}

    public static void main(String[] args) throws ClassNotFoundException {

        @TargMulti // 지역변수에도 사용가능
        boolean targMulti = true;

        /** repeatable */
        @RepeatF(a = 1, b = 2)
        //@RepeatF(a = 3, b = 4) // ⚠️ 반복 불가

        @RepeatT(a = 1, b = 2)
        @RepeatT(a = 3, b = 4)
        @RepeatT(a = 5, b = 6)
        boolean repeat;

        Class<?> myClass = Class.forName("sec13.chap02.ex02.MyClass");
        for (Field f : myClass.getDeclaredFields()) {
            if (f.getAnnotations().length > 0) {
                System.out.printf(
                        "%s : %s%n",
                        f.getName(),
                        Arrays.stream(f.getAnnotations())
                                .map(Annotation::toString)
                                .collect(Collectors.joining(","))
                );
            }
        }
        System.out.println("\n- - - - -\n");

        Class<?> mySubclass = Class.forName("sec13.chap02.ex02.MySubClass");
        System.out.println(
                "MySubclass의 어노테이션 : " +
                        Arrays.stream(mySubclass
                                        .getAnnotations())
                                .map(Annotation::toString)
                                .collect(Collectors.joining(","))
        );

    }
}
