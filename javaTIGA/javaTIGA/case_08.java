import java.util.Scanner;

public class case_08 {
    public static void  main(String[] args){
        int a=0;
        System.out.println("请输入等腰三角形的行数:");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        for(int i=1;i<a;i++){
            for(int j=1;j<a-i;j++);
            System.out.println("x");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.println("*");
        }

    }
    
}
