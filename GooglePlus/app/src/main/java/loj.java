import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public final class loj
{
  private static iag<loj> be;
  public final int A;
  public final int B;
  public final int C;
  public final int D;
  public final Rect E;
  public final Paint F;
  public final int G;
  public final Bitmap H;
  public final Bitmap I;
  public final Bitmap J;
  public final int K;
  public final int L;
  public final int M;
  public final int N;
  public final int O;
  public final int P;
  public final int Q;
  public final int R;
  public final int S;
  public final int T;
  public final int U;
  public final int V;
  public final int W;
  public final int X;
  public final int Y;
  public final NinePatchDrawable Z;
  public final jr a;
  public final float aA;
  public final float aB;
  public final Bitmap aC;
  public final Bitmap aD;
  public final Bitmap aE;
  public final int aF;
  public final int aG;
  public final int aH;
  public final int aI;
  public final int aJ;
  public final int aK;
  public final int aL;
  public final int aM;
  public final int aN;
  public final int aO;
  public final int aP;
  public final int aQ;
  public final int aR;
  public final Bitmap aS;
  public final int aT;
  public final int aU;
  public final int aV;
  public final Paint aW;
  public final int aX;
  public final int aY;
  public final int aZ;
  public final int aa;
  public final StyleSpan ab;
  public final Bitmap ac;
  public final Bitmap ad;
  public final Bitmap ae;
  public final ShapeDrawable af;
  public final ShapeDrawable ag;
  public final int ah;
  public final Bitmap ai;
  public final Bitmap aj;
  public final Bitmap ak;
  public final Bitmap al;
  public final int am;
  public final Bitmap an;
  public final Bitmap ao;
  public final Bitmap ap;
  public final int aq;
  public final int ar;
  public final NinePatchDrawable as;
  public final int at;
  public final int au;
  public final int av;
  public final int aw;
  public final int ax;
  public final int ay;
  public final float az;
  public final AccelerateInterpolator b;
  public final int ba;
  public final int bb;
  public final int bc;
  public final int bd;
  private Paint bf;
  private Paint[] bg;
  private Paint[] bh;
  public final DecelerateInterpolator c;
  public final ipb d;
  public final Bitmap e;
  public final Bitmap f;
  public final Bitmap g;
  public final Bitmap h;
  public final Bitmap i;
  public final Drawable j;
  public final int k;
  public final int l;
  public final int m;
  public final int n;
  public final int o;
  public final int p;
  public final Paint q;
  public final Paint r;
  public final Paint s;
  public final Paint t;
  public final Paint u;
  public final Paint v;
  public final int w;
  public final Drawable x;
  public final Bitmap y;
  public final int z;
  
  loj(Context paramContext)
  {
    Resources localResources = paramContext.getApplicationContext().getResources();
    this.a = jr.a();
    this.b = new AccelerateInterpolator();
    this.c = new DecelerateInterpolator();
    this.d = ((ipb)mbb.a(paramContext, ipb.class));
    this.e = a(localResources, ehr.fL);
    a(localResources, ehr.gm);
    a(localResources, ehr.gn);
    this.f = a(localResources, ehr.gp);
    this.g = a(localResources, ehr.gq);
    a(localResources, ehr.gg);
    a(localResources, ehr.fK);
    this.h = a(localResources, ehr.gB);
    this.i = a(localResources, ehr.gv);
    this.j = localResources.getDrawable(ehr.fD);
    this.k = localResources.getDimensionPixelSize(ehr.eN);
    this.l = localResources.getDimensionPixelSize(ehr.eO);
    localResources.getDimensionPixelSize(ehr.ex);
    localResources.getDimensionPixelSize(ehr.fB);
    localResources.getDimensionPixelSize(ehr.fC);
    this.m = localResources.getDimensionPixelSize(ehr.eP);
    this.o = localResources.getDimensionPixelSize(ehr.eS);
    this.n = localResources.getDimensionPixelSize(ehr.eR);
    this.p = localResources.getDimensionPixelSize(ehr.eb);
    this.q = new Paint();
    this.q.setColor(localResources.getColor(da.aC));
    this.r = new Paint();
    this.r.setColor(localResources.getColor(da.aB));
    this.bf = new Paint();
    this.bf.setColor(localResources.getColor(da.aq));
    this.s = new Paint();
    this.s.setColor(localResources.getColor(da.at));
    this.t = new Paint();
    this.t.setColor(localResources.getColor(da.ar));
    this.t.setStyle(Paint.Style.STROKE);
    this.t.setStrokeWidth(localResources.getDimension(ehr.dZ));
    this.u = new Paint();
    this.u.setColor(localResources.getColor(da.aw));
    this.u.setStyle(Paint.Style.STROKE);
    this.u.setStrokeWidth(localResources.getDimension(ehr.eW));
    this.w = localResources.getDimensionPixelSize(ehr.eF);
    localResources.getDrawable(ehr.fG);
    this.v = new Paint();
    this.v.setColor(localResources.getColor(da.ao));
    this.v.setStyle(Paint.Style.STROKE);
    this.v.setStrokeWidth(localResources.getDimension(ehr.eW));
    this.x = localResources.getDrawable(ehr.gl);
    this.y = a(localResources, ehr.fM);
    new Rect(localResources.getDimensionPixelSize(ehr.eJ), localResources.getDimensionPixelSize(ehr.eL), localResources.getDimensionPixelSize(ehr.eK), localResources.getDimensionPixelSize(ehr.eI));
    new Rect();
    this.z = localResources.getDimensionPixelSize(ehr.ec);
    this.A = localResources.getDimensionPixelSize(ehr.ed);
    this.B = localResources.getDimensionPixelSize(ehr.eT);
    this.C = localResources.getDimensionPixelSize(ehr.dY);
    this.D = localResources.getDimensionPixelSize(ehr.dX);
    this.E = new Rect();
    this.F = new Paint(2);
    this.G = localResources.getDimensionPixelSize(ehr.eQ);
    this.H = a(localResources, ehr.fR);
    this.I = a(localResources, ehr.fS);
    this.J = a(localResources, ehr.fI);
    this.K = localResources.getInteger(aau.CL);
    this.L = localResources.getColor(da.aL);
    this.M = localResources.getDimensionPixelSize(ehr.eh);
    this.N = localResources.getDimensionPixelSize(ehr.ei);
    this.O = localResources.getDimensionPixelSize(ehr.ej);
    this.P = localResources.getDimensionPixelSize(ehr.ek);
    this.Q = localResources.getInteger(aau.CU);
    this.R = localResources.getInteger(aau.CV);
    this.S = localResources.getInteger(aau.CX);
    this.T = localResources.getInteger(aau.CW);
    this.U = localResources.getInteger(aau.CM);
    this.V = localResources.getInteger(aau.Db);
    this.W = localResources.getInteger(aau.Da);
    this.X = localResources.getDimensionPixelSize(ehr.eH);
    this.Y = localResources.getDimensionPixelSize(ehr.eG);
    this.Z = ((NinePatchDrawable)localResources.getDrawable(ehr.gk));
    this.aa = localResources.getDimensionPixelSize(ehr.eM);
    this.ab = new StyleSpan(1);
    localResources.getInteger(aau.CY);
    localResources.getInteger(aau.CZ);
    this.bg = new Paint[3];
    this.bg[0] = new Paint();
    this.bg[0].setColor(localResources.getColor(da.aH));
    this.bg[1] = new Paint();
    this.bg[1].setColor(localResources.getColor(da.aI));
    this.bg[2] = new Paint();
    this.bg[2].setColor(localResources.getColor(da.aJ));
    this.bh = new Paint[3];
    this.bh[0] = new Paint();
    this.bh[0].setColor(localResources.getColor(da.aE));
    this.bh[1] = new Paint();
    this.bh[1].setColor(localResources.getColor(da.aF));
    this.bh[2] = new Paint();
    this.bh[2].setColor(localResources.getColor(da.aG));
    localResources.getDimensionPixelSize(ehr.eV);
    this.ac = a(localResources, ehr.gA);
    this.ad = a(localResources, ehr.gz);
    this.ae = a(localResources, ehr.gy);
    localResources.getDrawable(ehr.fH);
    float f1 = localResources.getDimension(ehr.ft);
    this.af = new ShapeDrawable(new RoundRectShape(new float[] { f1, f1, f1, f1, 0.0F, 0.0F, 0.0F, 0.0F }, null, null));
    this.ag = new ShapeDrawable(new RectShape());
    this.ah = localResources.getDimensionPixelSize(ehr.eU);
    this.ai = a(localResources, ehr.gs);
    this.aj = a(localResources, ehr.gr);
    this.ak = a(localResources, ehr.gt);
    this.al = a(localResources, ehr.gu);
    this.am = localResources.getColor(da.aD);
    this.an = a(localResources, ehr.fO);
    this.ao = a(localResources, ehr.fN);
    this.ap = a(localResources, ehr.gd);
    localResources.getColor(da.aO);
    a(localResources, ehr.fJ);
    this.aq = localResources.getColor(17170443);
    this.ar = localResources.getDimensionPixelSize(ehr.eX);
    localResources.getDimensionPixelSize(ehr.eE);
    this.as = ((NinePatchDrawable)localResources.getDrawable(ehr.fE));
    localResources.getInteger(aau.Dc);
    this.at = localResources.getColor(da.ap);
    this.au = localResources.getColor(17170443);
    this.av = localResources.getDimensionPixelOffset(ehr.fi);
    this.aw = localResources.getDimensionPixelOffset(ehr.fj);
    this.ax = localResources.getDimensionPixelSize(ehr.em);
    this.ay = localResources.getDimensionPixelSize(ehr.en);
    this.az = localResources.getDimension(ehr.eo);
    this.aA = localResources.getDimension(ehr.ep);
    this.aB = localResources.getDimension(ehr.eq);
    this.aC = a(localResources, ehr.gj);
    this.aD = a(localResources, ehr.gi);
    this.aE = a(localResources, ehr.gh);
    this.aF = localResources.getInteger(aau.CQ);
    this.aG = localResources.getInteger(aau.CP);
    this.aI = localResources.getInteger(aau.CS);
    this.aH = localResources.getInteger(aau.CR);
    this.aJ = localResources.getDimensionPixelSize(ehr.eA);
    this.aK = localResources.getDimensionPixelSize(ehr.ez);
    this.aL = localResources.getDimensionPixelSize(ehr.eC);
    this.aM = localResources.getDimensionPixelSize(ehr.eB);
    this.aN = localResources.getDimensionPixelSize(ehr.ey);
    this.aO = localResources.getDimensionPixelSize(ehr.eD);
    localResources.getColor(da.au);
    this.aP = localResources.getDimensionPixelSize(ehr.fu);
    this.aQ = localResources.getDimensionPixelSize(ehr.dV);
    this.aR = efj.M(paramContext);
    this.aS = a(localResources, ehr.go);
    this.aT = localResources.getDimensionPixelSize(ehr.dW);
    this.aU = localResources.getDimensionPixelSize(ehr.dU);
    this.aV = localResources.getDimensionPixelSize(ehr.dT);
    this.aW = new Paint();
    this.aW.setColor(localResources.getColor(da.as));
    this.aW.setStyle(Paint.Style.STROKE);
    this.aW.setStrokeWidth(localResources.getDimension(ehr.es));
    this.aY = localResources.getDimensionPixelSize(ehr.er);
    this.aZ = localResources.getDimensionPixelSize(ehr.eu);
    this.ba = localResources.getDimensionPixelSize(ehr.ev);
    this.aX = localResources.getDimensionPixelSize(ehr.et);
    this.bb = localResources.getDimensionPixelSize(ehr.ew);
    this.bc = localResources.getInteger(aau.CO);
    this.bd = localResources.getInteger(aau.CN);
  }
  
  private static Bitmap a(Resources paramResources, int paramInt)
  {
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeResource(paramResources, paramInt);
      return localBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      Log.e("ImageUtils", "ImageUtils#decodeResource(Resources, int) threw an OOME", localOutOfMemoryError);
    }
    return null;
  }
  
  public static loj a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    efj.k();
    if (be == null) {
      be = new lok(localContext);
    }
    return (loj)be.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loj
 * JD-Core Version:    0.7.0.1
 */