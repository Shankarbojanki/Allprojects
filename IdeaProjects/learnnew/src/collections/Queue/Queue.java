   package collections.Queue;
        // first in first out (FIFO)
        //enque---insert
        // deque---remove
   public class Queue {
    int queue[] = new int [5];
    int size;
    int front;
    int rear;

    public boolean add (int data ){
        queue[rear] = data;
        rear = rear+1;
        size = size+1;

        return false;
    }
    public  int remove(){
        int data =queue[front];
        front = front+1;
        size--;

        return data;
    }
            public  int poll(){
                int data =queue[front];
                front = front+1;
                size--;

                return data;
            }

            public void show(){
                System.out.println("Elements  :  ");
                for (int i=0; i<size;i++){
                    System.out.print(queue[i] + "   ");
                }
                System.out.print("\n");
            }
           public void show1(){
                  System.out.println("Remaining elements  :  ");
                  for (int i=0; i<size;i++){
                  System.out.print(queue[front+i] + "   ");
        }
               System.out.print("\n");
    }
            public void show2(){
                System.out.println("After poll remaining elements  :  ");
                for (int i=0; i<size;i++){
                    System.out.print(queue[front+i] + "   ");
                }
            }

            public int getSize(){
              return size;
            }

            public boolean isEmpty(){
               return size==0;
            }
}
