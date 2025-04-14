import java.util.*;

public class userprice {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 prices");
    Double[] prices = new Double[5];
    Double sum = 0.00;
    for(int i = 0; i<5;i++){
        System.out.print("Enter price "+(i+1)+" item : ");
        prices[i] = sc.nextDouble();
        sum = sum+prices[i];
    }

    System.out.println("Total sum is : "+ sum);
    Double avg = sum/5;
    System.out.println("Avarage is : " + avg);
    for(int i = 0; i<5; i++){
        if (prices[i]>avg) {
            System.out.println(prices[i]);
        }
    }
    sc.close();
}
}