package com.examen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo_Unico;
    private String nombre_producto;
    private String tipo_Producto;
    private String estado;
    private BigDecimal balance;
    private LocalDateTime fecha_Creacion;

    public Product(){

    }

    public Product(Long id, String codigo_Unico, String nombre_producto, String tipo_Producto, String estado, BigDecimal balance, LocalDateTime fecha_Creacion) {
        this.id = id;
        this.codigo_Unico = codigo_Unico;
        this.nombre_producto = nombre_producto;
        this.tipo_Producto = tipo_Producto;
        this.estado = estado;
        this.balance = balance;
        this.fecha_Creacion = fecha_Creacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo_Unico() {
        return codigo_Unico;
    }

    public void setCodigo_Unico(String codigo_Unico) {
        this.codigo_Unico = codigo_Unico;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getTipo_Producto() {
        return tipo_Producto;
    }

    public void setTipo_Producto(String tipo_Producto) {
        this.tipo_Producto = tipo_Producto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(LocalDateTime fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }
}
