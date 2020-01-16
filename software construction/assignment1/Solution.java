import java.util.*;

class Item {
	String name;
	float price;

	public Item(String name, float price){
		this.name=name;
		this.price=price;
	}

	public void showDetails(){
		System.out.print("Name: "+name+"\tPrice: "+price);
	}
}

class Cart {
	private Map<Item,Integer> list;
	private float totalPrice;

	public Cart(){
		list = new HashMap<>();
		totalPrice=0;
	}

	public void addItem(Item item){
		if(list.containsKey(item)){
				list.put(item, new Integer(list.get(item)+1));
			}else{
				list.put(item, new Integer(1));
			}
		totalPrice += item.price;
	}

	public void updateQuantity(Item item, int quantity){
		if(list.containsKey(item)){
			if(list.get(item)+quantity>=0){
				list.put(item, list.get(item)+quantity);
				totalPrice += quantity*item.price;
					if(list.get(item)==0){
							list.remove(item);
					}	
			}
	}
		else if(quantity>0){
			list.put(item, quantity);
			totalPrice += quantity*item.price;
		}
}

	public void removeItem(Item item){
		if(list.containsKey(item) && list.get(item)!=0){
			list.put(item, list.get(item)-1);
			totalPrice -= item.price;
				if(list.get(item)==0) list.remove(item);
		}
	}

	public float getPrice(){
		return totalPrice;
	}

	public void showDetails(){
		for(Map.Entry element: list.entrySet()){
			Item item = (Item)element.getKey();
			Integer quantity = (Integer)element.getValue();
			item.showDetails();
			System.out.println("\tQuantity: "+quantity);
		}
	}

}

public class Solution {
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	Map<String, Item> stock = new HashMap<>();
		stock.put("Bag", new Item("Bag", 1000));
		stock.put("Bottle", new Item("Bottle", 200));
		stock.put("Shirt", new Item("Shirt", 600));
		stock.put("Jeans", new Item("Jeans", 2000));
		stock.put("Shoes", new Item("Shoes", 5000));
		stock.put("Hoodie", new Item("Hoodie", 10000));
		stock.put("Novel", new Item("Novel", 400));
		stock.put("Watch", new Item("Watch", 3000));
		for(Map.Entry element: stock.entrySet()){
			Item item = (Item)element.getValue();
			float price = item.price;
			System.out.println(element.getKey()+"  "+price);
		}
		int t=1;
		Cart c = new Cart();
		while(t!=0){
			System.out.println("Enter the operation number");
			System.out.println("Enter 1 to Add to Cart");
			System.out.println("Enter 2 to delete");
			System.out.println("Enter 3 to update");
			System.out.println("Enter 4 to display");
			System.out.println("Enter 5 to exit");
			int x=input.nextInt();

			switch(x){
			case 1:{
				System.out.println("Enter the element to add");
				String str=input.next();			
				c.addItem(stock.get(str));
				break;
				}
			case 2:{
				System.out.println("Enter the element to delete");
				String str=input.next();
				Item val = (Item)stock.get(str);
				c.removeItem(val);
				break;
			}
			case 3:{
				System.out.println("Enter the element to update");
				String str=input.next();
				int qty=input.nextInt();
				c.updateQuantity(stock.get(str),qty);
				break;
			}
			case 4:{
				c.showDetails();
				System.out.println("Total Price: "+c.getPrice());
				break;
			}
			case 5:
			{
				t=0; 
				break;
			}
			default :
			{
				System.out.println("Enter valid choice");
				continue;
			}
			}
		}
	}

}
