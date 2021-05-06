package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public void gameOver() {
		System.out.println("Oyun bitti");
	}

	/*
	 * 	public final void gameOver() {
		System.out.println("Oyun bitti");
		
		ABSTRACT CLASSLAR ASLA NEWLENEMEZ;
		final anahtar sözcüðü olursa override edemezsin bu method çalýþýcak
		abstract kullanmak için abstract class olmak zorunda,final için zorunlu deðil
		abstract anahtar sözcüðü olursa override etmek zorundasýn hepsinin içini gidip extends classlarda doldurmalýsýn
	}
	 * */
}
