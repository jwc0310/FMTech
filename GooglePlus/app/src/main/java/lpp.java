import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class lpp
  extends View
{
  public int a;
  public int b;
  
  public lpp(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lpp(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lpp(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(this.a, this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpp
 * JD-Core Version:    0.7.0.1
 */