package _24_Abstractions;

public class Office_3_MovieRunner extends Office_3_Movie{
//  2. Create another class: MovieRunner and do the followings
//  Create main method
//  Create 3 Movie objects and assign values of your choice.
//  Example:
//  Move name=starWars
//  duration=120
//  isGood=true
//  And print the movie info

    public static void main(String[] args) {
        //Creating MovieRunner object
        Office_3_MovieRunner starWars=new Office_3_MovieRunner();
        //Assigning name
        starWars.setName("Star Wars");
        //Assigning duration
        starWars.duration=120;
        //Assigning is good or not
        starWars.isGood=true;
        //Calling movieInfo method to pring movie information faster
        starWars.movieInfo();
        //Print if movie short or long
        starWars.shortOrLong();

    }


}
