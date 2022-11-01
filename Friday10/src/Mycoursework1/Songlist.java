package Mycoursework1;
import java.util.ArrayList;
import java.util.Scanner;
import helpers.*;


public class Songlist 
{
    private ArrayList<Song> songs;

    public Songlist() 
    {
        songs = new ArrayList<Song>();
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
                case 4: wantToQuit = true; break;
            }
        }
    }

    private void displayMenu() 
    {
        System.out.println("\n 1. Add Songs");
        System.out.println(" 2. Delete Songs");
        System.out.println(" 3. Print All Songs");
        System.out.println(" 4. Quit\n");

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
        System.out.println(" Deleting a Song");
        String title = InputReader.getString("Please enter the song title >");

    }

    private Song findByTitle(string title)
    { 

        return null;
    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;
        
        for(Song song : songs)
        {
             count++;
            System.out.print("Song " + count + ": ");
            song.print();
        }
    }
}
