import java.util.Scanner;

public class Person {
    private String name;
    private Person link;


    public Person(String n) {

        name = n;
    }

    public void setLink(Person l) {
        link = l;
    }

    public void setName(String n) {
        name = n;

    }

    public Person getLink() {
        return link;
    }

    public String getName() {
        return name;
    }
}