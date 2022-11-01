package com.segundaDemo.vehiculo.partes;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Auto {

    private int kiloemtros;
    private String codigo;
    public static final int AUTONOMIA = 600;


    public Chofer esConducido;


    public Propietario propietario;


    public Motor tieneUn;


    private List<Ruedas> tiene = new ArrayList<Ruedas>();

    public int Autonomia(){
        return 5;
    }
}
