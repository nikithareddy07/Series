package DriverSeries;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++){
			System.out.print(Series.nSum(i) + " ");
			}
			System.out.println("");
			//Output: 0 1 3 6 10 15 21 28 36 45 55
			for(int i = 0; i <= 10; i++){
			System.out.print(Series.factorial(i)+" ");
			}
			System.out.println("");
			//Output: 0 1 2 6 24 120 720 5040 40320 362880 3628800
			for(int i = 0; i <= 10; i++){
			System.out.print(Series.fibonacci(i) + " ");
			}
			//Output: 0 1 1 2 3 5 8 13 21 34 55
	}

}
