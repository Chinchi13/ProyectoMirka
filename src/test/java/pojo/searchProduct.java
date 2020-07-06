package pojo;

public class searchProduct {
    private String email;
    private String pass;
    private String product;
    public  searchProduct(String product_,String _email, String _pass){
        this.email = _email;
        this.pass = _pass;
        this.product=product_;

    }


    public String getEmail(){return email;}
    public  String getPass(){return pass; }
    public  String getProduct(){return product;}




}
