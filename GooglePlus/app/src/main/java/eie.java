import java.util.ArrayList;

public abstract class eie<TListener>
{
  TListener a;
  boolean b;
  
  public eie(TListener paramTListener)
  {
    Object localObject;
    this.a = localObject;
    this.b = false;
  }
  
  protected abstract void a(TListener paramTListener);
  
  public final void b()
  {
    c();
    synchronized (eib.c(this.c))
    {
      eib.c(this.c).remove(this);
      return;
    }
  }
  
  public final void c()
  {
    try
    {
      this.a = null;
      return;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eie
 * JD-Core Version:    0.7.0.1
 */