package warehouse;

public class Product {

    private int clientId;
    private String name;
    private String address;
    private String email;
    private int age;
    
    public Product(int clientId, String name, String address, String email, int age)
    {
        super();
        this.clientId=clientId;
        this.name=name;
        this.address=address;
        this.email=email;
        this.age=age;
    }
    
    public Product(String name, String address, String email, int age)
    {
        super();
        this.name=name;
        this.address=address;
        this.email=email;
        this.age=age;
    }
    
    public int getId()
    {
        return clientId;
    }
    
    public void setId(int clientId)
    {
        this.clientId=clientId;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    
    public String createStringClient()
    {
        String x="Student [id=" + clientId + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age + "]";
        return x;
    }
}
