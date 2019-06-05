package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta de crédito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaCredito extends Pago {

  
    private String codigo;
    private String Franquisia;
    private String numeroTarjeta;
    private String codigoSeguridad;

    // Completar constructores, por defecto y y parametrizado

    public PagoTarjetaCredito(String codigo, String Franquisia, String numeroTarjeta, String codigoSeguridad) {
        this.codigo = codigo;
        this.Franquisia = Franquisia;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
    }


    public PagoTarjetaCredito(){}
    @Override
    public void registrarPago() {
        //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("125478546", "Fernanda Maria", "Benavides", "F", "fer@gmail.com");
        this.setCliente(cliente);

        this.setValor(45600122); // Cualquier valor de una logica de negocio que aun no se tiene
        this.setCodigo("1254578");
        this.setCodigoSeguridad("1346");
        this.setFranquisia("VISA");
        this.setNumeroTarjeta("3154-123485-12547");

        System.out.println("Pago con tarjeta de crédito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código de Seguridad: " + this.getCodigoSeguridad());
        System.out.println("Franquisia: " + this.getFranquisia());
        System.out.println("Número de tarjeta: " + this.getNumeroTarjeta());
        System.out.println("Valor: " + this.getValor());

    }
    
    // Completar getters and setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFranquisia() {
        return Franquisia;
    }

    public void setFranquisia(String Franquisia) {
        this.Franquisia = Franquisia;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTargeta) {
        this.numeroTarjeta = numeroTargeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }


}
