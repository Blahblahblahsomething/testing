import java.util.Scanner;
import jdk.internal.org.jline.utils.InputStreamReader;
import java.io.BufferedReader;
import java.math.*;
public class alamonChallenege
{ //attach methods to class
    //class variables
    double num1=1;
    int mass=1;
     static int fuelCalculation (int mass)
    {   //tabbed not spaced.
        //use floor to round.
        //declare local variable for double.
    
        //calculate formula for mass.
        return(Math.floor( num1(mass)/3.0))-2;
    }
     static int fuelSumEstimation(int mass)
     { int massSum=0;
        while(true)
        {
            mass=fuel(mass);
            if (mass <0);
        }
        massSum=+mass;
        return massSum;
     }

    //input function
    static int dataGatheringfunc()
    {   //file path assigned to string variable.
        string file="\\Users\\snoot\\Deskyop\\InputData.txt";
        //BufferedReacer object creation.
       BufferedReader in=new BufferedReader(new InputStreamReader(fis));
       System.out.println("Gathering data now\n");
       //encapsulate while loop with try/catch
       try{
           string str;
        while (( str=in.readline())!=null)
        {process(str);
        //close bufferedReader
       
        }
        //throw exception if anything interrupts bufferedread
       }
        catch(IOException e)
        {
        //notification to user regarding data. 
        System.out.printline("Error getting data");
        }
       
    

       
       finally{ 
           br.close();
       }
       
     //main placed here for ease of use.
  public static void main(string[] args){
    

    }    
}
    

    

     

    
