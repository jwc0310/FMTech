import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Scroller;

public class lxs
{
  public Scroller a;
  
  lxs(Context paramContext)
  {
    this.a = new Scroller(paramContext);
  }
  
  public static lxs a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return new lxt(paramContext);
    }
    return new lxs(paramContext);
  }
  
  public float a()
  {
    return 0.0F;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a.fling(0, 0, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxs
 * JD-Core Version:    0.7.0.1
 */