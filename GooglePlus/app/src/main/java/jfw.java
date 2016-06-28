import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class jfw
  extends ViewGroup
  implements lxj
{
  public static int a;
  private static boolean e;
  private static int f;
  private static int g;
  public AvatarView[] b = new AvatarView[10];
  public int c;
  public jfy d;
  private int h;
  
  public jfw(Context paramContext)
  {
    super(paramContext);
    if (!e)
    {
      Resources localResources = getResources();
      f = (int)localResources.getDimension(aaw.pe);
      g = efj.i(getContext());
      a = localResources.getColor(17170443);
      e = true;
    }
  }
  
  public final void D_()
  {
    for (int i = 0; i < 10; i++) {
      if (this.b[i] != null) {
        this.b[i].a();
      }
    }
    this.d = null;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    int j = g + f;
    int k;
    if ((Build.VERSION.SDK_INT >= 17) && (getLayoutDirection() == 1))
    {
      k = i - g;
      j = -j;
    }
    for (;;)
    {
      int m = k;
      for (int n = 0; n < this.h; n++)
      {
        this.b[n].layout(m, 0, m + g, g);
        m += j;
      }
      k = 0;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = resolveSize(2147483647, paramInt1);
    this.h = (i / g);
    if (this.h * g + (-1 + this.h) * f > i) {
      this.h = (-1 + this.h);
    }
    if (this.h > this.c) {
      this.h = this.c;
    }
    for (int j = 0; j < this.h; j++) {
      this.b[j].measure(View.MeasureSpec.makeMeasureSpec(g, 1073741824), View.MeasureSpec.makeMeasureSpec(g, 1073741824));
    }
    setMeasuredDimension(i, g);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfw
 * JD-Core Version:    0.7.0.1
 */