package com.aspect.aspectExample.aspects;

public class OrderAspect {

    public void beforeActivateOrderAdvice(){
        System.out.println("==========> Executing @before advice on *ActivateOrder()");
    }

}
