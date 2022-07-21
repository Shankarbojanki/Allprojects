package collections.Stack;

public class Runner1 {

    public static void main (String[] args) {

        DStack nums= new DStack();

        nums.push(16);
        nums.show();
        nums.push(89);
        nums.show();
        nums.push(16);
        nums.show();
        //dynamic array
        nums.push(89);
        nums.show();
        nums.push(16);
        nums.show();

        nums.pop();
        nums.show();


      System.out.println("size of the DStack--->" +nums.size());

        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());



        System.out.println("find----->"+nums.peek());
        System.out.println("deleted values---->" +nums.pop());
        System.out.println("size of the stack--->" +nums.size());
        System.out.println("Empty  "+nums.isEmpty());
        nums.show();

    }
}
