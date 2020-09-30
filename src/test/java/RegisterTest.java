import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class RegisterTest extends LoginPage {

    @DataProvider(name="register")
    public Object[][] register(){
        GetData obj=new GetData("Register");
        return obj.getdata();

    }

@Test(dataProvider = "register")
 public void check_registration(Map<String,String> data)
    {   System.out.println(data);
        String a=this.checkregistration(data);
        Assert.assertTrue(a.contains("Invalid"),"Ouput expected"+ "Invalid registration"+"but actual"+a);
    }
}
