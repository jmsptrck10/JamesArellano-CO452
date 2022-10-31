package Mycoursework1;
import java.util.ArrayList;
import helpers.*;
import Mycoursework1.Song;


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
        Song song = new Song("Through The Wire", "Kanye West", 1);
        songs.add(song);

        song = new Song("After Party", "Don Toliver", 0);
        songs.add(song);

        song = new Song("Too Much", "Drake", 0);
        songs.add(song);

        song = new Song("Too Comfortable", "Future", 0);
        songs.add(song);

        song = new Song("It Was A Good Day", "Ice Cube", 0);
        songs.add(song);

        song = new Song("Touch The Sky", "Kanye West", 0);
        songs.add(song);

        song = new Song("Money Trees", "Kendrick Lamar", 0);
        songs.add(song);

        song = new Song("Poetic Justice", "Kendrick Lamar", 0);
        songs.add(song);

        song = new Song("Freestyle", "Lil Baby", 0);
        songs.add(song);

        song = new Song("Revenge", "XXXTENTACION", 0);
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

        Song song=findBytitle(String Song);
        System.out.println("Could not find song");

        for(Song song : songs)


    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        
        for(Song song : songs)
        {
            song.print();
        }
    }
}
