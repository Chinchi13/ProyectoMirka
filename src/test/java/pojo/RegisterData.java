package pojo;

public class RegisterData {
    private String name;
    private String lastname;
    private String email;
    private String telephone;
    private String pass;
    private String repass;

    public RegisterData(String name_, String lastname_, String email_, String telephone_, String pass_, String repass_) {

        this.name = name_;
        this.lastname = lastname_;
        this.email = email_;
        this.telephone = telephone_;
        this.pass = pass_;
        this.repass = repass_;
    }
public String getName(){return name;}
public  String getLastname(){return lastname; }
public  String getEmail(){return email;}
public  String getTelephone(){return  telephone;}
public  String getPass(){return pass;}
public  String getRepass(){return repass;}




}
