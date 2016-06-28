import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.Calendar;
import java.util.TimeZone;

public final class dwg
  extends View
  implements kbb
{
  private static int a;
  private static int b;
  private static boolean c;
  private static ipb d;
  private static Paint e;
  private static Paint f;
  private static TextPaint g;
  private static TextPaint h;
  private static TextPaint i;
  private static Bitmap j;
  private static Bitmap k;
  private static Bitmap l;
  private static Drawable m;
  private static NinePatchDrawable n;
  private static String o;
  private static String p;
  private static int q;
  private static int r;
  private Rect A;
  private Rect B;
  private Rect C;
  private Rect D;
  private StaticLayout E;
  private Point F;
  private StaticLayout G;
  private Point H;
  private StaticLayout I;
  private Point J;
  private StaticLayout K;
  private Point L;
  private dvr M;
  private Bitmap N;
  private lwj O;
  private boolean s;
  private qdt t;
  private miq u;
  private String v;
  private String w;
  private String x;
  private ipf y;
  private kaz z;
  
  public dwg(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dwg(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dwg(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.O = ((lwj)mbb.a(paramContext, lwj.class));
    hxk.a(paramContext);
    setFocusable(true);
    if (!c)
    {
      Resources localResources = paramContext.getResources();
      d = (ipb)mbb.a(paramContext, ipb.class);
      e = new Paint(2);
      a = (int)localResources.getDimension(efj.lL);
      b = (int)localResources.getDimension(efj.lN);
      Paint localPaint = new Paint();
      f = localPaint;
      localPaint.setColor(-16777216);
      f.setStyle(Paint.Style.FILL);
      g = efj.B(paramContext, efj.yN);
      h = efj.B(paramContext, efj.ys);
      TextPaint localTextPaint = new TextPaint(h);
      i = localTextPaint;
      localTextPaint.setColor(localResources.getColor(efj.kq));
      i.setTextSize(localResources.getDimension(efj.nK));
      lwj.a(i, efj.nK);
      j = efj.a(localResources, efj.pw);
      k = efj.a(localResources, efj.pt);
      l = efj.a(localResources, efj.qf);
      m = localResources.getDrawable(da.aY);
      p = localResources.getString(aau.gj);
      o = localResources.getString(aau.gd);
      n = (NinePatchDrawable)localResources.getDrawable(efj.oJ);
      int i1 = bqo.a(paramContext);
      q = i1;
      r = bqo.a(i1);
      c = true;
    }
    this.A = new Rect();
    this.C = new Rect();
    this.D = new Rect();
    this.B = new Rect();
    this.F = new Point();
    this.H = new Point();
    this.J = new Point();
    this.L = new Point();
  }
  
  private final StaticLayout a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence, Point paramPoint, TextPaint paramTextPaint, boolean paramBoolean)
  {
    return this.O.a(paramInt1, paramInt2, paramInt3, 0, null, null, 0, paramCharSequence, paramPoint, paramTextPaint, true);
  }
  
  private static void a(StaticLayout paramStaticLayout, Point paramPoint, Canvas paramCanvas)
  {
    paramCanvas.translate(paramPoint.x, paramPoint.y);
    paramStaticLayout.draw(paramCanvas);
    paramCanvas.translate(-paramPoint.x, -paramPoint.y);
  }
  
  public final void a()
  {
    if (!this.s) {
      return;
    }
    this.u = null;
    this.t = null;
    this.v = null;
    this.w = null;
    this.x = null;
    this.A.setEmpty();
    this.C.setEmpty();
    this.B.setEmpty();
    this.D.setEmpty();
    this.E = null;
    this.G = null;
    this.I = null;
    this.K = null;
    this.M = null;
    this.N = null;
    this.F.set(0, 0);
    this.H.set(0, 0);
    this.J.set(0, 0);
    this.L.set(0, 0);
    this.s = false;
  }
  
  public final void a(dwh paramdwh, qdt paramqdt)
  {
    ap_();
    a();
    this.t = paramqdt;
    boolean bool1;
    ipm localipm;
    label74:
    qdc localqdc;
    if (this.t != null)
    {
      bool1 = true;
      this.s = bool1;
      if (this.s)
      {
        this.u = bqo.a(this.t.l.d);
        if (this.u != null)
        {
          if (this.u.a != 1) {
            break label433;
          }
          localipm = ipm.d;
          this.y = ipf.a(getContext(), this.u.c, localipm);
        }
        localqdc = (qdc)this.t.h.b(qdc.a);
        if (localqdc.c == null) {
          break label463;
        }
      }
    }
    label433:
    label463:
    for (TimeZone localTimeZone1 = hxk.a(localqdc.c);; localTimeZone1 = null)
    {
      Calendar localCalendar = Calendar.getInstance();
      boolean bool2 = efj.a(localCalendar.getTimeInMillis(), localCalendar.getTimeZone(), localqdc.b.longValue(), localTimeZone1, true);
      this.v = efj.a(paramdwh.getContext(), localqdc, false, null, bool2);
      localCalendar.setTimeInMillis(localqdc.b.longValue());
      hxj localhxj = new hxj(this.t);
      String str1 = localqdc.c;
      boolean bool3 = bqo.b(localhxj);
      TimeZone localTimeZone2 = hxk.a(str1);
      TimeZone localTimeZone3 = localCalendar.getTimeZone();
      String str2 = null;
      if (localTimeZone2 != null)
      {
        long l1 = hxk.a(localTimeZone3, localCalendar);
        long l2 = hxk.a(localTimeZone2, localCalendar);
        boolean bool4 = hxk.a(localTimeZone2.getID(), str1);
        str2 = null;
        if (bool4) {
          if (!bool3)
          {
            boolean bool5 = l1 < l2;
            str2 = null;
            if (!bool5) {}
          }
          else
          {
            str2 = localTimeZone2.getDisplayName();
          }
        }
      }
      this.w = str2;
      qdq localqdq = localhxj.l();
      mio localmio = this.t.l.g;
      if (localqdq != null)
      {
        this.x = localqdq.b;
        if ((TextUtils.isEmpty(this.x)) && (localqdq.d != null))
        {
          qea localqea = (qea)localqdq.d.b(qea.a);
          if (localqea != null) {
            this.x = localqea.c;
          }
        }
        this.N = j;
      }
      for (;;)
      {
        b();
        StringBuilder localStringBuilder = new StringBuilder();
        a(localStringBuilder);
        setContentDescription(localStringBuilder.toString());
        return;
        bool1 = false;
        break;
        localipm = ipm.a;
        break label74;
        if (localmio != null)
        {
          this.x = p;
          this.N = k;
        }
      }
    }
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    jr localjr = jr.a();
    Resources localResources = getResources();
    CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
    arrayOfCharSequence1[0] = localResources.getString(aau.fQ);
    efj.a(paramStringBuilder, arrayOfCharSequence1);
    CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
    arrayOfCharSequence2[0] = localjr.a(this.t.b);
    efj.a(paramStringBuilder, arrayOfCharSequence2);
    CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
    arrayOfCharSequence3[0] = this.v;
    efj.a(paramStringBuilder, arrayOfCharSequence3);
    CharSequence[] arrayOfCharSequence4 = new CharSequence[1];
    arrayOfCharSequence4[0] = this.w;
    efj.a(paramStringBuilder, arrayOfCharSequence4);
    if (bqo.b(new hxj(this.t)))
    {
      CharSequence[] arrayOfCharSequence6 = new CharSequence[1];
      arrayOfCharSequence6[0] = o;
      efj.a(paramStringBuilder, arrayOfCharSequence6);
    }
    CharSequence[] arrayOfCharSequence5 = new CharSequence[1];
    arrayOfCharSequence5[0] = this.x;
    efj.a(paramStringBuilder, arrayOfCharSequence5);
  }
  
  public final void a(kaz paramkaz)
  {
    if (paramkaz == this.z) {
      invalidate();
    }
  }
  
  public final void ap_()
  {
    if (this.z != null)
    {
      this.z.b(this);
      this.z = null;
    }
  }
  
  public final void b()
  {
    if (this.y != null) {
      this.z = d.a(this.y, 0, q, r, null, 0, this);
    }
  }
  
  protected final void drawableStateChanged()
  {
    m.setState(getDrawableState());
    invalidate();
    super.drawableStateChanged();
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.s) {
      return;
    }
    paramCanvas.drawRect(this.B, f);
    if (this.z != null)
    {
      Bitmap localBitmap = (Bitmap)this.z.p;
      if (localBitmap != null) {
        paramCanvas.drawBitmap(localBitmap, null, this.A, e);
      }
    }
    a(this.E, this.F, paramCanvas);
    a(this.G, this.H, paramCanvas);
    paramCanvas.drawBitmap(l, null, this.D, null);
    if (this.I != null) {
      a(this.I, this.J, paramCanvas);
    }
    if (this.M != null) {
      this.M.a(paramCanvas);
    }
    if (this.K != null)
    {
      a(this.K, this.L, paramCanvas);
      paramCanvas.drawBitmap(this.N, null, this.C, null);
    }
    m.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    m.draw(paramCanvas);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = a;
    int i2 = i1 * 2;
    int i3 = b;
    int i4 = View.MeasureSpec.getSize(paramInt1);
    int i5 = bqo.a(i4);
    if (this.u != null) {
      this.A.set(0, 0, i4 + 0, i5 + 0);
    }
    int i6 = i4 - i1 - i2;
    this.B.set(0, i5, i4, i5);
    int i7 = i5 + i1;
    this.E = a(i1, i7, i6, this.t.b, this.F, g, true);
    int i8 = i3 + (i7 + this.E.getHeight());
    this.G = this.O.a(i1, i8, i6, 0, l, this.D, i1, this.v, this.H, h, true);
    int i9 = i8 + this.G.getHeight();
    if (this.w != null)
    {
      int i13 = i9 + i3;
      this.I = a(this.H.x, i13, i6 - (this.H.x - i1), this.w, this.J, h, true);
      i9 = i13 + this.I.getHeight();
    }
    if (bqo.b(new hxj(this.t)))
    {
      int i12 = i9 + i3;
      this.M = new dvr(getContext(), null, o, i, n, n, null, i1, i12);
      i9 = i12 + this.M.a.height();
    }
    if (this.x != null)
    {
      int i11 = i9 + i3;
      this.K = this.O.a(i1, i11, i6, 0, this.N, this.C, i1, this.x, this.L, h, true);
      i9 = i11 + this.K.getHeight();
    }
    int i10 = i9 + i1 - i5;
    this.B.bottom = (i10 + this.B.bottom);
    setMeasuredDimension(i4, i10 + i5);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwg
 * JD-Core Version:    0.7.0.1
 */