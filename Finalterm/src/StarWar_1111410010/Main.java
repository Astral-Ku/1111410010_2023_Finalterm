package StarWar_1111410010;

public class Main {

	public static void main(String[] args) {
		class AirCraft{
			public String Manufacturer;
			public String Model;
		}
		class Xwing extends AirCraft{
			public void set_Manufacturer(String a,String b) {
				Model = "Incom Corporation T-65B X-Wing Space Superiority Fighter";
			}
		}
		class TieFighter extends AirCraft{
			public void set_Manufacturer(String a,String b) {
				Manufacturer = "Sienar Fleet System";
				Model = "Twin Ion Engine Line Starfighter";
			}	
		}
	}
}
