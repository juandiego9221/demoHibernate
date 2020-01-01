package pe.com.jdmm21.demojpa3.app.demojpa3.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfiguration2 {
    @Bean
    EntityManagerFactory getEntityManagerFactory(){
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("persistencia1");
        return emf;
    }

    @Bean
    @Qualifier(value = "eManager")
    EntityManager getEntityManager(){
        EntityManager em = getEntityManagerFactory().createEntityManager();
        return em;
    }

    
}