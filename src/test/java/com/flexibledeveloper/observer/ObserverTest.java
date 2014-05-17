package com.flexibledeveloper.observer;

import org.junit.Test;

/**
 * Created by kharyam on 5/17/14.
 */
public class ObserverTest {

  @Test
  public void nominalBehavior() {
    ConcreteSubject subject = new ConcreteSubject();
    Data originalData = new Data("Original Value 1","Original Value 2","Original Value 3");
    subject.setData(originalData);

    Observer observer1 = new ConcreteObserver1();
    Observer observer2 = new ConcreteObserver2();
    Observer observer3 = new ConcreteObserver3();

    subject.registerObserver(observer1);
    subject.registerObserver(observer2);
    subject.registerObserver(observer3);

    subject.notifyObservers();


    Data newData = new Data("New Value 1","New Value 2","New Value 3");

    subject.notifyObservers(newData);

  }
}
