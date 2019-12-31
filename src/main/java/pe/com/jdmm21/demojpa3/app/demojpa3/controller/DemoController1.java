package pe.com.jdmm21.demojpa3.app.demojpa3.controller;

import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController1 {

    Session session;

    DemoController1(Session session) {
        this.session = session;
    }

    @GetMapping("/test1")
    private ResponseEntity<?> hibernateTest1() {
        return ResponseEntity.ok(session.createQuery("select p from Person1 p").getResultList());
    }

    @GetMapping("/test2")
    private ResponseEntity<?> hibernateTest2() {
        return ResponseEntity.ok(session.createQuery("select p from Person3 p").getResultList());
    }

}