package lab5;
public class Nodo {
    // auto referencia
    private int dato;
    private Nodo enlace;
    
    /**
     * Constructor Nodo
     * Se inicializan los atributos de la clase por defecto
     */
    public Nodo(){
        this.dato = 0;
        this.enlace = null;
    }
    /**
     * Constructor Nodo
     * Inicializa el atributo dato de la clase
     * @param dato
     */
    public Nodo(int dato){
        this.dato = dato;
        this.enlace = null;
    }
    /**
     * Se obtiene el dato del Nodo
     * @return valor entero correspondiente al dato
     */
    public int getDato(){
        return dato;
    }
    /**
     * Se actualiza el dato del nodo
     * @param dato
     */
    public void setDato(int dato){
        this.dato= dato;
    }
    /**
     * Obtiene el valor de la referencia 
     * @return referencia del siguiente nodo
     */
    public Nodo getEnlace(){
        return enlace;
    }
    /**
     * Se actualiza la referencia del nodo
     * @param enlace
     */
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}
