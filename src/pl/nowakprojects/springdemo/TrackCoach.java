package pl.nowakprojects.springdemo;

/**
 * Created by Mateusz on 07.01.2017.
 */
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
