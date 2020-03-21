package com.proyecto.appmall.response;

public class Tiendas {

    private String nombre;
    private String descripcion;
    private String horario;
    private String web;
    private String photoUrl;
    private int numeroTel;

    public Tiendas(){}

    public Tiendas(String nombre, String descripcion, String horario, String web, String photoUrl, int numeroTel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.web = web;
        this.photoUrl = photoUrl;
        this.numeroTel = numeroTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhotoUrl(){
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }

    public int getNumeroTel(){
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel){
        this.numeroTel = numeroTel;
    }
}
