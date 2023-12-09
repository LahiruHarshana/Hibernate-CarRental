package lk.ijse.gdse66.configaration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;
    private SessionFactoryConfig() throws IOException {
        Configuration configuration = new Configuration().configure();
        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));

        configuration.addAnnotatedClass();
    }
}
