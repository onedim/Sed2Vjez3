
public class Zbir {

	public static void main(String[] args) {

		int br1=1;
		int br2=2;

		while (br1!=0 || br2!=0){
		System.out.println("unsite prvi");
		br1=TextIO.getInt();
		System.out.println("unsite drugi");
		br2=TextIO.getInt();
		System.out.println(br1+br2);
		}	
		System.out.println("Kraj programa");
	}

}
