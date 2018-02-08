import java.util.Scanner;

public class Operations {
  public static void main(String[]args){
      Train train =new Train();
      Bhogi b1=new Bhogi(1);
      train.addBhogi(b1);
      Bhogi b2=new Bhogi(2);
      train.addBhogi(b2);
      train.printAllBhogis();
  }
}
