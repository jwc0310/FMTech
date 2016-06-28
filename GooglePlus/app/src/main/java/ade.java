import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class ade
  extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private zv b;
  
  public ade(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  private ade(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 16843720);
    if (zv.a)
    {
      zw localzw = zw.a(getContext(), paramAttributeSet, a, 16843720, 0);
      setCheckMarkDrawable(localzw.a(0));
      localzw.a.recycle();
      this.b = localzw.a();
    }
  }
  
  public final void setCheckMarkDrawable(int paramInt)
  {
    if (this.b != null)
    {
      setCheckMarkDrawable(this.b.a(paramInt, false));
      return;
    }
    super.setCheckMarkDrawable(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ade
 * JD-Core Version:    0.7.0.1
 */