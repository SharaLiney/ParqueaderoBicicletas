package edu.unilibre.datos;

public class Parqueadero {
    private int capacidad=20;
    private ArrayList<Bicicleta> bicicletas;
    private ArrayList<Bicicleta> historial;

    public int obtenerCapacidad() {
        return capacidad;
    }
    public ArrayList<Bicicleta> obtenerBicicletas() {
        return bicicletas;
    }
    public ArrayList<Bicicleta> obtenerHistorial() {
        return historial;
    }

    public void modificarCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void modificarBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
    public void modificarHistorial(ArrayList<Bicicleta> historial) {
        this.historial = historial;
    }

    public boolean agregar (Bicicleta bicicleta){
        if (bicicletas.size()>= capacidad){
            return false;
        }
        bicicletas.add(bicicleta);
        return true;
    }
    public Bicicleta buscar (int cupo){
        for (Bicicleta bicicleta: bicicletas){
            if(bicicleta.obtenerCupo() == cupo){
                return bicicleta;
            }
        }
        return null;
    }
    public int primerCupoLibre(){
        for (int cupo=1; cupo <= capacidad; cupo++){
            if (buscar(cupo)==null){
                return cupo;
            }
        }
        return -1;
    }
    public void liberarCupo(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        historial.add(bicicleta);
    }
    public int cuposDisponibles(){
        return capacidad - bicicletas.size();
    }
}
