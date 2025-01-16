class Demo
{
	public void playMusic()
	{
		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}
}


public class MethodsEg {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.playMusic();
		String src=obj.getMeAPen(1);
		System.out.println(src);
	}
}