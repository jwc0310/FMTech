import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import com.google.android.libraries.social.help.TooltipView;
import com.google.android.libraries.social.stream.legacy.views.CardSocialBarViewGroup;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class eab
  extends lpi
  implements View.OnClickListener, View.OnLongClickListener, gim, hek, heu, iek, lot, lpd, lxx
{
  public TooltipView A;
  public int B = 0;
  public int C = 0;
  String D;
  String E;
  boolean F;
  String G;
  private int V;
  private lmg W;
  private int a;
  private String aA;
  private StaticLayout aB;
  private String aC;
  private StaticLayout aD;
  private int aE;
  private int aF;
  private lmj aG;
  private lmm aH;
  private long aI;
  private boolean aJ;
  private boolean aK;
  private boolean aL;
  private boolean aM;
  private boolean aN;
  private boolean aO;
  private TextView aP;
  private Point aQ;
  private String aR;
  private String aS;
  private String aT;
  private String aU;
  private boolean aV;
  private Bitmap aW;
  private CardSocialBarViewGroup aX;
  private hfn aY;
  private TooltipView aZ;
  private int aa;
  private Spannable ab;
  private String ac;
  private TextView ad;
  private String ae;
  private Spanned af;
  private AvatarView ag;
  private CirclesButton ah;
  private CirclesButton ai;
  private Spannable aj;
  private boolean ak;
  private SpannableStringBuilder al;
  private hfu am;
  private int an;
  private hfu ao;
  private int ap;
  private String aq;
  private int ar;
  private int as;
  private String at;
  private SpannableStringBuilder au;
  private hfu av;
  private int aw;
  private hfu ax;
  private int ay;
  private lww az;
  private int b;
  private final HashSet<String> ba = new HashSet();
  private View bb;
  private los bc;
  private llo bd;
  private Point be;
  private int bf;
  private lpc bg;
  private ill bh;
  private iee bi;
  private TooltipView bj;
  private ied bk;
  private boolean bl;
  private Rect bm;
  private hfb bn;
  private bot bo;
  private boolean bp;
  private String bq;
  private Button br;
  private gil bs;
  private int bt;
  private int bu;
  public int c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public long i;
  public Spanned j;
  public String k;
  public SpannableStringBuilder l;
  public boolean m;
  public eaj n;
  public dge o;
  public boolean p;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public int u = eai.a;
  heg v;
  public boolean w;
  public lml x;
  public llr y;
  public byte[] z;
  
  public eab(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public eab(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    if (!x()) {
      return paramInt1;
    }
    removeView(this.bg);
    if (this.bg == null) {
      this.bg = new lpc(getContext());
    }
    int i1;
    int i2;
    label78:
    lpc locallpc;
    String str1;
    String str2;
    label206:
    Context localContext;
    int i4;
    if ((this.y.e != null) && (this.y.e.a))
    {
      i1 = 1;
      if ((this.p) && (i1 == 0)) {
        break label394;
      }
      i2 = 1;
      locallpc = this.bg;
      str1 = this.g;
      str2 = this.ae;
      boolean bool = this.S;
      locallpc.g = this;
      locallpc.a = true;
      locallpc.e.setOnClickListener(locallpc);
      locallpc.e.setOnLongClickListener(locallpc);
      locallpc.removeView(locallpc.e);
      locallpc.removeView(locallpc.f);
      if (locallpc.a)
      {
        locallpc.addView(locallpc.e);
        locallpc.addView(locallpc.f);
      }
      if (i2 == 0) {
        break label400;
      }
      locallpc.f.setVisibility(0);
      locallpc.e.setVisibility(8);
      locallpc.f.setOnClickListener(locallpc);
      locallpc.f.setOnLongClickListener(locallpc);
      int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
      locallpc.e.measure(i3, i3);
      locallpc.f.measure(i3, i3);
      locallpc.d = Math.max(locallpc.e.getMeasuredWidth(), locallpc.f.getMeasuredWidth());
      localContext = locallpc.getContext();
      locallpc.c = bool;
      if (!str2.equals("female")) {
        break label422;
      }
      i4 = do.T;
      label311:
      if (i2 == 0) {
        break label449;
      }
    }
    label394:
    label400:
    label422:
    label449:
    for (int i5 = do.W;; i5 = i4)
    {
      locallpc.b = localContext.getString(i5, new Object[] { str1 });
      locallpc.setContentDescription(locallpc.b);
      addView(this.bg);
      this.bg.measure(View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      return paramInt1 + this.bg.getMeasuredHeight();
      i1 = 0;
      break;
      i2 = 0;
      break label78;
      locallpc.e.setVisibility(0);
      locallpc.f.setVisibility(8);
      break label206;
      if (str2.equals("male"))
      {
        i4 = do.U;
        break label311;
      }
      i4 = do.V;
      break label311;
    }
  }
  
  private int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    int i2;
    label28:
    int i3;
    label42:
    int i4;
    if (this.ao.getParent() == this)
    {
      i1 = 1;
      if (this.av.getParent() != this) {
        break label358;
      }
      i2 = 1;
      if (this.ax.getParent() != this) {
        break label364;
      }
      i3 = 1;
      if ((!this.w) || (this.am.getParent() != this)) {
        break label370;
      }
      i4 = 1;
      label63:
      if (i2 == 0) {
        break label390;
      }
      if (i1 != 0)
      {
        paramInt2 += 2 * this.H.m + this.ao.getHeight();
        int i10 = this.ao.getBottom() + this.H.m;
        paramCanvas.drawLine(paramInt1, i10, paramInt1 + paramInt3, i10, this.H.u);
      }
      if ((!C_()) && (i4 == 0) && (i3 != 0))
      {
        int i9 = this.ax.getBottom() + this.H.m;
        paramCanvas.drawLine(paramInt1, i9, paramInt1 + paramInt3, i9, this.H.u);
      }
    }
    label390:
    for (int i5 = paramInt2 + this.av.getHeight();; i5 = paramInt2)
    {
      if (i3 != 0) {
        if ((i1 != 0) || (i2 != 0)) {
          i5 += this.H.l;
        }
      }
      for (int i6 = i5 + this.ax.getHeight();; i6 = i5)
      {
        if ((this.w) && (i4 != 0)) {
          if (!C_())
          {
            int i8 = this.am.getBottom() + this.H.l;
            paramCanvas.drawLine(paramInt1, i8, paramInt1 + paramInt3, i8, this.H.u);
          }
        }
        for (int i7 = i6 + (this.am.getMeasuredHeight() + this.H.l);; i7 = i6)
        {
          if ((i1 != 0) || (i2 != 0) || (i3 != 0)) {
            i7 += this.H.m;
          }
          return i7;
          i1 = 0;
          break;
          label358:
          i2 = 0;
          break label28;
          label364:
          i3 = 0;
          break label42;
          label370:
          i4 = 0;
          break label63;
        }
      }
    }
  }
  
  private int a(View paramView, int paramInt)
  {
    if ((paramView == null) || (paramView.getParent() != this)) {
      return paramInt;
    }
    return paramInt + paramView.getHeight();
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.ag = new AvatarView(paramContext, paramAttributeSet, paramInt);
    this.ag.e = 1;
    this.ag.a(1);
    this.ag.setOnClickListener(this);
    lln locallln = (lln)mbb.a(paramContext, lln.class);
    hyi localhyi = (hyi)mbb.a(getContext(), hyi.class);
    int i1 = q();
    this.w = locallln.j(i1);
    this.bp = locallln.k(i1);
    Resources localResources;
    if (this.bp)
    {
      this.bb = new hfg(paramContext);
      this.aX = new CardSocialBarViewGroup(paramContext, paramAttributeSet, paramInt);
      this.bn = new hfb(paramContext, paramAttributeSet, paramInt);
      localResources = getResources();
      this.bu = localResources.getDimensionPixelOffset(efj.mk);
      int i2 = efj.yo;
      this.ao = new hfu(paramContext);
      this.ao.setTextAppearance(paramContext, i2);
      this.ao.a(true);
      this.ao.setMovementMethod(lxy.a());
      this.ao.setGravity(16);
      this.ao.setMinWidth(this.bu);
      this.av = new hfu(paramContext);
      this.av.setTextAppearance(paramContext, i2);
      this.av.a(true);
      this.av.setFocusableInTouchMode(true);
      this.av.setGravity(16);
      this.av.setMinWidth(this.bu);
      this.ax = new hfu(paramContext);
      this.ax.setTextAppearance(paramContext, i2);
      this.ax.a(true);
      this.ax.setMovementMethod(lxy.a());
      this.ax.setGravity(16);
      this.ax.setMinWidth(this.bu);
      if (this.w)
      {
        this.ao.setIncludeFontPadding(false);
        this.ao.setLineSpacing(localResources.getDimensionPixelSize(efj.nD), 1.0F);
        this.ax.setIncludeFontPadding(false);
        this.ax.setLineSpacing(localResources.getDimensionPixelSize(efj.nD), 1.0F);
        this.am = new hfu(paramContext);
        this.am.setTextAppearance(paramContext, efj.yt);
        this.am.a(true);
        this.am.setMovementMethod(lxy.a());
      }
      boolean bool1 = ((hul)mbb.a(paramContext, hul.class)).a(i1);
      this.ah = new CirclesButton(paramContext, paramAttributeSet, paramInt);
      this.ah.b(bool1);
      if (!localhyi.b(bwb.u, i1)) {
        break label725;
      }
      this.ah.a(4);
      this.ah.a(localResources.getString(aau.eI));
      label523:
      this.ah.setOnClickListener(this);
      this.ah.setOnLongClickListener(this);
      this.ai = new CirclesButton(paramContext, paramAttributeSet, paramInt);
      this.ai.b(bool1);
      this.ai.a(1);
      this.ai.setOnClickListener(this);
      this.ai.setOnLongClickListener(this);
      ill localill = new ill(paramContext, i1);
      localill.a.add(ine.class);
      this.bh = localill;
      if (bgp.b(paramContext, i1)) {
        break label745;
      }
    }
    label725:
    label745:
    for (boolean bool2 = true;; bool2 = false)
    {
      this.bl = bool2;
      this.bm = new Rect();
      this.bo = ((bot)mbb.a(paramContext, bot.class));
      this.bt = localResources.getDimensionPixelSize(efj.mg);
      this.bi = ((iee)mbb.a(paramContext, iee.class));
      return;
      if (this.w)
      {
        this.bb = new hfk(paramContext);
        break;
      }
      this.bb = new lpm(paramContext);
      break;
      this.ah.a(8);
      this.ah.a(null);
      break label523;
    }
  }
  
  private int b(int paramInt)
  {
    if (this.bc == null) {
      return paramInt;
    }
    return paramInt + this.bc.getHeight();
  }
  
  private int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.bd == null) {
      return paramInt2;
    }
    removeView(this.bc);
    this.bc = new los(getContext());
    los locallos = this.bc;
    int i1 = q();
    llo localllo = this.bd;
    String str1 = ((giz)mbb.a(locallos.getContext(), giz.class)).a(i1).b("gaia_id");
    locallos.b = localllo;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    locallos.d = TextUtils.equals(str1, locallos.b.a);
    if (locallos.d) {
      localSpannableStringBuilder.append(locallos.getContext().getString(do.ab));
    }
    for (;;)
    {
      locallos.c = localSpannableStringBuilder.toString();
      locallos.setContentDescription(locallos.c);
      addView(this.bc);
      int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
      int i5 = View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824);
      this.bc.measure(i5, i4);
      this.be = new Point(paramInt1, paramInt2);
      return this.be.y + this.bc.getMeasuredHeight();
      String str2 = locallos.b.b;
      localSpannableStringBuilder.append(locallos.getContext().getString(do.aa, new Object[] { str2 }));
      String str3 = localSpannableStringBuilder.toString();
      int i2 = str3.indexOf(str2);
      if ((i2 != -1) && (i2 == str3.lastIndexOf(str2)))
      {
        int i3 = i2 + str2.length();
        localSpannableStringBuilder.setSpan(locallos.a.ab, i2, i3, 33);
      }
    }
  }
  
  private int d(int paramInt1, int paramInt2, int paramInt3)
  {
    removeView(this.aP);
    if (((this.aV) || (this.s)) && (paramInt3 > 0))
    {
      if (this.aP == null)
      {
        this.aQ = new Point();
        Context localContext = getContext();
        this.aP = new TextView(localContext);
        this.aP.setTextAppearance(localContext, efj.yJ);
        this.aP.setOnClickListener(this);
        this.aP.setCompoundDrawablesWithIntrinsicBounds(efj.qE, 0, 0, 0);
        this.aP.setCompoundDrawablePadding(this.H.C);
        this.aP.setMinHeight(this.H.D);
        this.aP.setPadding(this.H.C, this.H.m, this.H.C, this.H.m);
        this.aP.setBackgroundResource(efj.jx);
      }
      this.aQ.set(paramInt1, paramInt2);
      if (this.s) {
        break label242;
      }
      this.aP.setText(aau.dl);
    }
    for (;;)
    {
      this.aP.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      addView(this.aP);
      paramInt2 += this.aP.getMeasuredHeight() + this.H.l;
      return paramInt2;
      label242:
      this.aP.setText(aau.dm);
    }
  }
  
  private final boolean x()
  {
    return (this.R != 1) && (y());
  }
  
  private final boolean y()
  {
    return (this.y != null) && (this.y.e != null);
  }
  
  public boolean C_()
  {
    return false;
  }
  
  public void D_()
  {
    if (this.bs != null) {
      this.bs.a(this);
    }
    super.D_();
    this.bf = 0;
    this.a = 0;
    this.b = 0;
    this.V = 0;
    this.c = 0;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.af = null;
    this.h = null;
    this.i = 0L;
    this.aT = null;
    this.aU = null;
    this.k = null;
    this.ar = 0;
    this.as = 0;
    this.at = null;
    this.az = null;
    this.j = null;
    this.ao.setText(null);
    this.ao.setMaxLines(2147483647);
    this.ao.setMinHeight(0);
    this.au = null;
    this.av.setText(null);
    this.av.setMaxLines(2147483647);
    this.av.setMovementMethod(null);
    this.av.setMinHeight(0);
    this.aw = 0;
    this.l = null;
    this.ax.setText(null);
    this.ax.setMaxLines(2147483647);
    this.ax.setMinHeight(0);
    this.ay = 0;
    if (this.w)
    {
      this.al = null;
      this.am.setText(null);
      this.am.setMaxLines(2147483647);
      this.an = 0;
    }
    this.m = false;
    this.aC = null;
    this.aD = null;
    this.aA = null;
    this.aB = null;
    this.aW = null;
    this.W = null;
    this.ab = null;
    if (this.ad != null) {
      this.ad.setText(null);
    }
    this.aE = 0;
    this.aF = 0;
    this.aG = null;
    this.aH = null;
    this.o = null;
    this.n = null;
    this.T = null;
    this.aI = 0L;
    this.aJ = false;
    this.aK = false;
    this.p = false;
    this.aL = false;
    this.aM = false;
    this.q = false;
    this.r = false;
    this.aR = null;
    this.aS = null;
    this.aV = false;
    this.t = false;
    this.u = eai.a;
    this.ak = false;
    if (this.bg != null) {
      this.bg.D_();
    }
    this.x = null;
    this.y = null;
    if (this.bc != null) {
      this.bc.D_();
    }
    this.bc = null;
    this.be = null;
    this.bd = null;
    if ((this.bb instanceof hfk))
    {
      hfk localhfk = (hfk)this.bb;
      localhfk.b();
      localhfk.e = 0;
      localhfk.d = 0;
      localhfk.f = null;
      localhfk.setVisibility(8);
    }
    if ((this.bb instanceof lxj)) {
      ((lxj)this.bb).D_();
    }
    if (this.aX != null) {
      this.aX.D_();
    }
    this.bn.D_();
    this.bj = null;
    this.A = null;
    this.aj = null;
    if (this.aY != null)
    {
      this.aY.b(null);
      this.aY.a(null);
    }
    this.aZ = null;
    if (this.aP != null)
    {
      this.aQ.set(0, 0);
      this.aP.setText(null);
    }
    this.B = 0;
    this.C = 0;
  }
  
  protected String F_()
  {
    if (this.W != null) {
      return this.W.a(getContext());
    }
    return null;
  }
  
  public final void G_()
  {
    boolean bool1 = true;
    hep localhep = (hep)mbb.b(getContext(), hep.class);
    boolean bool2;
    if (localhep != null)
    {
      if (this.aF <= 0) {
        break label48;
      }
      bool2 = bool1;
      if (bool2) {
        break label53;
      }
    }
    for (;;)
    {
      localhep.a(this, this, bool1);
      this.F = false;
      return;
      label48:
      bool2 = false;
      break;
      label53:
      bool1 = false;
    }
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt2;
  }
  
  public final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = d(this.M.left, paramInt2, this.P);
    if (!x())
    {
      i1 += this.H.m;
      this.bf = i1;
    }
    int i2 = a(i1, this.P);
    int i11;
    int i15;
    int i16;
    label307:
    int i19;
    label337:
    int i20;
    label353:
    int i21;
    label435:
    int i22;
    label555:
    label630:
    int i23;
    label779:
    int i24;
    label893:
    int i25;
    label918:
    int i26;
    label942:
    boolean bool;
    label962:
    int i28;
    int i29;
    label1268:
    int i4;
    label1348:
    int i5;
    label1368:
    int i6;
    Context localContext1;
    label1420:
    label1426:
    label1432:
    int i7;
    if (!this.m)
    {
      i11 = i2;
      this.a = i11;
      Context localContext2 = getContext();
      int i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
      removeView(this.ag);
      this.ag.a(this.f, this.h);
      this.ag.h = this.g;
      this.ag.measure(i12, i12);
      addView(this.ag);
      int i13 = View.MeasureSpec.makeMeasureSpec(this.P - 2 * this.H.m - this.H.aQ - efj.i(localContext2), -2147483648);
      int i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
      this.bn.measure(i13, i14);
      i15 = i11 + this.bn.getMeasuredHeight();
      addView(this.bn);
      this.bm.left = paramInt3;
      this.bm.top = i15;
      this.bm.right = (paramInt3 + paramInt4);
      if (efj.B(getContext()))
      {
        this.ao.setMinHeight(this.bu);
        this.av.setMinHeight(this.bu);
        this.ax.setMinHeight(this.bu);
      }
      if (!this.w) {
        break label2423;
      }
      i16 = paramInt4 - this.bt;
      int i17 = View.MeasureSpec.makeMeasureSpec(i16, -2147483648);
      int i18 = View.MeasureSpec.makeMeasureSpec(0, 0);
      if (!TextUtils.isEmpty(this.j))
      {
        i19 = 1;
        if (!C_()) {
          break label1593;
        }
        i20 = this.H.Q;
        if (i19 != 0)
        {
          if (this.R == 0) {
            this.ao.setMaxLines(i20);
          }
          this.ao.setText(this.j);
          addView(this.ao);
          this.ao.measure(i17, i18);
          this.ap = i15;
          i15 += this.ao.getMeasuredHeight();
        }
        if (TextUtils.isEmpty(this.au)) {
          break label1605;
        }
        i21 = 1;
        if (i21 != 0)
        {
          if (i19 != 0)
          {
            i15 += 2 * this.H.m;
            this.bm.top = i15;
          }
          this.av.setText(this.au);
          this.av.setVisibility(0);
          addView(this.av);
          if (this.R == 1) {
            this.av.setMovementMethod(lxy.a());
          }
          this.av.measure(i17, i18);
          this.aw = i15;
          i15 += this.av.getMeasuredHeight();
        }
        if (TextUtils.isEmpty(this.l)) {
          break label1611;
        }
        i22 = 1;
        if (i22 != 0)
        {
          if ((i19 != 0) || (i21 != 0)) {
            i15 += this.H.l;
          }
          if (this.R != 0) {
            break label1617;
          }
          CharSequence localCharSequence = this.l.subSequence(0, Math.min(1000, this.l.length()));
          this.ax.setText(localCharSequence);
          this.ax.setMaxLines(i20);
          this.ax.setVisibility(0);
          addView(this.ax);
          this.ax.measure(i17, i18);
          this.ay = i15;
          i15 += this.ax.getMeasuredHeight();
        }
        if ((this.w) && (!TextUtils.isEmpty(this.al)))
        {
          int i40 = i15 + this.H.l;
          addView(this.am);
          this.am.setText(this.al);
          this.am.measure(i17, i18);
          this.an = i40;
          i15 = i40 + this.am.getMeasuredHeight();
        }
        if ((i19 == 0) && (i21 == 0) && (i22 == 0)) {
          break label2416;
        }
        i23 = i15 + this.H.m;
        this.bm.bottom = i23;
        if (!TextUtils.isEmpty(this.ab)) {
          break label1631;
        }
        if (!C_()) {
          break label1824;
        }
        int i37 = this.P;
        int i38 = this.M.left;
        int i39 = a(i38, c(i38, i23, i37), i37);
        this.bm.right = (i37 + this.bm.left + this.H.w);
        Rect localRect = this.bm;
        localRect.left -= this.H.w;
        i24 = i39;
        this.bm.bottom = i24;
        this.b = i24;
        if (this.G == null) {
          break label1838;
        }
        i25 = 1;
        if ((!this.aK) && (!this.aJ) && (!this.aL)) {
          break label1844;
        }
        i26 = 1;
        if ((i25 == 0) || (i26 != 0)) {
          break label1856;
        }
        if (this.G == null) {
          break label1850;
        }
        bool = true;
        efj.d(bool, "Update does not correspond to a YouTube cross-post.");
        Context localContext5 = getContext();
        Resources localResources = localContext5.getResources();
        this.br = new Button(localContext5);
        int i33 = this.aF;
        Button localButton = this.br;
        int i34 = aau.vK;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "NUM_OF_REPLIES";
        arrayOfObject[1] = Integer.valueOf(i33);
        localButton.setText(rfb.a(Locale.getDefault(), localContext5.getResources().getString(i34), arrayOfObject));
        this.br.setTextAppearance(localContext5, efj.yA);
        this.br.setSingleLine(true);
        this.br.setEllipsize(TextUtils.TruncateAt.END);
        int[] arrayOfInt = new int[1];
        arrayOfInt[0] = efj.ja;
        TypedArray localTypedArray = localContext5.obtainStyledAttributes(arrayOfInt);
        this.br.setBackgroundResource(localTypedArray.getResourceId(0, 0));
        localTypedArray.recycle();
        int i35 = localResources.getDimensionPixelOffset(efj.kX);
        int i36 = localResources.getDimensionPixelOffset(efj.nC) + i35 * 3;
        this.br.setHeight(i36);
        this.br.setPadding(this.H.m, 0, this.H.m, 0);
        this.br.setGravity(16);
        efj.a(this.br, new gxq(pkh.V));
        this.br.setOnClickListener(new gxn(new eae(this)));
        addView(this.br);
        i28 = i36 + i24;
        this.V = i28;
        i29 = this.P;
        if (this.R != 0) {
          break label2234;
        }
        this.c = i28;
        int i30 = b(paramInt3, i28, this.P);
        if (this.A != null) {
          addView(this.A);
        }
        if (this.bj != null) {
          addView(this.bj);
        }
        if (this.ba.contains(this.N)) {
          m();
        }
        return i30;
      }
    }
    else
    {
      int i3;
      if (this.aW == null)
      {
        i3 = 0;
        i4 = paramInt4 - i3;
        if (TextUtils.isEmpty(this.aA)) {
          break label1420;
        }
        i5 = 1;
        if (TextUtils.isEmpty(this.aC)) {
          break label1426;
        }
      }
      for (i6 = 1;; i6 = 0)
      {
        localContext1 = getContext();
        if ((i5 != 0) || (i6 != 0)) {
          break label1432;
        }
        i11 = i2;
        break;
        i3 = Math.max(0, this.aW.getWidth());
        break label1348;
        i5 = 0;
        break label1368;
      }
      i7 = i2 + this.H.m;
      if (i5 == 0) {
        break label2444;
      }
      TextPaint localTextPaint2 = efj.B(localContext1, efj.yx);
      this.aB = new StaticLayout(this.aA, localTextPaint2, i4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    }
    label2444:
    for (int i8 = i7 + this.aB.getHeight();; i8 = i7)
    {
      if ((i5 != 0) && (i6 != 0)) {}
      for (int i9 = i8 + this.H.o;; i9 = i8)
      {
        if (i6 != 0)
        {
          TextPaint localTextPaint1 = efj.B(localContext1, efj.yD);
          this.aD = new StaticLayout(this.aC, localTextPaint1, i4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        }
        for (int i10 = i9 + this.aD.getHeight();; i10 = i9)
        {
          i11 = i10 + 4 * this.H.m;
          break;
          i19 = 0;
          break label337;
          label1593:
          i20 = this.H.R;
          break label353;
          label1605:
          i21 = 0;
          break label435;
          label1611:
          i22 = 0;
          break label555;
          label1617:
          this.ax.setText(this.l);
          break label630;
          label1631:
          if (this.ad == null)
          {
            Context localContext6 = getContext();
            this.ad = new TextView(localContext6);
            this.ad.setPadding(0, this.H.m, 0, this.H.m);
            this.ad.setTextAppearance(localContext6, efj.yD);
            this.ad.setMovementMethod(lxy.a());
            if (this.R != 1) {
              break label1808;
            }
            this.ad.setCompoundDrawablesWithIntrinsicBounds(efj.py, 0, 0, 0);
          }
          for (;;)
          {
            this.ad.setCompoundDrawablePadding(this.H.p);
            addView(this.ad);
            this.ad.setText(this.ab);
            this.ad.setContentDescription(this.ac);
            this.ad.measure(View.MeasureSpec.makeMeasureSpec(paramInt4, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.aa = i23;
            i23 += this.ad.getMeasuredHeight();
            break;
            label1808:
            this.ad.setCompoundDrawablesWithIntrinsicBounds(efj.pw, 0, 0, 0);
          }
          label1824:
          i24 = c(paramInt3, i23, paramInt4);
          break label893;
          label1838:
          i25 = 0;
          break label918;
          label1844:
          i26 = 0;
          break label942;
          label1850:
          bool = false;
          break label962;
          label1856:
          removeView(this.aX);
          Context localContext3 = getContext();
          int i27 = this.aX.a(this.aG, this.aK, this.aJ, this.aF, this.aE, this);
          addView(this.aX);
          iee localiee;
          TooltipView localTooltipView;
          int i31;
          if (this.bl)
          {
            CardSocialBarViewGroup localCardSocialBarViewGroup = this.aX;
            if (localCardSocialBarViewGroup.c == null)
            {
              Context localContext4 = localCardSocialBarViewGroup.getContext();
              int i32 = ((git)mbb.a(localContext4, git.class)).c();
              String str1 = localContext4.getString(do.aw);
              String str2 = localContext4.getString(do.aA);
              localCardSocialBarViewGroup.c = new ied(i32, pkh.N, str2, str1, 3);
            }
            ied localied = localCardSocialBarViewGroup.c;
            if (this.bi.a(localied))
            {
              this.bj = new TooltipView(localContext3);
              this.bj.a(localied);
              this.bj.e.add(this);
              this.bj.a(1);
              localiee = this.bi;
              localTooltipView = this.bj;
              efj.e(localTooltipView, "Attempted to register null TooltipView");
              localTooltipView.e.add(localiee);
              if (localTooltipView.getTag(efj.MH) == null) {
                break label2138;
              }
              i31 = 1;
              label2112:
              if ((i31 == 0) && (localTooltipView.getTag(efj.MI) == null)) {
                break label2210;
              }
            }
          }
          for (;;)
          {
            i28 = i24 + i27;
            break;
            label2138:
            lvj locallvj = (lvj)mbb.b(localTooltipView.getContext(), lvj.class);
            if (locallvj != null)
            {
              ief localief = new ief(localiee, localTooltipView);
              locallvj.a.a.add(localief);
              localTooltipView.setTag(efj.MH, localief);
              i31 = 1;
              break label2112;
            }
            i31 = 0;
            break label2112;
            label2210:
            localTooltipView.setTag(efj.MI, Long.valueOf(localiee.a.a()));
          }
          label2234:
          if (this.aY == null)
          {
            this.aY = new hfn(getContext());
            hfn localhfn1 = this.aY;
            eaf localeaf = new eaf(this);
            localhfn1.a.setOnClickListener(localeaf);
            hfn localhfn2 = this.aY;
            eag localeag = new eag(this);
            localhfn2.b.setOnClickListener(localeag);
          }
          if (!TextUtils.isEmpty(this.aj)) {
            this.aY.a(this.aj.toString());
          }
          if (((this.aG != null) && (this.aG.b > 0)) || (this.aE > 0)) {
            this.aY.b(getResources().getString(aau.vJ));
          }
          this.aY.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
          addView(this.aY);
          i28 += this.aY.getMeasuredHeight();
          break label1268;
          label2416:
          i23 = i15;
          break label779;
          label2423:
          i16 = paramInt4;
          break label307;
        }
      }
    }
  }
  
  public int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt;
  }
  
  protected int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i14;
    int i15;
    label40:
    String str3;
    label72:
    int i1;
    label160:
    label170:
    int i2;
    label180:
    int i3;
    if (this.n != null)
    {
      if (this.y != null)
      {
        i14 = 1;
        i15 = 0;
        if (i14 != 0)
        {
          if (this.y.b == null) {
            break label631;
          }
          i15 = 202;
        }
        eaj localeaj = this.n;
        String str1 = this.N;
        String str2 = this.e;
        if (i14 == 0) {
          break label674;
        }
        str3 = this.y.c;
        if (localeaj.a(str1, str2, i15, str3, this.z)) {
          gwz.a(this, -1);
        }
        this.n = null;
      }
    }
    else
    {
      if ((this.aP != null) && (this.aP.getParent() == this)) {
        paramInt5 += this.aP.getMeasuredHeight();
      }
      if (!x()) {
        paramInt5 += this.H.m;
      }
      if (x()) {
        break label680;
      }
      if (this.aB == null) {
        break label695;
      }
      i1 = 1;
      if (this.aD == null) {
        break label701;
      }
      i2 = 1;
      if ((i1 != 0) || (i2 != 0))
      {
        i3 = paramInt5 + this.H.m;
        if (this.aB != null)
        {
          paramCanvas.translate(paramInt3, i3);
          this.aB.draw(paramCanvas);
          paramCanvas.translate(-paramInt3, -i3);
          i3 += this.aB.getHeight();
        }
        if (this.aW != null)
        {
          int i12 = paramInt3 + (paramInt4 - this.aW.getWidth());
          int i13 = Math.max(paramInt5, i3 - this.aB.getHeight() / 2 - this.aW.getWidth() / 2);
          paramCanvas.drawBitmap(this.aW, i12, i13, null);
        }
        if ((i1 != 0) && (i2 != 0)) {
          i3 += this.H.o;
        }
        if (this.aD != null)
        {
          paramCanvas.translate(paramInt3, i3);
          this.aD.draw(paramCanvas);
          paramCanvas.translate(-paramInt3, -i3);
          i3 += this.aD.getHeight();
        }
        if ((i1 == 0) && (i2 == 0)) {
          break label782;
        }
      }
    }
    label524:
    label782:
    for (int i4 = i3 + 2 * this.H.m;; i4 = i3)
    {
      paramCanvas.drawLine(paramInt3, i4, paramInt3 + paramInt4, i4, this.H.u);
      if ((i1 != 0) || (i2 != 0)) {}
      for (paramInt5 = i4 + 2 * this.H.m;; paramInt5 = i4)
      {
        int i5 = paramInt5 + this.bn.getMeasuredHeight();
        int i6;
        label492:
        int i7;
        int i8;
        int i10;
        hfn localhfn;
        if (this.w)
        {
          i6 = a(paramCanvas, 0, i5, paramInt2);
          i7 = a(this.ad, i6);
          if (!C_()) {
            break label723;
          }
          i8 = a(paramCanvas, b(i7));
          int i9 = a(this.aX, i8);
          i10 = a(this.br, i9);
          if (this.R != 1) {
            break label768;
          }
          localhfn = this.aY;
        }
        for (int i11 = a(localhfn, i10);; i11 = i10)
        {
          if ((this.R != 0) || (this.bb == null) || (this.bb.getParent() != this) || (this.aH == null) || (this.aH.a == 0))
          {
            return i11;
            i14 = 0;
            break;
            label631:
            if (this.y.e != null)
            {
              i15 = 207;
              break label40;
            }
            lmo locallmo = this.y.a;
            i15 = 0;
            if (locallmo == null) {
              break label40;
            }
            i15 = 300;
            break label40;
            label674:
            str3 = null;
            break label72;
            label680:
            paramInt5 += this.bg.getHeight();
            break label160;
            label695:
            i1 = 0;
            break label170;
            label701:
            i2 = 0;
            break label180;
            i6 = a(paramCanvas, paramInt3, i5, paramInt4);
            break label492;
            label723:
            i8 = b(i7);
            break label524;
          }
          paramCanvas.drawLine(paramInt1, i11, paramInt1 + paramInt2, i11, this.H.u);
          return i11 + this.bb.getHeight();
        }
      }
    }
  }
  
  protected SpannableStringBuilder a(Cursor paramCursor, long paramLong)
  {
    boolean bool = (1L & paramLong) < 0L;
    SpannableStringBuilder localSpannableStringBuilder1 = null;
    byte[] arrayOfByte;
    SpannableStringBuilder localSpannableStringBuilder2;
    if (bool)
    {
      arrayOfByte = paramCursor.getBlob(14);
      localSpannableStringBuilder2 = null;
      if (arrayOfByte != null) {
        break label44;
      }
    }
    for (;;)
    {
      localSpannableStringBuilder1 = lww.a(localSpannableStringBuilder2, this);
      return localSpannableStringBuilder1;
      label44:
      localSpannableStringBuilder2 = lwh.a(ByteBuffer.wrap(arrayOfByte));
    }
  }
  
  public final void a()
  {
    boolean bool1 = true;
    if (this.bj != null) {
      this.bj.a(bool1);
    }
    if (!this.bh.a()) {
      getContext().startActivity(this.bh.b());
    }
    boolean bool2;
    boolean bool3;
    label103:
    CardSocialBarViewGroup localCardSocialBarViewGroup;
    do
    {
      return;
      hej localhej = (hej)mbb.a(getContext(), hej.class);
      String str1 = this.N;
      String str2 = this.f;
      String str3 = this.g;
      if (this.aM) {
        break;
      }
      bool2 = bool1;
      if ((this.aG == null) || (!this.aG.c)) {
        break label335;
      }
      bool3 = bool1;
      localhej.a(str1, str2, str3, bool2, bool3, this, this.z);
      localCardSocialBarViewGroup = this.aX;
    } while (localCardSocialBarViewGroup.b == null);
    hew localhew = localCardSocialBarViewGroup.b;
    boolean bool4;
    label160:
    hfh localhfh;
    label184:
    label210:
    int i1;
    if (!localCardSocialBarViewGroup.b.b())
    {
      bool4 = bool1;
      localhew.a(bool4);
      localhfh = localCardSocialBarViewGroup.a;
      if (localhfh.e) {
        break label347;
      }
      localhfh.e = bool1;
      if (!localhfh.e) {
        break label352;
      }
      localhfh.d = (1 + localhfh.d);
      localhfh.b();
      localhfh.c();
      localhfh.e();
      if (!localhfh.i) {
        break label391;
      }
      if (!localhfh.e) {
        break label367;
      }
      localhfh.f = localhfh.g;
      i1 = localhfh.a;
    }
    for (int i2 = 250;; i2 = 20)
    {
      GradientDrawable localGradientDrawable = (GradientDrawable)localhfh.c.getBackground();
      localhfh.f.addUpdateListener(new hfi(localhfh, localGradientDrawable));
      localhfh.f.addListener(new hfj(localhfh, i1));
      localhfh.f.setDuration(i2).start();
      return;
      bool2 = false;
      break;
      label335:
      bool3 = false;
      break label103;
      bool4 = false;
      break label160;
      label347:
      bool1 = false;
      break label184;
      label352:
      localhfh.d = (-1 + localhfh.d);
      break label210;
      label367:
      localhfh.f = localhfh.h;
      i1 = localhfh.b;
    }
    label391:
    localhfh.d();
  }
  
  public void a(Cursor paramCursor) {}
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    Context localContext1 = getContext();
    setOnClickListener(this);
    a(paramCursor);
    Resources localResources1 = getResources();
    this.S = paramhfa.b();
    this.N = paramCursor.getString(2);
    this.bs = ((gil)mbb.a(getContext(), gil.class));
    gil localgil = this.bs;
    String str1 = this.N;
    localgil.a.put(str1, this);
    this.d = paramCursor.getString(22);
    this.e = paramCursor.getString(29);
    this.f = paramCursor.getString(3);
    this.g = paramCursor.getString(4);
    if (this.g == null) {
      this.g = "";
    }
    this.ae = paramCursor.getString(6);
    byte[] arrayOfByte1 = paramCursor.getBlob(33);
    SpannableStringBuilder localSpannableStringBuilder1;
    boolean bool1;
    label221:
    byte[] arrayOfByte8;
    SpannableStringBuilder localSpannableStringBuilder2;
    label266:
    boolean bool15;
    label362:
    String str3;
    label423:
    label574:
    int i21;
    label587:
    label862:
    boolean bool2;
    label921:
    label945:
    label973:
    boolean bool3;
    label995:
    boolean bool4;
    label1017:
    boolean bool5;
    label1039:
    boolean bool6;
    label1072:
    boolean bool7;
    label1094:
    boolean bool8;
    label1116:
    boolean bool9;
    label1138:
    boolean bool10;
    label1158:
    boolean bool11;
    label1194:
    int i18;
    label1370:
    int i19;
    label1391:
    String str16;
    label1512:
    Context localContext2;
    Resources localResources2;
    int i2;
    Object localObject1;
    label1599:
    String str4;
    int i3;
    int i4;
    String str14;
    Object localObject5;
    Object localObject2;
    if (arrayOfByte1 == null)
    {
      localSpannableStringBuilder1 = null;
      this.af = localSpannableStringBuilder1;
      this.h = hdo.b(paramCursor.getString(5));
      this.i = paramCursor.getLong(10);
      if (TextUtils.isEmpty(paramCursor.getString(31))) {
        break label2446;
      }
      bool1 = true;
      this.ak = bool1;
      long l1 = paramCursor.getLong(11);
      if ((0x2 & l1) != 0L)
      {
        arrayOfByte8 = paramCursor.getBlob(13);
        if (arrayOfByte8 != null) {
          break label2452;
        }
        localSpannableStringBuilder2 = null;
        this.j = lww.a(localSpannableStringBuilder2, this);
      }
      if ((0x8 & l1) != 0L)
      {
        byte[] arrayOfByte7 = paramCursor.getBlob(9);
        if (arrayOfByte7 != null) {
          this.W = lmg.a(arrayOfByte7);
        }
      }
      String str2 = F_();
      if (!TextUtils.isEmpty(str2))
      {
        this.ab = new SpannableString(str2);
        lxw locallxw2 = new lxw("ucvg-location", this);
        if (this.R == 1) {
          break label2465;
        }
        bool15 = true;
        locallxw2.b = bool15;
        this.ab.setSpan(locallxw2, 0, str2.length(), 33);
        this.ac = h();
      }
      byte[] arrayOfByte2 = paramCursor.getBlob(24);
      if (arrayOfByte2 == null) {
        break label2471;
      }
      this.aU = lml.a(arrayOfByte2).b;
      this.aT = paramCursor.getString(19);
      this.k = paramCursor.getString(15);
      this.ar = paramCursor.getInt(18);
      str3 = paramCursor.getString(16);
      if ((TextUtils.isEmpty(this.k)) || (TextUtils.isEmpty(str3))) {
        break label2613;
      }
      this.aq = paramCursor.getString(36);
      if (TextUtils.isEmpty(this.aU)) {
        break label2479;
      }
      int i26 = aau.uC;
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = this.H.a.a(str3);
      arrayOfObject5[1] = this.H.a.a(this.aU);
      this.au = new SpannableStringBuilder(localResources1.getString(i26, arrayOfObject5));
      if (TextUtils.isEmpty(this.aq)) {
        break label2607;
      }
      i21 = 1;
      int i22 = this.au.length();
      this.au.setSpan(this.H.ab, 0, this.au.length(), 33);
      if ((i21 == 0) && (this.R == 1))
      {
        if (efj.B(localContext1)) {
          i22 = this.au.length();
        }
        kuf localkuf2 = new kuf(this, new gxq(pkh.w), this);
        this.au.setSpan(new lxw("ucvg-attribution", localkuf2), 0, i22, 33);
      }
      if ((i21 != 0) && (this.R == 1))
      {
        kuf localkuf1 = new kuf(this, new gxq(pkh.w), this);
        this.au.setSpan(new lxw("ucvg-originalactivity", localkuf1), 0, this.au.length(), 33);
      }
      if ((this.w) && (i21 != 0) && (this.ar > 0))
      {
        Resources localResources3 = localContext1.getResources();
        int i23 = efj.xl;
        int i24 = this.ar;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(this.ar);
        this.al = new SpannableStringBuilder(localResources3.getQuantityString(i23, i24, arrayOfObject3));
        this.al.setSpan(new lxw("ucvg-originalactivity", this), 0, this.al.length(), 33);
      }
      this.l = a(paramCursor, l1);
      this.aE = paramCursor.getInt(35);
      this.aF = paramCursor.getInt(8);
      byte[] arrayOfByte3 = paramCursor.getBlob(20);
      if (arrayOfByte3 == null) {
        break label2621;
      }
      this.aH = lmm.a(arrayOfByte3);
      byte[] arrayOfByte4 = paramCursor.getBlob(7);
      if (arrayOfByte4 == null) {
        break label2629;
      }
      this.aG = lmj.a(arrayOfByte4);
      this.aI = paramCursor.getLong(12);
      if ((0x8 & this.aI) == 0L) {
        break label2637;
      }
      bool2 = true;
      this.aJ = bool2;
      if ((0x10 & this.aI) == 0L) {
        break label2643;
      }
      bool3 = true;
      this.aK = bool3;
      if ((0x20 & this.aI) == 0L) {
        break label2649;
      }
      bool4 = true;
      this.p = bool4;
      if ((0x4 & this.aI) == 0L) {
        break label2655;
      }
      bool5 = true;
      this.aL = bool5;
      if (((1L & this.aI) != 0L) || ((0x400 & this.aI) != 0L)) {
        break label2661;
      }
      bool6 = true;
      this.aM = bool6;
      if ((0x80 & this.aI) == 0L) {
        break label2667;
      }
      bool7 = true;
      this.q = bool7;
      if ((0x800 & this.aI) == 0L) {
        break label2673;
      }
      bool8 = true;
      this.aN = bool8;
      if ((0x40 & this.aI) == 0L) {
        break label2679;
      }
      bool9 = true;
      this.aO = bool9;
      if ((0x4000 & l1) == 0L) {
        break label2685;
      }
      bool10 = true;
      this.r = bool10;
      if ((!this.t) || (!this.r) || ((0x2 & this.aI) == 0L)) {
        break label2691;
      }
      bool11 = true;
      this.aV = bool11;
      byte[] arrayOfByte5 = paramCursor.getBlob(23);
      if (arrayOfByte5 != null)
      {
        this.x = lml.a(arrayOfByte5);
        this.aR = this.x.a;
        this.aS = this.x.c;
      }
      byte[] arrayOfByte6 = paramCursor.getBlob(37);
      if (arrayOfByte6 != null)
      {
        this.y = llr.a(arrayOfByte6);
        if (this.y != null)
        {
          lmo locallmo = this.y.a;
          if (locallmo != null)
          {
            String str17 = locallmo.b;
            if ((!TextUtils.isEmpty(str17)) && (this.bh.a()))
            {
              this.m = true;
              this.aA = localResources1.getString(aau.uF);
              this.aC = str17;
              this.aW = this.H.h;
            }
          }
          if ((this.y == null) || (this.y.e == null)) {
            break label2697;
          }
          i18 = 1;
          if ((i18 == 0) || (!this.y.e.a)) {
            break label2703;
          }
          i19 = 1;
          if (i19 != 0) {
            this.p = false;
          }
        }
      }
      if (this.q) {
        this.n = null;
      }
      if (C_()) {
        a_(paramCursor, paramhfa, paramInt);
      }
      this.bd = llo.a(paramCursor.getBlob(32));
      setContentDescription(getContentDescription());
      if (this.R == 1)
      {
        str16 = paramCursor.getString(34);
        if (this.aM) {
          break label2733;
        }
        if (!this.ak) {
          break label2709;
        }
        this.aj = new SpannableString(getResources().getString(aau.bv, new Object[] { str16 }));
        lxw locallxw1 = new lxw("ucvg-acl", this);
        locallxw1.b = true;
        this.aj.setSpan(locallxw1, 0, this.aj.length(), 33);
      }
      localContext2 = getContext();
      localResources2 = localContext2.getResources();
      if (this.R != 1) {
        break label2749;
      }
      int i17 = efj.yB;
      CharSequence localCharSequence2 = lwd.a(localContext2, this.i);
      i2 = i17;
      localObject1 = localCharSequence2;
      str4 = lwd.a(localContext2, this.i).toString();
      llr localllr = this.y;
      lls locallls = null;
      if (localllr != null) {
        locallls = this.y.f;
      }
      i3 = localResources2.getColor(efj.kn);
      i4 = efj.yz;
      if ((locallls == null) || (!locallls.c())) {
        break label2993;
      }
      if ((this.u == 0) || (this.u == eai.e)) {
        break label3499;
      }
      this.D = locallls.a();
      this.E = locallls.b();
      str14 = this.E;
      String str15 = this.bo.b(this.E);
      localObject5 = new ead(this, this);
      localObject2 = str15;
    }
    for (Object localObject3 = str14;; localObject3 = null)
    {
      ied localied1;
      label1774:
      iee localiee;
      TooltipView localTooltipView;
      int i16;
      label1885:
      label1901:
      int i6;
      int i5;
      Object localObject4;
      if ((this.u != 0) && (this.u != eai.e)) {
        if (x())
        {
          localied1 = null;
          if ((localied1 != null) && (this.bi.a(localied1)))
          {
            this.A = new TooltipView(getContext());
            this.A.a(localied1);
            this.A.e.add(this);
            this.A.a(0);
            localiee = this.bi;
            localTooltipView = this.A;
            efj.e(localTooltipView, "Attempted to register null TooltipView");
            localTooltipView.e.add(localiee);
            if (localTooltipView.getTag(efj.MH) == null) {
              break label2897;
            }
            i16 = 1;
            if ((i16 == 0) && (localTooltipView.getTag(efj.MI) == null)) {
              break label2969;
            }
          }
          i6 = i4;
          i5 = i3;
          localObject4 = null;
        }
      }
      for (;;)
      {
        label1912:
        int i7 = 1;
        int i8 = efj.yr;
        Object localObject6 = this.g;
        if (!TextUtils.isEmpty(this.af))
        {
          i7 = localResources2.getInteger(efj.so);
          i8 = efj.yo;
          localObject6 = this.af;
        }
        hfb localhfb1 = this.bn;
        label2015:
        int i9;
        label2064:
        boolean bool12;
        label2106:
        boolean bool13;
        label2128:
        hfb localhfb3;
        label2193:
        int i10;
        label2228:
        int i11;
        label2302:
        int i12;
        label2363:
        AvatarView localAvatarView;
        String str5;
        if (!TextUtils.isEmpty((CharSequence)localObject6))
        {
          localhfb1.e.setMaxLines(i7);
          localhfb1.e.setText((CharSequence)localObject6);
          localhfb1.e.setVisibility(0);
          localhfb1.e.setTextAppearance(localhfb1.getContext(), i8);
          hfb localhfb2 = this.bn;
          localhfb2.c.setContentDescription((CharSequence)localObject2);
          localhfb2.c.setTextAppearance(localhfb2.getContext(), i6);
          Button localButton1 = localhfb2.c;
          if (TextUtils.isEmpty((CharSequence)localObject3)) {
            break label3401;
          }
          i9 = 0;
          localButton1.setVisibility(i9);
          localhfb2.c.setText((CharSequence)localObject3);
          localhfb2.c.setOnClickListener((View.OnClickListener)localObject5);
          Button localButton2 = localhfb2.c;
          if (localObject5 == null) {
            break label3408;
          }
          bool12 = true;
          localButton2.setClickable(bool12);
          Button localButton3 = localhfb2.c;
          if (localObject5 == null) {
            break label3414;
          }
          bool13 = true;
          localButton3.setEnabled(bool13);
          localhfb3 = this.bn;
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break label3420;
          }
          localhfb3.d.setText((CharSequence)localObject1);
          localhfb3.d.setContentDescription(str4);
          localhfb3.d.setVisibility(0);
          localhfb3.d.setTextAppearance(localhfb3.getContext(), i2);
          hfb localhfb4 = this.bn;
          localhfb4.f.setText((CharSequence)localObject4);
          TextView localTextView1 = localhfb4.f;
          if (!TextUtils.isEmpty((CharSequence)localObject4)) {
            break label3451;
          }
          i10 = 8;
          localTextView1.setVisibility(i10);
          localhfb4.requestLayout();
          this.bn.a.getPaint().setColor(i5);
          hfb localhfb5 = this.bn;
          localhfb5.h = this.ak;
          localhfb5.requestLayout();
          hfb localhfb6 = this.bn;
          boolean bool14 = this.aO;
          TextView localTextView2 = localhfb6.i;
          if (!bool14) {
            break label3457;
          }
          i11 = 0;
          localTextView2.setVisibility(i11);
          if ((this.R == 1) || (this.R == 2)) {
            this.v = ((heg)mbb.a(localContext1, heg.class));
          }
          this.z = paramCursor.getBlob(38);
          if (Build.VERSION.SDK_INT < 21) {
            break label3464;
          }
          i12 = 1;
          if (i12 != 0)
          {
            localAvatarView = this.ag;
            str5 = String.valueOf(this.N);
            if (str5.length() == 0) {
              break label3470;
            }
          }
        }
        label2446:
        label3470:
        for (String str6 = "update_avatar_".concat(str5);; str6 = new String("update_avatar_"))
        {
          localAvatarView.setTransitionName(str6);
          this.G = paramCursor.getString(41);
          this.bq = paramCursor.getString(42);
          return;
          localSpannableStringBuilder1 = lwh.a(ByteBuffer.wrap(arrayOfByte1));
          break;
          bool1 = false;
          break label221;
          label2452:
          localSpannableStringBuilder2 = lwh.a(ByteBuffer.wrap(arrayOfByte8));
          break label266;
          label2465:
          bool15 = false;
          break label362;
          label2471:
          this.aU = null;
          break label423;
          label2479:
          if (!TextUtils.isEmpty(this.aT))
          {
            int i25 = aau.uB;
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = this.H.a.a(str3);
            arrayOfObject4[1] = this.H.a.a(this.aT);
            this.au = new SpannableStringBuilder(localResources1.getString(i25, arrayOfObject4));
            break label574;
          }
          int i20 = aau.uA;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.H.a.a(str3);
          this.au = new SpannableStringBuilder(localResources1.getString(i20, arrayOfObject2));
          break label574;
          label2607:
          i21 = 0;
          break label587;
          label2613:
          this.au = null;
          break label862;
          label2621:
          this.aH = null;
          break label921;
          label2629:
          this.aG = null;
          break label945;
          label2637:
          bool2 = false;
          break label973;
          label2643:
          bool3 = false;
          break label995;
          label2649:
          bool4 = false;
          break label1017;
          label2655:
          bool5 = false;
          break label1039;
          label2661:
          bool6 = false;
          break label1072;
          label2667:
          bool7 = false;
          break label1094;
          label2673:
          bool8 = false;
          break label1116;
          label2679:
          bool9 = false;
          break label1138;
          label2685:
          bool10 = false;
          break label1158;
          bool11 = false;
          break label1194;
          i18 = 0;
          break label1370;
          label2703:
          i19 = 0;
          break label1391;
          label2709:
          this.aj = new SpannableString(getResources().getString(aau.bx));
          break label1512;
          label2733:
          this.aj = new SpannableString(str16);
          break label1512;
          label2749:
          int i1 = efj.yD;
          CharSequence localCharSequence1 = lwd.c(localContext2, this.i);
          i2 = i1;
          localObject1 = localCharSequence1;
          break label1599;
          if (this.bk == null)
          {
            Context localContext3 = getContext();
            String str12 = localContext3.getString(aau.mg);
            String str13 = ((hhk)mbb.a(localContext3, hhk.class)).b();
            this.bk = new ied(q(), pkh.M, str13, str12, 3);
            Intent localIntent = ((hpo)mbb.a(localContext3, hpo.class)).c(q());
            ied localied2 = this.bk;
            localied2.f = localContext3.getString(aau.jk);
            localied2.g = localIntent;
          }
          localied1 = this.bk;
          break label1774;
          label2897:
          lvj locallvj = (lvj)mbb.b(localTooltipView.getContext(), lvj.class);
          if (locallvj != null)
          {
            ief localief = new ief(localiee, localTooltipView);
            locallvj.a.a.add(localief);
            localTooltipView.setTag(efj.MH, localief);
            i16 = 1;
            break label1885;
          }
          i16 = 0;
          break label1885;
          label2969:
          localTooltipView.setTag(efj.MI, Long.valueOf(localiee.a.a()));
          break label1901;
          label2993:
          if (this.x != null)
          {
            String str7;
            label3031:
            String str8;
            String str9;
            eac localeac;
            switch (this.x.e)
            {
            default: 
              str7 = null;
              if ((this.u != 0) && (this.u == eai.c) && (this.u != eai.d))
              {
                str8 = this.x.d;
                int i15 = aau.ei;
                Object[] arrayOfObject1 = new Object[1];
                String str10 = String.valueOf(this.x.b);
                String str11 = String.valueOf(this.x.d);
                arrayOfObject1[0] = (1 + String.valueOf(str10).length() + String.valueOf(str11).length() + str10 + " " + str11);
                str9 = localContext2.getString(i15, arrayOfObject1);
                localeac = new eac(this, this.aR, this.aS);
              }
              break;
            }
            for (;;)
            {
              int i13 = efj.yQ;
              int i14 = localResources2.getColor(efj.jX);
              localObject5 = localeac;
              localObject2 = str9;
              localObject3 = str8;
              localObject4 = str7;
              i5 = i14;
              i6 = i13;
              break;
              str7 = localResources2.getString(aau.dj);
              break label3031;
              str7 = localResources2.getString(aau.dk);
              break label3031;
              if ((this.R == 1) || ((this.u != 0) && (this.u != eai.c) && (this.u != eai.d)))
              {
                str8 = this.x.b;
                str9 = localContext2.getString(aau.ei, new Object[] { str8 });
                localeac = new eac(this, this.aR, null);
              }
              else
              {
                localeac = null;
                str8 = null;
                str9 = null;
              }
            }
          }
          localObject2 = paramCursor.getString(34);
          i5 = localResources2.getColor(efj.kc);
          i6 = efj.yp;
          localObject3 = localObject2;
          localObject4 = null;
          localObject5 = null;
          break label1912;
          localhfb1.e.setVisibility(8);
          localhfb1.e.setText(null);
          break label2015;
          label3401:
          i9 = 8;
          break label2064;
          label3408:
          bool12 = false;
          break label2106;
          label3414:
          bool13 = false;
          break label2128;
          label3420:
          localhfb3.d.setText(null);
          localhfb3.d.setContentDescription(null);
          localhfb3.d.setVisibility(8);
          break label2193;
          label3451:
          i10 = 0;
          break label2228;
          i11 = 8;
          break label2302;
          i12 = 0;
          break label2363;
        }
        label2691:
        label2697:
        i6 = i4;
        label3457:
        label3464:
        i5 = i3;
        localObject4 = null;
      }
      label3499:
      localObject5 = null;
      localObject2 = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (!this.bh.a())
    {
      getContext().startActivity(this.bh.b());
      return;
    }
    hen localhen = (hen)mbb.a(getContext(), hen.class);
    if (TextUtils.isEmpty(this.g)) {}
    Resources localResources;
    int i1;
    Object[] arrayOfObject;
    for (String str = null;; str = localResources.getString(i1, arrayOfObject))
    {
      localhen.a(this.N, this.f, this.aM, this.ak, this.z, this.bq, str, paramBundle, this);
      return;
      localResources = getResources();
      i1 = aau.kO;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = this.g;
    }
  }
  
  public final void a(URLSpan paramURLSpan)
  {
    String str1 = paramURLSpan.getURL();
    if ((this.R == 1) && (this.o != null) && ("ucvg-acl".equals(str1))) {
      this.o.a();
    }
    do
    {
      return;
      if ((this.o != null) && ("ucvg-attribution".equals(str1)))
      {
        dge localdge2 = this.o;
        String str3 = this.k;
        localdge2.b.startActivity(efj.a(localdge2.b, localdge2.a, str3, null, false));
        return;
      }
      if ((this.o != null) && ("ucvg-originalactivity".equals(str1)))
      {
        dge localdge1 = this.o;
        String str2 = this.aq;
        localdge1.b.startActivity(efj.b(localdge1.b, localdge1.a, str2));
        return;
      }
    } while (this.o == null);
    if ("ucvg-location".equals(str1))
    {
      i();
      return;
    }
    ((lli)mbb.a(getContext(), lli.class)).a(this.N, this.e, this.f, str1, null);
  }
  
  public final void a(TooltipView paramTooltipView)
  {
    if (paramTooltipView == this.bj) {
      this.bj = null;
    }
    do
    {
      return;
      if (paramTooltipView == this.A)
      {
        this.A = null;
        return;
      }
    } while (paramTooltipView != this.aZ);
    this.aZ = null;
  }
  
  public final void a(TooltipView paramTooltipView, boolean paramBoolean)
  {
    if (paramTooltipView != null)
    {
      removeView(paramTooltipView);
      if (paramTooltipView == this.aZ) {
        this.ba.remove(this.N);
      }
    }
  }
  
  protected void a(StringBuilder paramStringBuilder) {}
  
  protected void a(boolean paramBoolean)
  {
    if (this.N != null)
    {
      if (!this.w) {
        break label26;
      }
      ((hfk)this.bb).a(paramBoolean);
    }
    label26:
    while (this.bp) {
      return;
    }
    lpm locallpm = (lpm)this.bb;
    locallpm.i = paramBoolean;
    if (locallpm.i)
    {
      locallpm.c();
      return;
    }
    locallpm.d();
  }
  
  protected void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.M.left;
    int i2 = i1 + this.P;
    int i3 = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int i4 = this.M.left + this.H.m;
    int i5 = i4 + this.O;
    int i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
    if ((this.bb != null) && (this.aH != null) && (this.bb.getParent() == this) && (this.aH.a > 0))
    {
      this.bb.measure(i3, i6);
      this.bb.layout(i1, this.c, i2, this.c + this.bb.getMeasuredHeight());
    }
    if (this.ag != null)
    {
      this.ag.measure(View.MeasureSpec.makeMeasureSpec(efj.i(getContext()), 1073741824), i6);
      this.ag.layout(i4, this.a, i4 + this.ag.getMeasuredWidth(), this.a + this.ag.getMeasuredHeight());
    }
    int i31;
    int i32;
    int i33;
    int i35;
    if (this.bn.getParent() == this)
    {
      int i26 = i4 + this.ag.getMeasuredWidth() + this.H.aQ;
      this.bn.layout(i26, this.a, i26 + this.bn.getMeasuredWidth(), this.a + this.bn.getMeasuredHeight());
      if (this.A != null)
      {
        this.A.measure(View.MeasureSpec.makeMeasureSpec((int)(0.68F * this.O), -2147483648), i6);
        Button localButton = this.bn.c;
        int i27 = localButton.getBottom();
        hfb localhfb = this.bn;
        int i28 = i27 + (localhfb.g + localhfb.b);
        int i29 = i28 + this.A.getMeasuredHeight();
        int i30 = localButton.getLeft() + localButton.getMeasuredWidth() / 2;
        i31 = this.A.getMeasuredWidth() / 2;
        i32 = i26 + i30 - i31;
        i33 = i32 + this.A.getMeasuredWidth();
        int i34 = i33 - i5;
        i35 = i4 - i32;
        if (i34 <= 0) {
          break label1538;
        }
        i32 -= i34;
        i33 -= i34;
        i31 += i34;
        this.A.b(i31);
        this.A.layout(i32, i28, i33, i29);
      }
    }
    int i7;
    label473:
    int i8;
    label532:
    ImageButton localImageButton2;
    int i24;
    int i23;
    int i25;
    label931:
    label955:
    int i18;
    label1167:
    int i19;
    label1205:
    ImageButton localImageButton1;
    int i10;
    int i11;
    int i13;
    int i12;
    if (this.w)
    {
      i7 = this.bt;
      if (this.ao.getParent() == this) {
        this.ao.layout(i7, this.ap, i7 + this.ao.getMeasuredWidth(), this.ap + this.ao.getMeasuredHeight());
      }
      if (!this.w) {
        break label1574;
      }
      i8 = this.bt;
      if (this.av.getParent() == this) {
        this.av.layout(i8, this.aw, i8 + this.av.getMeasuredWidth(), this.aw + this.av.getMeasuredHeight());
      }
      if (this.ax.getParent() == this) {
        this.ax.layout(i8, this.ay, i8 + this.ax.getMeasuredWidth(), this.ay + this.ax.getMeasuredHeight());
      }
      if ((this.w) && (this.am.getParent() == this)) {
        this.am.layout(i8, this.an, i8 + this.am.getMeasuredWidth(), this.an + this.am.getMeasuredHeight());
      }
      if ((this.ad != null) && (this.ad.getParent() == this)) {
        this.ad.layout(i4, this.aa, i4 + this.ad.getMeasuredWidth(), this.aa + this.ad.getMeasuredHeight());
      }
      if (this.aX.getParent() != this) {
        break label1630;
      }
      this.aX.measure(i3, i6);
      this.aX.layout(i1, this.b, i2, this.b + this.aX.getMeasuredHeight());
      if (this.bj != null)
      {
        this.bj.measure(View.MeasureSpec.makeMeasureSpec((int)(0.68F * this.O), -2147483648), i6);
        localImageButton2 = this.aX.a.c;
        int i20 = this.aX.getTop();
        CardSocialBarViewGroup localCardSocialBarViewGroup2 = this.aX;
        int i21 = i20 + (localCardSocialBarViewGroup2.a.getTop() + localCardSocialBarViewGroup2.a.c.getTop());
        int i22 = i21 - this.bj.getMeasuredHeight();
        if (!this.bj.a()) {
          break label1581;
        }
        i24 = this.aX.getRight() - this.aX.b();
        i23 = i24 - this.bj.getMeasuredWidth();
        i25 = this.bj.getMeasuredWidth() - localImageButton2.getMeasuredWidth() / 2;
        this.bj.b(i25);
        this.bj.layout(i23, i22, i24, i21);
      }
      if ((this.aY != null) && (this.aY.getParent() == this)) {
        this.aY.layout(i1, this.V, i2, this.V + this.aY.getMeasuredHeight());
      }
      if ((this.bg != null) && (x()))
      {
        this.bg.measure(i3, i6);
        this.bg.layout(i1, this.bf, i1 + this.bg.getMeasuredWidth(), this.bf + this.bg.getMeasuredHeight());
      }
      if ((this.ah != null) && (y()) && (this.ah.getParent() == this))
      {
        int i15 = i5 - Math.max(this.ah.getMeasuredWidth(), this.ai.getMeasuredWidth());
        int i16 = this.a;
        int i17 = i16 + Math.max(this.ah.getMeasuredHeight(), this.ai.getMeasuredHeight());
        this.ai.layout(i15, i16, i5, i17);
        CirclesButton localCirclesButton1 = this.ai;
        if (!this.p) {
          break label1697;
        }
        i18 = 8;
        localCirclesButton1.setVisibility(i18);
        this.ah.layout(i15, i16, i5, i17);
        CirclesButton localCirclesButton2 = this.ah;
        if (!this.p) {
          break label1703;
        }
        i19 = 0;
        localCirclesButton2.setVisibility(i19);
      }
      if ((this.aZ != null) && (this.aZ.getParent() == this))
      {
        this.aZ.measure(View.MeasureSpec.makeMeasureSpec((int)(0.68F * this.O), -2147483648), i6);
        localImageButton1 = this.aX.a.c;
        int i9 = this.aX.getTop();
        CardSocialBarViewGroup localCardSocialBarViewGroup1 = this.aX;
        i10 = i9 + (localCardSocialBarViewGroup1.a.getTop() + localCardSocialBarViewGroup1.a.c.getTop());
        i11 = i10 - this.aZ.getMeasuredHeight();
        if (!this.aZ.a()) {
          break label1710;
        }
        i13 = this.aX.getRight() - this.aX.b();
        i12 = i13 - this.aZ.getMeasuredWidth();
      }
    }
    for (int i14 = this.aZ.getMeasuredWidth() - localImageButton1.getMeasuredWidth() / 2;; i14 = this.aX.b() + localImageButton1.getMeasuredWidth() / 2)
    {
      this.aZ.b(i14);
      this.aZ.layout(i12, i11, i13, i10);
      if ((this.bc != null) && (this.bc.getParent() == this)) {
        this.bc.layout(this.be.x, this.be.y, this.be.x + this.bc.getMeasuredWidth(), this.be.y + this.bc.getMeasuredHeight());
      }
      if ((this.aP != null) && (this.aP.getParent() == this)) {
        this.aP.layout(this.aQ.x, this.aQ.y, this.aQ.x + this.aP.getMeasuredWidth(), this.aQ.y + this.aP.getMeasuredHeight());
      }
      return;
      label1538:
      if (i35 <= 0) {
        break;
      }
      i32 += i35;
      i33 += i35;
      i31 -= i35;
      break;
      i7 = i4;
      break label473;
      label1574:
      i8 = i4;
      break label532;
      label1581:
      i23 = this.aX.getLeft() + this.aX.b();
      i24 = i23 + this.bj.getMeasuredWidth();
      i25 = this.aX.b() + localImageButton2.getMeasuredWidth() / 2;
      break label931;
      label1630:
      if ((this.br == null) || (this.br.getParent() != this)) {
        break label955;
      }
      this.br.measure(i3, i6);
      this.br.layout(i1, this.b, i1 + this.br.getMeasuredWidth(), this.b + this.br.getMeasuredHeight());
      break label955;
      label1697:
      i18 = 0;
      break label1167;
      label1703:
      i19 = 8;
      break label1205;
      label1710:
      i12 = this.aX.getLeft() + this.aX.b();
      i13 = i12 + this.aZ.getMeasuredWidth();
    }
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt == aaw.i)
    {
      hee localhee = (hee)mbb.b(getContext(), hee.class);
      if (localhee != null)
      {
        localhee.a(this, this);
        return true;
      }
    }
    else
    {
      if ((paramInt == aaw.j) || (paramInt == aaw.l))
      {
        a();
        return true;
      }
      if (paramInt == aaw.e)
      {
        G_();
        return true;
      }
      if (paramInt == aaw.m)
      {
        a(null);
        return true;
      }
    }
    return false;
  }
  
  public void a_(Cursor paramCursor, hfa paramhfa, int paramInt) {}
  
  public void ap_()
  {
    if (this.ag != null) {
      this.ag.ap_();
    }
    super.ap_();
  }
  
  protected int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    if ((efj.B(getContext())) && (!this.bp))
    {
      i1 = 1;
      if ((this.R == 0) && (this.aH != null) && (i1 == 0)) {
        break label47;
      }
    }
    label47:
    while (this.aH.a == 0)
    {
      return paramInt2;
      i1 = 0;
      break;
    }
    if (this.bp)
    {
      hfg localhfg = (hfg)this.bb;
      lmm locallmm3 = this.aH;
      localhfg.a.clear();
      int i2;
      int i4;
      label124:
      hfm localhfm;
      if (locallmm3 == null)
      {
        i2 = 0;
        if (i2 == 0) {
          break label270;
        }
        localhfg.setVisibility(0);
        int i3 = Math.min(3, i2);
        Context localContext = localhfg.getContext();
        i4 = 0;
        if (i4 >= i3) {
          break label270;
        }
        if (!localhfg.b.isEmpty()) {
          break label254;
        }
        localhfm = new hfm(localContext);
        localhfm.a(3);
      }
      for (;;)
      {
        localhfg.addView(localhfm);
        localhfm.a(locallmm3.c(i4));
        localhfm.a(locallmm3.b(i4), locallmm3.a(i4));
        localhfm.a(locallmm3.d(i4), 0, false);
        localhfm.c(true);
        localhfg.a.add(localhfm);
        i4++;
        break label124;
        i2 = locallmm3.a();
        break;
        label254:
        localhfm = (hfm)localhfg.b.poll();
      }
      label270:
      addView(localhfg);
      localhfg.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      localhfg.setOnClickListener(new eah(this));
      return paramInt2 + localhfg.getMeasuredHeight();
    }
    if (this.w)
    {
      hfk localhfk = (hfk)this.bb;
      lmm locallmm2 = this.aH;
      localhfk.f = locallmm2;
      localhfk.d = 0;
      if ((locallmm2 == null) || (locallmm2.a() <= 0))
      {
        localhfk.e = 0;
        localhfk.setVisibility(8);
      }
      for (;;)
      {
        localhfk.a(t());
        localhfk.setVisibility(0);
        addView(localhfk);
        localhfk.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return paramInt2 + localhfk.getMeasuredHeight();
        localhfk.e = Math.min(3, locallmm2.a());
        localhfk.a(locallmm2, 0);
        localhfk.requestLayout();
        localhfk.setVisibility(0);
      }
    }
    lpm locallpm = (lpm)this.bb;
    lmm locallmm1 = this.aH;
    boolean bool = t();
    locallpm.d();
    locallpm.d = locallmm1;
    locallpm.f = null;
    if ((locallpm.d != null) && (locallpm.d.a() > 0)) {
      paramInt2 += 2 * lwj.a(efj.B(locallpm.getContext(), lpm.a)) + 2 * locallpm.c;
    }
    locallpm.i = bool;
    if (locallpm.i) {
      locallpm.c();
    }
    addView(this.bb);
    return paramInt2;
  }
  
  public Intent b(boolean paramBoolean)
  {
    Intent localIntent;
    if (this.N == null) {
      localIntent = null;
    }
    for (;;)
    {
      return localIntent;
      int i1 = q();
      localIntent = efj.a(getContext().getApplicationContext(), i1, this.N, this.ak, this.z, false);
      if (!TextUtils.isEmpty(this.aR)) {
        localIntent.putExtra("square_id", this.aR);
      }
      if (this.y != null) {}
      try
      {
        localIntent.putExtra("context_specific_data", llr.a(this.y));
        localIntent.putExtra("show_keyboard", paramBoolean);
        localIntent.putExtra("max_span", this.L);
        localIntent.putExtra("scroll_to_last_comment", this.F);
        if (this.u == 0) {
          continue;
        }
        localIntent.putExtra("stream_type", -1 + this.u);
        return localIntent;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          String str = String.valueOf(this.y);
          Log.e("UpdateCardViewGroup", 42 + String.valueOf(str).length() + "Unable to serialize DbContextSpecificData " + str);
        }
      }
    }
  }
  
  public void b()
  {
    super.b();
    if ((lwo.a(this)) && (this.ag != null)) {
      this.ag.b();
    }
  }
  
  public la<Integer, String> g()
  {
    Resources localResources = getResources();
    la localla = new la();
    localla.put(Integer.valueOf(aaw.i), localResources.getString(aau.aN));
    if (this.aG.c) {
      localla.put(Integer.valueOf(aaw.l), localResources.getString(aau.aS));
    }
    for (;;)
    {
      localla.put(Integer.valueOf(aaw.e), localResources.getString(aau.aI));
      localla.put(Integer.valueOf(aaw.m), localResources.getString(aau.aT));
      return localla;
      localla.put(Integer.valueOf(aaw.j), localResources.getString(aau.aP));
    }
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public CharSequence getContentDescription()
  {
    Resources localResources = getResources();
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    int i1;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      if (this.m)
      {
        CharSequence[] arrayOfCharSequence5 = new CharSequence[1];
        arrayOfCharSequence5[0] = this.aA;
        efj.a(localStringBuilder, arrayOfCharSequence5);
        CharSequence[] arrayOfCharSequence6 = new CharSequence[1];
        arrayOfCharSequence6[0] = this.aC;
        efj.a(localStringBuilder, arrayOfCharSequence6);
      }
      if (this.bg != null)
      {
        CharSequence[] arrayOfCharSequence4 = new CharSequence[1];
        arrayOfCharSequence4[0] = this.bg.getContentDescription();
        efj.a(localStringBuilder, arrayOfCharSequence4);
      }
      if (this.bn.getParent() == this)
      {
        CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
        arrayOfCharSequence3[0] = this.bn.getContentDescription();
        efj.a(localStringBuilder, arrayOfCharSequence3);
      }
      if (this.ax != null)
      {
        CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
        arrayOfCharSequence2[0] = this.ax.getText();
        efj.a(localStringBuilder, arrayOfCharSequence2);
      }
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.ab;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      a(localStringBuilder);
      if (this.aF <= 0) {
        break label387;
      }
      i1 = 1;
      label214:
      if (i1 != 0)
      {
        int i6 = efj.xk;
        int i7 = this.aF;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(this.aF);
        localStringBuilder.append(localResources.getQuantityString(i6, i7, arrayOfObject3)).append(". ");
      }
      if (this.aG != null) {
        break label393;
      }
    }
    label387:
    label393:
    for (int i2 = 0;; i2 = this.aG.b)
    {
      if (i2 > 0)
      {
        int i5 = efj.xT;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i2);
        localStringBuilder.append(localResources.getQuantityString(i5, i2, arrayOfObject2));
      }
      if (this.aE > 0)
      {
        int i3 = efj.xY;
        int i4 = this.aE;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.aE);
        localStringBuilder.append(localResources.getQuantityString(i3, i4, arrayOfObject1));
      }
      return mfx.b(localStringBuilder);
      localStringBuilder = new StringBuilder(256);
      break;
      i1 = 0;
      break label214;
    }
  }
  
  protected String h()
  {
    String str = F_();
    if (str == null) {
      return "";
    }
    return getResources().getString(aau.js, new Object[] { str });
  }
  
  protected void i()
  {
    if (this.o != null) {
      this.o.a(this.W);
    }
  }
  
  public final void j()
  {
    this.s = true;
    d(this.M.left, this.M.top, this.I - this.M.left - this.M.right);
    invalidate();
  }
  
  public final void k()
  {
    if (this.p)
    {
      this.ah.setVisibility(0);
      this.ai.setVisibility(8);
    }
    for (;;)
    {
      if ((this.y != null) && (this.y.e != null))
      {
        a(0, this.P);
        invalidate();
      }
      return;
      this.ah.setVisibility(8);
      this.ai.setVisibility(0);
    }
  }
  
  protected final boolean l()
  {
    return this.N != null;
  }
  
  public final void m()
  {
    Context localContext;
    gjb localgjb;
    String str1;
    String str2;
    if (this.aZ == null)
    {
      localContext = getContext();
      localgjb = ((giz)mbb.a(localContext, giz.class)).a(q());
      str1 = localContext.getString(aau.mg);
      if (!localgjb.c("is_default_restricted")) {
        break label200;
      }
      str2 = localContext.getString(aau.pg);
    }
    for (;;)
    {
      ied localied = new ied(q(), pkh.D, str2, str1, 1);
      String str3 = localContext.getString(aau.jk);
      Intent localIntent = iis.b(localContext, q(), efj.a(localContext, "plusone_posts", "https://support.google.com/plus/?hl=%locale%").toString());
      localied.f = str3;
      localied.g = localIntent;
      this.aZ = new TooltipView(localContext);
      this.aZ.a(localied);
      this.aZ.a(1);
      this.aZ.e.add(this);
      addView(this.aZ);
      this.ba.add(this.N);
      this.aZ.sendAccessibilityEvent(8);
      return;
      label200:
      if (localgjb.c("is_child")) {
        str2 = localContext.getString(aau.pf);
      } else {
        str2 = localContext.getString(aau.pe);
      }
    }
  }
  
  public final void n()
  {
    boolean bool1 = true;
    boolean bool2;
    int i1;
    if (this.o != null)
    {
      if ((this.y == null) || (this.y.e == null)) {
        break label68;
      }
      bool2 = bool1;
      if (!bool2) {
        break label73;
      }
      i1 = -3;
      label35:
      if (this.aN) {
        break label79;
      }
    }
    for (;;)
    {
      this.o.a(this.f, this.g, this.N, i1, this.p, bool1);
      return;
      label68:
      bool2 = false;
      break;
      label73:
      i1 = -2;
      break label35;
      label79:
      bool1 = false;
    }
  }
  
  public final void o()
  {
    int i1;
    if (this.o != null)
    {
      if ((this.y == null) || (this.y.e == null)) {
        break label54;
      }
      i1 = 1;
      if (i1 == 0) {
        break label59;
      }
    }
    label54:
    label59:
    for (int i2 = -3;; i2 = -2)
    {
      this.o.b(this.f, this.g, this.N, i2);
      return;
      i1 = 0;
      break;
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.ag)
    {
      hdf localhdf = (hdf)mbb.b(getContext(), hdf.class);
      if (localhdf != null)
      {
        ((gvj)mbb.a(getContext(), gvj.class)).a(this.ag);
        localhdf.a(this.f);
      }
    }
    hee localhee;
    do
    {
      do
      {
        do
        {
          return;
          if (paramView == this.ah)
          {
            n();
            return;
          }
          if (paramView == this.ai)
          {
            o();
            return;
          }
          if (paramView != this.aP) {
            break;
          }
        } while (this.o == null);
        this.o.a(this.aR, this.N);
        return;
      } while (!(paramView instanceof eab));
      if ((efj.B(getContext())) && (this.R == 0))
      {
        ((gil)mbb.a(getContext(), gil.class)).b(this);
        return;
      }
      localhee = (hee)mbb.b(getContext(), hee.class);
    } while (localhee == null);
    localhee.a(this, this);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if ((this.R != 0) || (Build.VERSION.SDK_INT < 21)) {}
    for (;;)
    {
      return;
      la localla = g();
      for (int i1 = 0; i1 < localla.size(); i1++) {
        paramAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(((Integer)localla.b[(i1 << 1)]).intValue(), (CharSequence)localla.b[(1 + (i1 << 1))]));
      }
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    if ((paramView == this.ah) || (paramView == this.ai)) {
      return p();
    }
    return false;
  }
  
  public final boolean p()
  {
    if (this.o != null)
    {
      this.o.a(this.f, this.g, this.N, -2);
      return true;
    }
    return false;
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    return (a(paramInt)) || (super.performAccessibilityAction(paramInt, paramBundle));
  }
  
  protected final int q()
  {
    return ((git)mbb.a(getContext(), git.class)).c();
  }
  
  public final String r()
  {
    return this.N;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eab
 * JD-Core Version:    0.7.0.1
 */