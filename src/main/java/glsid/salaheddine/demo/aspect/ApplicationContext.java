package glsid.salaheddine.demo.aspect;

public class ApplicationContext {
    private static String username="";
    private static String password="";
    private static String[] roles={};
    public static void authenticateUser(String u,String p,String[] inputRoles){
        if((u.equals("salah"))&&(p.equals("salah")) ){
            username= u;password=p;
            roles=inputRoles;
        }
        else throw new RuntimeException("Error loggin");
    }
    public static boolean hasRole(String role){
        for (String r:roles) {
            if(r.equals(role))return true;
        }
        return false;
    }
}