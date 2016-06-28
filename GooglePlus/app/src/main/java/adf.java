import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class adf
{
  ColorStateList a = null;
  PorterDuff.Mode b = null;
  boolean c = false;
  boolean d = false;
  private final CompoundButton e;
  private final zv f;
  private boolean g;
  
  adf(CompoundButton paramCompoundButton, zv paramzv)
  {
    this.e = paramCompoundButton;
    this.f = paramzv;
  }
  
  final int a(int paramInt)
  {
    if (Build.VERSION.SDK_INT < 17)
    {
      CompoundButton localCompoundButton = this.e;
      Drawable localDrawable = qu.a.a(localCompoundButton);
      if (localDrawable != null) {
        paramInt += localDrawable.getIntrinsicWidth();
      }
    }
    return paramInt;
  }
  
  final void a()
  {
    if (this.g)
    {
      this.g = false;
      return;
    }
    this.g = true;
    b();
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = this.e.getContext().obtainStyledAttributes(paramAttributeSet, wb.N, paramInt, 0);
    try
    {
      if (localTypedArray.hasValue(wb.O))
      {
        int i = localTypedArray.getResourceId(wb.O, 0);
        if (i != 0) {
          this.e.setButtonDrawable(this.f.a(i, false));
        }
      }
      if (localTypedArray.hasValue(wb.P))
      {
        CompoundButton localCompoundButton2 = this.e;
        ColorStateList localColorStateList = localTypedArray.getColorStateList(wb.P);
        qu.a.a(localCompoundButton2, localColorStateList);
      }
      if (localTypedArray.hasValue(wb.Q))
      {
        CompoundButton localCompoundButton1 = this.e;
        PorterDuff.Mode localMode = efj.a(localTypedArray.getInt(wb.Q, -1), null);
        qu.a.a(localCompoundButton1, localMode);
      }
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  final void b()
  {
    CompoundButton localCompoundButton = this.e;
    Drawable localDrawable1 = qu.a.a(localCompoundButton);
    if ((localDrawable1 != null) && ((this.c) || (this.d)))
    {
      Drawable localDrawable2 = gl.a.c(localDrawable1).mutate();
      if (this.c)
      {
        ColorStateList localColorStateList = this.a;
        gl.a.a(localDrawable2, localColorStateList);
      }
      if (this.d)
      {
        PorterDuff.Mode localMode = this.b;
        gl.a.a(localDrawable2, localMode);
      }
      if (localDrawable2.isStateful()) {
        localDrawable2.setState(this.e.getDrawableState());
      }
      this.e.setButtonDrawable(localDrawable2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adf
 * JD-Core Version:    0.7.0.1
 */