package base.spring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
    private static final String CONFIGURATION_FILE = "applicationContext";
    private static final ClassPathXmlApplicationContext context = initContext();

    private static ClassPathXmlApplicationContext initContext() {
        return new ClassPathXmlApplicationContext(CONFIGURATION_FILE);
    }

    public static ClassPathXmlApplicationContext getContext() {
        return context;
    }
}
