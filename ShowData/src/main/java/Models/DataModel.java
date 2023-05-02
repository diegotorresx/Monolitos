/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author torresforero.10
 */
public class DataModel {
    String idCliente;
    String nombre;
    String tipo;
    String datoRitmo;
    String datoTemperatura;
    String datoOxigeno;
    String fechaHora;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDatoRitmo() {
        return datoRitmo;
    }
    public void setDatoRitmo(String datoRitmo) {
        this.datoRitmo = datoRitmo;
    }
    public String getDatoTemperatura() {
        return datoTemperatura;
    }
    public void setDatoTemperatura(String datoTemperatura) {
        this.datoTemperatura = datoTemperatura;
    }
    public String getDatoOxigeno() {
        return datoOxigeno;
    }
    public void setDatoOxigeno(String datoOxigeno) {
        this.datoOxigeno = datoOxigeno;
    }
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
