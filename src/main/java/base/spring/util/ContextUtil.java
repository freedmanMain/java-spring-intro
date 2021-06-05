package base.spring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
    private static final String CONFIGURATION_FILE = "applicationContext";
    private static final ClassPathXmlApplicationContext context = initContext();

    private ContextUtil() {

    }

    private static ClassPathXmlApplicationContext initContext() {
        try {
            return new ClassPathXmlApplicationContext(CONFIGURATION_FILE);
        } catch (Exception e) {
            throw new RuntimeException("Error! Can't create ClassPathXmlApplicationContext object", e);
        }
    }

    public static ClassPathXmlApplicationContext getContext() {
        return context;
    }
}
