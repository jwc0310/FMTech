package android.support.design.widget;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import j;
import nj;
import ns;

public class Snackbar$SnackbarLayout
  extends LinearLayout
{
  public TextView a;
  public Button b;
  public aau c;
  private int d;
  private int e;
  
  public Snackbar$SnackbarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.t);
    this.d = localTypedArray.getDimensionPixelSize(j.u, -1);
    this.e = localTypedArray.getDimensionPixelSize(j.w, -1);
    if (localTypedArray.hasValue(j.v))
    {
      float f = localTypedArray.getDimensionPixelSize(j.v, 0);
      nj.a.f(this, f);
    }
    localTypedArray.recycle();
    setClickable(true);
    LayoutInflater.from(paramContext).inflate(2130968753, this);
  }
  
  private final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getOrientation();
    boolean bool = false;
    if (paramInt1 != i)
    {
      setOrientation(paramInt1);
      bool = true;
    }
    TextView localTextView;
    if ((this.a.getPaddingTop() != paramInt2) || (this.a.getPaddingBottom() != paramInt3))
    {
      localTextView = this.a;
      if (!nj.a.x(localTextView)) {
        break label102;
      }
      int j = nj.a.u(localTextView);
      int k = nj.a.v(localTextView);
      nj.a.a(localTextView, j, paramInt2, k, paramInt3);
    }
    for (;;)
    {
      bool = true;
      return bool;
      label102:
      localTextView.setPadding(localTextView.getPaddingLeft(), paramInt2, localTextView.getPaddingRight(), paramInt3);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131559143));
    this.b = ((Button)findViewById(2131559144));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (this.c != null)) {
      this.c.a();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.d > 0) && (getMeasuredWidth() > this.d))
    {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
      super.onMeasure(paramInt1, paramInt2);
    }
    int i = getResources().getDimensionPixelSize(2131493251);
    int j = getResources().getDimensionPixelSize(2131493250);
    int k;
    int m;
    if (this.a.getLayout().getLineCount() > 1)
    {
      k = 1;
      if ((k == 0) || (this.e <= 0) || (this.b.getMeasuredWidth() <= this.e)) {
        break label138;
      }
      if (!a(1, i, i - j)) {
        break label165;
      }
      m = 1;
    }
    for (;;)
    {
      if (m != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      k = 0;
      break;
      label138:
      if (k != 0) {}
      for (;;)
      {
        if (!a(0, i, i)) {
          break label165;
        }
        m = 1;
        break;
        i = j;
      }
      label165:
      m = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.design.widget.Snackbar.SnackbarLayout
 * JD-Core Version:    0.7.0.1
 */