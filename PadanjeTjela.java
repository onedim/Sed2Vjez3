
public class PadanjeTjela {

	public static void main(String[] args) {
		
		//kkoliko sekundi tjelo pada
		double seconds=TextIO.getDouble();
		double gravity=9.81;
		
		double  udaljenost= 0.5*(gravity/(seconds*seconds)*(seconds*seconds));
		System.out.println("Udaljenost predjena u metrima je: "+udaljenost);
	}

}
