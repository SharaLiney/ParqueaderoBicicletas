package edu.unilibre.datos;
import java.time.LocalDateTime;

public class Bicicleta {
    private int cupo;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private boolean pagado;
    private double valorMinuto=10;

    public int obtenerCupo() {
        return cupo;
    }
    public LocalDateTime obtenerHoraIngreso() {
        return horaIngreso;
    }
    public LocalDateTime obtenerHoraSalida() {
        return horaSalida;
    }
    public boolean obtenerPagado(){
        return pagado;
    }
    public double obtenerValorMinuto() {
        return valorMinuto;
    }

    public void modificarCupo(int cupo) {
        this.cupo = cupo;
    }
    public void modificarHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
    public void modificarHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    public void modificarPagado(boolean pagado) {
        this.pagado = pagado;
    }
    public void modificarValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public Bicicleta (int cupo, LocalDateTime horaIngreso, LocalDateTime horaSalida, boolean pagado, double valorMinuto){
        this.cupo=cupo;
        this.horaIngreso=horaIngreso;
        this.horaSalida=horaSalida;
        this.pagado=pagado;
        this.valorMinuto=valorMinuto;
    }
}
