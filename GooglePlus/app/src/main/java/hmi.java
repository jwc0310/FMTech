import android.content.Context;
import android.database.Cursor;

public final class hmi
  extends hqj
{
  private final int r;
  private final int s;
  
  public hmi(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, ((hho)mbb.a(paramContext, hho.class)).b());
    this.r = paramInt1;
    this.s = paramInt2;
  }
  
  public final Cursor o()
  {
    hhh localhhh = (hhh)mbb.a(this.l, hhh.class);
    switch (hmj.a[(-1 + this.s)])
    {
    default: 
      return null;
    case 1: 
      return localhhh.c(this.r, null);
    }
    return localhhh.e(this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmi
 * JD-Core Version:    0.7.0.1
 */