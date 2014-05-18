package com.flexibledeveloper.observer;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kharyam on 5/17/14.
 */
public class ObserverTest {
  @Test
  public void nominalBehavior() throws InterruptedException {

    System.out.println("Creating conductor (subject)");
    Conductor subject = new Conductor();

    System.out.println("Creating orchestra sections (observers)");
    Observer stringSection = new StringSection();
    Observer woodwindSection = new WoodwindSection();
    Observer percussionSection = new PercussionSection();
    Observer brassSection = new BrassSection();

    System.out.println("Conductor is getting the attention of the orchestra (Registering Observers)");
    subject.registerObserver(stringSection);
    subject.registerObserver(woodwindSection);
    subject.registerObserver(percussionSection);
    subject.registerObserver(brassSection);



    List<MeasureInformation> playList = new ArrayList<MeasureInformation>();
    playList.add(new MeasureInformation(1,"softly"));
    playList.add(new MeasureInformation(2,"softly"));
    playList.add(new MeasureInformation(3,"normally"));
    playList.add(new MeasureInformation(4,"normally"));
    playList.add(new MeasureInformation(5,"normally"));
    playList.add(new MeasureInformation(6,"loudly"));
    playList.add(new MeasureInformation(7,"loudly"));
    playList.add(new MeasureInformation(8,"fadingly"));

    System.out.println("\nPlaying piece (notifying observers)");
    for (int currentMeasure=0 ; currentMeasure < playList.size() ; currentMeasure++) {
      System.out.println("\nConductor signalling measure " + playList.get(currentMeasure).getMeasure());
      subject.notifyObservers(playList.get(currentMeasure));
      Thread.sleep(500);
    }


    System.out.println("\nWoodwinds sit out this time and play twice as fast(unregister observer)");
    subject.removeObserver(woodwindSection);
    System.out.println("\nPlaying piece again (notifying observers)");
    for (int currentMeasure=0 ; currentMeasure < playList.size() ; currentMeasure++) {
      System.out.println("\nConductor signalling measure " + playList.get(currentMeasure).getMeasure());
      subject.notifyObservers(playList.get(currentMeasure));
      Thread.sleep(250);
    }

  }
}
