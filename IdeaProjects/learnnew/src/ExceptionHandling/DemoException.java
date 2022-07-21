package ExceptionHandling;

public class DemoException {
    public static void main(String[] args) {
        int i,j,k;

        i=8;
        j=0;


        try {
            k=i/j;
            System.out.println(k);
        }
        catch (Exception e) {
            System.out.println(" can't divided with zero............ " + e);
        }
    }
}
