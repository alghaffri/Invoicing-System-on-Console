package applicationSystem;

import java.io.Serializable;

public class Item implements Serializable{

	 String itemName;
	 double  itemId;
 double unitPrice;
	 double quantity;
	 double quantityPrice;

	
	
	   public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemId() {
		return itemId;
	}

	public void setItemId(double itemId) {
		this.itemId = itemId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getQuantityPrice() {
		return quantityPrice;
	}

	public void setQuantityPrice(double quantityPrice) {
		this.quantityPrice = quantityPrice;
	}

	
}
