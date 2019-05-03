package com.productos.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productos.entidad.Producto;
import com.productos.servicio.ProductoServicio;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductoController {
	
	@Autowired
	@Qualifier("servicio")
	ProductoServicio servicio;
	
	@RequestMapping(value= "/producto/crear", method= RequestMethod.POST)
	public boolean crearProducto(@RequestParam(value="producto")String producto,@RequestParam(value="departamento") String departamento, 
			@RequestParam(value="precio") double precio) {
		
		Producto producto1 = new Producto (producto,departamento,precio);
        return servicio.crear(producto1);
    }
	
	@RequestMapping(value= "/producto/obtener", method= RequestMethod.GET)
	public List<Producto> obtenerProductos() {
		return servicio.obtener();
	}
	
	@RequestMapping(value= "/producto/actualizar", method= RequestMethod.PUT)
	public boolean actualizarProducto(@RequestParam(value="id")ObjectId id,@RequestParam(value="producto")String producto,
			@RequestParam(value="departamento") String departamento, @RequestParam(value="precio") double precio) {
		Producto producto1 = new Producto (id,producto,departamento,precio);
        return servicio.crear(producto1);
    }
	
	@RequestMapping(value= "/producto/delete", method= RequestMethod.DELETE)
	public boolean borrarProducto(@RequestParam(value="id") ObjectId id) {
		return servicio.borrar(id);
	}
	

}
