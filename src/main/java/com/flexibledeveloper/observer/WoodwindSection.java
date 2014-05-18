package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public class WoodwindSection implements Observer, PlayMeasure {
  private MeasureInformation measureInformation;

  @Override
  public void update(MeasureInformation measureInformation) {
    this.measureInformation = measureInformation;
    play();
  }

  @Override
  public void play() {
    System.out.print("Woodwind Section ");
    // Play every measure
    if (measureInformation != null) {
      System.out.println("puffing " + measureInformation.getDetails());
    } else {
      System.out.println("waiting...");
    }
  }
}
