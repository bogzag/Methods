package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 1000, 8, 200);
        System.out.println("your final score is" + highScore);
        calculateScore(true, 800, 5, 10);



        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("da",highScorePosition);

        highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition=calculateHighScorePosition(300);
        displayHighScorePosition("Theo",highScorePosition);

        highScorePosition=calculateHighScorePosition(4500);
        displayHighScorePosition("Bogza",highScorePosition);

    }



    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println( playerName +  " manage to get into position" + highScorePosition + " on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        //     if (playerScore >=1000) {
        //          return 1;
        //      } else if (playerScore >= 500) {
        //          return 2;
        //      }   else if(playerScore >= 100 ){
        //          return 3;
        //      }
        //     return 4;
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
    public static int calculateScore(boolean gameOver, int score, int level, int bonus) {


        if (gameOver) {
            int finalscore = score + (level * bonus);
            System.out.println("your final score is:" + finalscore);
            return finalscore;
        }
        return -1;

    }


}
