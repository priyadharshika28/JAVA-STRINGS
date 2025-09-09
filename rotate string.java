import java.util.*;
class Main{
    public static String leftrotate(String str,int d){
        int n = str.length();
        d=d%n;
        return str.substring(d)+str.substring(0,d);
    }
    public static String rightrotate(String str,int d){
        int n = str.length();
        d=d%n;
        return str.substring(n-d)+str.substring(0,n-d);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int d = sc.nextInt();
        System.out.println(leftrotate(str,d));
        System.out.println(rightrotate(str,d));
        
    }
}
