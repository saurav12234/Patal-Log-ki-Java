
// Question-Count the words in a string


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int[] arr = {11, 12, 12, 150, 3, 6, 5};

        String x = "gfh";

        Empolyees [] arrofObj = new Empolyees[50];

        Empolyees empolyees1 = new Empolyees();
        empolyees1.setName("nijush");
        empolyees1.setRollNumber(45);

        Empolyees empolyees2 = new Empolyees();
        empolyees2.setName("padu");
        empolyees2.setRollNumber(25);

        Empolyees empolyees3 = new Empolyees();
        empolyees3.setName("dki");
        empolyees3.setRollNumber(23);

        Empolyees empolyees4 = new Empolyees("sjflksjlj",34353);
//        empolyees3.setName("dki");
//        empolyees3.setRollNumber(23);

        //Empolyees empolyees4 = new Empolyees("pandu parameterized");




        arrofObj[0]= empolyees1;
        arrofObj[1]= empolyees2;
        arrofObj[2]= empolyees3;
        arrofObj[3]= empolyees4;
        arrofObj[4]= new Empolyees("emp5",5);




        System.out.println(arrofObj[0].getRollNumber());
        System.out.println(arrofObj[1].getRollNumber());
        System.out.println(arrofObj[2].getRollNumber());
        System.out.println(arrofObj[0].getName());
        System.out.println(arrofObj[1].getName());
        System.out.println(arrofObj[2].getName());
        System.out.println(arrofObj[3].getName());
        System.out.println(arrofObj[3].getRollNumber());




        Empolyees [] arrofEmployees = {new Empolyees("emp1",1), new Empolyees("emp2", 2)
        , new Empolyees("emp3",3), new Empolyees("emp4",4),new Empolyees("emp5",5)};


//        for (int i = 0; i <arrofEmployees.length ; i++) {
//            System.out.println(arrofEmployees[i].getName() + " " + arrofEmployees[i].getRollNumber());
//        }


        SortingArrays sortingArrays = new SortingArrays();

       // sortingArrays.merge();

        SmallestElement smallestElement = new SmallestElement();

//        for (int i = 0; i < 5; i++) {
//            smallestElement.getSmallestElement();
//        }

        Majority objectOfMajority = new Majority();

        objectOfMajority.getMahorityElement();











    }

    public static class Empolyees{

        String name;
        int rollNumber;

        Empolyees(){
            System.out.println("i am defgault");
        }


        Empolyees(String abc){
            System.out.println("parameterized constructor");
            System.out.println(abc);
        }

        Empolyees (String str, int i){
            this.name=str;
            this.rollNumber=i;
        }

        public String getName()
        {
           return name;
        }

        public void setName(String name){
            this.name=name;
        }

        public int getRollNumber()
        {
            return rollNumber;
        }

        public void setRollNumber(int x){
            this.rollNumber=x;
        }


    }



}