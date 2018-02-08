public class Pearl {
    private String pearlname;
    private Pearl nextpearl;


    public Pearl(String pn) {

        pearlname = pn;
    }

    public void setNextPearl(Pearl np) {
        nextpearl = np;
    }

    public void setPearlName(String pn) {
        pearlname = pn;

    }

    public Pearl getNextPearl() {
        return nextpearl;
    }

    public String getPearlName() {

        return pearlname;
    }
}
