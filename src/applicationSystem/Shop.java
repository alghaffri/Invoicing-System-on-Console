package applicationSystem;

import java.io.Serializable;
import java.util.ArrayList;


public class Shop implements Serializable{
 private String name;
 
 
 ArrayList<Item> item = new ArrayList <Item>();
 
 public void SetShopName() {
		 
 }
 
 public void addItems() {
	 
 }
 public void deleteItems() {
	 
 }
 public void changeItemPrice() {
	 
 }
 
 public void reportAllItems () {
	 
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
