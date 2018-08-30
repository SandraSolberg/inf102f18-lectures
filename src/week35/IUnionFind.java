package week35;

/**
 * @author Torstein Strømme
 */
public interface IUnionFind {

    /**
     * Add a connection between item p and item q
     *
     * @param p the item
     * @param q the item
     */
    public void union(int p, int q);


    /**
     * Find the "component identifier" of item p
     *
     * @param p the item
     * @return component identifier of item p
     */
    public int find(int p);


    /**
     * Returns true if items p and q are connected either directly or indirectly
     * through some path.
     *
     * @param p an item
     * @param q an item
     * @return true if items p and q are connected, false otherwise
     */
    public boolean connected(int p, int q);

}
