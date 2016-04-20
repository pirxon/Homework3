package homework3;

public class Zadanie1 {
	private double n;

	public void setN(double n) {
		this.n = n;
	}
	
	public void summa() {
		//int temp = (int)(n * 100); // не правильно округляло последнюю цыфру 8
		int temp =(int)(Math.round(n * 100));
		int sum = 0; 
		while (temp > 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}
		System.out.println("Сумма чисел - "+sum);
	}
}
