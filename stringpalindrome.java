import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ispalin = true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                ispalin = false;
                break;
            }
        }
        System.out.println(ispalin?"palin":"not palin");
    }
}
