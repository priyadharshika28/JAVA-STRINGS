import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(intgertoroman(num));
    }
    public static String intgertoroman(int num){
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] sysmbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder roman = new StringBuilder();
    for(int i=0;i<values.length;i++){
        while(num>=values[i]){
            roman.append(sysmbols[i]);
            num-=values[i];
        }
    }
    return roman.toString();   
}
}
