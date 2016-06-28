import android.content.Context;

public final class mbg
{
  private volatile mbb a;
  private final Object b = new Object();
  private final mbh c;
  private final boolean d = false;
  
  mbg(boolean paramBoolean, mbh parammbh)
  {
    this.c = parammbh;
  }
  
  public final mbb a(Context paramContext)
  {
    if (this.a == null) {}
    synchronized (this.b)
    {
      if (this.a == null)
      {
        mbb localmbb = new mbb(paramContext);
        if (this.d) {
          localmbb.b = mbb.a.a(paramContext.getApplicationContext());
        }
        if (this.c != null) {
          this.c.a(paramContext, localmbb);
        }
        this.a = localmbb;
      }
      return this.a;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbg
 * JD-Core Version:    0.7.0.1
 */