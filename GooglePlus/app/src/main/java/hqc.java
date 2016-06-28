import android.content.Context;

public abstract class hqc<D>
  extends fj<D>
{
  private D d;
  private boolean e;
  
  public hqc(Context paramContext)
  {
    super(paramContext);
  }
  
  private void p()
  {
    if (this.e)
    {
      o();
      this.e = false;
    }
  }
  
  public final void a(D paramD) {}
  
  public final void b(D paramD)
  {
    if (this.o) {}
    do
    {
      return;
      this.d = paramD;
    } while (!this.m);
    super.b(paramD);
  }
  
  public boolean f()
  {
    return false;
  }
  
  protected final void g()
  {
    if (this.d != null) {
      b(this.d);
    }
    if ((m()) || (this.d == null)) {
      a();
    }
    if (!this.e) {
      this.e = f();
    }
  }
  
  protected final void h()
  {
    k();
  }
  
  protected final void i()
  {
    super.i();
    k();
    this.d = null;
    p();
  }
  
  protected final void l()
  {
    super.l();
    p();
  }
  
  public boolean o()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqc
 * JD-Core Version:    0.7.0.1
 */