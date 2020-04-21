
package cts;


public class CTS {
 static String [][] userInfo = {{"kaalotaibi", "adsffas", "dkfigdj" , "fidjfd"},{"1244532a","334234","442422","442435235"}};

    public static void main(String[] args) {
//     String userInfo[][] = new String[2][10];
       login("fidjfd", "442435235");
                
     
     
    }
    
    public static boolean Check (String username, String password, String [][]userInfo){
        boolean flagU= false;
        boolean flagP = false;
        int st = 0;
        for (int i=0; i<4; i++){
            if (userInfo[0][i] == username){
                flagU = true;
                st = i;
                break;
            }  
        }
        
        
        if (flagU == false)
                return flagU;
        if (flagU == true)
            if (password == userInfo[1][st])
                flagP=true;
       
            if (flagP == false)
                    return flagP;
            
        
        
        return flagU && flagP;
        
    }

    
    public static void login(String username, String password){
        boolean check = Check(username, password, userInfo);
        if (check == true)
            System.out.println("Login is successful");
        if (check == false)
            System.out.println("Make sure the username or password is correct");
    }
}
