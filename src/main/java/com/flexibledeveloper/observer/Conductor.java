package com.flexibledeveloper.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kharyam on 5/17/14.
 */
public class Conductor implements Subject {

  private List<Observer> observers = new ArrayList<Observer>();
  private MeasureInformation measureInformation;

  public MeasureInformation getMeasureInformation() {
    return measureInformation;
  }

  public void setMeasureInformation(MeasureInformation measureInformation) {
    this.measureInformation = measureInformation;
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
      observer.update(measureInformation);
    }
  }

  public void notifyObservers(MeasureInformation measureInformation){
    this.measureInformation = measureInformation;
    notifyObservers();
  }

}
