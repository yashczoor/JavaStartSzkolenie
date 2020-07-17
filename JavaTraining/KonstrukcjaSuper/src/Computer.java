
public class Computer {
	private double cpuTemp;
	private int ramMemory;
	
	public double getCpuTemp() {
		return cpuTemp;
	}
	
	public void setCpuTemp(double cpuTemp) {
		this.cpuTemp = cpuTemp;
	}
	
	public int ramMemory() {
		return ramMemory;
	}
	public void setRamMemory(int ramMemory) {
		this.ramMemory = ramMemory;
	}

	//construct
	public Computer(double cpuTemp, int ramMemory) {
		setCpuTemp(cpuTemp);
		setRamMemory(ramMemory);
	}
	
	public void coolDown() {
		setCpuTemp(getCpuTemp()-1);
	}
}
