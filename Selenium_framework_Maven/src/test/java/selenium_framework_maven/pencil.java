package selenium_framework_maven;

public class pencil {
private String colour;
private int price;
private String  brand;

public void pencil(String colour,int price,String brand){
	this.colour=colour;
	this.price=price;
	this.brand=brand;
}
	public String toString() {
		return colour+" "+brand+" "+price;
	}
	public static void main(String [] args)
}

}

