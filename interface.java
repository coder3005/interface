/*interface introduction*/
import java.util.Scanner;
interface client
{
    void input(); //public+abstract
    void output(); //public+abstract
}
class raju implements client
{
    String name; double sal;
    public void input()
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Username: ");
        name=r.nextLine();

        System.out.println("Enter Salary: ");
        sal=r.nextDouble();
    }
    public void output()
    {
        System.out.println(name+" "+sal);
    }
    public static void main(String[] args) {
        client c=new raju();
        c.input(); c.output();
    }
}
