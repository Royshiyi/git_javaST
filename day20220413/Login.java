package day20220413;

public class Login {
    String name = "admin";
    String password = "123456";
    public boolean loginInfo(String n,String p){
        if(name.equals(n)){
            return false;
        }

        if(password.equals(p)){
            return false;
        }
        return true;
    }
}
