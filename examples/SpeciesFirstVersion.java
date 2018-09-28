import java.util.Scanner;

class Species
{
    public String name; // should not be null and should not be an empty string
    public int population; // should be positive
    public double growthRate;

    public 
	void readInput()
    {
        Scanner keyboard = new Scanner(System.in) ;
        do {
          System.out.println ("What is the species' name?") ;
          name = keyboard.nextLine () ;
        } while (name.equals("") == true) ;

        do {
          System.out.println ("What is the population of the species?") ;
          population = keyboard.nextInt () ;
        } while (population <= 0) ;

        System.out.println ("Enter growth rate (% increase per year):") ;
        growthRate = keyboard.nextDouble () ;
    }

    public 
	void writeOutput()
    {
        System.out.println ("Name = " + (name.length() > 10 ? name.substring(0, 10) : name )) ;
        System.out.println ("Population = " + population) ;
        System.out.println ("Growth rate = " + growthRate + "%") ;
    }


    public 
	int getPopulationIn10()
    {
        double _population = (double) population ;

        for (int count = 10 ; count > 0 && _population > 0.0 ; count--) {
            _population = _population * (1.0 + (double) growthRate / 100.0) ;
        }
        if (_population <= 0.0)
          return 0 ;

        return (int) _population ;
    }
}

/*************************************************/

public class SpeciesFirstVersion
{
    public static void main (String [] args)
    {
        Species speciesOfTheMonth = new Species();
        System.out.println ("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput ();
        speciesOfTheMonth.writeOutput ();
        int futurePopulation = speciesOfTheMonth.getPopulationIn10() ;
        System.out.println ("In ten years the population will be " + futurePopulation);

		System.out.println() ;

        //Change the species to show how to change the values of instance variables
        speciesOfTheMonth.name = "Otter";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println ("The new Species of the Month:");
        speciesOfTheMonth.writeOutput ();
        System.out.println ("In ten years the population will be " + speciesOfTheMonth.getPopulationIn10());
    }
}
