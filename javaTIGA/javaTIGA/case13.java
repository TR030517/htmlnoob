import java.util.Random;
import java.util.Scanner;

public class case13 {
    public static void  main(String[] args){
        Random r=new Random();
        int x =r.nextInt(100)+1;
        System.out.println(x);
        try (Scanner scanner = new Scanner(System.in)) {
            while(true){
                System.out.println("请输入数字:");
                int a=scanner.nextInt();
                if(a>x){
                    System.out.println("你猜的数据大了");
                }
                if(a<x){
                    System.out.println("你猜的数据小了");
                }
                if(a==x){
                    System.out.println("你猜对了");
                    break;
                }
            }
        }
        }
        }
    

