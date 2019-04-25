package com.mk.spring.exercise1.services;

import com.mk.spring.exercise1.pojo.CreditCard;
import com.mk.spring.exercise1.pojo.CreditCardType;

public interface ICreditCardTypeDetectorService {
    CreditCardType getCreditCardType(CreditCard card);
}
