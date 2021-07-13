/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetest;

/**
 *
 * @author JINSMON ALEX
 */
public class SimpleRunner {

    public static void main(String[] args) {
        String data[]  = {"A","A","A","B","C","C","A","B","D"};
        int a_sum=0, b_sum=0, c_sum=0, d_sum=0;
        int a_prom=0, b_prom=0, cd_prom=0;
        for (int i=0;i<data.length;i++){
            switch(data[i]){
                case "A":
                    a_sum++;
                    break;
                case "B":
                    b_sum++;
                    break;
                case "C":
                    c_sum++;
                    break;
                case "D":
                    d_sum++;
                    break;
                
            }
            
        }
        if(d_sum>0&&c_sum>0){
            if(d_sum>=c_sum){
                cd_prom = c_sum;
                d_sum = d_sum - c_sum;
                c_sum = 0;
            }else{
                cd_prom = d_sum;
                c_sum = c_sum - d_sum;
                d_sum = 0;
            }
        }

        a_prom = a_sum/3;
        a_sum = a_sum%3;

        b_prom = b_sum/2;
        b_sum = b_sum%2;
        
        System.out.println("A*"+(a_sum+a_prom*3)+" for "+(a_prom*130+a_sum*50));
        System.out.println("B*"+(b_sum+b_prom*2)+" for "+(b_prom*45+b_sum*30));
        System.out.println("C*"+(c_sum+cd_prom)+" for "+c_sum*20);
        System.out.println("D*"+(d_sum+cd_prom)+" for "+d_sum*15);
    }
}
