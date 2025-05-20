package pertemuan_9.tugas;

public class InharitanceMain {

	public static void main(String [] args) {
		Mobil mbl = new Mobil("Merah", "Toyota", "Civic");
		System.out.println(mbl.getWarna()+ 
				"-"+ mbl.getMerk()+
				"-"+ mbl.getJenis());
	}
}
