package warehouse;

public class Client {

    private int clientId;
    private String name;
    private String phone;
    private String email;
    
    public Client(int clientId, String name, String address, String email, int age)
    {
        super();
        this.clientId=clientId;
        this.name=name;
        this.phone=address;
        this.email=email;

    }
    
    public Client(String name, String address, String email, int age)
    {
        super();
        this.name=name;
        this.phone=address;
        this.email=email;
    
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
        return phone;
    }
    
    public void setAddress(String phone)
    {
        this.phone=phone;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    public String createStringClient()
    {
        String x="Student [id=" + clientId + ", name=" + name + ", address=" + phone + ", email=" + email + "]";
        return x;
    }
}
