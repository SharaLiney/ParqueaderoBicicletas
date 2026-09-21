package edu.unilibre.operaciones;

public class GestionParqueadero {
    private Parqueadero parqueadero;
    public GestionParqueadero (){
        this.parqueadero= new Parqueadero();
    }
    public Bicicleta registrarIngreso(String identificacion, String nombre){
        int cupo = parqueadero.primerCupoLibre();
        if (cupo == -1){
            return null;
        }
        Propietario propietario = new Propietario(identificacion, nombre);
        Bicicleta bicicleta = new Bicicleta(cupo, propietario);
        parqueadero.agregar(bicicleta);
        return bicicleta;
    }
    public String registrarSalida(int cupo){
        Bicicleta bicicleta = parqueadero.buscar(cupo);
        if (bicicleta == null){
            return null;
        }
        bicicleta.registrarSalida();
        return bicicleta.obtenerPropietario().toString();
    }
    public double calcularValor(int cupo){
        Bicicleta bicicleta = parqueadero.buscar(cupo);
        if (bicicleta == null){
            return -1;
        }
        return bicicleta.calcularValor();
    }
    public boolean registrarPago(int cupo){
        Bicicleta bicicleta = parqueadero.buscar(cupo);
        if (bicicleta == null){
            return false;
        }
        bicicleta.marcarPagado();
        parqueadero.liberarCupo(bicicleta);
        return true;
    }
    public int cuposDisponibles(){
        return parqueadero.cuposDisponibles();
    }
    public int cantidadBicicletasDia(LocalDate fecha){
        int contador =0;
        for (Bicicleta bicicleta: parqueadero.obtenerHistorial()){
            if (bicicleta.obtenerHoraSalida().toLocalDate().equals(fecha)){
                contador++;
            }
        }
        return contador;
    }
    public double valorIngresadoDia(LocalDate fecha){
        double total =0;
        for (Bicicleta bicicleta: parqueadero.obtenerHistorial()){
            if (bicicleta.obtenerHoraSalida().toLocalDate().equals(fecha)){
                total += bicicleta.calcularValor();
            }
        }
        return total;
    }
}
