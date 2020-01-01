package pe.com.jdmm21.demojpa3.app.demojpa3.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController2 {
    @Qualifier(value = "eManager")
    @Autowired
    EntityManager entityManager;

    @GetMapping("/jpa1")
    private ResponseEntity<?> jpaTest1() {
        return ResponseEntity.ok(entityManager.createQuery("select p from persona1 p").getResultList());
    }

    
}