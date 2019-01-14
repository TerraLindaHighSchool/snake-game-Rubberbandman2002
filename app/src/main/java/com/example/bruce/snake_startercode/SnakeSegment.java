package com.example.bruce.snake_startercode;

public class SnakeSegment {
    private Body mBodyParts;
    private int mDegrees;
    private int mxLoc;
    private int myLoc;

    /*****************************************************
     * Enum
     ****************************************************/
    protected enum Body{
        HEAD, BODY, TAIL
    }

    public SnakeSegment(Body bodyParts, int degrees, int xLoc, int yLoc){
        mBodyParts = bodyParts;
        mDegrees = degrees;
        mxLoc = xLoc;
        myLoc = yLoc;
    }

    /******************************************************
     *Getters and Setters
     ******************************************************/
    public Body getBodyParts(){
        return mBodyParts;
    }

    public int getDegrees(){
        return mDegrees;
    }

    public void setDegrees(int degrees){
        mDegrees = degrees;
    }

    public int getXLoc(){
        return mxLoc;
    }

    public  void setXLoc(int xLoc){
        mxLoc = xLoc;
    }

    public int getYLoc(){
        return myLoc;
    }

    public void setYLoc(int yLoc){
        myLoc = yLoc;
    }
}
