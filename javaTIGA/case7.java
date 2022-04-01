public class case7{
    public static void  main(String[] args){
        for(int i=0;i<1000;i++){
            int a=i/100;
            int b=i%100/10;
            int c=i%10;
            if(a*a*a+b*b*b+c*c*c==i);
        System.out.println("这是一个水仙花数"+i);
    }
}
}
