package com.example.formulario;

public class Formulario {
    private String Marca;
    private int Modelo;
    private String Color;
    private String Placa;
    private int Num_sillas;
    private int Cilindraje;

    Formulario(String bmw){
        this.Marca="";
        this.Modelo= 0;
        this.Color= "";
        this.Placa= "";
        this.Num_sillas= 0;
        this.Cilindraje= 0;
    }
    Formulario(String Marca, int Modelo, String Color, String Placa, int Num_sillas, int Cilindraje){
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.Color=Color;
        this.Placa=Placa;
        this.Num_sillas=Num_sillas;
        this.Cilindraje=Cilindraje;
    }
    public String getMarca(){return Marca;}
    public void setMarca(String Marca){this.Marca=Marca;}
    public int getModelo(){return Modelo;}
    public void setModelo(int Modelo){this.Marca=Marca;}
    public String getColor(){return Color;}
    public void setColor(String Color){this.Color=Color;}
    public String getPlaca(){return Placa;}
    public void setPlaca(String Placa){this.Placa=Placa;}
    public int getNum_sillas(){return Num_sillas;}
    public void setNum_sillas(int Num_sillas){this.Num_sillas=Num_sillas;}
    public int getCilindraje(){return Cilindraje;}
    public void setCilindraje(int Cilindraje){this.Cilindraje=Cilindraje;}
}