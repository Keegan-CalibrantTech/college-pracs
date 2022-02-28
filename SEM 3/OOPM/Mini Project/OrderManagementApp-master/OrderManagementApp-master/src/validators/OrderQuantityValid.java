package validators;

import warehouse.Order;

public class OrderQuantityValid implements Validator<Order>{
    
    private static final int MIN_Quantity=1;
    private static final int MAX_Quantity=100;//change with product quantity
    
    public void validate(Order t)
    {
        if(t.getOrderQuantity()<MIN_Quantity || t.getOrderQuantity()>MAX_Quantity)
        {
            throw new IllegalArgumentException("The Oreder Quantity limit is not respected");
        }
    }
}
