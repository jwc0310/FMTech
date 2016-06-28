import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;

public final class jrh
{
  public final int a;
  public final int b;
  public final int c;
  
  public jrh(Context paramContext)
  {
    int i;
    float f;
    if (paramContext.getResources().getConfiguration().orientation == 2)
    {
      i = 1;
      f = efj.a(efj.K(paramContext));
      if (f < 750.0F) {
        break label106;
      }
    }
    int k;
    label106:
    for (int j = 1;; j = 0)
    {
      k = 0;
      if (j == 0)
      {
        boolean bool = f < 500.0F;
        k = 0;
        if (!bool) {
          k = 1;
        }
      }
      TypedValue.applyDimension(1, 4.0F, efj.K(paramContext));
      if (i == 0) {
        break label151;
      }
      if (j == 0) {
        break label112;
      }
      this.a = 6;
      this.b = 5;
      this.c = 6;
      return;
      i = 0;
      break;
    }
    label112:
    if (k != 0)
    {
      this.a = 6;
      this.b = 4;
      this.c = 6;
      return;
    }
    this.a = 4;
    this.b = 3;
    this.c = 4;
    return;
    label151:
    if (j != 0)
    {
      this.a = 4;
      this.b = 3;
      this.c = 6;
      return;
    }
    if (k != 0)
    {
      this.a = 3;
      this.b = 2;
      this.c = 6;
      return;
    }
    this.a = 3;
    this.b = 2;
    this.c = 4;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrh
 * JD-Core Version:    0.7.0.1
 */