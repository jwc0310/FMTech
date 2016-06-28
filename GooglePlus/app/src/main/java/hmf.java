import android.content.Context;
import android.database.Cursor;

public final class hmf
  extends hml
{
  private String t;
  
  public hmf(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    super(paramContext, paramInt1, paramInt2, ((hho)mbb.a(paramContext, hho.class)).d(paramString));
    this.t = paramString;
  }
  
  public final Cursor o()
  {
    hhh localhhh = (hhh)mbb.a(this.l, hhh.class);
    switch (hmg.a[(-1 + this.s)])
    {
    default: 
      return null;
    case 1: 
      return localhhh.c(this.r, this.t, null);
    }
    return localhhh.f(this.r, this.t);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmf
 * JD-Core Version:    0.7.0.1
 */