//package CrudFilehandling;
//import java.io.*;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.util.*;
//public class Employee implements  Serializable {
//    int empno;
//    String  ename;
//    int salary;
//    Employee(int empno,String ename,int salary){
//        this.empno=empno;
//        this.ename=ename;
//        this.salary=salary;
//    }
//
//    public  String toString (){
//        return  empno+" "+ename+" " +salary;
//    }
//    }
//class Employeedemo {
//    public static void main(String[] args) throws Exception {
//        int choice = -1;
//        Scanner S = new Scanner(System.in);
//        Scanner S1 = new Scanner(System.in);
//        File file = new File("employee.txt");
//        ArrayList<Employee> e = new ArrayList<Employee>();
//        ObjectOutputStream oos = null;
//        ObjectInputStream ois = null;
//        ListIterator li = null;
//        if (file.isFile()) {
//            ois = new ObjectInputStream(new FileInputStream(file));
//            e = (ArrayList<Employee>)ois.readObject();
//            ois.close();
//        }
//        do {
//            System.out.println("1.Insert");
//            System.out.println("2.display");
//            System.out.println("3.Search");
//            System.out.println("4.delete");
//            System.out.println("0.Exit");
//            System.out.println("Enter ur choice");
//            choice=S.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter how many employees you want : ");
//                    int n = S.nextInt();
//                    for (int i = 0; i < n; i++) {
//                        System.out.println("Enter Employee no: ");
//                        int empno = S.nextInt();
//                        System.out.print("Enter Employee Name: ");
//                        String ename = S1.nextLine();
//                        System.out.print("Enter Employee Salary: ");
//                        int salary = S.nextInt();
//                        e.add(new Employee(empno, ename, salary));
//                    }
//                    oos = new ObjectOutputStream(new FileOutputStream(file));
//                    for (Employee employee: e){
//                        oos.writeObject(employee);
//                    }
//                    oos.close();
//                    break;
//                case 2:
//                    if (file.isFile()) {
//                        ois = new ObjectInputStream(new FileInputStream(file));
//                        e = (ArrayList<Employee>) ois.readObject();
//                        ois.close();
//                        System.out.println("---------------------------------------");
//                        li = e.listIterator();
//                        while (li.hasNext())
//                            System.out.println(li.next());
//                        System.out.println("---------------------------------------");
//                    } else {
//                        System.out.println("file not found");
//                    }
//                    break;
//                case 3:
//                    if (file.isFile()) {
//                        ois =new ObjectInputStream(new FileInputStream(file));
//                        e=(ArrayList<Employee>)ois.readObject();
//                        ois.close();
//                        }
//                        ois.close();
//                        boolean found = false;
//                        System.out.println("Enter employee number");
//                        int empno = S.nextInt();
//                        li = e.listIterator();
//                        while (li.hasNext()) {
//                            Employee em = (Employee) li.next();
//                            if (em.empno == empno) {
//                                System.out.println(em);
//                                found = true;
//                            }
//                        }
//                        if (!found)
//                            System.out.println("record not found");
//                    } else {
//                        System.out.println("file not exists");
//                    }
//                    break;
//                case 4:
//                    if (file.isFile()) {
//                        ois = new ObjectInputStream(new FileInputStream(file));
//                        e = (ArrayList<Employee>) ois.readObject();
//                        ois.close();
//
//                        boolean found = false;
//                        System.out.print("Enter employee number to delete");
//                        int empno = S.nextInt();
//                        li = e.listIterator();
//                        while (li.hasNext()) {
//                            Employee em = (Employee) li.next();
//                            if (em.empno == empno) {
//                                li.remove();
//                                System.out.println(em);
//                                found = true;
//                            }
//                        }
//                        if (found){
//                            oos= new ObjectOutputStream(new FileOutputStream(file));
//                            oos.writeObject(e);
//                            oos.close();
//                            System.out.println("Deleted successfully");
//                        }
//                        else {
//                            System.out.println("Deleted successfully");
//                        }
//                    }
//                    else {
//                        System.out.println("file not exists");
//                    }
//                    break;
//            }
//        } while (choice != 0) ;
//    }
//}
