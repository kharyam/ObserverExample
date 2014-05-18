package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public class BrassSection implements Observer, PlayMeasure {
  private MeasureInformation measureInformation;

  @Override
  public void update(MeasureInformation measureInformation) {
    this.measureInformation = measureInformation;
    play();
  }

  @Override
  public void play() {
    System.out.print("Brass Section ");
    // Only play after the third measure
    if (measureInformation !=null && (measureInformation.getMeasure() > 3 )) {
      System.out.println("blowing "+ measureInformation.getDetails());
    } else {
      System.out.println("waiting...");
    }
  }
}
