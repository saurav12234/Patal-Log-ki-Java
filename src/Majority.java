import java.util.Scanner;

public class Majority {

    public void getMahorityElement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how much size you want");
        int size = sc.nextInt();
        int expectedSum = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
                arr[i]=i+1;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length;   i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==expectedSum)
                {
                    System.out.println("Pair is " + arr[i] + " " + arr[j]);
                }

            }

        }

    }
}