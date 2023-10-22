public class Main {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[2];
        cakes[0] = new OrderCake("OrderCake",150,3);
        cakes[1] = new ReadyMadeCake("ReadymadeCake",200,2);
        for (Cake cake : cakes) {
            System.out.println(cake);
        }
    }
}