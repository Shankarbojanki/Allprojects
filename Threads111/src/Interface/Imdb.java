package Interface;

public interface Imdb {
    void movies();
}
interface Bookticket {
    void ticketbooking();
}
 class Bookmyshow implements Imdb,Bookticket {

    public void movies() {
        System.out.println("Book your tickets here");
    }
    public void ticketbooking() {
        System.out.println("you can search movie ratings,reviews");
    }
 }
 class MoviesDotcom implements Imdb {
     @Override
     public void movies() {
         System.out.println("search movies and shows");
     }
 }
 class NetflixDotcom extends Bookmyshow{
       public void movies() {
           System.out.println("welcome to netflix.............enjoy your favourite movies here by IMDB rating");
       }
 }
 class  Moviedb {
     public static void main(String[] args) {
         Bookmyshow bookmyshow= new Bookmyshow();
         bookmyshow.movies();
         bookmyshow.ticketbooking();

         MoviesDotcom moviesdotcom= new MoviesDotcom();
         moviesdotcom.movies();

         NetflixDotcom netflixDotcom= new NetflixDotcom();
         netflixDotcom.movies();

     }
 }