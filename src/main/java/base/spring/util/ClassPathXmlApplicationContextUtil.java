package base.spring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextUtil {
    private static final String CONFIGURATION_FILE = "applicationContext";
    private static final ClassPathXmlApplicationContext context = initContext();

    private ClassPathXmlApplicationContextUtil() {

    }

    private static ClassPathXmlApplicationContext initContext() {
        try {
            return new ClassPathXmlApplicationContext(CONFIGURATION_FILE);
        } catch (Exception e) {
            throw new RuntimeException("Error! Can't create ClassPathXmlApplicationContext object. "
                    + "Wrong applicationContext file path=" + CONFIGURATION_FILE, e);
        }
    }

    public static ClassPathXmlApplicationContext getContext() {
        return context;
    }
}
