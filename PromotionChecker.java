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
public class PromotionChecker implements IPromotionChecker
{        //returns PromotionID and count of promotions
    @Override
    public HashMap runPromotion(String[] prods)
    {
        Product a = new Product();
        Product b = new Product();        
        Product c = new Product();
        Product d = new Product();
        
        //int a_sum=0, b.productQuantity=0, c_sum=0, d_sum=0;
        int a_prom=0, b_prom=0, cd_prom=0;
        for (int i=0;i<prods.length;i++){
            switch(prods[i]){
                case "A":
                    a.productQuantity++;
                    break;
                case "B":
                    b.productQuantity++;
                    break;
                case "C":
                    c.productQuantity++;
                    break;
                case "D":
                    d.productQuantity++;
                    break;
                
            }
            
        }
        if(d.productQuantity>0&&c.productQuantity>0){
            if(d.productQuantity>=c.productQuantity){
                cd_prom = d.productQuantity;
                d.productQuantity = d.productQuantity - c.productQuantity;
                c.productQuantity = 0;
            }else{
                cd_prom = c.productQuantity;
                c.productQuantity = c.productQuantity - d.productQuantity;
                d.productQuantity = 0;
            }
        }

        a_prom = a.productQuantity/3;
        a.productQuantity = a.productQuantity%3;

        b_prom = b.productQuantity/2;
        b.productQuantity = b.productQuantity%2;
        
        HashMap output = new HashMap();
        output.put("aq", a.productQuantity+(a_prom*3));
        output.put("bq", b.productQuantity+(b_prom*2));
        output.put("cq", c.productQuantity+cd_prom);
        output.put("dq", d.productQuantity+cd_prom);
        
        output.put("ap", a.productQuantity*50+a_prom*130);
        output.put("bp", b.productQuantity*30+b_prom*45);
        output.put("cp", c.productQuantity*20);
        output.put("dp", d.productQuantity*15+cd_prom*30);
        
        return output;
    }
    
}
