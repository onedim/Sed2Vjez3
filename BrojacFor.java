
public class BrojacFor {

	public static void main(String[] args) {
		System.out.println ("U");
		int brojac=TextIO.getInt();
		int trice=0;
		int petice=0;
		int i=0;
		System.out.println ("U broju "+brojac);
		for (i=1;i<=brojac;i++) {
			if(i % 3 == 0){
				trice++;
			}
			if (i % 5== 0)
				petice++;
			}
		
		System.out.println("Djeljivo sa 3 je: " +trice);
		System.out.println("Djeljivo sa 5 je: " +petice);
	}

}
