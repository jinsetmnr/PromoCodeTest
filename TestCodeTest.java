/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetest;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author user
 */
public class TestCodeTest {

    
    @Test 
    public void TestDataA() throws Exception{
        PromotionChecker pcCheck = new PromotionChecker();
        String[] prods = {"A","B","C"};
        HashMap outCheck = pcCheck.runPromotion(prods);
        HashMap tester = new HashMap();
        tester.put("aq",1); 
        tester.put("dp",0); 
        tester.put("dq",0); 
        tester.put("cp",20); 
        tester.put("cq",1); 
        tester.put("bp",30); 
        tester.put("bq",1); 
        tester.put("ap",50); 
        
        Assert.assertTrue(outCheck.equals(tester));
        
    }
    
    @Test 
    public void TestDataB() throws Exception{
        PromotionChecker pcCheck = new PromotionChecker();
        String[] prods = {"A","A","A","A","A","B","B","B","B","B","C"};
        HashMap outCheck = pcCheck.runPromotion(prods);
        HashMap tester = new HashMap();
        tester.put("aq",5); 
        tester.put("dp",0); 
        tester.put("dq",0); 
        tester.put("cp",20); 
        tester.put("cq",1); 
        tester.put("bp",120); 
        tester.put("bq",5); 
        tester.put("ap",230); 
        
        Assert.assertTrue(outCheck.equals(tester));
        
    }
    
    @Test 
    public void TestDataC() throws Exception{
        PromotionChecker pcCheck = new PromotionChecker();
        String[] prods = {"A","A","A","B","B","B","B","B","C","D"};
        HashMap outCheck = pcCheck.runPromotion(prods);
        HashMap tester = new HashMap();
        tester.put("aq",3); 
        tester.put("dp",15); 
        tester.put("dq",1); 
        tester.put("cp",0); 
        tester.put("cq",1); 
        tester.put("bp",120); 
        tester.put("bq",5); 
        tester.put("ap",130); 
        
        Assert.assertTrue(outCheck.equals(tester));
        
    }
}
