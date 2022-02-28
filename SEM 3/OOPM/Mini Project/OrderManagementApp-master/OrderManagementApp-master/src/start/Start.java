package start;

import bll.ClientBL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import warehouse.Client;

public class Start {
    protected static final Logger LOGGER=Logger.getLogger(Start.class.getName());
    
    public static void main(String[] args) throws SQLException
    {
        ClientBL clientBL=new ClientBL();
        Client c1=new Client("dummy name", "dummy address", "dummy@address.co", 20);
        int id = clientBL.insertClient(c1);
		if (id > 0) {
			clientBL.findClientById(id);
		}
        try
        {
            c1=clientBL.findClientById(1);
        }
        catch(Exception e)
        {
            LOGGER.log(Level.INFO,e.getMessage());
        }
        Ware.retrieveProperties(c1);
    }
    
}
