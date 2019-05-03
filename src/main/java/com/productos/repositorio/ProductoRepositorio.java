package com.productos.repositorio;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.productos.entidad.Producto;
//@EnableMongoAuditing
@Repository("repositorio")
public interface ProductoRepositorio extends MongoRepository<Producto, Serializable>{
	
	public abstract Producto findBy_id(ObjectId id);

	
}
