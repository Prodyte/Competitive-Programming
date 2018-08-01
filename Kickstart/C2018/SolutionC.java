package C2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionC {
    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long t = in.nextLong();
        for(long i=0; i<t; i++){
            long n = in.nextLong();
            long k = in.nextLong();
            long x1 = in.nextLong();
            long y1 = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            long e1 = in.nextLong();
            long e2 = in.nextLong();
            long f = in.nextLong();
            ArrayList<Long> xList = new ArrayList<>();
            ArrayList<Long> yList = new ArrayList<>();
            xList.add(x1);
            yList.add(y1);
            for(int j=1; j<n; j++){
                xList.add((c*xList.get(j-1) + d*yList.get(j-1) + e1)%f);
                yList.add((d*xList.get(j-1) + c*yList.get(j-1) + e2)%f);
            }
            ArrayList<Long> arr = new ArrayList<>();
            for(int j=0; j<n; j++){
                arr.add((xList.get(j) + yList.get(j))%f);
            }
            long ans = 0;

            System.out.println(ans);
        }
    }
}
