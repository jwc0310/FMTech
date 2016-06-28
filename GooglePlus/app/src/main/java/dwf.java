import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.List;

public final class dwf
  implements kbb
{
  static int a;
  private static boolean af;
  private static ipb ag;
  private static Paint ah;
  private static int ai;
  private static int aj;
  static float b;
  static int c;
  static int d;
  static Bitmap e;
  static Paint f;
  static Paint g;
  static TextPaint h;
  static TextPaint i;
  static TextPaint j;
  static TextPaint k;
  static TextPaint l;
  static TextPaint m;
  static TextPaint n;
  static Bitmap o;
  static Bitmap p;
  static Bitmap q;
  static Bitmap r;
  static Bitmap s;
  static Bitmap t;
  static Bitmap u;
  static Bitmap v;
  static NinePatchDrawable w;
  static String x;
  static String y;
  public hxj A;
  public miq B;
  public boolean C;
  public dvl D;
  public ipf E;
  kaz F;
  Rect G;
  public dvq H;
  Bitmap I;
  Rect J;
  StaticLayout K;
  Point L;
  Bitmap M;
  Rect N;
  Rect O;
  Bitmap P;
  float[] Q;
  StaticLayout R;
  Point S;
  StaticLayout T;
  Point U;
  StaticLayout V;
  Point W;
  StaticLayout X;
  Point Y;
  public CharSequence Z;
  StaticLayout aa;
  Point ab;
  dvr ac;
  boolean ad;
  lwj ae;
  public boolean z;
  
  public dwf(View paramView)
  {
    Context localContext = paramView.getContext();
    hxk.a(localContext);
    this.ae = ((lwj)mbb.a(localContext, lwj.class));
    if (!af)
    {
      Resources localResources = paramView.getResources();
      ag = (ipb)mbb.a(localContext, ipb.class);
      f = new Paint(2);
      a = (int)localResources.getDimension(efj.kS);
      b = localResources.getDimension(efj.lM);
      c = (int)localResources.getDimension(efj.lL);
      d = (int)localResources.getDimension(efj.lN);
      e = efj.t(localContext, 1);
      Paint localPaint1 = new Paint();
      ah = localPaint1;
      localPaint1.setColor(localResources.getColor(efj.jB));
      ah.setStyle(Paint.Style.FILL);
      h = efj.B(localContext, efj.yL);
      TextPaint localTextPaint1 = efj.B(localContext, efj.yo);
      i = localTextPaint1;
      lwj.a(localTextPaint1, efj.nK);
      TextPaint localTextPaint2 = efj.B(localContext, efj.yC);
      TextPaint localTextPaint3 = new TextPaint(localTextPaint2);
      j = localTextPaint3;
      localTextPaint3.setColor(localResources.getColor(efj.jW));
      lwj.a(j, efj.nJ);
      TextPaint localTextPaint4 = new TextPaint(localTextPaint2);
      m = localTextPaint4;
      localTextPaint4.setColor(localResources.getColor(efj.jv));
      lwj.a(m, efj.nJ);
      TextPaint localTextPaint5 = new TextPaint(localTextPaint2);
      l = localTextPaint5;
      localTextPaint5.setColor(localResources.getColor(efj.kd));
      lwj.a(l, efj.nJ);
      TextPaint localTextPaint6 = new TextPaint(localTextPaint2);
      k = localTextPaint6;
      localTextPaint6.setColor(localResources.getColor(efj.jw));
      lwj.a(k, efj.nJ);
      TextPaint localTextPaint7 = new TextPaint(i);
      n = localTextPaint7;
      localTextPaint7.setColor(localResources.getColor(efj.kh));
      n.setTextSize(localResources.getDimension(efj.nK));
      lwj.a(n, efj.nK);
      Paint localPaint2 = new Paint();
      g = localPaint2;
      localPaint2.setColor(localResources.getColor(efj.ju));
      g.setStrokeWidth(localResources.getDimension(efj.lK));
      o = efj.a(localResources, efj.qn);
      p = efj.a(localResources, efj.qu);
      q = efj.a(localResources, efj.qt);
      t = efj.a(localResources, efj.qv);
      u = efj.a(localResources, efj.qw);
      v = efj.a(localResources, efj.qx);
      r = efj.a(localResources, efj.qA);
      s = efj.a(localResources, efj.qs);
      y = localResources.getString(aau.gj);
      x = localResources.getString(aau.gd);
      w = (NinePatchDrawable)localResources.getDrawable(efj.oJ);
      int i1 = bqo.a(localContext);
      ai = i1;
      aj = bqo.a(i1);
      af = true;
    }
    this.G = new Rect();
    this.J = new Rect();
    this.L = new Point();
    this.N = new Rect();
    this.O = new Rect();
    this.S = new Point();
    this.U = new Point();
    this.W = new Point();
    this.Y = new Point();
    this.ab = new Point();
    this.Q = new float[4];
  }
  
  public static void a(StaticLayout paramStaticLayout, Point paramPoint, Canvas paramCanvas)
  {
    paramCanvas.translate(paramPoint.x, paramPoint.y);
    paramStaticLayout.draw(paramCanvas);
    paramCanvas.translate(-paramPoint.x, -paramPoint.y);
  }
  
  final StaticLayout a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence, Point paramPoint, TextPaint paramTextPaint, boolean paramBoolean)
  {
    return this.ae.a(paramInt1, paramInt2, paramInt3, 0, null, null, 0, paramCharSequence, paramPoint, paramTextPaint, paramBoolean);
  }
  
  public final void a()
  {
    if (!this.z) {
      return;
    }
    dvl localdvl = this.D;
    dvq localdvq = this.H;
    localdvl.f.remove(localdvq);
    this.H = null;
    this.B = null;
    this.A = null;
    this.D = null;
    this.I = null;
    this.M = null;
    this.G.setEmpty();
    this.J.setEmpty();
    this.L.set(0, 0);
    this.N.setEmpty();
    this.O.setEmpty();
    this.R = null;
    this.T = null;
    this.V = null;
    this.X = null;
    this.K = null;
    this.aa = null;
    this.ac = null;
    this.P = null;
    this.S.set(0, 0);
    this.U.set(0, 0);
    this.W.set(0, 0);
    this.Y.set(0, 0);
    this.ab.set(0, 0);
    this.Z = null;
    this.z = false;
  }
  
  public final void a(kaz paramkaz)
  {
    if ((this.D != null) && (paramkaz == this.F)) {
      this.D.invalidate();
    }
  }
  
  public final void ap_()
  {
    e();
  }
  
  public final void b()
  {
    if ((this.D != null) && (lwo.a(this.D))) {
      d();
    }
  }
  
  public final void d()
  {
    if (this.H != null) {
      this.H.b();
    }
    if (this.E != null) {
      this.F = ag.a(this.E, 0, ai, aj, null, 0, this);
    }
  }
  
  public final void e()
  {
    if (this.H != null) {
      this.H.ap_();
    }
    if (this.F != null)
    {
      this.F.b(this);
      this.F = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwf
 * JD-Core Version:    0.7.0.1
 */