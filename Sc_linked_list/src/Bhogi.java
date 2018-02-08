import java.util.Scanner;

public class Bhogi {
    private int bnumber;
    private Bhogi door;

    public Bhogi() {
        door = null;
        bnumber = 0;
    }

    public Bhogi(int bn) {

        bnumber = bn;
    }

    public void setDoor(Bhogi d) {
        door = d;
    }

    public void setBNumber(int bn) {
        bnumber = bn;

    }

    public Bhogi getDoor() {
        return door;
    }

    public int getBNumber() {
        return bnumber;
    }
}
