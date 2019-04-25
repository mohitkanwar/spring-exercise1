package com.mk.spring.exercise1.services;

import com.mk.spring.exercise1.pojo.CreditCard;
import com.mk.spring.exercise1.pojo.CreditCardType;

import static com.mk.spring.exercise1.pojo.CreditCardType.UNKNOWN;

public class CreditCardTypeDetector implements ICreditCardTypeDetectorService {
    public CreditCardType getCreditCardType(CreditCard card) {
        for (CreditCardType cardType : CreditCardType.values()) {
            if (null == cardType.getPattern()) continue;
            if (cardType.getPattern().matcher(String.valueOf(card.getNumber())).matches()) return cardType;
        }

        return UNKNOWN;

    }
}
