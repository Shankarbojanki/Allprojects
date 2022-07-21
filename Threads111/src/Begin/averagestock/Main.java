package Begin.averagestock;

public class Main {
    public static void main(String[] args) {
      Stock tesla =new Stock();
      tesla.buy(685.47,100);
      tesla.buy(683.23,200);
      tesla.sell(690.00,100);
      tesla.sell(691.00,100);

        System.out.println(tesla.getShares());
        System.out.println(tesla.getPrice());
        System.out.println(tesla.getAveragePrice());
    }
}
