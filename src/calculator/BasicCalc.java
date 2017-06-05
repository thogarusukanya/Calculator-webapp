package calculator;


public class BasicCalc
{
	double a,b,c;// include variables a, b, c here
	 
	double add() //include methods for operations
	{
		c=a+b;
		return(c);
	}
	double subtract()
	{
		c=a-b;
		return(c);
}
	double multiply()
	{
		c=a*b;
		return(c);
}
	double divide()
	{
		c=a/b;
		return(c);
}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
}