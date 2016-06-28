import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public final class adh
  extends MultiAutoCompleteTextView
  implements ne
{
  private static final int[] a = { 16843126 };
  private zv b;
  private adc c;
  private adr d;
  
  public adh(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, aau.H);
  }
  
  private adh(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(zs.a(paramContext), paramAttributeSet, paramInt);
    zw localzw = zw.a(getContext(), paramAttributeSet, a, paramInt, 0);
    this.b = localzw.a();
    if (localzw.a.hasValue(0)) {
      setDropDownBackgroundDrawable(localzw.a(0));
    }
    localzw.a.recycle();
    this.c = new adc(this, this.b);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new adr(this);
    this.d.a(paramAttributeSet, paramInt);
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.c != null) {
      this.c.b(null);
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.c != null) {
      this.c.a(paramInt);
    }
  }
  
  public final void setDropDownBackgroundResource(int paramInt)
  {
    if (this.b != null)
    {
      setDropDownBackgroundDrawable(this.b.a(paramInt, false));
      return;
    }
    super.setDropDownBackgroundResource(paramInt);
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.c != null) {
      this.c.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.c != null) {
      this.c.a(paramMode);
    }
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.d != null) {
      this.d.a(paramContext, paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adh
 * JD-Core Version:    0.7.0.1
 */