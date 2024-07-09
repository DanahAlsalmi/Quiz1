import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /*
        1. Write a Java program that accept three numbers from the user and print the largest number .
         */

//        System.out.print("Enter number1:");
//        int num1= input.nextInt();
//        System.out.print("Enter number2:");
//        int num2= input.nextInt();
//        System.out.print("Enter number3:");
//        int num3= input.nextInt();
//
//        if (num1>num2&&num1>num3){
//            System.out.println("The largest number is :"+num1);
//        } else if (num2>num1&&num2>num3) {
//            System.out.println("The largest number is :"+num2);
//        }else System.out.println("The largest number is :"+num3);

       /*
       2. Write a Java program that accept a String and a number from the user,then print the character in the given index .
        */

//        System.out.print("Enter a String :");
//        String str = input.nextLine();
//        System.out.print("Enter a number :");
//        int number = input.nextInt();
//
//        if (number <= str.length() - 1) {
//            System.out.println(str.charAt(number));
//        } else System.out.println("invalid number");

        /*
        3. Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
         */

//        System.out.println("Enter a number OR 0 to quit :");
//        int num = input.nextInt();
//        int sum = num;
//
//
//        do {
//            System.out.println("^");
//            num = input.nextInt();
//            sum += num;
//
//        } while (num != 0);
//        System.out.println("The result is :" + sum);

        /*

        4. Write a Java program to find positive and negative numbers of a given array:

         */

//        int[] numbers = {10, -21, 30, 31, -25};
//
//        for (int n : numbers) {
//            if (n > 0) {
//                System.out.println(" " + n + " is a positive number");
//            } else System.out.println(n + " is a negative number ");
//
//        }

        /*
        5. Write a Java program to find a shortest word of a given array:
         */

        String [] words={"Tuwaiq","Bootcamp","Student","Java"};
        String sh="";

      
        for (int i = 0; i <= words.length-1; i++) {
            if (words[i].length() < words[1].length()) {
                sh = words[i];
            }else sh=words[i+1];
        }
        System.out.println(sh);




    }
}