package com.example.multi.module.console;

import com.example.multi.module.config.AppConfig;
import com.example.multi.module.numbergenerator.MessageGenerator;
import com.example.multi.module.numbergenerator.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private final static Logger log = LoggerFactory.getLogger(App.class);
   /* private static final String CONFIG_LOCATION = "beans.xml";*/
   public static void main(String[] args) {
       log.info("Hello Raja now it is working with logback! ");
       log.error("this is not an error this is for reference...!");

       //create context (container)
        /*ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);*/

       ConfigurableApplicationContext context
               = new AnnotationConfigApplicationContext(AppConfig.class);
       // get the number generator bean from context (container)
       NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

       // call method next() to get a random number
       int number = numberGenerator.next();

       // log generated number =
       log.info("number: {}", number);
/*        // get the game bean from context (container)
        Game game = context.getBean(Game.class);*/
       /*game.reset();*/
       MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
       log.info("getMainMessage: {}", messageGenerator.getMainMessage());
       log.info("getResultMessage: {}", messageGenerator.getResultMessage());
       // call reset method


       // close context (container)
       context.close();
   }
}
