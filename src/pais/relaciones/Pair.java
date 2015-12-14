package pais.relaciones;
/**
 * Relaciona dos objetos. El de la izquierda ser� inmutable pero el de la derecha se puede
 * cambiar a discrecci�n. La clase pair s�lo compara en su m�todo equals al objeto de la 
 * izquierda, el de la derecha no ser� comparado.
 * 
 * @author Ismael
 * @author <a href="https://www.linkedin.com/in/glen-edmonds-77b6208"> Glen Edmonds </a> on the source <a href="https://stackoverflow.com/questions/521171/a-java-collection-of-value-pairs-tuples">https://stackoverflow.com/questions/521171/a-java-collection-of-value-pairs-tuples</a> 
 *
 * @param <L> Una clase cualquiera. Tras la creaci�n el objeto ser� inmutable
 * @param <R> Una clase cualquiera
 * 
 */
public class Pair<L,R> {

	  private final L left;
	  private R right;
	  /**
	   * Constructor �nico, debe recibir los dos par�metros. se ha de tener cuidado de no introducir un
	   * null en left, porque no se podr� modificar m�s adelante, right sin embargo es mutable
	   * @param left un par�metro que ser� inmutable
	   * @param right un par�metro modificable
	   */
	  public Pair(L left, R right) {
	    this.left = left;
	    this.right = right;
	  }

	  public L getLeft() { 
		  return left; 
	  }
	  public R getRight() { 
		  return right; 
	  }
	  /**
	   * Permite modificar el par�metro right, es posible introducir null
	   * @param right un par�metro del tipo <R>
	   */
	  public void setRight(R right){
		  this.right = right;
	  }
	  /**
	   * El c�digo hash ser� un and expl�cito de left. no teniendo en cuenta right
	   * @return un c�digo hash
	   */
	  @Override
	  public int hashCode() { 
		  return left.hashCode();// ^ right.hashCode(); 
	  }

	  /**
	   * Devuelve true si el objeto de la izquierda es igual
	   * @param o el Par a comparar
	   * @return true si el objeto de la izquierda es el mismo, false en caso contrario	  
	   */
	  @SuppressWarnings("unchecked")
      @Override
	  public boolean equals(Object o) {
	    if (!(o instanceof Pair)) return false;
	    Pair<L,R> par = (Pair<L,R>) o;
	    return this.left.equals(par.getLeft());// &&  this.right.equals(pairo.getRight());
	  }
}