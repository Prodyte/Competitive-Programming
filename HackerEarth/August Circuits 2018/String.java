import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int q = in.nextInt();
        String a = in.next();
        int[] freq = new int[26];
        for(int i=0; i<26; i++)
            freq[i] = 0;
        for(int i=0; i<a.length(); i++){
            int c = (int)a.charAt(i);
            c = c%97;
            freq[c]++;
        }
        int index = 0;
        int value = freq[0];
        for(int i=1; i<26; i++){
            if(freq[i] > value){
                value = freq[i];
                index = i;
            }
        }
        char ch = (char)(index + 97);
        a = a.replaceAll(String.valueOf(ch), "");
        System.out.println(a.length());
        /*for(int i=0; i<q; i++){
            String a = in.next();
            String b = in.next();
            int[] aFreq = new int[52];
            int[] bFreq = new int[52];
            for(int j=0; j<52; j++){
                aFreq[j] = 0;
                bFreq[j] = 0;
            }
            if(a.length() < b.length()){
                System.out.println("NO");
                break;
            }
            for(int j=0; j<a.length(); j++){
                int c = (int)a.charAt(j);
                if(c >= 97 && c <= 122)
                    aFreq[c%97]++;
                else
                    aFreq[c-39]++;
            }
            for(int j=0; j<b.length(); j++){
                int c = (int)b.charAt(j);
                if(c >= 97 && c <= 122)
                    bFreq[c%97]++;
                else
                    bFreq[c-39]++;
            }
            for(int j=0; j<26; j++){
                char c = (char)(j+65);
                // converting lowercase to uppercase
                if(b.contains(Character.toString(c)) && !a.contains(Character.toString(c))){
                    bFreq[j]--;
                    aFreq[j+26]++;
                }
                else
                    bFreq[j] = 0;
            }

            boolean flag = true;
            for(int j=0; j<52; j++){
                if(aFreq[j] != bFreq[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }*/
    }
}
