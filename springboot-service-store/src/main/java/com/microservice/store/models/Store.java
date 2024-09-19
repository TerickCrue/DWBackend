package com.microservice.store.models;


public class Store {
	
	private Celular cel;
	
	private Integer cantidad;
	
	public Store() {
		
	}
	

	public Store(Celular c, Integer cantidad) {
		super();
		this.cel = c;
		this.cantidad = cantidad;
	}



	public Celular getCel() {
		return cel;
	}

	public void setCel(Celular cel) {
		this.cel = cel;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
