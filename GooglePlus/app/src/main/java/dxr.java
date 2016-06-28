import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class dxr
  extends RelativeLayout
{
  private static int b;
  public dxs a;
  
  public dxr(Context paramContext)
  {
    super(paramContext);
    if (b == 0) {
      b = getContext().getResources().getDimensionPixelSize(efj.nj);
    }
  }
  
  public dxr(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (b == 0) {
      b = getContext().getResources().getDimensionPixelSize(efj.nj);
    }
  }
  
  public dxr(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (b == 0) {
      b = getContext().getResources().getDimensionPixelSize(efj.nj);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxr
 * JD-Core Version:    0.7.0.1
 */