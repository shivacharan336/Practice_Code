public class PearlChain {
    public static void main(String[] args) {

        Chain chain = new Chain();
        Pearl p1 = new Pearl("aaa");
        chain.enqueuePearl(p1);
        Pearl p2 = new Pearl("bbb");
        chain.enqueuePearl(p2);
        Pearl p3 = new Pearl("ccc");
        chain.enqueuePearl(p3);
        Pearl p4 = new Pearl("ddd");
        chain.enqueuePearl(p4);
        Pearl p5 = new Pearl("eee");
        chain.enqueuePearl(p5);
        Pearl p6 = new Pearl("fff");
        chain.enqueuePearl(p6);
        chain.dequeuePearl();
        chain.printAllPearls();

    }
}