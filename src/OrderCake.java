class OrderCake extends Cake {
    double weight;
    public OrderCake(String n, double r, double w){
        super(n,r);
        weight = w;
        printDetails();
    }
    //override calcPrice  and printDetails

    @Override
    public double calcPrice() {
        super.calcPrice();
        return rate*weight;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Name: "+name);
        System.out.println("Rate: "+rate);
        System.out.println("Weight "+weight);
        System.out.println("Total Price: "+calcPrice());
        System.out.println();
    }
}
