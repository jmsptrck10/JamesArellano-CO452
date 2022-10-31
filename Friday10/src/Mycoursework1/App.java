package Mycoursework1;
import helpers.ConsoleColours;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("List of Songs");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by James Patrick Arellano");
        System.out.println();

        Songlist songs = new Songlist();
    }
}
