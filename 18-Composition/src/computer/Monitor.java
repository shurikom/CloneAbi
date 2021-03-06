package computer;

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution resolution1; // HAS A resolution

	// Generate constructor
	public Monitor(String model, String manufacturer, int size, Resolution resolution1) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.resolution1 = resolution1;
	}

	public void drawPixelAt(int x, int y, String color) {

		System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getResolution1() {
		return resolution1;
	}

	// Generate getters

}
