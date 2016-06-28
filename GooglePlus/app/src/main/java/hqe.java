import android.content.Context;
import android.database.sqlite.SQLiteException;

public abstract class hqe<E>
  extends fj<E>
{
  private boolean d;
  public boolean g;
  
  public hqe(Context paramContext)
  {
    super(paramContext);
  }
  
  public void b(E paramE)
  {
    if (!this.d) {
      super.b(paramE);
    }
  }
  
  public final E d()
  {
    if (!this.d) {
      try
      {
        Object localObject = f();
        return localObject;
      }
      catch (SQLiteException localSQLiteException)
      {
        this.d = true;
      }
    }
    return null;
  }
  
  public abstract E f();
  
  public void g()
  {
    super.g();
    a();
    if (!this.g) {
      this.g = o();
    }
  }
  
  public final void h()
  {
    super.h();
    k();
  }
  
  public void i()
  {
    k();
    super.i();
    q();
  }
  
  public void l()
  {
    super.l();
    q();
  }
  
  public boolean o()
  {
    return false;
  }
  
  public boolean p()
  {
    return true;
  }
  
  public final void q()
  {
    if (this.g)
    {
      p();
      this.g = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqe
 * JD-Core Version:    0.7.0.1
 */