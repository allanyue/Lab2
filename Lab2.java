public class Lab2 {
    
    public static void main(String[] args) {

	System.out.println("As I was going to St. Ives");
	System.out.println("I met a man with seven wives");
	System.out.println("Each wife had seven sacks");
	System.out.println("Each sack had seven cats");
	System.out.println("Each cat had seven kits");
	System.out.println("Kittens, cats, sacks, wives");
	System.out.println("How many were going to St. Ives?");
	
	
	boolean manGoingToStIves = true;

	int numWives = 7;

	int numSacksPerWife = 7;
	
        int numCatsPerSack = 7;

	int numKitsPerCat = 7;

	int total;


if (manGoingToStIves) {
	    total = numWives + numSacksPerWife*numWives + 
numCatsPerSack*numSacksPerWife*numWives + 
numKitsPerCat*numCatsPerSack*numSacksPerWife*numWives + 2;
	} else {
	    total = 1;
	}
	
System.out.println("Number going to St. Ives is " + total);

}
}
