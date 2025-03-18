import java.lang.*;
public class thread{
    public static void main(String[] args){
        try{
            for(int i = 0;i<=10;i++){
                System.out.println(i+" ");
                Thread.sleep(200);
            }
        }
        catch(Exception e){
            System.out.println("code is ok" + e);
        }
    }
}