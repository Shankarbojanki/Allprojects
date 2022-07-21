package Practceall;

public class Practice {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=a+b;
        System.out.println(c);

       //widening
        int x=10;
        float f=x;
        System.out.println("widening");
        System.out.println(x);
        System.out.println(f);

        //short
        float r= 10.5F;
        int y=(int)r;
        System.out.println("short : 10.5 ");
        System.out.println(y);

        //overflow
        int z=130;
        byte z1=(byte)z;
        System.out.println("overflow");
        System.out.println(z);
        System.out.println(z1);

        //adding lower type
        byte x1=10;
        byte x2=20;

        byte x3=(byte) (x1+x2);
        System.out.println("lower type");
        System.out.println(x3);


        float f2=10.1111111111f;
        double d2=10.11111111111111111;
        double d3= 7;

        System.out.println(f2+"--"+d2+" "+d3);


        int m=12;
        int n=15;

        int min=(m<n)?m:n;
        int max=(m>n)?m:n;

        System.out.println("ternary:  " +min+"   max:" +max);

    }
}
