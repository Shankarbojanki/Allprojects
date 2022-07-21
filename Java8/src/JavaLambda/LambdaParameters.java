package JavaLambda;

interface Addable {
    int addition (int a,int b);
}
class AddImplements implements Addable {

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class LambdaParameters {
    public static void main(String[] args) {

//        Addable additions = (a, b) -> (a + b);
//        int result=additions.addition(18,34);
//        System.out.println(result);

        Addable abc = (int a, int b) ->{
           int c=(a+b);
           return c;
        };
        System.out.println(abc);
    }
}
