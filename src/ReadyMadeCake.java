public class ReadyMadeCake extends Cake {
    int quantity;
    public ReadyMadeCake(String n, double r, int q){
        super(n,r);
        quantity = q;
        printDetails();
    }
    //override calcPrice and printDetails

    @Override
    public double calcPrice() {
        super.calcPrice();
        return rate*quantity;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Name: "+name);
        System.out.println("Rate: "+rate);
        System.out.println("Quantity "+quantity);
        System.out.println("Total Price: "+calcPrice());
        System.out.println();
    }
}
