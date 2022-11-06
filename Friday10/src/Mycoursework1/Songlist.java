package Mycoursework1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import helpers.*;


public class Songlist 
{
    private ArrayList<Song> songs = new ArrayList<Song>();
    
     

    public Songlist() 
    {
        addSomeSongs();
        doMainMenu();
    }

    private void addSomeSongs() 
    {
        Song song = new Song("Through The Wire", "Kanye West", 366574);
        songs.add(song);

        song = new Song("After Party", "Don Toliver", 265530237	);
        songs.add(song);

        song = new Song("Too Much", "Drake", 3159527);
        songs.add(song);

        song = new Song("Too Comfortable", "Future", 1827423);
        songs.add(song);

        song = new Song("It Was A Good Day", "Ice Cube", 52637438);
        songs.add(song);

        song = new Song("Touch The Sky", "Kanye West", 449224);
        songs.add(song);

        song = new Song("Money Trees", "Kendrick Lamar", 239606269);
        songs.add(song);

        song = new Song("Poetic Justice", "Kendrick Lamar", 10099);
        songs.add(song);

        song = new Song("Freestyle", "Lil Baby", 41528695);
        songs.add(song);

        song = new Song("Jocelyn Flores", "XXXTENTACION", 1557614471);
        songs.add(song);
        
    }

    private void doMainMenu() 
    {
        boolean wantToQuit = false;

        while(!wantToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs();
                case 4: printTopSongs();
                case 5: wantToQuit = true; break;
            }
        }
    }

    private void displayMenu() 
    {
        System.out.println("\n 1. Add Songs");
        System.out.println(" 2. Delete Songs");
        System.out.println(" 3. Print All Songs");
        System.out.println(" 4. Print All Top Songs");
        System.out.println(" 5. Quit\n");

    }

    private void addSong()
    {
        System.out.println(" Adding a Song");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name  >");
        int count = InputReader.getInt("Please enter the play count > ");

        Song song = new Song(title, name, count);
        songs.add(song);
    }

    private void deleteSong()
    {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Song No. which you want to delete: ");
    Integer num = reader.nextInt();
    songs.remove(num - 1);



    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;
        
        for(Song song : songs)
        {
             count++;
            System.out.print("Song " + "count" + ": ");
            song.print();
        }
    }
    
    private void printTopSongs()  {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter No. of plays you want to print: ");
        Integer num = reader.nextInt();
            int i;
            for (i = 0; i < songs.size(); i++) {
                if (num <= songs.get(i).getPlayCount()) {
                    System.out.println("Song No. " + (i+1) + " : " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist() + " " + songs.get(i).getPlayCount() + " plays ");
                }

            }

        

    }
    
}
