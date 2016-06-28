import android.content.Context;
import android.content.res.Resources;
import android.widget.Adapter;
import java.util.ArrayList;

public final class gop
  extends hqt
{
  static int a;
  static int b;
  static int c;
  private Context f;
  
  gop(Context paramContext)
  {
    this.f = paramContext;
    if (a == 0)
    {
      Resources localResources = paramContext.getResources();
      a = localResources.getDimensionPixelSize(efj.Eg);
      b = localResources.getDimensionPixelSize(efj.Ef);
      c = localResources.getColor(efj.DR);
    }
  }
  
  public final void a(Adapter paramAdapter)
  {
    if (this.d.size() > 0) {
      super.a(new goq(this, this.f));
    }
    super.a(paramAdapter);
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gop
 * JD-Core Version:    0.7.0.1
 */