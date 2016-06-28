import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.View;

public final class adc
{
  public zu a;
  private final View b;
  private final zv c;
  private zu d;
  
  public adc(View paramView, zv paramzv)
  {
    this.b = paramView;
    this.c = paramzv;
  }
  
  public final void a()
  {
    if (this.b.getBackground() != null)
    {
      if (this.a == null) {
        break label29;
      }
      zv.a(this.b, this.a);
    }
    label29:
    while (this.d == null) {
      return;
    }
    zv.a(this.b, this.d);
  }
  
  public final void a(int paramInt)
  {
    if (this.c != null) {}
    for (ColorStateList localColorStateList = this.c.a(paramInt);; localColorStateList = null)
    {
      b(localColorStateList);
      return;
    }
  }
  
  public final void a(ColorStateList paramColorStateList)
  {
    if (this.a == null) {
      this.a = new zu();
    }
    this.a.a = paramColorStateList;
    this.a.d = true;
    a();
  }
  
  public final void a(PorterDuff.Mode paramMode)
  {
    if (this.a == null) {
      this.a = new zu();
    }
    this.a.b = paramMode;
    this.a.c = true;
    a();
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = this.b.getContext().obtainStyledAttributes(paramAttributeSet, wb.ck, paramInt, 0);
    try
    {
      if (localTypedArray.hasValue(wb.cl))
      {
        ColorStateList localColorStateList2 = this.c.a(localTypedArray.getResourceId(wb.cl, -1));
        if (localColorStateList2 != null) {
          b(localColorStateList2);
        }
      }
      if (localTypedArray.hasValue(wb.cm))
      {
        View localView2 = this.b;
        ColorStateList localColorStateList1 = localTypedArray.getColorStateList(wb.cm);
        nj.a.a(localView2, localColorStateList1);
      }
      if (localTypedArray.hasValue(wb.cn))
      {
        View localView1 = this.b;
        PorterDuff.Mode localMode = efj.a(localTypedArray.getInt(wb.cn, -1), null);
        nj.a.a(localView1, localMode);
      }
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public final void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.d == null) {
        this.d = new zu();
      }
      this.d.a = paramColorStateList;
      this.d.d = true;
    }
    for (;;)
    {
      a();
      return;
      this.d = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adc
 * JD-Core Version:    0.7.0.1
 */