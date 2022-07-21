package objectandclass;

public class Zooani{

}

class Lion {
    String name;
    int age;
    int joiningyear;
      public Lion(String name,int age,int joiningyear)
    {
        this.name=name;
        this.age=age;
        this.joiningyear=joiningyear;
    }
    public Lion() {}
          public String toString(){
              return("Lion name is:" + name+ ",age is:"+age+", joining year:"+joiningyear);
        }
    }
class Elephant {
    String name;
    int age;
    int joiningyear;
    public Elephant(String name,int age,int joiningyear)
    {
        this.name=name;
        this.age=age;
        this.joiningyear=joiningyear;
    }
    public Elephant() {}
    public String toString(){
        return("Elephant name is:" + name+ ",age is:"+age+", joining year:"+joiningyear);
    }
}

class Guardian {
    String name;
    int age;
    int joiningyear;
    public Guardian(String name,int age,int joiningyear)
    {
        this.name=name;
        this.age=age;
        this.joiningyear=joiningyear;
    }
    public Guardian() {}
    public String toString(){
        return("Guardian name is:" + name+ ",age is:"+age+", joining year:"+joiningyear);
    }
}
