package Tasks;

public class DesignParkingSystem {
	    // Array to store counts for [Small, Medium, Large]
	    // Using index 1, 2, and 3 to match common carType inputs
	    private int[] capacity;

	    public DesignParkingSystem(int small, int medium, int large) {
	        this.capacity = new int[]{0, small, medium, large};
	    }

	    public boolean addVehicle(int carType) {
	        // Check if there is space for the specific carType
	        if (capacity[carType] > 0) {
	            capacity[carType]--;
	            return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        // Example usage:
	        DesignParkingSystem myParking = new DesignParkingSystem(1, 1, 0);
	        System.out.println(myParking.addVehicle(1)); // Returns true
	        System.out.println(myParking.addVehicle(1)); // Returns false (out of small spots)
	    }
	}
