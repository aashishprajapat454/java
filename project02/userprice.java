import java.util.*;

public class userprice {
    public static void main(String[] args){

    // take user input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 prices");
    Double[] prices = new Double[5];

    // make sum of all prices
    Double sum = 0.00;
    for(int i = 0; i<5;i++){
        System.out.print("Enter price "+(i+1)+" item : ");
        prices[i] = sc.nextDouble();
        sum = sum+prices[i];
    }

    System.out.println("Total sum is : "+ sum);

    // find average of total prices
    Double avg = sum/5;
    System.out.println("Avarage is : " + avg);

    // print if price is gratere then average
    for(int i = 0; i<5; i++){
        if (prices[i]>avg) {
            System.out.println(prices[i]+" is greter then" + avg);
        }
    }
    sc.close();
}
}