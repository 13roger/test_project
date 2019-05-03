package com.productos.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")

public class Producto {
	

	
	
	private ObjectId _id;
	private String producto;
	private String departamento;
	private double precio;
	private boolean crearArchivo;
	
	public Producto() {
		
	}
	
	public Producto(ObjectId _id, String producto, String departamento, double precio, boolean crearArchivo) {
		this._id = _id;
		this.producto = producto;
		this.departamento = departamento;
		this.precio = precio;
		this.crearArchivo = crearArchivo;
	}
	public Producto(ObjectId _id, String producto, String departamento, double precio) {
		this._id = _id;
		this.producto = producto;
		this.departamento = departamento;
		this.precio = precio;
		//this.crearArchivo = crearArchivo;
	}
	
	public Producto(String producto, String departamento, double precio) {
		this.producto = producto;
		this.departamento = departamento;
		this.precio = precio;
		//this.crearArchivo = crearArchivo;
	}
	public ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId id) {
		this._id = id;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isCrearArchivo() {
		return crearArchivo;
	}
	public void setCrearArchivo(boolean crearArchivo) {
		this.crearArchivo = crearArchivo;
	}

	

	

}
