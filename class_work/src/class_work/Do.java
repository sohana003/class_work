package class_work;

public class Do {

	public void dosomething(vehicle T)
	{
		if(T instanceof car)
		{
			car c=(car)T;
		    c.show();
			c.speed();
			c.isrunning();			
		}
		if(T instanceof bus)
		{
			bus c=(bus)T;
		    c.show();
			c.speed();
			c.isrunning();			
		}
		if(T instanceof ship)
		{
			ship c=(ship)T;
		    c.show();
			c.speed();
			c.isrunning();			
		}
		if(T instanceof boat)
		{
			boat c=(boat)T;
		    c.show();
			c.speed();
			c.isrunning();			
		}
		if(T instanceof aeroplane)
		{
			aeroplane c=(aeroplane)T;
		    c.show();
			c.speed();
			c.isrunning();			
		}
		if(T instanceof helicopter)
		{
			helicopter c=(helicopter)T;
		    c.show();
			c.speed();
			c.isrunning();			
		}
	}
}
