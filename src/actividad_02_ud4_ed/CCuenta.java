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

/** Definicion de atributos de la clase Ccuenta
 * 
 */
  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor sin argumentos
     */
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
    * @return <code>nombre</code>retorna el nombre del titular
    */
    
    public String obtenerNombre()
    {
        return nombre;
    }

    /** 
    * @return <code>saldo</code> retorna el saldo disponible en la cuenta
    */
    
     public double estado ()
    {
        return saldo;
    }
    /** Metodo para ingresar dinero
    *  
    * @param cantidad Dinero a sacar de la cuenta
    * @throws Exception Controlamos que la cantidad ingresada no sea negativa
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
    * @throws Exception Controlamos que no se retiren cantidades negativas ni superiores al saldo
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
     * Devuelve el numero de cuenta
    * @return <code>cuenta</code> retorna la cuenta obtenida
    */
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
    * @param cuenta Establece la cuenta
    */
    
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Asignamos valor al saldo
    * @param saldo Establece el saldo
    */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Nos devuelve el tipo de interes
    * @return <code>tipoInterés</code> retorna el tipo de interés
    */
  
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
    * Asignamos valor al tipo de interes
    * @param tipoInterés Establece el tipoInterés
    */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
//PRUEBA
//PRUEBA2