package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public class PercussionSection implements Observer, PlayMeasure {
  private MeasureInformation measureInformation;

  @Override
  public void update(MeasureInformation measureInformation) {
    this.measureInformation = measureInformation;
    play();
  }

  @Override
  public void play() {
    System.out.print("Percussion section ");
    // Only drum on odd measures
    if (measureInformation !=null && (measureInformation.getMeasure() % 2 != 0 )) {
      System.out.println("drumming " + measureInformation.getDetails());
    } else {
      System.out.println("waiting...");
    }
  }
}
