package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator woman =new WomanGameCalculator();
		woman.gameOver();
		
		KidsGameCalculator kids=new KidsGameCalculator();
		kids.gameOver();
		
		/*GameCalculator game=new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ABSTRACT CLASSLARI NEWLEYEMEZSÝN NEWLERSEN BÖYLE HER SEFERÝNDE ÝÇÝNÝ DOLDURMAN GEREK
		bu classlar genelde base classý saklamak/gizlemek için kullanýlýr bir de zorunlu içini doldurma zorunluluðu saðlayabiliyoruz
		*/
	}

}
