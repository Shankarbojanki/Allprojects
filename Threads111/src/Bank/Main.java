package Bank;

public class Main {
    public static void main(String[] args) {


        Account shankar=new Account("62253582840","Shankar Bojanki","Shankar2233@gmail.com","1234567890",0);

        shankar.DepositMoney(100);
        shankar.DepositMoney(200);

        shankar.WithdrawlMoney(300);
    }
}
