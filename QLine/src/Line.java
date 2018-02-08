public class Line {
    private Person firstperson;
    private Person lastperson;


    public Line() {
        firstperson = null;
        lastperson = null;
    }

    public boolean isEmpty() {
        return firstperson == null;
    }

    public void enqueuePerson(Person p) {
        if (this.isEmpty()) {
            firstperson = p;
            lastperson = firstperson;
        } else {
            lastperson.setLink(p);
            lastperson = p;

        }
    }
    public void dequeuePerson() {

        if (!this.isEmpty()) {

            firstperson=firstperson.getLink();

        }


    }


    public void printAllPersons() {
        if (this.isEmpty()) {
            System.out.println("this line is empty");

        } else {
            Person nextperson = firstperson;
            while (nextperson != null) {
                System.out.println(nextperson.getName());
                if (nextperson.getLink() != null) {
                    nextperson = nextperson.getLink();
                } else {
                    nextperson = null;
                }
            }
        }
    }

}

