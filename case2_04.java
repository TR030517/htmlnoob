package case2;

public class case2_04 {
    public static void main(String[] args){
        int i = 10;
        int j = 20;

        //&和&&
        //System.out.println((i++ > 100)&(j++ > 100));
        System.out.println((i++ > 100)&&(j++ > 100));
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
