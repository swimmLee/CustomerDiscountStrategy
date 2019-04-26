
package solid.example;

/**
 *
 * @author lheberer
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public double getDiscountedAmount(double billAmount){
        return billAmount;
    }
    
    @Override
    public String toString(){
        return "No Discount";
    }   
}
