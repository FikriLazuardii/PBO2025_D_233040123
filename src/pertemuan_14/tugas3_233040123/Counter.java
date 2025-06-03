package pertemuan_14.tugas3_233040123;

public class Counter {
	  private static int instanceCount = 0;
	    
	    public Counter() {
	        instanceCount++;
	    }
	    
	    public static int getInstanceCount() {
	        return instanceCount;
	    }
}
