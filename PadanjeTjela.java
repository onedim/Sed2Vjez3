
public class PadanjeTjela {

	public static void main(String[] args) {
		System.out.println("Upisite broj sekundi koje tjelo pada");
		//koliko sekundi tjelo pada
		double seconds=TextIO.getDouble();
		double gravity=9.81;
		
		double  udaljenost= (Math.pow(seconds, 2)*gravity)/2;
		System.out.println("Udaljenost predjena u metrima je: "+udaljenost);
	}

}
