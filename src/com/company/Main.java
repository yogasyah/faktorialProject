package com.company;

public class Main {

    public static void main(String[] args) {
        int l = 1;
        int tingkat = 10;
        int n = 12/2;
        for(int i=1;i<=n;i++){
            for(int k=n;k>i;k--){
                System.out.print("0");
            }
            for(int j=1;j<=l;j++){
                System.out.print("+");
            }
            for(int k=n;k>i;k--){
                System.out.print("0");
            }
            
            l+=2;

            System.out.println("");
        }
        l -= 4;

        for(int i=(n-1);i>=1;i--){
            for(int k=i;k<=(n-1);k++){
                System.out.print("O");
            }
            for(int j=l;j>=1;j--){
                System.out.print("+");
            }
            for(int k=i;k<=(n-1);k++){
                System.out.print("O");
            }
            l-=2;

            System.out.println("");
        }
	// write your code here
    }
}
