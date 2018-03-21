package org.fuys.ownutil.instance;

import java.util.Arrays;
import java.util.Comparator;

class EBook {
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public EBook(String title,double price){
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "title : " + this.title + " -- price : " + this.price;
	}
}

class EBookComparator implements Comparator<EBook>{

	@Override
	public int compare(EBook o1, EBook o2) {
		if(o1==null || o2==null){
			return -2;
		}else if(o1.getPrice() < o2.getPrice()){
			return -1;
		}else if(o1.getPrice() > o2.getPrice()){
			return 1;
		}else {
			return 0;
		}
	}
	
}

public class ComparatorInstance {
	
	public static void main(String[] args) {
		EBook ebs[] = new EBook[]{
			new EBook("java", 11),
			new EBook("jsp", 12),
			new EBook("oracle", 10),
			new EBook("java", 11)
		};
		Arrays.sort(ebs, new EBookComparator());
		System.out.println(Arrays.toString(ebs));
	}

}
