package nwo.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(4.0, 4.0);
    Assert.assertEquals(p1.distance(p2), 4.242640687119285);
  }
}
