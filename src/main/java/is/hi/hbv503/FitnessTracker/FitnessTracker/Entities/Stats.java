package is.hi.hbv503.FitnessTracker.FitnessTracker.Entities;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Services.ExerciseService;


public class Stats{

    public Stats(){
    }

    private ExerciseService exerciseService;

    public double getTotalTime(int size){

        System.out.println("checking....");
        int i = 0;
        int totalTime = 0;
        System.out.println(exerciseService.findAll().size());

        while(i < size){
            System.out.println(1);
            totalTime += exerciseService.findAll().get(i).getDuration();
            System.out.println(2);
            i++;
        }
        System.out.println("Total time spent: " +  totalTime);
        return totalTime;
    }
}
