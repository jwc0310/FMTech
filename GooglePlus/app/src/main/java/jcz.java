import android.content.Context;
import android.database.Cursor;

public abstract class jcz<T extends Cursor>
  extends fj<T>
{
  private T d;
  
  public jcz(Context paramContext)
  {
    super(paramContext);
  }
  
  private void a(T paramT)
  {
    if (this.d != paramT)
    {
      if ((this.d != null) && (!this.d.isClosed())) {
        this.d.close();
      }
      this.d = paramT;
    }
    if ((paramT != null) && (!paramT.isClosed())) {}
    for (;;)
    {
      try
      {
        paramT.getCount();
        ? = paramT;
      }
      catch (Exception localException)
      {
        ? = null;
        continue;
        int i = 0;
        continue;
        Object localObject = ?;
        continue;
      }
      if ((? != null) && (?.isClosed()))
      {
        i = 1;
        localObject = null;
        if (i == 0) {
          continue;
        }
        super.b(localObject);
      }
      T ? = paramT;
    }
  }
  
  public abstract T f();
  
  protected final void g()
  {
    if ((m()) || (this.d == null))
    {
      a();
      return;
    }
    a(this.d);
  }
  
  protected final void h()
  {
    k();
  }
  
  protected final void i()
  {
    super.i();
    k();
    if ((this.d != null) && (!this.d.isClosed())) {
      this.d.close();
    }
    this.d = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcz
 * JD-Core Version:    0.7.0.1
 */