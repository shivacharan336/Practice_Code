public class Doubly_PearlChain {
    public static void main(String[] args) {

        Doubly_Chain chain = new Doubly_Chain();
        Doubly_Pearl p1 = new Doubly_Pearl("aaa");
        chain.enqueuePearl(p1);
        Doubly_Pearl p2 = new Doubly_Pearl("bbb");
        chain.enqueuePearl(p2);
        Doubly_Pearl p3 = new Doubly_Pearl("ccc");
        chain.enqueuePearl(p3);
        Doubly_Pearl p4 = new Doubly_Pearl("ddd");
        chain.enqueuePearl(p4);
        Doubly_Pearl p5 = new Doubly_Pearl("eee");
        chain.enqueuePearl(p5);
        Doubly_Pearl p6 = new Doubly_Pearl("fff");
        chain.enqueuePearl(p6);
        chain.dequeuePearl();
        chain.dequeuePearl();
        chain.printAllPearls();

    }
}