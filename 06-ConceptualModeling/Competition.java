import java.util.Arrays;

/*14.	Competitors are judged by five judges during the competition.
Each judge can score 1, 2, 3, 4 or 5 points. 
Then, the highest score and the lowest score are thrown out. 
The arithmetic mean of the remaining three scores is calculated and this is the competitor's final result that is displayed. 
Create a class diagram for the competition scoring system. 
Define the class and write a program that calculates the final result for three players. */

public class Competition {
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;


    public Competition(int score1, int score2, int score3, int score4, int score5) {
        if (score1>0 && score1<=5){
            this.score1 = score1;
        }
        if (score2>0 && score2<=5){
            this.score2 = score2;
        }
        if (score3>0 && score3<=5){
            this.score3 = score3;
        }
        if (score4>0 && score4<=5){
            this.score4 = score4;
        }
        if (score5>0 && score5<=5){
            this.score5 = score5;
        }
    }


    public String displayResult() {
        int[] scores = {score1, score2, score3, score4, score5};

        // Sort the array to easily find the highest and lowest scores
        Arrays.sort(scores);

        // Discard the highest and lowest scores
        int sum = scores[1] + scores[2] + scores[3];

        // Calculate the final result
        double finalResult = sum / 3.0;

        return "Final Result: " + finalResult;
    }


    public int getScore1() {
        return score1;
    }


    public void setScore1(int score1) {
        this.score1 = score1;
    }


    public int getScore2() {
        return score2;
    }


    public void setScore2(int score2) {
        this.score2 = score2;
    }


    public int getScore3() {
        return score3;
    }


    public void setScore3(int score3) {
        this.score3 = score3;
    }


    public int getScore4() {
        return score4;
    }


    public void setScore4(int score4) {
        this.score4 = score4;
    }


    public int getScore5() {
        return score5;
    }


    public void setScore5(int score5) {
        this.score5 = score5;
    }

    
    
}


//tutaj poprawic constructor ale mi sie nie chce xd