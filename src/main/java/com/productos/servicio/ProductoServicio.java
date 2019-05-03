package com.productos.servicio;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.productos.repositorio.ProductoRepositorio;
import com.productos.entidad.Producto;


@Service("servicio")
public class ProductoServicio {
	
	@Autowired
	@Qualifier("repositorio")
	private ProductoRepositorio repositorio;
	
	public boolean crear(Producto producto) {
		try {
			repositorio.save(producto);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<Producto> obtener() {
		List<Producto> producto =  repositorio.findAll();
		return producto;
	}
	
	public boolean actualizar(Producto producto) {
		try {
			repositorio.save(producto);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean borrar(ObjectId id) {
		try {
			Producto producto = repositorio.findBy_id(id);
			repositorio.delete(producto);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

	

}
