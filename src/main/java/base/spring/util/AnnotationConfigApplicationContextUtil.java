package base.spring.util;

import base.spring.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextUtil {
    private static final AnnotationConfigApplicationContext context;

    static {
        try {
            context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        } catch (Exception e) {
            throw new RuntimeException("Error! Can't create AnnotationConfigApplicationContext object. "
                    + ApplicationConfig.class + " is not config class!", e);
        }
    }

    public static AnnotationConfigApplicationContext getContext() {
        return context;
    }
}
