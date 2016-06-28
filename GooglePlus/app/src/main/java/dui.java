import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextPaint;

public class dui
{
  public static NinePatchDrawable a;
  public static NinePatchDrawable b;
  public static NinePatchDrawable c;
  public static NinePatchDrawable d;
  public static TextPaint e;
  public static TextPaint f;
  private static boolean g;
  
  public dui(Context paramContext)
  {
    if (!g)
    {
      g = true;
      Resources localResources = paramContext.getResources();
      a = (NinePatchDrawable)localResources.getDrawable(efj.oO);
      b = (NinePatchDrawable)localResources.getDrawable(efj.oP);
      c = (NinePatchDrawable)localResources.getDrawable(efj.oM);
      d = (NinePatchDrawable)localResources.getDrawable(efj.oN);
      e = efj.B(paramContext, efj.yI);
      f = efj.B(paramContext, efj.yK);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dui
 * JD-Core Version:    0.7.0.1
 */