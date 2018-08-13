package com.yiibai.mybatis07_spring.maper;

import java.util.List;

import com.yiibai.mybatis07_spring.pojo.Order;
import com.yiibai.mybatis07_spring.pojo.User;

public interface UserMaper {
	
	User getUserById(int id);
	
	List<Order> getUserOrders(int id);
}
