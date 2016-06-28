import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;

public final class adr
{
  private static final int[] a = { 16842804 };
  private static final int[] b;
  private final TextView c;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aau.ac;
    b = arrayOfInt;
  }
  
  public adr(TextView paramTextView)
  {
    this.c = paramTextView;
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, b);
    if (localTypedArray.hasValue(0)) {
      a(localTypedArray.getBoolean(0, false));
    }
    localTypedArray.recycle();
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    Context localContext = this.c.getContext();
    TypedArray localTypedArray1 = localContext.obtainStyledAttributes(paramAttributeSet, a, paramInt, 0);
    int i = localTypedArray1.getResourceId(0, -1);
    localTypedArray1.recycle();
    if (i != -1)
    {
      TypedArray localTypedArray3 = localContext.obtainStyledAttributes(i, wb.bt);
      if (localTypedArray3.hasValue(wb.bv)) {
        a(localTypedArray3.getBoolean(wb.bv, false));
      }
      localTypedArray3.recycle();
    }
    TypedArray localTypedArray2 = localContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    if (localTypedArray2.hasValue(0)) {
      a(localTypedArray2.getBoolean(0, false));
    }
    localTypedArray2.recycle();
    ColorStateList localColorStateList = this.c.getTextColors();
    if ((localColorStateList != null) && (!localColorStateList.isStateful())) {
      if (Build.VERSION.SDK_INT >= 21) {
        break label173;
      }
    }
    label173:
    for (int j = zr.c(localContext, 16842808);; j = zr.a(localContext, 16842808))
    {
      this.c.setTextColor(zr.a(localColorStateList.getDefaultColor(), j));
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    TextView localTextView = this.c;
    if (paramBoolean) {}
    for (wr localwr = new wr(this.c.getContext());; localwr = null)
    {
      localTextView.setTransformationMethod(localwr);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adr
 * JD-Core Version:    0.7.0.1
 */