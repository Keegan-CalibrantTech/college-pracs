package warehouse;

import java.util.Date;

public class Order {
    private int orderId;
    private int customerId;
    private int productId;
    private int orderQuantity;
    private int unitPrice;
    private int orderTotal;
    private Date orderDate;
    
    public Order(int orderId,int customerId,int productId,int orderQuantity,int unitPrice, int orderTotal,Date orderDate)
    {
        super();
        this.orderId=orderId;
        this.customerId=customerId;
        this.productId=productId;
        this.orderQuantity=orderQuantity;
        this.unitPrice=unitPrice;
        this.orderTotal=orderTotal;
        this.orderDate=orderDate;
    }
    
    public Order(int customerId,int productId,int orderQuantity,int unitPrice, int orderTotal,Date orderDate)
    {
        super();
        this.customerId=customerId;
        this.productId=productId;
        this.orderQuantity=orderQuantity;
        this.unitPrice=unitPrice;
        this.orderTotal=orderTotal;
        this.orderDate=orderDate;
    }
    
    public int getOrderId()
    {
        return orderId;
    }
    
    public void setOrderId(int orderId)
    {
        this.orderId=orderId;
    }
    
    public int getCustomerId()
    {
        return customerId;
    }
    
    public void setCustomerId(int customerId)
    {
        this.customerId=customerId;
    }
    
    public int getProductId()
    {
        return productId;
    }
    
    public void setProductId(int productId)
    {
        this.productId=productId;
    }
    
    public int getOrderQuantity()
    {
        return orderQuantity;
    }
    
    public void setOrderQuantity(int orderQuantity)
    {
        this.orderQuantity=orderQuantity;
    }
    
    public int getUnitPrice()
    {
        return unitPrice;
    }
    
    public void setUnitPrice(int unitPrice)
    {
        this.unitPrice=unitPrice;
    }
    
    public int getOrderTotal()
    {
        return orderTotal;
    }
    
    public void setOrderTotal(int orderTotal)
    {
        this.orderTotal=orderTotal;
    }
    
    public Date getOrderDate()
    {
        return orderDate;
    }
    
    public void setOrderDate(Date orderDate)
    {
        this.orderDate=orderDate;
    }
    
}
