package class_work;

public class veriadic {

	public void print(int... args )
	{
		for(int arg : args) {
			System.out.print(arg+" ");
		}
	}
}
