package com.tek.interview.question.service;

import com.tek.interview.question.model.OrderLine;

public interface IOrderService {

	/**
	 * Add an Order Line
	 * 
	 * @param orderLine
	 * @throws IllegalArgumentException
	 */
	void add(OrderLine orderLine) throws Exception;

	/**
	 * Retruns number of orders added
	 * 
	 * @return
	 */
	int size();

	/**
	 * Get an order line at given index position
	 * 
	 * @param index
	 * @return OrderLine
	 */
	OrderLine get(int index);

	/**
	 * Clears the cart
	 */
	void clear();

}