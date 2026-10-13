import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DogWalker
{
    private int maxDogs;

    private DogWalkCompany company;

    public DogWalker(int max, DogWalkCompany comp)
    {
        maxDogs = max;
        company = comp;
    }

    public int walkDogs(int hour)
    {
        int availableDogs = company.numAvailableDogs(hour);
        int dogsToWalk = Math.min(maxDogs, availableDogs);
        company.updateDogs(hour, dogsToWalk);
        return dogsToWalk;
    }

    public int dogWalkShift(int startHour, int endHour)
    {

    }
}