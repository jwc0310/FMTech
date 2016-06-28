import android.content.Context;
import android.os.Build.VERSION;

public final class hu
{
  public final hy a;
  private final in b;
  
  public hu(Context paramContext, in paramin)
  {
    if (paramin == null) {
      throw new IllegalArgumentException("sessionToken must not be null");
    }
    this.b = paramin;
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a = new hz(paramContext, paramin);
      return;
    }
    this.a = new ia(this.b);
  }
  
  public final void a(hv paramhv)
  {
    if (paramhv == null) {
      throw new IllegalArgumentException("callback cannot be null");
    }
    this.a.a(paramhv);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hu
 * JD-Core Version:    0.7.0.1
 */