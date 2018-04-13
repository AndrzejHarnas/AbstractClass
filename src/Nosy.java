
public class Nosy extends TV {

	@Override
	public void onTV(boolean b) {
		// TODO Auto-generated method stub
		
		if(b) 
			System.out.println("TV jest włączony");
		else 
			System.out.println("TV jest wyłączony");
	}

	
//jeślie metoda jest statyczne nie trzeba inicjalizowac obiektu zeby sie do niej odwołać
	
	public static void test(){
		
		System.out.println("Tescik static");
	}
	
	
	@Override
	public String toString(){
		return "Metoda toString klasy Nosy";
	}

	@Override
	public void changeChanel() {
    System.out.println("zmiana kanału");
		
	}
}
