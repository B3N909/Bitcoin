package me.savant.bitcoin;

import me.savant.bitcoin.cex.OrderType;

public abstract class Index
{
	private int tradeID;
	private OrderType type;
	private float amount;
	private float price;
	private int date;
	
	public Index(int tradeID, OrderType type, float amount, float price, int date)
	{
		this.tradeID = tradeID;
		this.type = type;
		this.amount = amount;
		this.price = price;
		this.date = date;
	}
	
	public int getTradeID()
	{
		return tradeID;
	}
	
	public OrderType getType()
	{
		return type;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public int getDate()
	{
		return date;
	}
}
