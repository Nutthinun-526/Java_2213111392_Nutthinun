
public class Lap706_StockProduct {
	
	private String id;
	private int unit;
	private double price;
	

	public static void main(String[] args) {
		

	}
	
	public void setId(String ID) {
		id = ID;
	}
	
	public String getId() {
		return id;
	}
	
	public void setUnit(int UNIT) {
	    unit = UNIT;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public void setPrice(double PRICE) {
		price = PRICE;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double calculate() {
		double total = unit*price;
		return total;
	}

}
