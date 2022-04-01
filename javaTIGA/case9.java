public class case9 {
    public static void  main(String[] args){
        int a=0;
        outer:for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                a++;
                if(i==2&&j==5){
                    break outer;
                }
                System.out.println("第"+i+"排，第"+j+"列:"+a);
            }
        }

    }
     
}
