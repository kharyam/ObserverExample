package com.flexibledeveloper.observer;

import org.junit.Test;

/**
 * Created by kharyam on 5/17/14.
 */
public class ObserverTest {

  @Test
  public void nominalBehavior() {

    System.out.println("Creating Subject");
    ConcreteSubject subject = new ConcreteSubject();
    Data originalData = new Data("Original Value 1","Original Value 2","Original Value 3");
    subject.setData(originalData);

    System.out.println("Creating Observers");
    Observer observer1 = new ConcreteObserver1();
    Observer observer2 = new ConcreteObserver2();
    Observer observer3 = new ConcreteObserver3();

    System.out.println("Registering Observers");
    subject.registerObserver(observer1);
    subject.registerObserver(observer2);
    subject.registerObserver(observer3);

    System.out.println("\nNotifying observers");
    subject.notifyObservers();

    Data newData = new Data("New Value 1","New Value 2","New Value 3");

    System.out.println("\nNotifying observers with new data");
    subject.notifyObservers(newData);

    System.out.println("\nRemoving observer2");
    subject.removeObserver(observer2);

    System.out.println("\nNotifying remaining observers");
    subject.notifyObservers(newData);

  }
}
