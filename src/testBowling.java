
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class testBowling {
    @Test
    void TestThrowFour(){
        bowling bowl = new bowling();
        bowl.roll(4);
        assertEquals(bowl.score(),4);

    }

    @Test
    void TestThrowFive(){
        bowling bowl = new bowling();
        bowl.roll(5);
        assertEquals(bowl.score(),5);

    }

    @Test
    void TestThrowTwice(){
        bowling bowl = new bowling();
        bowl.roll(5);
        bowl.roll(4);
        assertEquals(bowl.score(),9);
    }

    @Test
    void TestTomGame(){
        bowling bowl = new bowling();
        for (int i=1;i<=20;i++){
            bowl.roll(3);
        }
        assertEquals(bowl.score(),60);
    }

    @Test
    void TestBowlASpare(){
        bowling bowl = new bowling();
        bowl.roll(9);
        bowl.roll(1);
        bowl.roll(4);
        assertEquals(bowl.score(),18);
    }

    @Test
    void TestBowlTwoSpares(){
        bowling bowl = new bowling();
        // Frame 1 - spare
        bowl.roll(9);
        bowl.roll(1); //10
        // Frame 2 - spare
        bowl.roll(4); //18
        bowl.roll(6); //24  (30)
        // Frame 3
        bowl.roll(5); //34

        assertEquals(bowl.score(),34);
    }

    @Test
    void TestBowlThreeSpares(){
        bowling bowl = new bowling();
        // Frame 1 - spare
        bowl.roll(9);
        bowl.roll(1); //10
        // Frame 2 - spare
        bowl.roll(4); //18
        bowl.roll(6); //24
        // Frame 3
        bowl.roll(5); //34
        bowl.roll(5); //39
        // Frame 4
        bowl.roll(5); //49


        assertEquals(bowl.score(),49);
    }

    @Test
    void TestMichaelGame(){
        bowling bowl = new bowling();
        for (int i=1;i<=21;i++){
            bowl.roll(5);
        }

        assertEquals(bowl.score(),150);
    }

}
