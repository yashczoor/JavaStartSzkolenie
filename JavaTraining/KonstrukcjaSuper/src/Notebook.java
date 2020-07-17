
public class Notebook extends Computer {
	private int batteryCapacity;

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	// konstruktor
	public Notebook(double cpuTemp, int ramMemory, int batteryCapacity) {
		super(cpuTemp, ramMemory); // odnosi siê do konstruktora klasy nadrzêdnej
		setBatteryCapacity(batteryCapacity);
	}

	/*
	 * public Notebook() { super(); } //taki konstruktor jak powy¿ej istnieje
	 * domyœlnie w klasie // dziedzicz¹cej. bezparametrowy, wiec nie widzi tego
	 * który jest teraz // w Computer
	 */
	public void coolDown() {
		super.coolDown();
		turboCool();
	}

	public void turboCool() {
		setCpuTemp(getCpuTemp() - 2);
	}

}
