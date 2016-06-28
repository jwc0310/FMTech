import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public final class dxa
  extends ViewGroup.LayoutParams
{
  public int a;
  public int b;
  public int c;
  public int d;
  
  public dxa(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public dxa(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, bgl.g);
    this.a = localTypedArray.getDimensionPixelOffset(bgl.j, 0);
    this.b = localTypedArray.getDimensionPixelOffset(bgl.k, 0);
    this.d = localTypedArray.getDimensionPixelOffset(bgl.h, 0);
    this.c = localTypedArray.getDimensionPixelOffset(bgl.i, 0);
    localTypedArray.recycle();
  }
  
  public dxa(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxa
 * JD-Core Version:    0.7.0.1
 */