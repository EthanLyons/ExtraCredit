/*
package edu.cnm.deepdive;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Shipment {

  private final Date initiation;
  private final List<TrackingInfo> tracking;

  public Shipment() {
    initiation = new Date();
    tracking = new LinkedList<>();
  }

  public Date getInitiation() {
    return (Date) initiation.clone();
  }

  public List<TrackingInfo> getTracking() {
   // return new LinkedList<>(tracking);
    return Collections.unmodifiableList(tracking);
  }

  public void addTracking(TrackingInfo, info) {
      tracking.add(info);
  }

}*/
