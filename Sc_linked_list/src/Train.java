public class Train {
    private Bhogi firstbhogi;
    private Bhogi lastbhogi;
//    public int length;

    public Train() {
        firstbhogi = null;
        lastbhogi = null;
    }

    public boolean isEmpty() {
        return firstbhogi == null;
    }

//    public int getLength() {
//       // return length;
//    }

    public void addBhogi(Bhogi b) {
        if (this.isEmpty()) {
            firstbhogi = b;
            lastbhogi = firstbhogi;
        } else {
            lastbhogi.setDoor(b);
            lastbhogi = b;

        }
    }

    public void printAllBhogis() {
        if (this.isEmpty()) {
            System.out.println("this train is empty");

        } else {
            Bhogi nextbhogi = firstbhogi;
            while (nextbhogi != null) {
                System.out.println(nextbhogi.getBNumber());
                if (nextbhogi.getDoor() != null) {
                    nextbhogi = nextbhogi.getDoor();
                } else {
                    nextbhogi = null;
                }
            }
        }
    }

  /*  public void insertAtFirstBhogi(int value){
        Bhogi bhogi=new Bhogi(value,null);
        length++;
        if (firstbhogi == null){
            firstbhogi=bhogi;
            lastbhogi=firstbhogi;

        }
        else{
            bhogi.setDoor(firstbhogi);
            firstbhogi=bhogi;
        }
    }
    public void insertAtLastBhogi(int value){
        Bhogi bhogi=new Bhogi(value,null);
        length=;
        if(firstbhogi==null){
            firstbhogi=bhogi;
            lastbhogi=firstbhogi;
        }
        else {
            lastbhogi.setDoor(bhogi);
            lastbhogi = bhogi;
            }
    }*/

}
