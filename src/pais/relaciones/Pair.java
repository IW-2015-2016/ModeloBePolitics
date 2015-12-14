package pais.relaciones;

public class Pair<L,R> {

	  private final L left;
	  private R right;

	  public Pair(L left, R right) {
	    this.left = left;
	    this.right = right;
	  }

	  public L getLeft() { return left; }
	  public R getRight() { return right; }

	  public void setRight(R right){
		  this.right = right;
	  }
	  @Override
	  public int hashCode() { return left.hashCode() ^ right.hashCode(); }

	  /**
	   * Devuelve true si el objeto de la izquierda es igual
	   * @param o el Par a comparar
	   * @return true si el objeto de la izquierda es el mismo, false en caso contrario	  
	   */
	  @Override
	  public boolean equals(Object o) {
	    if (!(o instanceof Pair)) return false;
	    Pair pairo = (Pair) o;
	    return this.left.equals(pairo.getLeft());// &&  this.right.equals(pairo.getRight());
	  }
}
