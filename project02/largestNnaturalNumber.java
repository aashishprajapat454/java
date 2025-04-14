import java.util.*;

public class largestNnaturalNumber {
    public static void main(String[] args) {
        
        // Veriable declareation
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int number = sc.nextInt();
        int[] numArray = new int[number];
        System.out.println("Enter " + number + " Numbers");
        int maxNum = numArray[0];
        // for user input
        for (int i = 0; i < number; i++) {
            numArray[i] = sc.nextInt();
            
        }

        // chack largest number and store in a veriabel
        for(int i = 1; i< number;i++){
            if(numArray[i]>maxNum){
                maxNum = numArray[i];
            }
        }
        sc.close();
        // final output is here
        System.out.println("The largest number is : " + maxNum);
    }
}