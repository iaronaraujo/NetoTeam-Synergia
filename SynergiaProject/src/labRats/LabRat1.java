package labRats;

public class LabRat1 {
	private int sum;
	private int mult;

	
	public LabRat1(int x, int y){
		sum = x+y;
		mult = x*y;
	}
	
	public int getSum(){
		return sum;
	}
	
	public int getMult(){
		return mult;
	}
	public int getPow(int x, int y){
		int result = 1;
		for(int i = 0; i < y; i++){
			result *= x;
		}
		return result;
	}
	
	public int getCraziness(int x){
		return getPow(sum, mult) - getPow(x, x);
	}
}
