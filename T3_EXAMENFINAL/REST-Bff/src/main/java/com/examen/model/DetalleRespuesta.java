package com.examen.model;

import com.examen.entity.Client;
import com.examen.entity.Product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@Getter
@Setter

public class DetalleRespuesta {
	

    private Client cliente;

    private List<Product> productos;

    public DetalleRespuesta(){

    }

    public DetalleRespuesta(Client cliente, List<Product> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public List<Product> getProductos() {
        return productos;
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }
}
