package com.jibbs.finance.stock.service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import com.jibs.finance.stock.service.StockDataRetrievalService;
import com.jibs.finance.stock.service.StockPrice;

@Service(StockDataRetrievalServiceImpl.NAME)
public class StockDataRetrievalServiceImpl implements StockDataRetrievalService
{
	public static final String NAME = "stockDataRetrievalService";

	@Override
	public StockPrice findCurrentPrice(String ticker)
	{
		StockPrice price = new StockPrice();
		price.setDate(ZonedDateTime.now());
		price.setHigh(BigDecimal.valueOf(120.00d));
		price.setLow(BigDecimal.valueOf(114.00));
		price.setPrice(BigDecimal.valueOf(119.88d));
		price.setTicker("RIG");
		return null;
	}

}
