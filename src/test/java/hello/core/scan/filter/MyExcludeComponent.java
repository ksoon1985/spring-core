package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // class level μ λΆμ
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {

}
