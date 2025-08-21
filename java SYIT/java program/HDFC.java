class RBI{
	int roi(){
		return 7;
	}
}
public class HDFC extends RBI{
	int roi(){
		return 8;
	}
	void display(){
		System.out.println("ROI is:"+super.roi());
		System.out.println("ROI is:"+roi());
	}

	public static void main (String args[]){
		HDFC h = new HDFC();
		h.display();
		
	}
}