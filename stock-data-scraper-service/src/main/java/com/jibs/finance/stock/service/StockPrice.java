package com.jibs.finance.stock.service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class StockPrice
{
	private String ticker;
	private BigDecimal price;
	private BigDecimal high;
	private BigDecimal low;
	private ZonedDateTime date;

	public String getTicker()
	{
		return ticker;
	}

	public void setTicker(String ticker)
	{
		this.ticker = ticker;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public BigDecimal getHigh()
	{
		return high;
	}

	public void setHigh(BigDecimal high)
	{
		this.high = high;
	}

	public BigDecimal getLow()
	{
		return low;
	}

	public void setLow(BigDecimal low)
	{
		this.low = low;
	}

	public ZonedDateTime getDate()
	{
		return date;
	}

	public void setDate(ZonedDateTime date)
	{
		this.date = date;
	}
}
