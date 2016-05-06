package pojo;

public class Options {
	public String getLivingCost() {
		return LivingCost;
	}
	public void setLivingCost(String livingCost) {
		LivingCost = livingCost;
	}
	public String getFood() {
		return Food;
	}
	public void setFood(String food) {
		Food = food;
	}
	public String getFuel() {
		return Fuel;
	}
	public void setFuel(String fuel) {
		Fuel = fuel;
	}
	public double getStateTax() {
		return StateTax;
	}
	public void setStateTax(double stateTax) {
		StateTax = stateTax;
	}
	public String getTransport() {
		return Transport;
	}
	public void setTransport(String transport) {
		Transport = transport;
	}
	public String getMiscellaneous() {
		return Miscellaneous;
	}
	public void setMiscellaneous(String miscellaneous) {
		Miscellaneous = miscellaneous;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	String LivingCost;
	String Food;
	String Fuel;
	double StateTax;
	String Transport;
	String Miscellaneous;
	String Total;
	
	public String toString(){
		return "Food:"+this.getFood()+" Fuel:"+this.getFuel()+" LivingCost:"+this.getLivingCost()+" Misc:"+this.getMiscellaneous()+" Transport:"+this.getTransport()+" state Tax:"+this.getStateTax()+" Total:"+this.getTotal();
	}
	public String calculateTotal(String Type){
		int total = 0;
		if(Type.equals("Public_transport")){
			total = Integer.parseInt(this.LivingCost)+Integer.parseInt(this.Food)+Integer.parseInt(this.Transport)+Integer.parseInt(this.Miscellaneous);
		}
		else if(Type.equals("Fuel")){
			System.out.println(this.LivingCost);
			System.out.println(Integer.parseInt(this.Food));
			System.out.println(Integer.parseInt(this.Fuel));
			System.out.println(Integer.parseInt(this.Miscellaneous));
			total = Integer.parseInt(this.LivingCost)+Integer.parseInt(this.Food)+Integer.parseInt(this.Fuel)+Integer.parseInt(this.Miscellaneous);			
		}
		total = total * 12 ;
		return total+"";
	}
}
