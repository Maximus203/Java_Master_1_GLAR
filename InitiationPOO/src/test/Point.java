package test;

public class Point 
{
	private double x;
	private double y;
	
	public Point(double xi, double yi) 
	{
		x = xi;
		y = yi;
	}
	
	public void setY(double yn) 
	{
		y = yn;
	}
	
	public void setX(double xn)
	{
		x = xn;
	}
	
	public double getY() 
	{
		return y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public void translater(double dx, double dy)
	{
		x = x + dx;
		y = y + dy;
	}
	
}
