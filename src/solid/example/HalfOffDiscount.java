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
public class HalfOffDiscount implements DiscountStrategy {

    @Override
    public double getDiscountedAmount(double billAmount){
        return billAmount - billAmount * 0.50;
    }
    
    @Override
    public String toString(){
        return "Half Off";
    }
    
}
