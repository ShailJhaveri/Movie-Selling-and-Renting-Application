import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ResultBean {

	private String name ;
	private int age;
	private String totalAmount;
	private String totalPoints;
	ArrayList<Item> listOfItems = new ArrayList<Item>();

	
	
	public ArrayList<Item> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(ArrayList<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
}