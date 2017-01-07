package pl.nowakprojects.springdemo;

/**
 * Created by Mateusz on 07.01.2017.
 */
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
