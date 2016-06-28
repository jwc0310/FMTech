package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import efj;
import wb;
import yi;
import yj;
import zl;

public class ActionBarContainer
  extends FrameLayout
{
  View a;
  public View b;
  public Drawable c;
  public Drawable d;
  public Drawable e;
  public boolean f;
  public boolean g;
  private boolean h;
  private View i;
  private int j;
  
  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int k;
    Object localObject;
    label30:
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      k = 1;
      if (k == 0) {
        break label144;
      }
      localObject = new yj(this);
      setBackgroundDrawable((Drawable)localObject);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.a);
      this.c = localTypedArray.getDrawable(wb.d);
      this.d = localTypedArray.getDrawable(wb.f);
      this.j = localTypedArray.getDimensionPixelSize(wb.l, -1);
      if (getId() == efj.aH)
      {
        this.f = true;
        this.e = localTypedArray.getDrawable(wb.e);
      }
      localTypedArray.recycle();
      if (!this.f) {
        break label163;
      }
      if (this.e != null) {
        break label157;
      }
      bool = true;
    }
    for (;;)
    {
      setWillNotDraw(bool);
      return;
      k = 0;
      break;
      label144:
      localObject = new yi(this);
      break label30;
      label157:
      bool = false;
      continue;
      label163:
      if ((this.c == null) && (this.d == null)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private static boolean a(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0);
  }
  
  private static int b(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
  }
  
  public final void a(zl paramzl)
  {
    if (this.a != null) {
      removeView(this.a);
    }
    this.a = paramzl;
    if (paramzl != null)
    {
      addView(paramzl);
      ViewGroup.LayoutParams localLayoutParams = paramzl.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramzl.d = false;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    if (paramBoolean) {}
    for (int k = 393216;; k = 262144)
    {
      setDescendantFocusability(k);
      return;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.c != null) && (this.c.isStateful())) {
      this.c.setState(getDrawableState());
    }
    if ((this.d != null) && (this.d.isStateful())) {
      this.d.setState(getDrawableState());
    }
    if ((this.e != null) && (this.e.isStateful())) {
      this.e.setState(getDrawableState());
    }
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.c != null) {
        this.c.jumpToCurrentState();
      }
      if (this.d != null) {
        this.d.jumpToCurrentState();
      }
      if (this.e != null) {
        this.e.jumpToCurrentState();
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = findViewById(efj.ab);
    this.i = findViewById(efj.ag);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.h) || (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.a;
    boolean bool2;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      bool2 = bool1;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        int k = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, k - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, k - localLayoutParams.bottomMargin);
      }
      if (!this.f) {
        break label147;
      }
      if (this.e == null) {
        break label333;
      }
      this.e.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    for (;;)
    {
      if (bool1) {
        invalidate();
      }
      return;
      bool2 = false;
      break;
      label147:
      if (this.c != null) {
        if (this.b.getVisibility() == 0) {
          this.c.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        }
      }
      label199:
      for (boolean bool3 = bool1;; bool3 = false)
      {
        this.g = bool2;
        if ((bool2) && (this.d != null))
        {
          this.d.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          break;
          if ((this.i != null) && (this.i.getVisibility() == 0))
          {
            this.c.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            break label199;
          }
          this.c.setBounds(0, 0, 0, 0);
          break label199;
        }
        bool1 = bool3;
        break;
      }
      label333:
      bool1 = false;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b == null) && (View.MeasureSpec.getMode(paramInt2) == -2147483648) && (this.j >= 0)) {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(paramInt2)), -2147483648);
    }
    super.onMeasure(paramInt1, paramInt2);
    if (this.b == null) {}
    int k;
    do
    {
      return;
      k = View.MeasureSpec.getMode(paramInt2);
    } while ((this.a == null) || (this.a.getVisibility() == 8) || (k == 1073741824));
    int m;
    if (!a(this.b))
    {
      m = b(this.b);
      if (k != -2147483648) {
        break label167;
      }
    }
    label167:
    for (int n = View.MeasureSpec.getSize(paramInt2);; n = 2147483647)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(m + b(this.a), n));
      return;
      if (!a(this.i))
      {
        m = b(this.i);
        break;
      }
      m = 0;
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.c != null) {
        this.c.setVisible(bool, false);
      }
      if (this.d != null) {
        this.d.setVisible(bool, false);
      }
      if (this.e != null) {
        this.e.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.c) && (!this.f)) || ((paramDrawable == this.d) && (this.g)) || ((paramDrawable == this.e) && (this.f)) || (super.verifyDrawable(paramDrawable));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContainer
 * JD-Core Version:    0.7.0.1
 */