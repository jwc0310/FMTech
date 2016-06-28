import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class dwz
  extends ViewGroup
  implements lxj
{
  private Drawable a;
  private lwu b;
  final List<lwu> w = new ArrayList();
  
  public dwz(Context paramContext)
  {
    super(paramContext);
  }
  
  public dwz(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public static int a(View paramView, int paramInt)
  {
    dxa localdxa = (dxa)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = paramView.getMeasuredWidth();
    switch (paramInt)
    {
    default: 
      return -1;
    case 0: 
      return localdxa.a;
    case 1: 
      return localdxa.b;
    case 3: 
      return i + localdxa.b;
    }
    return j + localdxa.a;
  }
  
  public static int a(View... paramVarArgs)
  {
    int i = -1 + paramVarArgs.length;
    int j = 0;
    for (int k = i; k >= 0; k--)
    {
      View localView = paramVarArgs[k];
      if (localView != null) {
        j = Math.max(j, localView.getMeasuredHeight());
      }
    }
    return j;
  }
  
  public static void a(int paramInt, View... paramVarArgs)
  {
    int i = Math.max(-1 + paramVarArgs.length, 0);
    int j = 2147483647;
    int k = i;
    View localView2;
    if (k >= 0)
    {
      localView2 = paramVarArgs[k];
      if (localView2 == null) {
        break label110;
      }
    }
    label110:
    for (int m = Math.min(j, ((dxa)localView2.getLayoutParams()).b);; m = j)
    {
      k--;
      j = m;
      break;
      while (i >= 0)
      {
        View localView1 = paramVarArgs[i];
        if (localView1 != null)
        {
          dxa localdxa = (dxa)localView1.getLayoutParams();
          a(localView1, localdxa.a, j);
          b(localView1, localdxa.d, paramInt);
        }
        i--;
      }
      return;
    }
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    dxa localdxa = (dxa)paramView.getLayoutParams();
    if (localdxa == null) {
      localdxa = new dxa(paramInt1, paramInt2);
    }
    for (;;)
    {
      paramView.setLayoutParams(localdxa);
      return;
      localdxa.a = paramInt1;
      localdxa.b = paramInt2;
    }
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.max(paramInt1, 0);
    int j = Math.max(paramInt3, 0);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(i, paramInt2), View.MeasureSpec.makeMeasureSpec(j, paramInt4));
  }
  
  public static void b(View paramView, int paramInt1, int paramInt2)
  {
    dxa localdxa = (dxa)paramView.getLayoutParams();
    localdxa.c = paramInt2;
    localdxa.d = paramInt1;
    paramView.setLayoutParams(localdxa);
  }
  
  public void D_()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((localView instanceof lxj)) {
        ((lxj)localView).D_();
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    setPadding(paramInt1 + getPaddingLeft(), paramInt2 + getPaddingTop(), paramInt3 + getPaddingRight(), paramInt4 + getPaddingBottom());
  }
  
  protected void a(Canvas paramCanvas) {}
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof dxa;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (this.a != null)
    {
      this.a.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      this.a.draw(paramCanvas);
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i;
    int j;
    if (!this.w.isEmpty())
    {
      i = (int)paramMotionEvent.getX();
      j = (int)paramMotionEvent.getY();
      switch (paramMotionEvent.getAction())
      {
      }
    }
    do
    {
      for (;;)
      {
        return super.dispatchTouchEvent(paramMotionEvent);
        for (int m = -1 + this.w.size(); m >= 0; m--)
        {
          lwu locallwu = (lwu)this.w.get(m);
          if (locallwu.a(i, j, 0))
          {
            this.b = locallwu;
            invalidate();
            return true;
          }
        }
        this.b = null;
        for (int k = -1 + this.w.size(); k >= 0; k--) {
          ((lwu)this.w.get(k)).a(i, j, 1);
        }
        invalidate();
      }
    } while (this.b == null);
    this.b.a(i, j, 3);
    this.b = null;
    invalidate();
    return true;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getPaddingLeft();
    int j = getPaddingTop();
    paramCanvas.translate(-i, -j);
    a(paramCanvas);
    paramCanvas.translate(i, j);
  }
  
  protected Point f_(int paramInt)
  {
    return null;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new dxa(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new dxa(paramLayoutParams);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        dxa localdxa = (dxa)localView.getLayoutParams();
        int k = localView.getMeasuredWidth();
        int m = localView.getMeasuredHeight();
        int n = getPaddingLeft() + Math.max(0, (localdxa.d - k) / 2);
        int i1 = getPaddingTop() + Math.max(0, (localdxa.c - m) / 2);
        localView.layout(n + localdxa.a, i1 + localdxa.b, k + (n + localdxa.a), i1 + (m + localdxa.b));
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft() + getPaddingRight();
    int j = getPaddingTop() + getPaddingBottom();
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    measureChildren(View.MeasureSpec.makeMeasureSpec(n - i, k), View.MeasureSpec.makeMeasureSpec(i1 - j, m));
    int i2 = getChildCount();
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    View localView;
    dxa localdxa;
    int i8;
    label141:
    int i9;
    label164:
    int i7;
    int i6;
    if (i3 < i2)
    {
      localView = getChildAt(i3);
      if (localView.getVisibility() == 8) {
        break label296;
      }
      localdxa = (dxa)localView.getLayoutParams();
      if (localdxa.d != 0)
      {
        i8 = localdxa.d + localView.getMeasuredWidth() / 2;
        if (localdxa.c == 0) {
          break label216;
        }
        i9 = localdxa.c + localView.getMeasuredHeight() / 2;
        int i10 = Math.max(i4, i8);
        i7 = Math.max(i5, i9);
        i6 = i10;
      }
    }
    for (;;)
    {
      i3++;
      i5 = i7;
      i4 = i6;
      break;
      i8 = localdxa.a + localView.getMeasuredWidth();
      break label141;
      label216:
      i9 = localdxa.b + localView.getMeasuredHeight();
      break label164;
      Point localPoint = f_(i4);
      if (localPoint != null)
      {
        setWillNotDraw(false);
        i4 = Math.max(i4, localPoint.x);
        i5 = Math.max(i5, localPoint.y);
      }
      setMeasuredDimension(resolveSize(i4 + i, paramInt1), resolveSize(i5 + j, paramInt2));
      return;
      label296:
      i6 = i4;
      i7 = i5;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.a = paramDrawable;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwz
 * JD-Core Version:    0.7.0.1
 */