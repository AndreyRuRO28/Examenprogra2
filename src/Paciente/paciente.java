/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paciente;

/**
 *
 * @author Student
 */
public class paciente {
    private int cedula;
    private String nombre;
    private String Fecha;
    private String horaLlegada;
    private String horaSalida;
    private String clasificacion;

    public paciente(int cedula, String nombre, String Fecha, String horaLlegada, String horaSalida, String clasificacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.clasificacion = clasificacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
}
