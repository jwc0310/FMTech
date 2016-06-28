import java.util.concurrent.Executor;

public enum pii
  implements Executor
{
  static
  {
    pii[] arrayOfpii = new pii[1];
    arrayOfpii[0] = a;
    b = arrayOfpii;
  }
  
  private pii() {}
  
  public final void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public final String toString()
  {
    return "MoreExecutors.directExecutor()";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pii
 * JD-Core Version:    0.7.0.1
 */