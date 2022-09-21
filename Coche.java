package tallerpablobel;

import java.util.Date;

public class Coche {
    String matricula;
    String duenyo;
    int telefono;
    String modelo;
    String marca;
    String averia;
    int precioFinal;

    public Coche(String matricula, String duenyo, int telefono, String modelo, String marca, String averia) {
        this.matricula = matricula;
        this.duenyo = duenyo;
        this.telefono = telefono;
        this.modelo = modelo;
        this.marca = marca;
        this.averia = averia;
    }

    public Coche(String matricula, String duenyo, String averia, int precioFinal) {
        this.matricula = matricula;
        this.duenyo = duenyo;
        this.averia = averia;
        this.precioFinal = precioFinal;
    }

    public Coche(String matricula, String duenyo, String modelo, String marca, String averia) {
        this.matricula = matricula;
        this.duenyo = duenyo;
        this.modelo = modelo;
        this.marca = marca;
        this.averia = averia;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    
    public Coche (String matricula, int telefono){
        this.matricula = matricula;
        this.telefono = telefono;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(String duenyo) {
        this.duenyo = duenyo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAveria() {
        return averia;
    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", duenyo=" + duenyo + ", telefono=" + telefono + ", modelo=" + modelo + ", marca=" + marca + ", averia=" + averia + '}';
    }
    
    
    
    
}
