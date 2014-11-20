
public class BrojacWhileIf {

	public static void main(String[] args) {
		System.out.println ("U");
		int brojac=TextIO.getInt();
		int trice=0;
		int petice=0;
		System.out.println ("U broju "+brojac);
		while (brojac !=0) {
			if(brojac % 3 == 0){
				trice++;
			}
			if (brojac % 5== 0)
				petice++;
			brojac --; 
			}
		
		System.out.println("Djeljivo sa 3 je: " +trice);
		System.out.println("Djeljivo sa 5 je: " +petice);
	}

}
