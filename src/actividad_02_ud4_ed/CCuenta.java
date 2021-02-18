/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;
/**
* @author David Rodriguez
*/

public class CCuenta {


  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * @param nom Nombre de el titular de la cuenta
    * @param cue Cuenta
    * @param sal Saldo en cuenta
    * @param tipo Tipo de interes
    */
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  
    /**
    * @param nom Nombre que va a ser asignado al titular de la cuenta
    */
    
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
    * @return retorna el nombre obtenido
    */
    
    public String obtenerNombre()
    {
        return nombre;
    }

    /** 
    * @return retorna el estado del saldo
    */
    
     public double estado ()
    {
        return saldo;
    }
    /** Metodo para ingresar dinero
    *  
    * @param cantidad Dinero a sacar de la cuenta
    * @throws Esception Controlamos que la cantidad ingresada no sea negativa
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /** Metodo para ingresar dinero
    *  
    * @param cantidad Dinero a sacar de la cuenta
    * @see estado() Estado de la cuenta
    * @throws Esception Controlamos que la cantidad ingresada no sea negativa
     */
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
    * @return retorna la cuenta obtenida
    */
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
    * @param cuenta Establecer cuenta
    */
    
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
    * @param saldo Establecer saldo
    */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
    * @return retorna el tipo de interés
    */
  
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
    * @param tipoInterés Establecer tipoInterés
    */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
