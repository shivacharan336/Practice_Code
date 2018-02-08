public class QLine {
    public static void main(String[] args) {

        Line line = new Line();
        Person p1 = new Person("shiva");
        line.enqueuePerson(p1);
        Person p2 = new Person("hari");
        line.enqueuePerson(p2);
        Person p3 = new Person("vimal");
        line.enqueuePerson(p3);
        Person p4 = new Person("charan");
        line.enqueuePerson(p4);
        Person p5 = new Person("guru");
        line.enqueuePerson(p5);
        Person p6 = new Person("john");
        line.enqueuePerson(p6);
        line.dequeuePerson();
        line.printAllPersons();

    }
}