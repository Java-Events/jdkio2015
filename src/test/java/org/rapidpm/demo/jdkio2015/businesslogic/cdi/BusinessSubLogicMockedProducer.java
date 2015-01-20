package org.rapidpm.demo.jdkio2015.businesslogic.cdi;

import org.rapidpm.commons.cdi.CDICommons;
import org.rapidpm.commons.cdi.ManagedInstanceCreator;
import org.rapidpm.commons.cdi.contextresolver.ContextResolver;
import org.rapidpm.demo.jdkio2015.Mocked;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class BusinessSubLogicMockedProducer {

  @Inject @CDICommons ContextResolver contextResolver;
  @Inject ManagedInstanceCreator instanceCreator;

  @Produces @Mocked
  public BusinessSubLogic create(){
    System.out.println("BusinessSubLogicMockedProducer => Production Code");
    return instanceCreator.activateCDI(new BusinessSubLogicMocked());
  }
}
