import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public abstract class jtu
  extends ViewGroup
  implements lxj
{
  public static loj a;
  public static int b;
  public lly c;
  public int d;
  public boolean e;
  
  public jtu(Context paramContext)
  {
    super(paramContext);
    if (a == null)
    {
      a = loj.a(paramContext);
      b = View.MeasureSpec.makeMeasureSpec(0, 0);
    }
    a(paramContext);
  }
  
  public void D_()
  {
    this.e = false;
  }
  
  public jtu a(lly paramlly)
  {
    this.c = paramlly;
    return this;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public abstract void a(Context paramContext);
  
  public abstract void b();
  
  public abstract void c();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jtu
 * JD-Core Version:    0.7.0.1
 */