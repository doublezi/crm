package com.crm.service.impl;

import com.crm.dao.OrderLineDao;
import com.crm.service.OrderLineService;

public class OrderLineServiceImpl implements OrderLineService {
	private OrderLineDao orderLineDao;
	public void setOrderLineDao(OrderLineDao orderLineDao) {
		this.orderLineDao = orderLineDao;
	}
	
}
