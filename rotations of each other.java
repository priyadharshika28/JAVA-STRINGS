import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("not rotations");
        }
        else{
            String temp = s1+s1;
            if(temp.contains(s2)){
                System.out.println("rotations");
            }
            else{
                System.out.println("not rotations");
            }
        }
    }
}
