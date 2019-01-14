package com.example.bruce.snake_startercode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeSegmentTest {
SnakeSegment s;
   @Before
   public void setup(){
       SnakeSegment head = new SnakeSegment(SnakeSegment.Body.HEAD, 0, 0, 0);
   }

    @Test
    public void getBodyParts() {
        SnakeSegment.Body actualValue;
        SnakeSegment.Body expectedValue[] = {SnakeSegment.Body.HEAD, SnakeSegment.Body.BODY, SnakeSegment.Body.TAIL};
        for (int i = 0; i < 3; i++) {
            s = new SnakeSegment(SnakeSegment.Body.values()[i], 0, 0, 0);
            actualValue = s.getBodyParts();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getDegrees() {
       int[] expectedValue = {0, 90, 180, 270};
       int actualValue = -1;
        for (int i = 0; i < 4; i++) {
            s = new SnakeSegment(SnakeSegment.Body.HEAD, expectedValue[i], 0, 0);
            actualValue = s.getDegrees();
            assertTrue(actualValue == expectedValue[i]);

        }
   }

    @Test
    public void setDegrees() {
        s = new SnakeSegment(SnakeSegment.Body.HEAD, -1, 0, 0);
        int[] expectedValue = {0, 90, 180, 270};
        for(int i = 0; i < 4; i++) {
            s.setDegrees(expectedValue[i]);
            int actualValue = s.getDegrees();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getXLoc() {
        s = new SnakeSegment(SnakeSegment.Body.HEAD, -1, 0, 0);
        int[] expectedValue = {1,2,3};
        for(int i = 0; i < 3; i++){
            s.setXLoc(expectedValue[i]);
            int actualValue = s.getXLoc();
            assertTrue(actualValue == expectedValue[i]);
        }
   }

    @Test
    public void setxLoc() {
        s = new SnakeSegment(SnakeSegment.Body.HEAD, -1, 0, 0);
        int[] expectedValue = {1, 2, 3};
        for(int i = 0; i < 3; i++) {
            s.setXLoc(expectedValue[i]);
            int actualValue = s.getXLoc();
            assertTrue(actualValue == expectedValue[i]);
        }
    }

    @Test
    public void getYLoc() {
        s = new SnakeSegment(SnakeSegment.Body.HEAD, -1, 0, 0);
        int[] expectedValue = {1,2,3};
        for(int i = 0; i < 3; i++) {
            s.setYLoc(expectedValue[i]);
            int actualValue = s.getYLoc();
            assertTrue(actualValue == expectedValue[i]);
        }

    }

    @Test
    public void setYLoc() {
        s = new SnakeSegment(SnakeSegment.Body.HEAD, -1, 0, 0);
        int[] expectedValue = {1, 2, 3};
        for(int i = 0; i < 3; i++) {
            s.setYLoc(expectedValue[i]);
            int actualValue = s.getYLoc();
            assertTrue(actualValue == expectedValue[i]);
        }
    }
}