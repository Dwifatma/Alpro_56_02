package ch05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LongestCommonSubsequence1 { /** Class  LongestCommonSubsequence **/
   
    /** function lcs **/
    public String lcs(String str1, String str2)
    {
        int a = str1.length();
        int b = str2.length();
 
        int[][] arr = new int[a + 1][b + 1];
 
        for (int i = a - 1; i >= 0; i--)
        {
            for (int j = b - 1; j >= 0; j--)
            {
                if (str1.charAt(i) == str2.charAt(j))
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                else 
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
 
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i < a && j < b) 
        {
            if (str1.charAt(i) == str2.charAt(j)) 
            {
                sb.append(str1.charAt(i));
                i++;
                j++;
            }
            else if (arr[i + 1][j] >= arr[i][j + 1]) 
                i++;
            else
                j++;
        }
        return sb.toString();
    }
 
    /** Main Function **/
    public static void main(String[] args) throws IOException
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Longest Common Subsequence Algorithm Test\n");
 
        System.out.println("\nMasukkan LCS ke-1 : ");
        String str1 = br.readLine();
 
        System.out.println("\nMasukkan LCS ke-2 : ");
        String str2 = br.readLine();
 
        LongestCommonSubsequence1 obj = new LongestCommonSubsequence1(); 
        String result = obj.lcs(str1, str2);
 
        System.out.println("\nLongest Common Subsequence : "+ result);
    }

}






