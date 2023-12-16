package com.example.multi.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private final static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        log.info("Hello Raja now it is working with logback! ");
        log.error("this is not an error this is for reference...!");
    }
}
