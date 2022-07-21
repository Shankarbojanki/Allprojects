package Practceall;
public class Calc {
   int num;
   int doubled;
   public void calcdoubled(){
       doubled=num*2;
   }
}

class doubleddemo{
    public static void main(String[] args) {
        Calc number = new Calc();

        number.num=123456789;
        number.calcdoubled();
        System.out.println(number.doubled);
    }
}

