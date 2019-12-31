package pe.com.jdmm21.demojpa3.app.demojpa3.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfiguration {

    @Bean
    org.hibernate.cfg.Configuration getconfiguration(){
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.configure("/hibernate.cfg.xml");
        return configuration;
    }

    @Bean
    SessionFactory getSessionFactory(){
        SessionFactory sessionFactory = getconfiguration().buildSessionFactory();
        return sessionFactory;
    }

    @Bean
    Session getSesssion(){
        Session session = getSessionFactory().openSession();
        return session;
    }


    
}