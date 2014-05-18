package com.flexibledeveloper.observer;

/**
 * Created by kharyam on 5/17/14.
 */
public class MeasureInformation {
  private int measure;
  private String details;

  public MeasureInformation(int measure, String details) {
    this.measure = measure;
    this.details = details;
  }

  public int getMeasure() {
    return measure;
  }

  public void setMeasure(int measure) {
    this.measure = measure;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

}
