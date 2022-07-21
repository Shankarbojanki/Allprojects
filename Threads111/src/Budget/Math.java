package Budget;

public class Math {
    public int add(int a,int b) {
        return a+b;
    }
    public int subtraction(int a,int b) {
        return a-b;
    }
    public int multiplication(int a,int b) {
        return  a*b;
    }
    public int division(int a,int b) {
        return a/b;
    }
}
class MathExtention extends Math {
    public int square(int a) {
        return a*a;
    }
    public int doubles(int a) {
        return a*2;
    }
}

interface ScintificStandards {
    public void caluclateAge();
}


class sciMath extends MathExtention implements  ScintificStandards {
    public void caluclateAge() {
      return ;
    }
}

