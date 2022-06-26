public class
Main
{
    public static void main(String[] args)
    {
        int birthMonth = 17;
        if(birthMonth > 0)
        {
            if(birthMonth <=12)
            {
                System.out.println("Your birth month is " + birthMonth);
            }
            else
            {
                System.out.println("Invalid input: " + birthMonth);
            }
        }
        else
        {
            System.out.println("Invalid input: " + birthMonth);
        }
    }
}