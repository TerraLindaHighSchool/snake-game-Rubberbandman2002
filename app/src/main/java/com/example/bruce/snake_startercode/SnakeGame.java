package com.example.bruce.snake_startercode;

import java.util.ArrayList;
import java.util.List;

public class SnakeGame {
  private int mSpriteDim, mBOARD_WIDTH, mBOARD_HEIGHT, mScore, mLevel, mCountdown, mMillisDelay;
  private int[] mAppleCoord;
  private List <SnakeSegment> mSnake;
  private boolean mGameOver;
  private int mXMax, mYMax;


    public SnakeGame(int beginningDirection, int beginningSpriteDim, int beginningX, int beginningY, int width, int height){
      mSpriteDim = beginningSpriteDim;
      mBOARD_WIDTH = width;
      mBOARD_HEIGHT = height;
      mXMax = mBOARD_WIDTH / beginningSpriteDim;
      mYMax = mBOARD_HEIGHT / beginningSpriteDim;
      mScore = 0;
      mLevel = 1;
      mCountdown = 12;
      mMillisDelay = 400;
      mAppleCoord = new int[2];
      mSnake = new ArrayList<>();
      mSnake.add(new SnakeSegment(SnakeSegment.Body.HEAD, beginningDirection,beginningX,beginningY));
      mSnake.add(new SnakeSegment(SnakeSegment.Body.BODY, beginningDirection,beginningX-1,beginningY));
      mSnake.add(new SnakeSegment(SnakeSegment.Body.TAIL, beginningDirection,beginningX-2,beginningY));
      mGameOver = false;
    }
  
    protected void touched(float xTouched, float yTouched){

        
   }
    
    protected void eatApple(){
  
    }
    
    protected boolean play(){
        SnakeSegment.Body seg;
        int xLoc, yLoc, degrees;
        for (int i = 0; i < mSnake.size(); i++){
             seg = mSnake.get(i).getBodyParts();
             xLoc = mSnake.get(i).getXLoc();
             yLoc = mSnake.get(i).getYLoc();
             degrees = mSnake.get(i).getDegrees();
           switch (degrees){
                 case 180:
                     mSnake.get(i).setXLoc(--xLoc);
                 break;

                 case 90:
                     mSnake.get(i).setYLoc(++yLoc);
                 break;

                 case 0:
                     mSnake.get(i).setXLoc(++xLoc);
                 break;

                 case 270:
                     mSnake.get(i).setYLoc(--yLoc);
             }
             if (mSnake.get(0).getXLoc() >= mXMax || mSnake.get(0).getXLoc() <= 0 ||
                 mSnake.get(0).getYLoc() >= mYMax || mSnake.get(0).getYLoc() <= 0)
                    mGameOver = true;
        }
          return mGameOver;
    }

  // getters and Setters

    protected int getSpriteDim(){
      return mSpriteDim;
    }

    protected int getBOARD_WIDTH(){
      return mBOARD_WIDTH;
    }

    protected int getBOARD_HEIGHT(){
      return mBOARD_HEIGHT;
    }

    protected int getScore(){
      return mScore;
    }

    protected int getLevel(){
      return mLevel;
    }

    protected int getCountdown(){
      return mCountdown;
    }

    protected int getMillisDelay() {
      return mMillisDelay;
    }

    protected boolean getGameOver(){
      return mGameOver;
    }

    protected List<SnakeSegment> getSnake(){
      return mSnake;
    }

    protected int[] getAppleCoord(){
      return mAppleCoord;
    }

}









