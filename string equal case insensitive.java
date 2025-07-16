import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean isequal = true;
        if(a.length()!=b.length()){
            System.out.println("not equal");
        }
        for(int i=0;i<a.length();i++){
            char c1 = Character.toLowerCase(a.charAt(i));
            char c2 = Character.toLowerCase(b.charAt(i));
            if(c1!=c2){
                isequal = false;
                break;
            }
        }
        System.out.println(isequal ?"equal":"not");
    }
}
