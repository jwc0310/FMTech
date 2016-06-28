import android.content.ContentResolver;
import android.content.Context;

public final class jbh
  extends fj<Integer>
{
  private final int d;
  private final Context e;
  private fv f = null;
  private Integer g = null;
  
  public jbh(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.d = paramInt;
    this.e = paramContext;
  }
  
  protected final void g()
  {
    if (this.f == null)
    {
      this.f = new fv(this);
      this.e.getContentResolver().registerContentObserver(jda.a, true, this.f);
    }
    if ((m()) || (this.g == null))
    {
      a();
      return;
    }
    b(this.g);
  }
  
  protected final void i()
  {
    if (this.f != null)
    {
      this.e.getContentResolver().unregisterContentObserver(this.f);
      this.f = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbh
 * JD-Core Version:    0.7.0.1
 */