/* interface methods */
interface client
{
    void webdesign();  //public + abstract
    void webdevelope(); //public + abstract
}
abstract class RajTech implements client
{
    @Override 
    public void webdesign()
    {
        System.out.println("Green, top menu, three dot button");
    }
}
class RahulTech extends RajTech
{
    @Override 
    public void webdevelope()
    {
        System.out.println("HTML, CSS, JAVASCRIPT");
    }
}
class check
{
    public static void main(String[] args) {
        
    RahulTech r=new RahulTech();
    r.webdesign();
    r.webdevelope();
    }
}
