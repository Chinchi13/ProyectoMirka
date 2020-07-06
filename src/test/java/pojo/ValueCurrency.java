package pojo;



public class ValueCurrency {
    private String email;
    private String pass;
    private String product;
    private String Euro;
    private String Sterling;
    private String us;

    public  ValueCurrency(String email_, String pass_,String product_, String Euro_,String Sterling_,String us_){
       this.email= email_;
       this.pass=pass_;
       this.product=product_;
        this.Euro=Euro_;
        this.Sterling=Sterling_;
        this.us=us_;
    }

    public  String getEmail(){return email;}
    public  String getPass(){return pass;}
    public  String getProduct(){return product;}
    public  String getEuro(){return Euro;}
    public  String getSterling(){return Sterling;}
    public  String getUs(){return us;}




}
