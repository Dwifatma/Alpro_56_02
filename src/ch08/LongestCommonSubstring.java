/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08;

/**
 *
 * @author dwifa
 */
public class LongestCommonSubstring {
   public static void main(String[] args) {
	String str1="AAACCGTGAGTTATTCGTTCTAGAA";
	String str2="CACCCCTAAGGTACCTTTGGTTC";
	LongestCommonSubstring lcsMain=new LongestCommonSubstring();
            System.out.println("==Longest Common Substring Test==");
	    System.out.println("\nString 1: "+str1);
	    System.out.println("\nString 2: "+str2);
	    System.out.println("\nLongest common subString is: " 
                                +lcsMain.getLongestCommonSubstring(str1, str2));
	
	}
	public String getLongestCommonSubstring(String str1, String str2){
	int m = str1.length();
	int n = str2.length();
	
	int max = 0;
	
	int[][] dp = new int[m][n];
	int endIndex=-1;
            for(int i=0; i<m; i++){
		for(int j=0; j<n; j++){
	if(str1.charAt(i) == str2.charAt(j)){
	
	// If first row or column
		if(i==0 || j==0){
		dp[i][j]=1;
	}else{
	// Add 1 to the diagonal value
		dp[i][j] = dp[i-1][j-1]+1;
	}
	
	if(max < dp[i][j])
	{
	max = dp[i][j];
	endIndex=i;
		}
	}
	
		}
	}
	return str1.substring(endIndex-max+1,endIndex+1);
		}
	}

