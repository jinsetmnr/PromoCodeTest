/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetest;

import java.util.HashMap;

/**
 *
 * @author JINSMON ALEX
 */
public class Runner{


    public static void main(String[] args) {

        String data[]  = {"A","A","A","B","C","C","A","B","D"};
        IPromotionChecker pc = new PromotionChecker(); 
        HashMap out = pc.runPromotion(data);

        System.out.println("A*"+out.get("aq")+" for "+out.get("ap"));
        System.out.println("B*"+out.get("bq")+" for "+out.get("bp"));
        System.out.println("C*"+out.get("cq")+" for "+out.get("cp"));
        System.out.println("D*"+out.get("dq")+" for "+out.get("dp"));
        
    }
}
