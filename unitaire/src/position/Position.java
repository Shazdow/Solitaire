package position;

public class Position implements Positionne{
	private double abs;
	private double ord;
	
	public Position (double abs, double ord)
	{
		this.abs=abs;
		this.ord=ord;
	}
	
	public Position()
	{
		this(0, 0);
	}
	
	public double getAbs()
	{
		return abs;
	}
	
	public double getOrd()
	{
		return ord;
	}
	
	public void setAbs(double abs)
	{
		this.abs = abs;
	}
	
	public void setOrd(double ord)
	{
		this.ord = ord;
	}
	
	public String toString()
	{
		return "(" + abs + " , " + ord + ")";
	}

	@Override
	public int position(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}

