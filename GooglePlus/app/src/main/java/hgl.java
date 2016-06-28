import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.TextView;

public final class hgl
  extends lws
{
  private static final SparseArray<Drawable> E = new SparseArray();
  private static Drawable F;
  private boolean B;
  private boolean C = true;
  private boolean D = false;
  public String a;
  public String b;
  private int c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  private final TextView l;
  private TextView m;
  private Drawable n;
  private final Rect o;
  private final int p;
  private final int q;
  private String r;
  private final SpannableStringBuilder s = new SpannableStringBuilder();
  private int t;
  private int u;
  
  public hgl(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private hgl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null);
    Resources localResources = getResources();
    if (this.C) {}
    for (int i1 = localResources.getDimensionPixelSize(efj.GZ);; i1 = localResources.getDimensionPixelSize(efj.GY))
    {
      this.c = i1;
      this.d = localResources.getDimensionPixelOffset(efj.Hd);
      this.e = localResources.getDimensionPixelOffset(efj.Ha);
      this.f = localResources.getDimensionPixelSize(efj.Hb);
      this.g = (localResources.getDimensionPixelOffset(efj.Hc) - this.v);
      this.q = localResources.getInteger(efj.Hn);
      this.i = localResources.getDimensionPixelOffset(efj.GW);
      this.h = localResources.getDimensionPixelOffset(efj.GV);
      this.p = localResources.getDimensionPixelSize(efj.GT);
      this.j = localResources.getDimensionPixelOffset(efj.GU);
      this.k = localResources.getDimensionPixelOffset(efj.GX);
      this.l = new TextView(paramContext);
      this.l.setMaxLines(this.q);
      this.l.setEllipsize(TextUtils.TruncateAt.END);
      this.l.setTextAppearance(paramContext, efj.Hs);
      this.l.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      addView(this.l);
      this.o = new Rect();
      if (F == null) {
        F = localResources.getDrawable(efj.Hj);
      }
      this.n = F;
      return;
    }
  }
  
  public final void a(String paramString)
  {
    if (this.m == null)
    {
      Context localContext = getContext();
      this.m = new TextView(localContext);
      this.m.setSingleLine(true);
      this.m.setEllipsize(TextUtils.TruncateAt.END);
      this.m.setGravity(16);
      this.m.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      this.m.setTextAppearance(localContext, efj.Hr);
      addView(this.m);
    }
    this.m.setText(paramString);
    this.m.setVisibility(0);
    this.D = true;
  }
  
  public final void a(String paramString1, int paramInt1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this.a = paramString1;
    this.t = paramInt1;
    this.u = paramInt2;
    boolean bool;
    label121:
    int i4;
    if ((this.C) && ((paramInt1 == 1) || (paramInt1 == 10)))
    {
      bool = true;
      this.B = bool;
      if ((paramInt1 == -1) && ("v.whatshot".equals(paramString1))) {
        paramInt1 = -2;
      }
      this.n = ((Drawable)E.get(paramInt1));
      switch (paramInt1)
      {
      default: 
        this.r = paramString2;
        efj.a(this.l, this.r, this.s, this.b, lws.A, this.w);
        if (this.n == null) {}
        switch (paramInt1)
        {
        default: 
          i4 = efj.He;
          label225:
          this.n = getContext().getApplicationContext().getResources().getDrawable(i4);
          E.put(paramInt1, this.n);
          if (this.B)
          {
            Resources localResources2 = getContext().getResources();
            int i3 = efj.Hq;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(paramInt2);
            a(localResources2.getQuantityString(i3, paramInt2, arrayOfObject2));
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      if (this.r == null) {
        Log.e("CircleListItemView", "Circle name unavailable for content description.");
      }
      this.l.setContentDescription(this.r);
      if (this.B)
      {
        TextView localTextView = this.m;
        Resources localResources1 = getResources();
        int i1 = efj.Hp;
        int i2 = this.u;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.u);
        localTextView.setContentDescription(localResources1.getQuantityString(i1, i2, arrayOfObject1));
      }
      return;
      bool = false;
      break;
      this.r = getResources().getString(aw.av);
      break label121;
      this.r = getResources().getString(aw.au);
      break label121;
      this.r = getResources().getString(aw.aw);
      break label121;
      this.r = getResources().getString(aw.az);
      break label121;
      if (paramBoolean)
      {
        i4 = efj.Hk;
        break label225;
      }
      i4 = efj.Hj;
      break label225;
      i4 = efj.Hf;
      break label225;
      if (paramBoolean)
      {
        i4 = efj.Hh;
        break label225;
      }
      i4 = efj.Hg;
      break label225;
      i4 = efj.Hl;
      break label225;
      i4 = efj.He;
      break label225;
      i4 = efj.Hi;
      break label225;
      i4 = efj.Hm;
      break label225;
      this.D = false;
      if (this.m != null) {
        this.m.setVisibility(8);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.a != null) {
      throw new IllegalArgumentException("Call setMemberCountVisible() before calling setCircle()");
    }
    this.C = false;
    if (this.C) {}
    for (int i1 = getResources().getDimensionPixelSize(efj.GZ);; i1 = getResources().getDimensionPixelSize(efj.GY))
    {
      this.c = i1;
      return;
    }
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    if (this.t != -3)
    {
      this.n.setBounds(this.o);
      this.n.draw(paramCanvas);
    }
    super.dispatchDraw(paramCanvas);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.f;
    int i2 = this.l.getMeasuredHeight();
    if (this.D) {}
    for (int i3 = i2 + (this.m.getMeasuredHeight() + this.k);; i3 = i2)
    {
      int i4 = (paramInt4 - paramInt2 - this.p) / 2;
      int i5 = (paramInt4 - paramInt2 - i3) / 2;
      int i6 = this.n.getIntrinsicWidth();
      int i7 = this.n.getIntrinsicHeight();
      int i8 = i4 + (this.p - i7) / 2;
      int i9 = i1 + (this.p - i6) / 2;
      this.o.set(i9, i8, i6 + i9, i7 + i8);
      if (this.t == -3) {}
      for (int i10 = this.h;; i10 = i1 + (this.p + this.h))
      {
        int i11 = paramInt3 - this.g;
        if (this.x)
        {
          int i14 = this.y.getMeasuredWidth();
          int i15 = this.y.getMeasuredHeight();
          int i16 = (paramInt4 - paramInt2 - i15) / 2;
          this.y.layout(i11 - i14 - this.v, i16, i11 - this.v, i15 + i16);
          i11 -= i14 + this.j;
        }
        int i12 = Math.min(this.l.getMeasuredWidth(), i11 - i10 - this.i);
        this.l.layout(i10, i5, i12 + i10, i5 + i2);
        if (this.D)
        {
          int i13 = i2 + i5 + this.k;
          this.m.layout(i10, i13, i11, i3 + i5);
        }
        return;
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = i1 - this.f - this.g - this.p - this.h;
    int i3;
    if (this.x)
    {
      this.y.measure(0, paramInt2);
      i3 = Math.max(0, this.y.getMeasuredHeight());
      i2 -= this.y.getMeasuredWidth() + this.j;
    }
    for (;;)
    {
      this.l.measure(0, 0);
      int i4 = this.l.getMeasuredHeight();
      int i5;
      if (this.D)
      {
        this.m.measure(0, 0);
        i5 = i4 + (this.m.getMeasuredHeight() + this.k);
        int i7 = Math.min(this.m.getMeasuredWidth(), i2);
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(this.m.getMeasuredHeight(), 1073741824));
      }
      for (;;)
      {
        int i6 = Math.min(this.l.getMeasuredWidth(), i2);
        this.l.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i5 * this.q, -2147483648));
        setMeasuredDimension(i1, Math.max(Math.max(Math.max(i3, i5 * this.l.getLineCount()), this.p) + (this.d + this.e), this.c));
        return;
        i5 = i4;
      }
      i3 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hgl
 * JD-Core Version:    0.7.0.1
 */