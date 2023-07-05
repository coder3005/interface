/* interface variables */
interface customerRaj
{
    int amt=5;  //public + static + final 
    void purchase();  // public + abstract   /*if we write public abstract before void then the same result will come*/
}
class sellerSanju implements customerRaj
{
    @Override
    public void purchase()
    {
        //amt=5 final
        System.out.println("Raj needs "+amt+" kg rice");
    }
}
class check
{
    public static void main(String[] args) {
        customerRaj c=new sellerSanju();
        c.purchase();
        System.out.println(customerRaj.amt); //static
    }
}
