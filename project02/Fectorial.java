import java.util.*;

public class Fectorial {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number for find fectorial : ");
        int num = sc.nextInt();

        // calculate fectorial of user input
        int fectorial = 1;
        for(int i = num; i>= 1; i--){
            fectorial = fectorial*i;
        }

        // final output
        System.out.println("Fectorial of "+ num +" is "+fectorial);
        sc.close();
    }
}
