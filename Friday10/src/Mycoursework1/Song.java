package Mycoursework1;

public class Song  
{
    private String id;

    private String title;

    private String artist;

    private int playCount;

    public Song(String title, String name, int count) 
    {
        this.title = title;
        this.artist = name;
        this.playCount = count;
    }
    
        public String getTitle() {
            return title;

        }
         public void setTitle(String title)
         {
            this.title = title;

         }
         
        public String getName() {
            return title;

        }
        public void setArtist(String name)
         {
            this.artist = name;

         }
        public String getCount() {
            return title;

        }
        public void setCount(int count)
         {
            this.playCount = count;

         }

    public void print()
    {
        System.out.println(title + " by " + artist + " plays: " + playCount);
    }

   

   

    


 


}
