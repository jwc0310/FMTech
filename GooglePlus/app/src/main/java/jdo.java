import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.TimeZone;

public final class jdo
{
  private final Context a;
  
  public jdo(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final mji a()
  {
    mji localmji = new mji();
    int i = this.a.getResources().getDisplayMetrics().densityDpi;
    int j;
    if (i >= 480) {
      j = 9;
    }
    for (;;)
    {
      localmji.a = j;
      localmji.b = this.a.getResources().getConfiguration().locale.toString();
      localmji.c = TimeZone.getDefault().getID();
      return localmji;
      if (i >= 320) {
        j = 5;
      } else if (i >= 240) {
        j = 4;
      } else {
        j = 3;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdo
 * JD-Core Version:    0.7.0.1
 */