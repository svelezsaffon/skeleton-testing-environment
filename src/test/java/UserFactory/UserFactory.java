package UserFactory;

/**
 * Created by santiago on 11/04/18.
 */
public class UserFactory {


    public static User createUser(String type){
        User ret=null;
        switch (type){
            case "admin":
                ret=new Admin();
                break;
            case "regular":
                ret=new Regular();
                break;
            case "visitor":
                ret=new Visitor();
                break;
            default :
                ret=new Admin();
                break;

        }

        return ret;
    }

    public static User createUser(Roles type){
        User ret=null;
        if(type==Roles.admin){
            ret=new Admin();
        }else if(type==Roles.regular){
            ret=new Regular();
        }else if(type ==Roles.visitor){
            ret=new Visitor();
        }else{
            ret=new Visitor();
        }
        return ret;
    }

}
