import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class adi
  extends RadioButton
  implements tk
{
  private zv a;
  private adf b;
  
  public adi(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, aau.Y);
  }
  
  private adi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = zv.a(paramContext);
    this.b = new adf(this, this.a);
    this.b.a(paramAttributeSet, paramInt);
  }
  
  public final void a(ColorStateList paramColorStateList)
  {
    if (this.b != null)
    {
      adf localadf = this.b;
      localadf.a = paramColorStateList;
      localadf.c = true;
      localadf.b();
    }
  }
  
  public final void a(PorterDuff.Mode paramMode)
  {
    if (this.b != null)
    {
      adf localadf = this.b;
      localadf.b = paramMode;
      localadf.d = true;
      localadf.b();
    }
  }
  
  public final int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    if (this.b != null) {
      i = this.b.a(i);
    }
    return i;
  }
  
  public final void setButtonDrawable(int paramInt)
  {
    if (this.a != null) {}
    for (Drawable localDrawable = this.a.a(paramInt, false);; localDrawable = fo.a(getContext(), paramInt))
    {
      setButtonDrawable(localDrawable);
      return;
    }
  }
  
  public final void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    if (this.b != null) {
      this.b.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adi
 * JD-Core Version:    0.7.0.1
 */