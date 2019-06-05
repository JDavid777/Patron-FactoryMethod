package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {
    private String codigo;
    private String banco;
    private String numeroCuenta;
    
    public void PagoTarjetaCredito(){
        
    }

   
    public void registrarPago(){
         System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("1254785", "Manuel", "Lara", "M", "manu@gmail.com");
        this.setCliente(cliente);

        this.setValor(2650000); // Cualquier valor de una logica de negocio que aun no se tiene
        this.setCodigo("1254578");
        this.setBanco("Bancolombia");
        this.setNumeroCuenta("1223-4334-54554-6454");
       

        System.out.println("Pago con tarjeta de debito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Valor: " + this.getValor());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    

}
