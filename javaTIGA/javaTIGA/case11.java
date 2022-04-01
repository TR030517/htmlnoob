public class case11 {
    public static void  main(String[] args){
        System.out.println("剧院可售座位票信息：");
        for(int x=1;x<=4;x++){
            for(int y=1;y<=10;y++){
                if(x==1||y==10){
                    continue;
                }
            else{
                System.out.println("第"+x+"排，第"+y+"列可售");
            }
                    
            }
        }
       }
    
}
