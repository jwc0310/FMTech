import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class aum
{
  public static final hyf a = new hyf("debug.photosettings.period", Long.toString(TimeUnit.HOURS.toSeconds(6L)), "5070d5db", hym.b);
  
  public static final ois a(Context paramContext, int paramInt)
  {
    hyi localhyi = (hyi)mbb.a(paramContext, hyi.class);
    ois localois = new ois();
    localois.g = Integer.valueOf(localhyi.c(aun.g, paramInt).intValue());
    localois.a = Integer.valueOf(localhyi.c(aun.a, paramInt).intValue());
    localois.f = Integer.valueOf(localhyi.c(aun.f, paramInt).intValue());
    localois.e = Integer.valueOf(localhyi.c(aun.e, paramInt).intValue());
    localois.d = Integer.valueOf(localhyi.c(aun.d, paramInt).intValue());
    localois.c = Integer.valueOf(localhyi.c(aun.c, paramInt).intValue());
    localois.b = Integer.valueOf(localhyi.c(aun.b, paramInt).intValue());
    return localois;
  }
  
  public static final ojb b(Context paramContext, int paramInt)
  {
    hyi localhyi = (hyi)mbb.a(paramContext, hyi.class);
    ojb localojb = new ojb();
    localojb.d = Boolean.valueOf(localhyi.b(auo.d, paramInt));
    localojb.e = Boolean.valueOf(localhyi.b(auo.e, paramInt));
    localojb.c = Integer.valueOf(localhyi.c(auo.c, paramInt).intValue());
    localojb.a = Integer.valueOf(localhyi.c(auo.a, paramInt).intValue());
    localojb.b = Integer.valueOf(localhyi.c(auo.b, paramInt).intValue());
    return localojb;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aum
 * JD-Core Version:    0.7.0.1
 */