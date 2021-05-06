package day2HomeWork2;

public class Methods {
	public static void sayiBulmaca() {
		int[] numbers =new int[] {1,2,5,7,9,0};
		int wanted=6;
		boolean isThere=false;
		
		for (int number : numbers) {
			if(number==wanted) {
			  isThere=true;
			  break;
			}
		}
		if(isThere) {
			message("Sayı mevcuttur: "+wanted);
		}
		else {
			message("Sayı mevcut değildir: "+wanted);
		}
	}
	public static void message(String message) {
		System.out.println(message);
	}
}
