package org.rapidpm.demo.jdkio2015.businesslogic.cdi;

import org.rapidpm.demo.jdkio2015.businesslogic.Production;
import org.rapidpm.demo.jdkio2015.fxcdi.JavaOne2014;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.time.Instant;

/**
 * Created by Sven Ruppert on 04.12.13.
 */
@Production
public class BusinessLogicImpl implements BusinessLogic {

    @Inject @JavaOne2014 BusinessSubLogic subLogic;

    @PostConstruct
    public void init() {
        System.out.println("BusinessLogicImpl.PostConstruct -> " + Instant.now());
    }

    public String doSomething() {
        return "BusinessLogicImpl " + subLogic.calculate() ;
    }
}
