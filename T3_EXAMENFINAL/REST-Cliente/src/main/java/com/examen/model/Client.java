package com.examen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

public class Client {

    @Id
    private String codigo_unico;
    private String nombre;
    private String apellido;
    private String tipo_documento;
    private String numero_documento;

    public Client(){

    }

    public Client(String codigo_unico, String nombre, String apellido, String tipo_documento, String numero_documento) {
        this.codigo_unico = codigo_unico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
    }

    public String getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(String codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }
}
