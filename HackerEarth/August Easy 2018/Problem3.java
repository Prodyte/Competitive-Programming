import java.lang.*;
import java.util.*;

class Problem3{
    public static void main(String[] args){
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        double n, p;
        for(int i=0; i<t; i++){
            n = sc.nextDouble();
            p = sc.nextDouble();
            double x = ((2*p)/(n*(n+1)));
            double check = ((n*x*(x+1)) - (2*p))/2;
            if(check >=0 && check < n){
                System.out.println(x);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}