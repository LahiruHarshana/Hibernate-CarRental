package lk.ijse.gdse66.configaration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;
    private SessionFactoryConfig(){
        Configuration configuration = new Configuration().configure();
        Properties properties = new Properties();
    }
}
