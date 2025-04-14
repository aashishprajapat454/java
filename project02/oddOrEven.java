import java.util.*;

public class oddOrEven {
    public static void main(String[] args) {

        // take user input 
        Scanner sc = new Scanner(System.in);
        System.out.print("Entter a number : ");
        int num = sc.nextInt();
        // chack user input odd or even
        if (num%2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
