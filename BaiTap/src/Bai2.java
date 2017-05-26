
public class Bai2 {
	public static void main(String[] args){
		calculate();
	}
	public static double calculate(){
		double kq = 0;
		for(int i= 1;i<=100;i++){
			kq= kq+(double) 1/i;
		}
		System.out.println(kq);
		return kq; 
	}
}
