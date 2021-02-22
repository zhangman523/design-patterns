package behavioralDesignPatterns.chain_of_responsibility.middleware;

/**
 * 基础验证接口
 * Base middleware class.
 */
public abstract class Middleware {

    private Middleware next;

    /**
     * Builds chains of middleware objects
     *
     * @param next Middleware
     * @return
     */
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     *
     * @param email    email
     * @param password pwd
     * @return
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     *
     * @param email    email
     * @param password pwd
     * @return
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
