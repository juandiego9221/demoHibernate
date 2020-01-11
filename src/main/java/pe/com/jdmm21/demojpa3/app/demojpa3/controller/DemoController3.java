package pe.com.jdmm21.demojpa3.app.demojpa3.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.jdmm21.demojpa3.app.demojpa3.model3.Room1;
import pe.com.jdmm21.demojpa3.app.demojpa3.util.HibernateUtil;

@RestController
public class DemoController3 {

    @GetMapping("/testHibernate1")
    public ResponseEntity<?> test1(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Room1> response = session.createQuery("select r from Room1 r").getResultList();
        return ResponseEntity.ok(response);
    }
    
}