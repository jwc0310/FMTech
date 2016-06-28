package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import zv;
import zw;

public class TintImageView
  extends ImageView
{
  private static final int[] a = { 16842964, 16843033 };
  private final zv b;
  
  public TintImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TintImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TintImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zw localzw = zw.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (localzw.a.length() > 0)
    {
      if (localzw.a.hasValue(0)) {
        setBackgroundDrawable(localzw.a(0));
      }
      if (localzw.a.hasValue(1)) {
        setImageDrawable(localzw.a(1));
      }
    }
    localzw.a.recycle();
    this.b = localzw.a();
  }
  
  public void setImageResource(int paramInt)
  {
    setImageDrawable(this.b.a(paramInt, false));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.TintImageView
 * JD-Core Version:    0.7.0.1
 */