/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.example;

/**
 *
 * @author lheberer
 */
public class SaleDiscount implements DiscountStrategy {
    @Override
    public double getDiscountedAmount(double billAmount){
        return billAmount - billAmount * 0.10;
    }
    
    @Override
    public String toString(){
        return "Sale Discount";
    }
    
}
