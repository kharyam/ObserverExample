package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public interface Subject {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers();
}
