package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "payments")
public class Payment {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@ManyToOne
		@JoinColumn(name ="order_id", nullable = false)
		private Order order;
		private double amount;
		private String paymentMethod;
		//Credit card,Paypal,etc.
		private boolean successful;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public boolean isSuccessful() {
			return successful;
		}
		public void setSuccessful(boolean successful) {
			this.successful = successful;
		}
		
		

	}


