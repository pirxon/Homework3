package homework3;

public class Main {

	public static void main(String[] args) {

		/*
		 * 1) В переменной n хранится вещественное трёхзначное число с 2-мя
		 * знаками после запятой. Создайте программу, вычисляющую и выводящую на
		 * экран сумму всех цифр числа n. Например есть число 69. Цифры его
		 * составляющие - 6 и 9. А их сумма будет 6+9 = 15.
		 */
		Zadanie1 chislo = new Zadanie1();
		chislo.setN(321.28);
		chislo.summa();

		/*
		 * 2) В переменной n хранится вещественное трёхзначное число с 2-мя
		 * знаками после запятой. Создайте программу, вычисляющую и выводящую на
		 * экран max и min цифру числа n.
		 */
		Zadanie2 chislo_max_min = new Zadanie2();
		chislo_max_min.setN(234.56);
		chislo_max_min.max();
		chislo_max_min.min();

	}
}
