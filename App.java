package com.study.rest.SpringRest;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


//added Annotation to enable auto configuration feature along with other features.
@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {
    	//method to launch Spring Application
      SpringApplication.run(App.class, args);
    }
    
    
       
}
