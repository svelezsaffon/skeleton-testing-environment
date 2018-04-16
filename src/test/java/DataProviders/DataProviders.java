package DataProviders;

import UserFactory.Roles;
import org.testng.annotations.DataProvider;

/**
 * Created by santiago on 16/04/18.
 */
public class DataProviders {

    @DataProvider(name ="GoogleUsersRole")
    public static Roles[] getRolesToTest(){
        Roles[] users = { Roles.admin, Roles.regular, Roles.visitor };
        return users;
    }
}
