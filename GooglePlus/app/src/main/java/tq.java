import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class tq
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  
  public tq(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }
  
  public tq(int paramInt1, int paramInt2, int paramInt3)
  {
    super(-2, -2);
    this.a = 8388629;
  }
  
  public tq(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.b);
    this.a = localTypedArray.getInt(wb.c, 0);
    localTypedArray.recycle();
  }
  
  public tq(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public tq(tq paramtq)
  {
    super(paramtq);
    this.a = paramtq.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     tq
 * JD-Core Version:    0.7.0.1
 */