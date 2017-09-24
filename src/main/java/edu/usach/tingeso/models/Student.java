package edu.usach.tingeso.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="alumno_id")
    private long alumno_id;

    @NotNull
    private String rut;

 	@NotNull
 	private String primer_nombre;

    @NotNull
 	private String apellido;

    @NotNull
 	private String carrera;

    @NotNull
 	private String email;

    @NotNull
 	private int anio_ingreso;

    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }

    public long getAlumno_id(){
        return alumno_id;
    }


    public void setAlumno_id(long alumno_id)
 	{
        this.alumno_id = alumno_id;
    }

             	public String getPrimer_nombre()
 	{
                		return primer_nombre;
            	}

             	public void setPrimer_nombre(String primer_nombre)
 	{
                		this.primer_nombre = primer_nombre;
            	}

             	public String getApellido()
 	{
                		return apellido;
            	}

             	public void setApellido(String apellido)
 	{
                		this.apellido= apellido;
            	}

             	public String getCarrera()
 	{
                		return carrera;
            	}

            	public void setCarrera(String carrera){
                    this.carrera=carrera;
                }

             	public String getEmail()
 	{
                		return email;
            	}

            	public void setEmail(String email)
 	{
                		this.email = email;
            	}

             	public int getAnio_ingreso()
 	{
               		return anio_ingreso;
            	}

             	public void setAnio_ingreso(int anio_ingreso)
 	{
                		this.anio_ingreso= anio_ingreso;
            	}
}
