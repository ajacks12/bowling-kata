public class bowling {

    // Property of current frame
    // Score for each frame
    //

    int score;
    int curRoll = 0;
    int lastNoOfPins;
    boolean spare;

    // update this as you go
    int score(){
        return score;
    }

    //called each time the player rolls a ball.
    // The argument is the number of pings knocked down
    // increment total number of throws taken
    void roll(int noOfPins){
        score = score + noOfPins;

        curRoll++;

        // Special case for spare in 10th frame
        if (curRoll==21){
            return;
        }

        if (spare) {
            score = score + noOfPins;
        }
        spare = false;

        // Check if spare
        if (curRoll%2==0){
            if (lastNoOfPins + noOfPins==10) {
                spare = true;
            }
        }



        // Check if strike
        lastNoOfPins = noOfPins;
    }


}
