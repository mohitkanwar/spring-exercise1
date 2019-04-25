package com.mk.spring.exercise1.main;

import com.mk.spring.exercise1.pojo.CreditCard;
import com.mk.spring.exercise1.services.ICreditCardTypeDetectorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        ICreditCardTypeDetectorService cardTypeDetectorService = applicationContext.getBean("cardDectorService",ICreditCardTypeDetectorService.class);
        CreditCard visaCard = applicationContext.getBean("VISACard", CreditCard.class);
        System.out.println(cardTypeDetectorService.getCreditCardType(visaCard).name());
        System.out.println(visaCard.getExpiryDate());
    }
}
