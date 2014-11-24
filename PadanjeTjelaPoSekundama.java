
public class PadanjeTjelaPoSekundama {

	public static void main(String[] args) {
		System.out.println("Unesite zeljenu udaljenost");
		double mHeight=TextIO.getDouble();
		double gravity=9.8;
		System.out.println("Unesite zeljeno vrijeme");
		double mVrijeme=TextIO.getDouble();
		double  udaljenost= (Math.pow(mVrijeme, 2)*gravity)/2;
		do (mHeight!=udaljenost){
			System.out.println("Tacno ste pogodili vrijeme i vrijeme pada");
			}
		 
			System.out.println("Niste pogodili vrijeme i vrijeme pada");
	}

}
