package parknshop.parknshopapp.Base.HttpController;

/**
 * Created by chrisyu on 15/12/10.
 */
public abstract class CustomRunnable<T> implements Runnable {
    public T data;
    public String url;
    public String dataString;

    @Override
    abstract public void run();
}
