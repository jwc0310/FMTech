import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public final class ghv
{
  private static ghv c;
  public final float a;
  public final float b;
  
  private ghv(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    this.a = TypedValue.applyDimension(1, 10.0F, localDisplayMetrics);
    this.b = TypedValue.applyDimension(1, 30.0F, localDisplayMetrics);
  }
  
  public static ghv a(Context paramContext)
  {
    if (c == null) {
      c = new ghv(paramContext);
    }
    return c;
  }
  
  public static boolean b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramContext.getResources().getConfiguration().getLayoutDirection() == 1;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghv
 * JD-Core Version:    0.7.0.1
 */