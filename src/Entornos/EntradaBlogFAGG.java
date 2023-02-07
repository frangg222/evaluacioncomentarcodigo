package Entornos;
/**
 *

 * @author francisco andres

 * @version 2023

 *

 */

public class EntradaBlogFAGG{

    /**

     * separador es el ccarácter que separa ENTRADA DE del

     * nombre del autor

     */


    public static char separador=':';

    private int id;

    private String texto;

    private String autor;

/**

 * Constructor de la clase. recibe el número de entrada, el nombre del autor

 * de la entrada y el texto que contiene la entrada. Si el número de entrada

 * es negativo, lanza una excepción.

 */

    /**

     *

     * @param id

     * @param autor

     * @param texto

     * @throws IllegalArgumentException

     */

    public EntradaBlogFAGG(int id,String autor,String texto)throws IllegalArgumentException{

        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");

        this.id=id;

        this.autor=autor;

        this.texto=texto;

    }

    @Override

    public String toString(){

        String cad="";

        cad+="\nENTRADA DE"+separador+autor;

        cad+="\n "+texto;

        return cad;

    }


    /**

     * devuelve el numero de entrada

     * @return

     */

    public int getId(){

        return this.id;

    }


    /**

     * devuelve el texto completo de la entrada

     * @return

     */

    public String getTexto(){

        return this.texto;

    }


    /**

     * devuelve el nombre del autor de la entrada en mayúsculas

     */

    public String getAutor(){

        return this.autor.toUpperCase();

    }


    /**

     * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor

     */

    public String devuelveAutor(){

        return this.autor;

    }


    /**

     * No tiene porqué tener argumentos.

     * @param args

     */

    public static void main(String[] args) {


        EntradaBlogFAGG e1=new EntradaBlogFAGG (-3,"ana","Últimas noticias, está disponible BixBy 2.0");

        System.out.println(e1);

    }

}


