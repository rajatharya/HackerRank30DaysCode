package day22binarysearchtree;

public interface Tree<D extends Comparable> {

	public boolean isEmpty();
	public int cardinality();
	public boolean member(D element);
	public NonEmptyBST <D> add(D element);
}
