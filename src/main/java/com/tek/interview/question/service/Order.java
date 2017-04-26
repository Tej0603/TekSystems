package com.tek.interview.question.service;

import java.util.ArrayList;
import java.util.List;

import com.tek.interview.question.model.OrderLine;

/**
 * Order class containing multiple {@link OrderLine} elements
 *
 */
public class Order implements IOrderService {

	private List<OrderLine> orderLines;

	/**
	 * Add an OrderLine to the cart
	 * 
	 * @param orderLine
	 * @throws IllegalArgumentException if the specified orderLine is null
	 */
	public void add(OrderLine o) throws Exception {
		if (o == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		// BUG 1 : Initialize orderLines
		if(orderLines == null) {
			orderLines = new ArrayList<OrderLine>();
		}
		orderLines.add(o);
	}

	/**
	 * Get number of items added to the cart
	 * 
	 * @return
	 */
	public int size() {
		return orderLines.size();
	}

	/**
	 * Get the {@link OrderLine} from collection at the given index position
	 * 
	 */
	public OrderLine get(int index) {
		return orderLines.get(index);
	}

	/**
	 * Clear the cart
	 * 
	 */
	public void clear() {
		this.orderLines.clear();
	}
}