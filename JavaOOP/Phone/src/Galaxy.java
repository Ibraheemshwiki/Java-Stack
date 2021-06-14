
public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		String s =("Galaxy "+ getVersionNumber() + " says " + getRingTone());
		return s; 
    }
    
    @Override
    public String unlock() {
		return ("Unlocking via finger print");
    
    }
    
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy" + getVersionNumber() + " from " + getCarrier());       
    }
}

