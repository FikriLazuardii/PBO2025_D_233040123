package pertemuan_11;

public abstract class Bentuk {
	
	 protected double PHI = 3.14;
	    protected int jari2;

	    public Bentuk(int jari) {
	        this.jari2 = jari;
	    }

	    public abstract double luas();

	    public double getPHI() {
	        return PHI;
	    }

	    public void setPHI(double pHI) {
	        PHI = pHI;
	    }

	    public int getJari2() {
	        return jari2;
	    }

	    public void setJari2(int jari2) {
	        this.jari2 = jari2;
	    }
}
