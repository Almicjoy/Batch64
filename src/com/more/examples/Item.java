package com.more.examples;

import java.math.BigDecimal;

public class Item {
	private String name;
	private int qty;
	private BigDecimal price;
	
	public Item() {
		super();
	}
	
	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}

	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
