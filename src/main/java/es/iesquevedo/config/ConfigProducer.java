package es.iesquevedo.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import java.util.Scanner;

@ApplicationScoped
public class ConfigProducer {
@Produces
    public Scanner produceScanner(){
        return new Scanner(System.in);
    }

}
