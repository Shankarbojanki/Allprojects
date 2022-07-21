package Begin.averagestock;

public class Stock {
    int Shares;
    double Price;
    double Capital;
    Stock() {

    }
    public void buy (double p,int s) {
        Shares+=s;
        Price=p;
        Capital+=s*p;
    }
    public void sell (double p,int s) {
        Shares-=s;
        Price=p;
        Capital-=s*p;
    }
    public int getShares() {
        return Shares;
    }
    public  double getPrice() {
        return Price;
    }
    public double getAveragePrice() {
        return Capital / getShares();
    }
}
