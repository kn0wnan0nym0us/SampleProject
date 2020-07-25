 //Passing objects
 //strings
 //operators
 
 public class Puppy {
    public Puppy(String name){
    System.out.println("Passed Name is :" + name );
    }
    public static void main(String []args){
        new Puppy("tommy");

       String myString = "House";
       String myNewString = "This is my " + myString;
       System.out.println(myNewString);

        int solution = 9 + 1;
        System.out.println("9 + 1 = " + solution);
    
        int prevSolution = solution; 
        solution = solution / 2;
        System.out.println(prevSolution + "/2 = " + solution);
        prevSolution= solution * 3;
        System.out.println(solution + "*3 = " + prevSolution);
        solution +=2;
        System.out.println("My new solution is "+ solution);
        solution++;
        System.out.println("My new solution is "+ solution);
        solution--;
        System.out.println("My new solution is "+ solution);

        

    }
} 