import java.util.Scanner;

public class case_04 {
    public static void  main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("请输入一个数:");
        int a=x.nextLine();
        if(a%2==0){
            System.out.println("这是偶数");
        }
        else{
            System.out.println("这是奇数");
        }
    }
    
}
