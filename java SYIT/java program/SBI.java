class RBI{
	int roi(){
		return 7;
	}
}
public class SBI extends RBI{
	int roi(){
		return 8;
	}

	public static void main (String args[]){
		SBI s = new SBI();
		System.out.println("ROI is:"+s.roi());
	}
}