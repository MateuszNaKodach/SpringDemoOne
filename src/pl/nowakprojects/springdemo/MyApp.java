package pl.nowakprojects.springdemo;

/**
 * Created by Mateusz on 07.01.2017.
 */
public class MyApp {
    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());

    }
}
