public class Smartphone {
    private String marca;
    private String modelo;
    private double tamanyoPantalla;
    private int capacidadBateria;
    private boolean encendido;
    private int nivelBateria;
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, double tamanyoPantalla, int capacidadBateria, boolean encendido, int mivelBateria, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanyoPantalla = tamanyoPantalla;
        this.capacidadBateria = capacidadBateria;
        this.encendido = encendido;
        this.nivelBateria = mivelBateria;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Smartphone() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanyoPantalla() {
        return tamanyoPantalla;
    }

    public void setTamanyoPantalla(double tamanyoPantalla) {
        this.tamanyoPantalla = tamanyoPantalla;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getMivelBateria() {
        return nivelBateria;
    }

    public void setMivelBateria(int mivelBateria) {
        this.nivelBateria = mivelBateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public boolean getencender() {
        return this.encendido=true;
    }
    public boolean getapagado() {
        return this.encendido=false;
    }
    public String getusar(int minutos){
       int porcentaje = minutos/5;
       this.nivelBateria -= porcentaje;
       return this.nivelBateria+"%";
    }
    public String getcagar(int minutos){
        int porcentaje = minutos/2;
        this.nivelBateria += porcentaje;
        return this.nivelBateria+"%";
    }

    @Override
    public String toString() {
        return this.marca+ " " + this.modelo + " -Encendido: "+ encendido + ", bateria restante: "+ nivelBateria+"%";
    }
}
