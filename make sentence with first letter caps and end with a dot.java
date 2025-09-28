import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }
        StringBuilder sentence = new StringBuilder();
        for(int i=0;i<n;i++){
            sentence.append(words[i]);
            if(i<n-1){
                sentence.append(" ");
            }
        }
        String res = sentence.toString();
        res = sentence.substring(0,1).toUpperCase()+res.substring(1);
        if(!res.endsWith(".")){
            res+=".";
        }
        System.out.print(res);
    }
}
