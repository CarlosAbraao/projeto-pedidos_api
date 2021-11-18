package com.devcarlosabraao.curso.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devcarlosabraao.curso.entities.PK.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name ="tb_order_item")
public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK(); // INSTACIAR A CLASSE
	
	private Integer quantity;
	
	private Double price;
	
	public OrderItem() {
		
	}

	public OrderItem(Order order, Product product,Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
		
	
	}
	
	
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	
	public Product getProduct() {
		return id.getProduct();
		
	
	}
	
	
	
	public void setProduct(Product Product) {
		id.setProduct(Product);
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	
	
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//METODO QUE RETORNA O SUBTOTAL
	public Double getSubTotal() {
		
		return price * quantity;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	

}