package com.jibs.finance.stock.service;

public interface StockDataRetrievalService
{
	public StockPrice findCurrentPrice(String ticker);
}
