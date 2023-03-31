package tn.agena3000.sfcs.kademproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.agena3000.sfcs.kademproject.entities.Universite;

@EnableScheduling
@SpringBootApplication
@EnableAspectJAutoProxy
public class KademProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(KademProjectApplication.class, args);
        Universite uni = Universite.builder()
                .nomUniv("Esprit")
                .build();
    }

}
