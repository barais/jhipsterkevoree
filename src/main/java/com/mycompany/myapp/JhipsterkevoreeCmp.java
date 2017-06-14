package com.mycompany.myapp;

import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.Start;
import org.springframework.boot.SpringApplication;

import com.mycompany.myapp.config.DefaultProfileUtil;

@ComponentType(version=1)
public class JhipsterkevoreeCmp {
    @Start
    public void start() {
        SpringApplication app = new SpringApplication(JhipsterkevoreeApp.class);
        DefaultProfileUtil.addDefaultProfile(app);
//        app.run();
    }
}
