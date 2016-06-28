import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class dvm
  extends dwz
  implements lxj
{
  private static boolean a;
  private static int b;
  private static int c;
  private static int d;
  private static int e;
  private static Drawable f;
  
  public dvm(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  private static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = -1) {
      return Math.max(paramInt1 + i * paramInt2, 0);
    }
  }
  
  protected void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    boolean bool1 = true;
    Resources localResources = paramContext.getResources();
    if (!a)
    {
      b = (int)localResources.getDimension(efj.kU);
      c = (int)localResources.getDimension(efj.kW);
      d = (int)localResources.getDimension(efj.kV);
      e = (int)localResources.getDimension(efj.kT);
      f = localResources.getDrawable(efj.ov);
      a = bool1;
    }
    a(bool1);
    if (paramContext.getResources().getConfiguration().orientation == 2) {}
    for (boolean bool2 = bool1;; bool2 = false)
    {
      int i;
      if (bool2) {
        i = 2;
      }
      setLayoutParams(new lyc(i, -3));
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Drawable localDrawable = f;; localDrawable = null)
    {
      setBackgroundDrawable(localDrawable);
      setPadding(a(getPaddingLeft(), b, paramBoolean), a(getPaddingTop(), c, paramBoolean), a(getPaddingRight(), d, paramBoolean), a(getPaddingBottom(), e, paramBoolean));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvm
 * JD-Core Version:    0.7.0.1
 */