package inheritance;

public class Instagram2  extends Instagram1{
	
	public void videocall()
	{
		System.out.println("User can do video calling");
	}
	
	public void Voicecall()
	{
		System.out.println("User can do voice calling");
	}

	
	public static void main(String[] args) {
		
		
		Instagram2 ig=new Instagram2();
		ig.Text();
		ig.Upload("Any video");
		ig.download("Funny Video");
		ig.Multimedia("Pictures");
		ig.videocall();
	}
}
