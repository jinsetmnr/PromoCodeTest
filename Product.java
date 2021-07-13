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
public class Product {
    
    public char[] productType = {'A','B','C','D'};
    public float[] productPrice = {50,30,20,15};
    public int productQuantity = 0;
    public float productSum = 0;
    static int cdQuantity =0;
    static float cdPromotionPrice = 30;
    static float aPromotionPrice = 130;
    static float bPromotionPrice = 45;
    static int aPromotionQuantity = 3;
    static int bPromotionQuantity = 2;
    

    public char[] getProductType() {
        return productType;
    }

    public void setProductType(char[] productType) {
        this.productType = productType;
    }

    public float[] getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float[] productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getProductSum() {
        return productSum;
    }

    public void setProductSum(float productSum) {
        this.productSum = productSum;
    }
 
    
    
}
