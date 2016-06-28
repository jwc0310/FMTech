import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup.MarginLayoutParams;

final class hic
  extends aga<hid>
{
  private final int d;
  private final LayoutInflater e;
  private final ViewGroup.MarginLayoutParams f;
  private final Context g;
  private final hib[] h;
  private final boolean i;
  
  hic(hhv paramhhv, Context paramContext, hib[] paramArrayOfhib)
  {
    this.g = paramContext;
    this.h = paramArrayOfhib;
    Resources localResources = paramContext.getResources();
    if (localResources.getConfiguration().orientation == j)
    {
      this.i = j;
      this.e = LayoutInflater.from(this.g);
      if (!this.i) {
        break label98;
      }
    }
    label98:
    for (this.f = new ViewGroup.MarginLayoutParams(-2, -1);; this.f = new ViewGroup.MarginLayoutParams(-1, -2))
    {
      this.d = localResources.getDimensionPixelSize(aau.zj);
      return;
      j = 0;
      break;
    }
  }
  
  static int d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 1;
    }
    return 0;
  }
  
  public final int a()
  {
    return 1 + this.h.length;
  }
  
  public final int a(int paramInt)
  {
    return d(paramInt);
  }
  
  public final long b(int paramInt)
  {
    return paramInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hic
 * JD-Core Version:    0.7.0.1
 */