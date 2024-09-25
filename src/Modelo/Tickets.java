package Modelo;

import java.util.Date;

public class Tickets {
    private int funcionId;
    private String usuarioId;
    private String usuarioNombre;
    private String usuarioEmail;
    private int peliculaId;
    private String peliculaTitulo;
    private int salaId;
    private String salaNombre;
    private String horaFuncion;
    private Date fechaReserva;
    private double totalPago;

    public Tickets(int funcionId, String usuarioId, String usuarioNombre, String usuarioEmail, int peliculaId, String peliculaTitulo, 
                  int salaId, String salaNombre, String horaFuncion, Date fechaReserva, Double totalPago) {
        this.funcionId = funcionId;
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.usuarioEmail = usuarioEmail;
        this.peliculaId = peliculaId;
        this.peliculaTitulo = peliculaTitulo;
        this.salaId = salaId;
        this.salaNombre = salaNombre;
        this.horaFuncion = horaFuncion;
        this.fechaReserva = fechaReserva;
        this.totalPago = totalPago;
    }

    // Getters y setters
    public int getFuncionId() { return funcionId; }
    public void setFuncionId(int funcionId) { this.funcionId = funcionId; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public String getUsuarioNombre() { return usuarioNombre; }
    public void setUsuarioNombre(String usuarioNombre) { this.usuarioNombre = usuarioNombre; }

    public String getUsuarioEmail() { return usuarioEmail; }
    public void setUsuarioEmail(String usuarioEmail) { this.usuarioEmail = usuarioEmail; }

    public int getPeliculaId() { return peliculaId; }
    public void setPeliculaId(int peliculaId) { this.peliculaId = peliculaId; }

    public String getPeliculaTitulo() { return peliculaTitulo; }
    public void setPeliculaTitulo(String peliculaTitulo) { this.peliculaTitulo = peliculaTitulo; }

    public int getSalaId() { return salaId; }
    public void setSalaId(int salaId) { this.salaId = salaId; }

    public String getSalaNombre() { return salaNombre; }
    public void setSalaNombre(String salaNombre) { this.salaNombre = salaNombre; }

    public String getHoraFuncion() { return horaFuncion; }
    public void setHoraFuncion(String horaFuncion) { this.horaFuncion = horaFuncion; }

    public Date getFechaReserva() { return fechaReserva; }
    public void setFechaReserva(Date fechaReserva) { this.fechaReserva = fechaReserva; }

    public double getTotalPago() { return totalPago; }
    public void setTotalPago(double totalPago) { this.totalPago = totalPago; }
}
