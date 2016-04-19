package homework3;

public class Zadanie2 {
	protected double n;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}
	public void max() {
		int temp = (int)(n * 100);
	 	
	    int a = (temp % 100000 / 10000);
	 	int b = (temp % 10000 / 1000);
	    int c = (temp % 1000 / 100);
	    int d = (temp % 100 / 10);
	    int e = (temp % 10);

		if(a>b & a>c & a>d & a>e) {
			System.out.println("Максимальное число - "+a);
		}else if(b>c & b>d & b>e ) {
			System.out.println("Максимальное число - "+b);
		}else if(c>d & c>e) {
			System.out.println("Максимальное число - "+c);
		}else if (d>e){
			System.out.println("Максимальное число - "+d);
		}else
			System.out.println("Максимальное число - "+e);
	}
	
	public void min() {
		int temp = (int)(n * 100);
	 	
	    int a = (temp % 100000 / 10000);
	 	int b = (temp % 10000 / 1000);
	    int c = (temp % 1000 / 100);
	    int d = (temp % 100 / 10);
	    int e = (temp % 10);

		if(a<b & a<c & a<d & a<e) {
			System.out.println("Минимальное число - "+a);
		}else if(b<c & b<d & b<e ) {
			System.out.println("Минимальное число - "+b);
		}else if(c<d & c<e) {
			System.out.println("Минимальное число - "+c);
		}else if (d<e){
			System.out.println("Минимальное число - "+d);
		}else
			System.out.println("Минимальное число - "+e);
		
	}

}
