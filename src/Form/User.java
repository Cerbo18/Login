
package Form;


public class User {
    String Username;
    String Email;
    String Password;
    
    public User(){}
    
    public User(String Username,String Email, String Password){
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setUsername(String Username){
        this.Username = Username;
    }
    
    public String getUsername(){
        return Username;
    }
}
