import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class aev
  extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h = -1;
  
  public aev(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.g = 0.0F;
  }
  
  public aev(int paramInt1, int paramInt2, float paramFloat)
  {
    super(0, -1);
    this.g = 1.0F;
  }
  
  public aev(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.ab);
    this.g = localTypedArray.getFloat(wb.ad, 0.0F);
    this.h = localTypedArray.getInt(wb.ac, -1);
    localTypedArray.recycle();
  }
  
  public aev(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aev
 * JD-Core Version:    0.7.0.1
 */