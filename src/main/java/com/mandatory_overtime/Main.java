package com.mandatory_overtime;


import com.mandatory_overtime.controller.GamePlay;
import java.io.IOException;


public class Main {

  public static void main(String[] args) throws IOException{

    GamePlay gamePlay = new GamePlay();
    gamePlay.newGame();
  }
}
