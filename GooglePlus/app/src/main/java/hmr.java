import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class hmr
  extends hml
{
  private final String t;
  private final String u;
  private final boolean v;
  
  public hmr(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    this(paramContext, paramInt1, paramString, false, paramInt2, null);
  }
  
  public hmr(Context paramContext, int paramInt1, String paramString1, boolean paramBoolean, int paramInt2, String paramString2) {}
  
  public final Cursor o()
  {
    hhh localhhh = (hhh)mbb.a(this.l, hhh.class);
    switch (hms.a[(-1 + this.s)])
    {
    default: 
      return null;
    case 1: 
      return localhhh.b(this.r, this.t, null);
    case 2: 
      return localhhh.d(this.r, this.t);
    }
    return localhhh.a(this.r, this.t, this.v, this.u);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmr
 * JD-Core Version:    0.7.0.1
 */