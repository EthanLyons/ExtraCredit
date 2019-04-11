package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import org.junit.jupiter.api.Test;

class TrackingInfoTest {

  @Test
  void getRecorded() {
    Date recorded = new Date();
    String details = "some details";
    TrackingInfo info = new TrackingInfo(recorded, details);
    Date test = info.getRecorded();
    assertEquals(recorded, test); // Assert that date returned by getRecorded is the same date passed in constructor.
    test.setTime(test.getTime() + 1000);
    Date actual = info.getRecorded();
    assertEquals(recorded, actual); // Assert that change to date returned by getRecorded have no effect on value returned by subsquent invocation;
  }

  @Test
  void getDetails() {
    Date recorded = new Date();
    String details = "some details";
    TrackingInfo info = new TrackingInfo(recorded, details);
    Date actual = info.getRecorded();
    assertEquals(details, actual);
  }
}