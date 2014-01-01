package JourneyThroughAvslor.Engine;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import JourneyThroughAvslor.Engine.*;

@RunWith(JUnit4.class)
public class UtilityTests {

    @Test
    public void testJunit() {
    }

    @Test
    public void testAttackDamage() {
        org.junit.Assert.assertEquals(4.0, Utility.getAttackDamage(2.0, 2.0),0.0);
    }
}
