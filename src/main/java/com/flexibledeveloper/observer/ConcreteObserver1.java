package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public class ConcreteObserver1 implements Observer, DisplayData {
  private Object data;

  @Override
  public void update(Data data) {
    this.data = data;
    display();
  }

  @Override
  public void display() {
    System.out.println("ConcreteObserver1 " + data);
  }
}
