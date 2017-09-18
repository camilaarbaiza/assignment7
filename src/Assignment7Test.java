import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment7Test {
    @org.junit.Test
    public void assignGrades() throws Exception {

        double[] scores = {14.3, 45.9, 67.0};
        double bestScore = 67.0;
        char expected = 'F';

        Assert.assertEquals(expected,Assignment7.assignGrades(scores[0],bestScore));

    }

}