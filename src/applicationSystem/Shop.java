package applicationSystem;

import java.io.Serializable;
import java.util.ArrayList;

public class Shop implements Serializable {
	private String name;

	ArrayList<Item> item = new ArrayList<Item>();

	public void SetShopName(String name) {
		this.name = name;
	}

	public void addItems(Item addItem) {
		item.add(addItem);
	}

	public void deleteItems() {

		for (Item i : item) {
			item.remove(i);

		}
		System.out.println("all Items Deleted ");
	}

	public void changeItemPrice(int itemID, int theNewPrice) {
		for (Item i : item) {
			i.unitPrice = theNewPrice;
			System.out.println("Price changed ");
		}

	}

	public void reportAllItems() {

		System.out.println("++++++ Items  ++++++");

		for (Item item8 : item) {
			System.out.println("----------------------------------");
			System.out.println(" Name : " + item8.itemName);
			System.out.println(" ID : " + item8.itemId);
			System.out.println(" Quantity : " + item8.quantity);
			System.out.println(" Price : " + item8.unitPrice);
			System.out.println(" Quantity  Price : " + item8.quantityPrice);

		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
