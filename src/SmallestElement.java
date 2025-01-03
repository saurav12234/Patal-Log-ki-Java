import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {

    public void getSmallestElement(){


        int [] smallestarr = {23,52,74,85,91,74,76,38};


        Scanner sc = new Scanner(System.in);




        System.out.println("Enter the nth smallest element you want to find, max size : " + smallestarr.length);

        int nth = sc.nextInt();

        Arrays.sort(smallestarr);

        System.out.println("sorted array");
        for (int i = 0; i <smallestarr.length ; i++) {
            System.out.print(smallestarr[i] + " ");
        }
        System.out.println();

        System.out.println(nth + " smallest element is " + smallestarr[nth-1]);

    };




}
