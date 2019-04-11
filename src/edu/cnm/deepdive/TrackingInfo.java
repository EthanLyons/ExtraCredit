package edu.cnm.deepdive;

import java.util.Date;

public class TrackingInfo {

  private final Date recorded ;
  private final String details;

  public TrackingInfo(Date recorded, String details) {
    this.details = details;
    this.recorded = (Date) recorded.clone();
  }

  public Date getRecorded() {
    return (Date) recorded.clone();
  }

  public String getDetails() {
    return details;
  }
}
