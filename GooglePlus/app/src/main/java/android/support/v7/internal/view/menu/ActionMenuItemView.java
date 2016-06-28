package android.support.v7.internal.view.menu;

import acu;
import ads;
import afi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import efj;
import nj;
import ns;
import wb;
import xe;
import xf;
import xn;
import xp;
import yc;

public class ActionMenuItemView
  extends ads
  implements acu, View.OnClickListener, View.OnLongClickListener, yc
{
  public xp a;
  public xn b;
  public xf c;
  private CharSequence d;
  private Drawable e;
  private afi f;
  private boolean g;
  private int h;
  private int i;
  private int j;
  
  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.g = localResources.getBoolean(efj.h);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.v, paramInt, 0);
    this.h = localTypedArray.getDimensionPixelSize(wb.w, 0);
    localTypedArray.recycle();
    this.j = ((int)(0.5F + 32.0F * localResources.getDisplayMetrics().density));
    setOnClickListener(this);
    setOnLongClickListener(this);
    this.i = -1;
  }
  
  private final void e()
  {
    int k;
    int n;
    if (!TextUtils.isEmpty(this.d))
    {
      k = 1;
      label35:
      int m;
      if (this.e != null)
      {
        if ((0x4 & this.a.e) != 4) {
          break label79;
        }
        n = 1;
        m = 0;
        if (n != 0)
        {
          boolean bool = this.g;
          m = 0;
          if (!bool) {}
        }
      }
      else
      {
        m = 1;
      }
      if ((k & m) == 0) {
        break label85;
      }
    }
    label79:
    label85:
    for (CharSequence localCharSequence = this.d;; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      k = 0;
      break;
      n = 0;
      break label35;
    }
  }
  
  public final xp a()
  {
    return this.a;
  }
  
  public final void a(xp paramxp, int paramInt)
  {
    this.a = paramxp;
    Drawable localDrawable = paramxp.getIcon();
    this.e = localDrawable;
    if (localDrawable != null)
    {
      int m = localDrawable.getIntrinsicWidth();
      int n = localDrawable.getIntrinsicHeight();
      if (m > this.j)
      {
        float f2 = this.j / m;
        m = this.j;
        n = (int)(f2 * n);
      }
      if (n > this.j)
      {
        float f1 = this.j / n;
        n = this.j;
        m = (int)(f1 * m);
      }
      localDrawable.setBounds(0, 0, m, n);
    }
    setCompoundDrawables(localDrawable, null, null, null);
    e();
    this.d = paramxp.a(this);
    setContentDescription(this.d);
    e();
    setId(paramxp.getItemId());
    if (paramxp.isVisible()) {}
    for (int k = 0;; k = 8)
    {
      setVisibility(k);
      setEnabled(paramxp.isEnabled());
      if ((paramxp.hasSubMenu()) && (this.f == null)) {
        this.f = new xe(this);
      }
      return;
    }
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean c()
  {
    if (!TextUtils.isEmpty(getText())) {}
    for (int k = 1; (k != 0) && (this.a.getIcon() == null); k = 0) {
      return true;
    }
    return false;
  }
  
  public final boolean d()
  {
    return !TextUtils.isEmpty(getText());
  }
  
  public void onClick(View paramView)
  {
    if (this.b != null) {
      this.b.a(this.a);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    this.g = getContext().getResources().getBoolean(efj.h);
    e();
  }
  
  public boolean onLongClick(View paramView)
  {
    if (!TextUtils.isEmpty(getText())) {}
    for (int k = 1; k != 0; k = 0) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int m = getWidth();
    int n = getHeight();
    int i1 = arrayOfInt[1] + n / 2;
    int i2 = arrayOfInt[0] + m / 2;
    if (nj.a.t(paramView) == 0) {
      i2 = localContext.getResources().getDisplayMetrics().widthPixels - i2;
    }
    Toast localToast = Toast.makeText(localContext, this.a.getTitle(), 0);
    if (i1 < localRect.height()) {
      localToast.setGravity(8388661, i2, n + arrayOfInt[1] - localRect.top);
    }
    for (;;)
    {
      localToast.show();
      return true;
      localToast.setGravity(81, 0, n);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k;
    int m;
    int n;
    int i1;
    if (!TextUtils.isEmpty(getText()))
    {
      k = 1;
      if ((k != 0) && (this.i >= 0)) {
        super.setPadding(this.i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
      super.onMeasure(paramInt1, paramInt2);
      m = View.MeasureSpec.getMode(paramInt1);
      n = View.MeasureSpec.getSize(paramInt1);
      i1 = getMeasuredWidth();
      if (m != -2147483648) {
        break label171;
      }
    }
    label171:
    for (int i2 = Math.min(n, this.h);; i2 = this.h)
    {
      if ((m != 1073741824) && (this.h > 0) && (i1 < i2)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), paramInt2);
      }
      if ((k == 0) && (this.e != null)) {
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
      return;
      k = 0;
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.a.hasSubMenu()) && (this.f != null) && (this.f.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.i = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuItemView
 * JD-Core Version:    0.7.0.1
 */