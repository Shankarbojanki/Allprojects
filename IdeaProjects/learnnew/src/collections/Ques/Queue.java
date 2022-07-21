package collections.Ques;

public  class Queue implements Comparable<Queue> {
    int rollnumber;
    String name;
    String section;
    String favsubject;

    public Queue(int rollnumber, String name, String section, String favsubject){

        this.rollnumber= rollnumber;
        this.name= name;
        this.section= section;
        this.favsubject= favsubject;
    }

    public Queue(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int compareTo(Queue s){
        if(rollnumber>s.rollnumber){
            return 1;
        } else if (rollnumber<s.rollnumber) {
            return -1;
        }
        else {
            return 0;
        }
    }

}
