package pe.com.jdmm21.demojpa3.app.demojpa3.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Car;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Engine;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Ocuppant1;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Room1;

public class HibernateUtil {
    private final static Logger logger = LoggerFactory.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure("/hibernate.cfg.xml")
                    .addAnnotatedClass(Room1.class).addAnnotatedClass(Ocuppant1.class).addAnnotatedClass(Car.class).addAnnotatedClass(Engine.class);
            return configuration.buildSessionFactory();
        } catch (Throwable e) {
            logger.info("Error: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}