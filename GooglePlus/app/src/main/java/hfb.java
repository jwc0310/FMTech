import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class hfb
  extends ViewGroup
  implements lxj
{
  private final Drawable A;
  private final int B;
  private final int C;
  private int D;
  public final ShapeDrawable a;
  public final int b;
  public final Button c;
  public final TextView d;
  public final TextView e;
  public final TextView f;
  public final int g;
  public boolean h;
  public final TextView i;
  private int j;
  private int k;
  private final int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private final int u;
  private final int v;
  private final int w;
  private final int x;
  private int y;
  private int z;
  
  public hfb(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.B = localResources.getDimensionPixelSize(aau.yx);
    this.A = localResources.getDrawable(aau.yD);
    this.w = localResources.getDimensionPixelSize(aau.yv);
    this.g = localResources.getDimensionPixelSize(aau.yw);
    this.b = localResources.getDimensionPixelSize(aau.yB);
    this.l = localResources.getDimensionPixelSize(aau.yC);
    int i1 = this.l;
    int i2 = this.b;
    int i3 = localResources.getColor(aau.yn);
    Point localPoint1 = new Point(0, 0);
    Point localPoint2 = new Point(0, i2);
    Point localPoint3 = new Point(i1, i2 / 2);
    Path localPath = new Path();
    localPath.setFillType(Path.FillType.EVEN_ODD);
    localPath.lineTo(localPoint2.x, localPoint2.y);
    localPath.lineTo(localPoint3.x, localPoint3.y);
    localPath.lineTo(localPoint1.x, localPoint1.y);
    localPath.close();
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new PathShape(localPath, i1, i2));
    localShapeDrawable.getPaint().setColor(i3);
    this.a = localShapeDrawable;
    this.u = localResources.getDimensionPixelSize(aau.ys);
    this.v = localResources.getDimensionPixelOffset(aau.yr);
    this.x = localResources.getDimensionPixelSize(aau.yp);
    this.C = localResources.getDimensionPixelSize(aau.yu);
    this.c = new Button(localContext, null, 0);
    TypedArray localTypedArray = localContext.obtainStyledAttributes(new int[] { 16843534 });
    this.c.setBackgroundResource(localTypedArray.getResourceId(0, 0));
    localTypedArray.recycle();
    this.c.setGravity(16);
    this.c.setMaxLines(1);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    this.c.setVisibility(8);
    addView(this.c);
    this.e = new TextView(localContext);
    this.e.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.e);
    this.d = new TextView(localContext);
    this.d.setMaxLines(1);
    this.d.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.d);
    this.f = new TextView(localContext);
    this.f.setMaxLines(1);
    this.f.setEllipsize(TextUtils.TruncateAt.END);
    this.f.setTextAppearance(localContext, aau.yL);
    addView(this.f);
    this.i = new TextView(localContext);
    this.i.setGravity(16);
    this.i.setTextAppearance(localContext, aau.yL);
    this.i.setAllCaps(true);
    this.i.setText(localResources.getString(efj.Gq));
    this.i.setVisibility(8);
    addView(this.i);
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView.getVisibility() != 8) {
      paramView.layout(paramInt1, paramInt2, paramInt1 + paramView.getMeasuredWidth(), paramInt2 + paramView.getMeasuredHeight());
    }
  }
  
  public final void D_()
  {
    this.c.setOnClickListener(null);
    this.c.setEnabled(false);
    this.c.setClickable(false);
    this.c.setText(null);
    this.c.setVisibility(8);
    this.n = 0;
    this.o = 0;
    this.m = 0;
    this.j = 0;
    this.k = 0;
    this.f.setText(null);
    this.f.setVisibility(8);
    this.s = 0;
    this.t = 0;
    this.d.setText(null);
    this.d.setVisibility(8);
    this.p = 0;
    this.q = 0;
    this.r = 0;
    this.e.setText(null);
    this.e.setVisibility(8);
    this.y = 0;
    this.z = 0;
    this.i.setVisibility(8);
    this.D = 0;
  }
  
  public final CharSequence getContentDescription()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.e.getText();
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.c.getContentDescription();
      efj.a(localStringBuilder, arrayOfCharSequence2);
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      arrayOfCharSequence3[0] = this.d.getContentDescription();
      efj.a(localStringBuilder, arrayOfCharSequence3);
      return mfx.b(localStringBuilder);
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.c.getVisibility() != 8)
    {
      this.a.setBounds(this.k, this.j, this.k + this.l, this.j + this.b);
      this.a.draw(paramCanvas);
    }
    if (this.h)
    {
      this.A.setBounds(this.z, this.y, this.z + this.A.getIntrinsicWidth(), this.y + this.A.getIntrinsicHeight());
      this.A.draw(paramCanvas);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(this.e, 0, this.r);
    a(this.c, this.o, this.n);
    if (this.i.getVisibility() != 8)
    {
      int i1 = this.c.getTop() + this.m - this.D;
      int i2 = this.c.getRight() + this.w;
      if (this.h) {
        i2 += this.w + this.A.getIntrinsicWidth();
      }
      a(this.i, i2, i1);
    }
    a(this.f, this.t, this.s);
    a(this.d, this.p, this.q);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    Context localContext = getContext();
    int i1 = aau.a(localContext, paramInt1);
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i3 = efj.i(localContext);
    int i4;
    if (this.d.getVisibility() != 8)
    {
      this.d.setMaxWidth(i1);
      this.d.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), i2);
      i4 = i1 - (this.d.getMeasuredWidth() + this.w);
      this.p = (i4 + this.w);
    }
    for (;;)
    {
      int i5 = this.e.getVisibility();
      int i6 = 0;
      int i7 = 0;
      if (i5 != 8)
      {
        this.e.setMaxWidth(i4);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(i4, -2147483648), i2);
        i7 = this.e.getMeasuredWidth();
        i6 = this.e.getMeasuredHeight();
      }
      int i13;
      int i15;
      int i16;
      int i9;
      int i10;
      label487:
      int i11;
      hfb localhfb;
      if (this.c.getVisibility() != 8)
      {
        i13 = i4 - (this.l + 2 * this.w);
        if (this.h) {
          i13 -= this.A.getIntrinsicWidth() + this.w;
        }
        if (this.i.getVisibility() != 8)
        {
          this.i.setMinHeight(0);
          this.i.measure(i2, i2);
          this.D = this.i.getBaseline();
          i13 -= this.i.getMeasuredWidth() + this.w;
        }
        this.c.setMinHeight(0);
        this.c.setMaxWidth(i13);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i13, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
        int i14 = this.c.getMeasuredWidth();
        i15 = this.c.getMeasuredHeight();
        if ((i13 - i7 - i14 < 0) || (this.f.getVisibility() != 8))
        {
          this.r = 0;
          this.n = (i6 + this.x);
          this.o = (this.l + this.u);
          this.j = (this.n + (i15 - this.b) / 2);
          this.k = 0;
          i16 = i15 + (i6 + this.x) + this.g;
          if (this.h)
          {
            this.y = (this.n + (i15 - this.A.getIntrinsicHeight()) / 2);
            this.z = (i14 + this.o + this.w);
          }
          this.m = this.c.getBaseline();
          int i17 = Math.max(i16, i3);
          i9 = i13;
          i10 = i17;
          if (this.f.getVisibility() != 8)
          {
            this.e.setMaxWidth(i9 - i7);
            int i12 = View.MeasureSpec.makeMeasureSpec(i9 - i7, -2147483648);
            this.f.measure(i12, i2);
            this.s = this.r;
            this.t = (i7 + this.w);
          }
          if (this.h)
          {
            if (this.c.getVisibility() == 8) {
              break label837;
            }
            this.y = (this.n + (this.c.getMeasuredHeight() - this.A.getIntrinsicHeight()) / 2);
            i11 = this.o + this.c.getMeasuredWidth() + this.w;
            localhfb = this;
          }
        }
      }
      for (;;)
      {
        localhfb.z = i11;
        if (this.d.getVisibility() != 8) {
          this.q = (this.r + (i6 - this.d.getMeasuredHeight()) / 2);
        }
        setMeasuredDimension(i1, i10);
        return;
        this.r = ((i3 - i6) / 2);
        this.j = (this.r + (i6 - this.b) / 2);
        this.k = (i7 + this.v);
        this.c.setMinHeight(this.C);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i13, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
        i15 = this.c.getMeasuredHeight();
        this.n = ((i3 - i15) / 2);
        this.o = (this.k + this.l + this.u);
        i16 = Math.max(i6 + this.r, i15 + this.n) + this.g;
        break;
        this.r = ((i3 - i6) / 2);
        int i8 = i3 + this.B;
        i9 = i4;
        i10 = i8;
        break label487;
        label837:
        this.y = (this.r + (i6 - this.A.getIntrinsicHeight()) / 2);
        if (this.f.getVisibility() != 8)
        {
          i11 = this.t + this.f.getMeasuredWidth() + this.w;
          localhfb = this;
        }
        else
        {
          i11 = i7 + this.w;
          localhfb = this;
        }
      }
      i4 = i1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfb
 * JD-Core Version:    0.7.0.1
 */