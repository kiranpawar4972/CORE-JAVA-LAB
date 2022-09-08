// java program to calculate simple interest

class Interest  //declearing class
{
    public static void main (String args[])  //calling main
    { 
		float p, r, t, si;  // principal amount, rate, time and simple interest.
		p = 1500; r = 12; t = 2;
		si = (p*r*t)/100;
		System.out.println("Simple Interest is: " +si);
    }  // end of main
}  // end of class