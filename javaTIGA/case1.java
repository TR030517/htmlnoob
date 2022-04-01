import java.util.Scanner;
public class case1{
     public static void main(String[] args) {
         System.out.println("开始");
         Scanner sc=new Scanner(System.in);
         System.out.println("请输入一个数字（0~100）：");
         int week = sc.nextlnt();

         if(week>0&&week<59);{
            System.out.println("空气飞吻");
        }
        if(week>=60&&week<89);{
            System.out.println("一个赵彬阳");
        }
        if(week>=90&&week<100);{
            System.out.println("一个奥特曼");
        }
        if(week<=100);{
            System.out.println("迪迦");
        }
        System.out.println("结束");
     }
    }     