package lk.ijse.gdse66.configaration;

import lk.ijse.gdse66.entity.Car;
import org.hibernate.Session;
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

        configuration.addAnnotatedClass(Car.class);
        sessionFactory = configuration.setProperties(properties).buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance() throws IOException {

        return (null== factoryConfig) ? factoryConfig = new SessionFactoryConfig() : factoryConfig;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
