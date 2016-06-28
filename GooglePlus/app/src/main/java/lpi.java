import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class lpi
  extends ViewGroup
  implements gxs, kbb, lpj, lxj
{
  private static final mcs a = new mcs("enable_debug_stream", (byte)0);
  public loj H;
  public int I;
  public int J;
  public int K = 1;
  public int L = 1;
  public Rect M;
  public String N;
  public int O;
  public int P;
  public Drawable Q;
  public int R;
  public boolean S;
  public View.OnClickListener T;
  public String U;
  private final List<lwu> b = new ArrayList();
  private lwu c;
  private boolean d;
  private int e = -1;
  private gxq f;
  private boolean g;
  private boolean h;
  
  public lpi(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lpi(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  public lpi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.H = loj.a(paramContext);
    setWillNotDraw(false);
    this.M = new Rect();
  }
  
  public static gxq a(String paramString, llr paramllr)
  {
    gxt localgxt1 = pkh.d;
    String str2;
    gxt localgxt2;
    String str1;
    if (paramllr != null)
    {
      str2 = paramllr.c;
      if (paramllr.b != null)
      {
        localgxt2 = pkh.C;
        str1 = str2;
      }
    }
    for (;;)
    {
      if (str1 == null) {}
      for (String[] arrayOfString = { paramString };; arrayOfString = new String[] { paramString, str1 }) {
        return new kvj(localgxt2, arrayOfString);
      }
      localgxt2 = localgxt1;
      str1 = str2;
      continue;
      localgxt2 = localgxt1;
      str1 = null;
    }
  }
  
  private final Drawable f()
  {
    if (this.S) {}
    for (int i = da.aR;; i = da.aQ) {
      return getResources().getDrawable(i);
    }
  }
  
  public void D_()
  {
    int i = 1;
    ap_();
    removeAllViews();
    this.b.clear();
    this.c = null;
    if (this.d)
    {
      setClickable(i);
      this.d = false;
    }
    this.I = 0;
    this.J = 0;
    this.P = 0;
    this.N = null;
    this.K = i;
    this.L = i;
    this.R = 0;
    setOnClickListener(null);
    if (Build.VERSION.SDK_INT >= 14) {}
    for (;;)
    {
      if (i != 0)
      {
        lwo.h(this);
        setTranslationY(0.0F);
        setRotationX(0.0F);
        setRotationY(0.0F);
        setScaleX(1.0F);
        setScaleY(1.0F);
      }
      this.U = null;
      this.e = -1;
      this.f = null;
      this.g = false;
      this.h = false;
      return;
      i = 0;
    }
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt2;
  }
  
  public int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return paramInt5;
  }
  
  public final int a(hfa paramhfa, int paramInt)
  {
    return paramhfa.a(paramInt) - this.M.left - this.M.right;
  }
  
  public final lpi a(Cursor paramCursor, hfa paramhfa, int paramInt1, int paramInt2)
  {
    int i = 1;
    this.N = paramCursor.getString(2);
    this.S = paramhfa.b();
    byte[] arrayOfByte = paramCursor.getBlob(37);
    this.f = a(this.N, llr.a(arrayOfByte));
    this.U = paramCursor.getString(39);
    this.e = paramCursor.getPosition();
    this.R = paramInt2;
    if (paramInt2 == i)
    {
      this.L = Math.min(2, paramhfa.a);
      this.K = this.L;
    }
    if ((this.R == 0) || (this.R == i))
    {
      int j = i;
      setFocusable(j);
      if (this.R != 0) {
        break label199;
      }
      label136:
      setClickable(i);
      a(paramCursor, paramhfa, paramInt1);
      if (this.R != 0) {
        break label205;
      }
      if (this.Q == null) {
        this.Q = d();
      }
      setBackgroundDrawable(this.Q);
    }
    for (;;)
    {
      getBackground().getPadding(this.M);
      return this;
      int k = 0;
      break;
      label199:
      i = 0;
      break label136;
      label205:
      setBackgroundColor(this.H.au);
    }
  }
  
  public void a(Cursor paramCursor, hfa paramhfa, int paramInt) {}
  
  public final void a(hfa paramhfa)
  {
    if (paramhfa.a() <= 0) {
      return;
    }
    this.I = paramhfa.a(this.K);
    this.P = (this.I - this.M.left - this.M.right);
    int i = this.M.left + this.H.m;
    this.O = (this.I - this.M.right - 2 * this.H.m - this.M.left);
    this.J = this.M.top;
    this.J = a(this.I, this.J, i, this.O);
    this.J += this.M.bottom;
    this.S = paramhfa.b();
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public void a(boolean paramBoolean) {}
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void ap_() {}
  
  public Intent b(boolean paramBoolean)
  {
    return null;
  }
  
  public void b() {}
  
  public final void c(boolean paramBoolean)
  {
    if (this.g != paramBoolean)
    {
      this.g = paramBoolean;
      if (!this.h) {
        a(t());
      }
    }
  }
  
  public Drawable d()
  {
    Drawable localDrawable1 = f();
    if (!e()) {
      return f();
    }
    int i = this.H.at;
    if (this.S) {}
    for (int j = da.aS;; j = da.aT)
    {
      Drawable localDrawable2 = getResources().getDrawable(j);
      return efj.a(localDrawable1, ColorStateList.valueOf(i), localDrawable2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }
  
  public boolean e()
  {
    return true;
  }
  
  public boolean l()
  {
    return true;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
    lwo.h(this);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (!l()) {
      return;
    }
    super.onDraw(paramCanvas);
    int i = getWidth();
    a(paramCanvas, this.M.left, i - this.M.left - this.M.right, this.M.left + this.H.m, i - this.M.left - this.M.right - 2 * this.H.m, this.M.top);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (!l()) {
      setMeasuredDimension(0, 0);
    }
    while ((this.I <= 0) || (this.J <= 0)) {
      return;
    }
    setMeasuredDimension(this.I, this.J);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      int k = 0;
      for (;;)
      {
        super.onTouchEvent(paramMotionEvent);
        if ((paramMotionEvent.getAction() == 1) && (k == 0) && (this.T != null)) {
          this.T.onClick(this);
        }
        return true;
        for (int n = -1 + this.b.size();; n--)
        {
          if (n < 0) {
            break label172;
          }
          lwu locallwu = (lwu)this.b.get(n);
          if (locallwu.a(i, j, 0))
          {
            this.c = locallwu;
            this.d = isClickable();
            setClickable(false);
            invalidate();
            k = 0;
            break;
          }
        }
        label172:
        k = 0;
        continue;
        if (this.c != null)
        {
          this.c = null;
          if (this.d)
          {
            setClickable(true);
            this.d = false;
          }
          setPressed(false);
          invalidate();
        }
        for (int m = -1 + this.b.size(); m >= 0; m--) {
          bool |= ((lwu)this.b.get(m)).a(i, j, 1);
        }
        k = bool;
      }
      if (this.c != null)
      {
        this.c.a(i, j, 3);
        this.c = null;
        if (this.d)
        {
          setClickable(true);
          this.d = false;
        }
        invalidate();
      }
    }
  }
  
  public final String s()
  {
    return this.N;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (paramOnClickListener != null)
    {
      this.T = new gxn(paramOnClickListener);
      return;
    }
    this.T = null;
  }
  
  public final boolean t()
  {
    return (this.g) && (!this.h);
  }
  
  public final void u()
  {
    if (!this.h)
    {
      this.h = true;
      if (this.g) {
        a(t());
      }
    }
  }
  
  public gxq v()
  {
    return this.f;
  }
  
  public final void w()
  {
    if (this.h)
    {
      this.h = false;
      if (this.g) {
        a(t());
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpi
 * JD-Core Version:    0.7.0.1
 */