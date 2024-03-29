package co.agenciaviajes.negocio;

/**
 * Pago en efectivo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoEfectivo extends Pago {
    
    public PagoEfectivo(){}
    
    public void registrarPago(){
         System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("98393282", "Carlos", "Sanchez Londoño", "M", "Car@gmail.com");
        this.setCliente(cliente);

        this.setValor(45600122); // Cualquier valor de una logica de negocio que aun no se tiene
        

        System.out.println("Pago en efectivo registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
   
        System.out.println("Valor: " + this.getValor());
        
    }

}
