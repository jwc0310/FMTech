package android.support.v7.widget;

import adt;
import adu;
import adv;
import adx;
import ady;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import efj;
import wc;

public class CardView
  extends FrameLayout
  implements adu
{
  public static final adx a;
  private boolean b;
  private boolean c;
  private final Rect d = new Rect();
  private final Rect e = new Rect();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      a = new adt();
    }
    for (;;)
    {
      a.a();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        a = new ady();
      } else {
        a = new adv();
      }
    }
  }
  
  public CardView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wc.a, paramInt, efj.br);
    int i = localTypedArray.getColor(wc.b, 0);
    float f1 = localTypedArray.getDimension(wc.c, 0.0F);
    float f2 = localTypedArray.getDimension(wc.d, 0.0F);
    float f3 = localTypedArray.getDimension(wc.e, 0.0F);
    this.b = localTypedArray.getBoolean(wc.g, false);
    this.c = localTypedArray.getBoolean(wc.f, true);
    int j = localTypedArray.getDimensionPixelSize(wc.h, 0);
    this.d.left = localTypedArray.getDimensionPixelSize(wc.j, j);
    this.d.top = localTypedArray.getDimensionPixelSize(wc.l, j);
    this.d.right = localTypedArray.getDimensionPixelSize(wc.k, j);
    this.d.bottom = localTypedArray.getDimensionPixelSize(wc.i, j);
    if (f2 > f3) {
      f3 = f2;
    }
    localTypedArray.recycle();
    a.a(this, paramContext, i, f1, f2, f3);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e.set(paramInt1, paramInt2, paramInt3, paramInt4);
    super.setPadding(paramInt1 + this.d.left, paramInt2 + this.d.top, paramInt3 + this.d.right, paramInt4 + this.d.bottom);
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final boolean b()
  {
    return this.c;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(a instanceof adt))
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j;
      switch (i)
      {
      default: 
        j = View.MeasureSpec.getMode(paramInt2);
        switch (j)
        {
        }
        break;
      }
      for (;;)
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.a(this)), View.MeasureSpec.getSize(paramInt1)), i);
        break;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.b(this)), View.MeasureSpec.getSize(paramInt2)), j);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.CardView
 * JD-Core Version:    0.7.0.1
 */