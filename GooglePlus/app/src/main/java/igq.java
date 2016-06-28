import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

final class igq
{
  int a;
  
  private static int b(Context paramContext, int paramInt1, int paramInt2)
  {
    Resources localResources = paramContext.getApplicationContext().getResources();
    DisplayMetrics localDisplayMetrics = efj.K(paramContext);
    int i = localDisplayMetrics.widthPixels * localDisplayMetrics.heightPixels << 2;
    int j = localResources.getInteger(paramInt2);
    if (i == 0) {
      return j;
    }
    return Math.min((int)(localResources.getInteger(paramInt1) * i / 100L), j);
  }
  
  final igp a(Context paramContext, int paramInt1, int paramInt2)
  {
    igp localigp = new igp();
    localigp.a = b(paramContext, efj.MT, paramInt1);
    localigp.c = b(paramContext, efj.MW, paramInt2);
    localigp.b = b(paramContext, efj.MS, paramInt2);
    int i = paramContext.getApplicationContext().getResources().getInteger(paramInt2);
    if (localigp.c > i) {
      localigp.b = Math.round(i / localigp.c * localigp.b);
    }
    Resources localResources = paramContext.getApplicationContext().getResources();
    localigp.e = localResources.getInteger(efj.MV);
    localigp.d = localResources.getInteger(efj.MU);
    return localigp;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igq
 * JD-Core Version:    0.7.0.1
 */