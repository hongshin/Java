import java.util.Scanner;

class Species
{
    private	String name ; // should not be null and should not be an empty string
    private	int population ; // should be positive
    private	double growthRate ;

	Species(String name, int population, double growthRate) 
	{
		if (name == null || name.equals(""))
			System.exit(1) ;
		else
			this.name = name ;

		if (population <= 0) 
			System.exit(1) ;
		else
			this.population = population ;

		this.growthRate = growthRate ;
	}


    public 
	void writeOutput()
    {
        System.out.println ("Name = " + (name.length() > 10 ? name.substring(0, 10) : name )) ;
        System.out.println ("Population = " + population) ;
        System.out.println ("Growth rate = " + growthRate + "%") ;
    }


    public 
	int predictPopulation(int year)
    {
        double _population = (double) population ;

        for (int count = year ; count > 0 && _population > 0.0 ; count--) {
            _population = _population * (1.0 + (double) growthRate / 100.0) ;
        }
        if (_population <= 0.0)
          return 0 ;

        return (int) _population ;
    }

	public
	int getPopulation() 
	{
		return this.population ;
	}

	public 
	String getName()
	{
		return this.name ;
	}

	public 
	double getGrowthRate()
	{
		return this.growthRate ;
	}
}

/*************************************************/

public 
class SpeciesForthVersion
{
    public 
	static void main (String [] args)
    {
		Scanner in = new Scanner(System.in) ;

        System.out.println ("Enter data on the Species of the Month:");
        System.out.println ("What is the species' name?") ;
        String name = in.nextLine () ;
        System.out.println ("What is the population of the species?") ;
        int  population = in.nextInt () ;
        System.out.println ("Enter growth rate (% increase per year):") ;
        double growthRate = in.nextDouble () ;


		Species speciesOfTheMonth = new Species(name, population, growthRate) ;
		speciesOfTheMonth.writeOutput ();

		System.out.println("Enter number of years to project: ") ;
		int numOfYears = in.nextInt() ;

        int futurePopulation = speciesOfTheMonth.predictPopulation(numOfYears);
        System.out.println ("In " + numOfYears + " years the population will be " + 
			futurePopulation);

		System.out.println() ;

        //Change the species to show how to change the values of instance variables
		Species otter = new Species("Otter", 10, 15) ;
       	System.out.println ("The new Species of the Month:");
		otter.writeOutput ();
        System.out.println ("In " + numOfYears + " years the population will be " + 
			otter.predictPopulation(numOfYears));
    }
}
