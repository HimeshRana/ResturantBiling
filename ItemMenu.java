package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Item {
	private String name;
	private String type;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

}

public class ItemMenu {
	private static final String STARTER = "<Starter>";
	private static final String MAINCOURSE = "<Maincourse>";
	private static final String COLDDRINKS = "<Cold drinks>";
	private static final String DESERT = "<Desert>";

	public static void main(String[] args) {
		new ItemMenu().getMenu();

	}

	public void getMenu() {
		List<Item> items = new ArrayList<>();
		List<Item> starterItems = getStarterMenu();
		items.addAll(starterItems);
		List<Item> mainCourseItems = getMaincourseMenu();
		items.addAll(mainCourseItems);
		List<Item> coldDrinkItems = getColdDrinkMenu();
		items.addAll(coldDrinkItems);
		List<Item> desertItems = getDesertMenu();
		items.addAll(desertItems);
		printData(items);
		// add item by admin
		// print data
		System.out.println();

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Do you want to add items? \nYes or no (click y for yes or click any button to exit)");
		System.out.print("Enter your choice : ");
		char ch = sc1.next().charAt(0);

		if (ch == 'y') {
			System.out.println(
					"1.Starter\n2.Main course\n3.Cold drinks\n4.Deserte\nEnter number of menu in which item should added : ");
			int choice = sc1.nextInt();
			if (choice == 1) {
				System.out.println("Enter item : ");
				String name = sc.nextLine();
				Item item = new Item();
				item.setName(name);
				System.out.println("Enter item price : ");
				int price = sc.nextInt();
				item.setPrice(price);
				item.setType(STARTER);
				starterItems.add(item);
			}

			else if (choice == 2) {
				System.out.println("Enter item : ");
				String name = sc.nextLine();
				Item item = new Item();
				item.setName(name);
				System.out.println("Enter item price : ");
				int price = sc.nextInt();
				item.setPrice(price);
				item.setType(MAINCOURSE);
				mainCourseItems.add(item);
			}

			items.clear();
			items.addAll(starterItems);
			items.addAll(mainCourseItems);
			items.addAll(coldDrinkItems);
			items.addAll(desertItems);
			printData(items);

		}
	}

//	private Item addData() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter item : ");
//		String name = sc.nextLine();
//		Item item = new Item();
//		item.setName(name);
//		System.out.println("Enter item price : ");
//	    int price = sc.nextInt();
//		item.setPrice(price);
//		return item;
//	}

	private void printData(List<Item> items) {
		System.out.println(STARTER);
		for (Item item : items) {
			if (item.getType().equals(STARTER)) {
				System.out.println("-" + item.getName() + " : " + item.getPrice());
			}
		}

		System.out.println();
		System.out.println(MAINCOURSE);
		for (Item item : items) {
			if (item.getType().equals(MAINCOURSE)) {
				System.out.println("-" + item.getName() + " : " + item.getPrice());
			}
		}

		System.out.println();
		System.out.println(COLDDRINKS);
		for (Item item : items) {
			if (item.getType().equals(COLDDRINKS)) {
				System.out.println("-" + item.getName() + " : " + item.getPrice());
			}
		}

		System.out.println();
		System.out.println(DESERT);
		for (Item item : items) {
			if (item.getType().equals(DESERT)) {
				System.out.println("-" + item.getName() + " : " + item.getPrice());
			}
		}
	}

	private List<Item> getStarterMenu() {
		List<Item> starterItems = new ArrayList<>();
		Item item = new Item();
		item.setName("Manchurian");
		item.setPrice(90);
		starterItems.add(item);

		Item item2 = new Item();
		item2.setName("Panner Chilli");
		item2.setPrice(110);
		starterItems.add(item2);

		Item item3 = new Item();
		item3.setName("Hot and sour");
		item3.setPrice(70);
		starterItems.add(item3);

		Item item4 = new Item();
		item4.setName("Hara bhara kabab");
		item4.setPrice(120);
		starterItems.add(item4);

		Item item5 = new Item();
		item5.setName("Panner 65");
		item5.setPrice(100);
		starterItems.add(item5);

		for (Item i : starterItems) {
			i.setType(STARTER);
		}
		return starterItems;
	}

	private List<Item> getMaincourseMenu() {
		List<Item> mainCourseItems = new ArrayList<>();

		Item item = new Item();
		item.setName("Panner tikka");
		item.setPrice(160);
		mainCourseItems.add(item);

		Item item2 = new Item();
		item2.setName("Panner butter masala");
		item2.setPrice(175);
		mainCourseItems.add(item2);

		Item item3 = new Item();
		item3.setName("Panner handi");
		item3.setPrice(180);
		mainCourseItems.add(item3);

		Item item4 = new Item();
		item4.setName("Veg kofta");
		item4.setPrice(155);
		mainCourseItems.add(item4);

		Item item5 = new Item();
		item5.setName("Panner kofta");
		item5.setPrice(190);
		mainCourseItems.add(item5);

		Item item6 = new Item();
		item6.setName("Chapati");
		item6.setPrice(15);
		mainCourseItems.add(item6);

		Item item7 = new Item();
		item7.setName("Nan");
		item7.setPrice(30);
		mainCourseItems.add(item7);

		Item item8 = new Item();
		item8.setName("Jeera rice");
		item8.setPrice(110);
		mainCourseItems.add(item8);

		Item item9 = new Item();
		item9.setName("Dal fry");
		item9.setPrice(90);
		mainCourseItems.add(item9);

		Item item10 = new Item();
		item10.setName("Veg Biryani");
		item10.setPrice(150);
		mainCourseItems.add(item10);

		for (Item i : mainCourseItems) {
			i.setType(MAINCOURSE);
		}

		return mainCourseItems;
	}

	private List<Item> getColdDrinkMenu() {
		List<Item> coldDrinkItems = new ArrayList<>();

		Item item = new Item();
		item.setName("Faluda");
		item.setPrice(70);
		coldDrinkItems.add(item);

		Item item2 = new Item();
		item2.setName("Cold coco");
		item2.setPrice(55);
		coldDrinkItems.add(item2);

		Item item3 = new Item();
		item3.setName("Fruit salad");
		item3.setPrice(65);
		coldDrinkItems.add(item3);

		Item item4 = new Item();
		item4.setName("Sprite and coke");
		item4.setPrice(40);
		coldDrinkItems.add(item4);

		Item item5 = new Item();
		item5.setName("Badam shek");
		item5.setPrice(70);
		coldDrinkItems.add(item5);

		for (Item i : coldDrinkItems) {
			i.setType(COLDDRINKS);
		}
		return coldDrinkItems;

	}

	private List<Item> getDesertMenu() {
		List<Item> desertItems = new ArrayList<>();
		Item item = new Item();
		item.setName("Gulab jambun");
		item.setPrice(40);
		desertItems.add(item);

		Item item2 = new Item();
		item2.setName("Ice Cream");
		item2.setPrice(30);
		desertItems.add(item2);

		Item item3 = new Item();
		item3.setName("Gajar halvo");
		item3.setPrice(50);
		desertItems.add(item3);

		Item item4 = new Item();
		item4.setName("Malai kulfi");
		item4.setPrice(40);
		desertItems.add(item4);

		for (Item i : desertItems) {
			i.setType(DESERT);
		}
		return desertItems;
	}

}
