import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;

public final class hfp
  extends ViewGroup
  implements lxj
{
  public final gqw a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private final int h;
  private final Paint i;
  private final int j;
  private final int k;
  private final int l;
  private final Paint m;
  private int n;
  private int o;
  private int p;
  private int q = 0;
  private final int r;
  private boolean s;
  private boolean t;
  private final TextView u;
  private final TextView v;
  private final TextView w;
  private final iqu x;
  private double y;
  
  public hfp(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.b = localResources.getDimensionPixelOffset(aaw.nv);
    this.c = localResources.getDimensionPixelOffset(aaw.no);
    this.e = localResources.getInteger(aau.yS);
    this.g = localResources.getInteger(aau.yR);
    this.f = localResources.getInteger(aau.yT);
    this.j = localResources.getDimensionPixelSize(aaw.nt);
    this.d = localResources.getDimensionPixelSize(aaw.ns);
    this.h = localResources.getDimensionPixelSize(aaw.nx);
    this.t = false;
    this.w = new TextView(localContext);
    this.w.setTextAppearance(localContext, aaw.nF);
    this.w.setMaxLines(1);
    this.w.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.w);
    this.u = new TextView(localContext);
    this.u.setTextAppearance(localContext, aaw.nG);
    this.u.setMaxLines(this.e);
    this.u.setLineSpacing(localResources.getDimension(aaw.nl), 0.0F);
    this.u.setEllipsize(TextUtils.TruncateAt.END);
    this.u.setIncludeFontPadding(false);
    addView(this.u);
    this.v = new TextView(localContext);
    this.v.setTextAppearance(localContext, aaw.nH);
    this.k = localResources.getDimensionPixelSize(aaw.nm);
    this.v.setLineSpacing(localResources.getDimension(aaw.nn), 0.0F);
    this.v.setEllipsize(TextUtils.TruncateAt.END);
    this.v.setIncludeFontPadding(false);
    addView(this.v);
    this.x = new iqu(localContext);
    this.x.s = 0;
    this.x.b(1);
    this.x.N = 0.5F;
    this.x.p = null;
    this.x.b(false);
    addView(this.x);
    this.a = new gqw(this);
    this.l = localResources.getDimensionPixelOffset(aaw.nq);
    this.m = new Paint();
    this.m.setColor(localResources.getColor(aaw.nk));
    this.m.setStrokeWidth(this.l);
    this.i = new Paint();
    this.i.setColor(localResources.getColor(aaw.nj));
    this.i.setStyle(Paint.Style.STROKE);
    this.i.setStrokeWidth(localResources.getDimensionPixelSize(aaw.nw));
    this.p = localResources.getDimensionPixelSize(aaw.np);
    this.r = localResources.getDimensionPixelSize(aaw.ny);
    setWillNotDraw(false);
  }
  
  private int a(int paramInt)
  {
    int i1 = 1;
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i3 = View.MeasureSpec.makeMeasureSpec(paramInt, 1073741824);
    int i4 = this.c;
    int i5;
    int i6;
    label51:
    int i7;
    label64:
    int i8;
    if (this.x.getVisibility() == 0)
    {
      i5 = i1;
      if ((i5 == 0) || (this.s)) {
        break label180;
      }
      i6 = i1;
      if (this.v.getVisibility() != 0) {
        break label186;
      }
      i7 = i1;
      if (i7 == 0) {
        break label266;
      }
      if (i6 == 0) {
        break label210;
      }
      this.v.setMaxLines(this.f);
      this.v.measure(i3, i2);
      if (this.v.getMeasuredHeight() <= i4) {
        break label192;
      }
      this.v.setVisibility(8);
      i8 = 0;
    }
    for (;;)
    {
      label119:
      if (this.w.getVisibility() == 0) {}
      for (;;)
      {
        if (i1 != 0)
        {
          this.w.measure(i3, i2);
          if ((i6 == 0) || (i4 >= 0 + this.w.getMeasuredHeight())) {
            break label255;
          }
          this.w.setVisibility(8);
        }
        return i8;
        i5 = 0;
        break;
        label180:
        i6 = 0;
        break label51;
        label186:
        i7 = 0;
        break label64;
        label192:
        i4 -= this.v.getMeasuredHeight();
        i8 = 0;
        break label119;
        label210:
        this.v.setMaxLines(this.g);
        this.v.measure(i3, i2);
        i8 = 0 + (this.v.getMeasuredHeight() + this.r);
        break label119;
        i1 = 0;
      }
      label255:
      return i8 + this.w.getMeasuredHeight();
      label266:
      i8 = 0;
    }
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    int i2;
    int i3;
    if (this.x.getVisibility() == 0)
    {
      i2 = i1;
      if (((i2 != 0) && (!this.s)) || (c())) {
        paramInt1 += this.k;
      }
      if (this.v.getVisibility() != 0) {
        break label165;
      }
      i3 = i1;
      label54:
      if (i3 != 0)
      {
        this.v.layout(paramInt1, paramInt2 - this.p, paramInt1 + this.v.getMeasuredWidth(), paramInt2 + this.v.getMeasuredHeight());
        paramInt2 += this.v.getMeasuredHeight() + this.r;
      }
      if (this.w.getVisibility() != 0) {
        break label171;
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        this.w.layout(paramInt1, paramInt2, paramInt1 + this.w.getMeasuredWidth(), paramInt2 + this.w.getMeasuredHeight());
        paramInt2 += this.w.getMeasuredHeight();
      }
      return paramInt2;
      i2 = 0;
      break;
      label165:
      i3 = 0;
      break label54;
      label171:
      i1 = 0;
    }
  }
  
  private final boolean c()
  {
    int i1;
    if (this.x.getVisibility() == 0)
    {
      i1 = 1;
      if ((i1 != 0) && (!this.s)) {
        break label51;
      }
      if (this.v.getVisibility() != 0) {
        break label46;
      }
    }
    label46:
    for (int i2 = 1;; i2 = 0)
    {
      if (i2 == 0) {
        break label51;
      }
      return true;
      i1 = 0;
      break;
    }
    label51:
    return false;
  }
  
  public final void D_()
  {
    a(false);
    this.x.D_();
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    int i1;
    TextView localTextView;
    int i2;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      i1 = 1;
      this.w.setText(paramCharSequence);
      localTextView = this.w;
      i2 = 0;
      if (i1 == 0) {
        break label51;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(i2);
      this.t = (i1 | this.t);
      return;
      i1 = 0;
      break;
      label51:
      i2 = 8;
    }
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    int i1;
    iqu localiqu;
    if ((!TextUtils.isEmpty(paramString)) && (paramInt1 != 0) && (paramInt2 != 0))
    {
      i1 = bool;
      localiqu = this.x;
      if (i1 == 0) {
        break label59;
      }
    }
    label59:
    for (int i2 = 0;; i2 = 8)
    {
      localiqu.setVisibility(i2);
      requestLayout();
      if (i1 != 0) {
        break label66;
      }
      return;
      i1 = 0;
      break;
    }
    label66:
    this.t = (true | this.t);
    if (paramInt1 >= 400)
    {
      double d1 = paramInt1 / paramInt2;
      if ((d1 <= 2.5D) && (d1 >= 0.5555555555555556D))
      {
        this.s = bool;
        if (!this.s) {
          break label172;
        }
        this.y = (paramInt2 / paramInt1);
        this.x.a(0.0F);
      }
    }
    for (;;)
    {
      ipf localipf = ipf.a(getContext(), paramString, ipm.a);
      if (localipf == null) {
        break label187;
      }
      this.x.a(localipf);
      return;
      bool = false;
      break;
      label172:
      this.x.a(this.h);
    }
    label187:
    this.x.setVisibility(8);
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1 = 1;
    int i2;
    if ((paramBoolean) && (this.t))
    {
      i2 = i1;
      this.t = i2;
      if (!this.t) {
        break label46;
      }
    }
    label46:
    for (int i3 = 0;; i3 = 8)
    {
      setVisibility(i3);
      if (paramBoolean) {
        break label53;
      }
      return;
      i2 = 0;
      break;
    }
    label53:
    int i4;
    TextView localTextView;
    if (this.x.getVisibility() == 0)
    {
      i4 = i1;
      if (i4 == 0) {
        break label95;
      }
      localTextView = this.u;
      i1 = this.e;
    }
    for (;;)
    {
      localTextView.setMaxLines(i1);
      return;
      i4 = 0;
      break;
      label95:
      localTextView = this.u;
      int i5 = this.w.getVisibility();
      int i6 = 0;
      if (i5 == 0) {
        i6 = i1;
      }
      if (i6 == 0) {
        i1 = 2;
      }
    }
  }
  
  public final void b()
  {
    this.t = false;
    this.s = false;
    this.n = 0;
    this.o = 0;
    this.q = 0;
    a(null, 0, 0);
    a(null);
    b(null);
    c(null);
    this.a.a(null);
    a(false);
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    int i1;
    TextView localTextView;
    int i2;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      i1 = 1;
      this.u.setText(paramCharSequence);
      localTextView = this.u;
      i2 = 0;
      if (i1 == 0) {
        break label51;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(i2);
      this.t = (i1 | this.t);
      return;
      i1 = 0;
      break;
      label51:
      i2 = 8;
    }
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    int i1;
    TextView localTextView;
    int i2;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      i1 = 1;
      this.v.setText(paramCharSequence);
      localTextView = this.v;
      i2 = 0;
      if (i1 == 0) {
        break label51;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(i2);
      this.t = (i1 | this.t);
      return;
      i1 = 0;
      break;
      label51:
      i2 = 8;
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.u.getVisibility() == 0) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        paramCanvas.drawLine(this.j, this.i.getStrokeWidth(), getMeasuredWidth(), this.i.getStrokeWidth(), this.i);
      }
      if (c())
      {
        int i2 = this.j + this.p;
        paramCanvas.drawLine(i2, this.o, i2, this.o + this.n, this.m);
      }
      return;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1;
    int i2 = this.j;
    int i3 = this.d;
    int i4;
    int i8;
    if (this.u.getVisibility() == 0)
    {
      i4 = i1;
      if (i4 == 0) {
        break label230;
      }
      int i7 = 0 + this.b;
      i8 = i7 + this.u.getMeasuredHeight();
      this.u.layout(i2, i7, i2 + this.u.getMeasuredWidth(), i8);
    }
    label167:
    label230:
    for (int i5 = i8 + i3;; i5 = 0)
    {
      if (this.x.getVisibility() == 0) {}
      for (;;)
      {
        if ((i1 == 0) || (this.s)) {
          break label167;
        }
        this.x.layout(i2, i5, i2 + this.x.getMeasuredWidth(), i5 + this.x.getMeasuredHeight());
        a(i2 + this.x.getMeasuredWidth(), i5);
        return;
        i4 = 0;
        break;
        i1 = 0;
      }
      if ((i1 != 0) && (this.s))
      {
        int i6 = i3 + a(i2, i5);
        this.x.layout(0, i6, this.x.getMeasuredWidth(), i6 + this.x.getMeasuredHeight());
        return;
      }
      a(i2, i5);
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    if (getVisibility() == 8)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i3 = aau.a(getContext(), paramInt1);
    int i4 = this.d;
    int i5 = i3 - 2 * this.b - this.j;
    int i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
    int i7;
    if (this.u.getVisibility() == 0)
    {
      i7 = i1;
      if (i7 == 0) {
        break label390;
      }
      this.u.measure(i6, i2);
    }
    label390:
    for (int i8 = 0 + (i4 + this.u.getMeasuredHeight() + this.b);; i8 = 0)
    {
      label125:
      int i10;
      if (this.x.getVisibility() == 0)
      {
        if ((i1 == 0) || (this.s)) {
          break label247;
        }
        int i15 = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        int i16 = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        this.x.b(this.c, this.c);
        this.x.measure(i15, i16);
        a(i5 - this.k - this.x.getMeasuredWidth());
        i10 = i8 + this.x.getMeasuredHeight();
      }
      for (;;)
      {
        if (i10 != 0) {
          break label381;
        }
        setVisibility(8);
        setMeasuredDimension(0, 0);
        return;
        i7 = 0;
        break;
        i1 = 0;
        break label125;
        label247:
        int i9 = a(i5 - this.k);
        this.o = i8;
        this.n = (i9 - this.p);
        i10 = i8 + (i9 + i4);
        if ((i1 != 0) && (this.s))
        {
          int i11 = (int)(Math.max(i3, 0) * this.y);
          this.x.b(i3, i11);
          int i12 = (int)(i3 * this.y);
          int i13 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
          int i14 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
          this.x.measure(i13, i14);
          i10 += this.x.getMeasuredHeight();
        }
      }
      label381:
      setMeasuredDimension(i3, i10);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfp
 * JD-Core Version:    0.7.0.1
 */