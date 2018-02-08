public class Doubly_Pearl {
    private String pearlname;
    private Doubly_Pearl nextpearl;
    private Doubly_Pearl previouspearl;


    public Doubly_Pearl(String pn) {

        pearlname = pn;
    }

    public void setNextPearl(Doubly_Pearl np) {
        nextpearl = np;
    }
    public void setPreviousPearl(Doubly_Pearl pp) {
        previouspearl = pp;
    }

    public void setPearlName(String pn) {
        pearlname = pn;

    }

    public Doubly_Pearl getNextPearl() {
        return nextpearl;
    }

    public Doubly_Pearl getPreviousPearl() {
        return previouspearl;
    }

    public String getPearlName() {

        return pearlname;
    }
}
