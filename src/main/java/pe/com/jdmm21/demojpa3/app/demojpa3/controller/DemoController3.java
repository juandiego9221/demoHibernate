package pe.com.jdmm21.demojpa3.app.demojpa3.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Car;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Engine;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Room1;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Student1;
import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Teacher1;
import pe.com.jdmm21.demojpa3.app.demojpa3.util.HibernateUtil;

@RestController
public class DemoController3 {

    @GetMapping("/testHibernate1")
    public ResponseEntity<?> test1(){
        //OTO OTM
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Room1> response = session.createQuery("select r from Room1 r").getResultList();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/testHibernate2")
    public ResponseEntity<?> testOTO(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Car> response = session.createQuery("select c from Car c").getResultList();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/testHibernate3")
    public ResponseEntity<?> testOTOB(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Engine> response = session.createQuery("select e from Engine e").getResultList();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/testHibernate4")
    public ResponseEntity<?> testMTM(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Teacher1> response = session.createQuery("select e from Teacher1 e").getResultList();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/testHibernate5")
    public ResponseEntity<?> testMTMStudent(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student1> response = session.createQuery("select e from Student1 e").getResultList();
        return ResponseEntity.ok(response);
    }
    
}