package collections.Stack;

public class Stack
{
     int stack[] = new int[6];
     int top = 0;
     public void push (int data)
     {
         if(top==4){
             System.out.println("stack is full");
         }
         else {
             stack[top]= data;
             top++;
         }

     }
     public int pop(){
          int data = 0;
          if(isEmpty()){
              System.out.println("stack is empty");
          }
          else{
              top--;
              data = stack[top];
              stack[top] =0;
          }
          return data;
     }
    public int peek(){
        int data;
        data = stack[top-1];
        stack[top] =0;
        return data;
    }
    public int size(){
         return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

     public void show(){
         for(int n:stack){
             System.out.print(n+   "  ");
         }
         System.out.println();
     }
}
