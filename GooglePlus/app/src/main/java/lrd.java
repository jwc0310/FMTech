import android.content.Context;
import android.widget.FrameLayout;

public final class lrd
  extends FrameLayout
{
  public lrd(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = resolveSize(2147483647, paramInt1);
    setMeasuredDimension(i, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrd
 * JD-Core Version:    0.7.0.1
 */