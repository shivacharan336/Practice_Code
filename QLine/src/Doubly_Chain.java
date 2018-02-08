public class Doubly_Chain {
    private Doubly_Pearl firstpearl;
    private Doubly_Pearl lastpearl;


    public Doubly_Chain() {
        firstpearl = null;
        lastpearl = null;
    }

    public boolean isEmpty() {

        return firstpearl == null;
    }

    public void enqueuePearl(Doubly_Pearl p) {
        if (this.isEmpty()) {
            firstpearl = p;
            lastpearl = firstpearl;
        } else {
            lastpearl.setNextPearl(p);
            p.setPreviousPearl(lastpearl);

            lastpearl = p;
            lastpearl.setNextPearl(firstpearl);
            firstpearl.setPreviousPearl(lastpearl);

        }
    }
    public void dequeuePearl() {

        if (!this.isEmpty()) {
            Doubly_Pearl temppearl=firstpearl.getPreviousPearl();
            temppearl.setNextPearl(firstpearl.getNextPearl());
            firstpearl=firstpearl.getNextPearl();
            firstpearl.setPreviousPearl(temppearl);


        }


    }


    public void printAllPearls() {
        if (this.isEmpty()) {
            System.out.println("this chain is empty");

        } else {
            Doubly_Pearl currentpearl = firstpearl;
            while (currentpearl != null) {
                System.out.println("currentpearl " + currentpearl.getPearlName() +
                        " nextpearl " + currentpearl.getNextPearl().getPearlName()+
                        " previouspearl " + currentpearl.getPreviousPearl().getPearlName());
                if(currentpearl==lastpearl){
                    currentpearl=null;
                }
                else{
                    currentpearl = currentpearl.getNextPearl();
                }
            }
        }
    }

}

