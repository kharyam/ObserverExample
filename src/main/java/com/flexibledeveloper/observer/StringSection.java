package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public class StringSection implements Observer, PlayMeasure {
  private MeasureInformation measureInformation;

  @Override
  public void update(MeasureInformation measureInformation) {
    this.measureInformation = measureInformation;
    play();
  }

  @Override
  public void play() {
    System.out.print("String Section ");
    // Only play every 3 measures
    if (measureInformation !=null && (measureInformation.getMeasure() % 3 != 0 )) {
      System.out.println("strumming " + measureInformation.getDetails());
    } else {
      System.out.println("waiting...");
    }
  }
}
