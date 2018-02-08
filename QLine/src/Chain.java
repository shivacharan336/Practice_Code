public class Chain {
    private Pearl firstpearl;
    private Pearl lastpearl;


    public Chain() {
        firstpearl = null;
        lastpearl = null;
    }

    public boolean isEmpty() {

        return firstpearl == null;
    }

    public void enqueuePearl(Pearl p) {
        if (this.isEmpty()) {
            firstpearl = p;
            lastpearl = firstpearl;
        } else {
            lastpearl.setNextPearl(p);
            lastpearl = p;
            lastpearl.setNextPearl(firstpearl);

        }
    }
    public void dequeuePearl() {

        if (!this.isEmpty()) {

            firstpearl=firstpearl.getNextPearl();

        }


    }


    public void printAllPearls() {
        if (this.isEmpty()) {
            System.out.println("this chain is empty");

        } else {
            Pearl currentpearl = firstpearl;
            while (currentpearl != null) {
                System.out.println("currentpearl " + currentpearl.getPearlName() +
                        " nextpearl " + currentpearl.getNextPearl().getPearlName());
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

