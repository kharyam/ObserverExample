package com.flexibledeveloper.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kharyam on 5/17/14.
 */
public class ConcreteSubject implements Subject {

  private List<Observer> observers = new ArrayList<Observer>();
  private Data data;

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(data);
    }
  }

  public void notifyObservers(Data data){
    this.data = data;
    notifyObservers();
  }

}
