import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.photos.viewer.components.shapes.PhotoShapesLayout;
import com.google.android.apps.plus.service.EsService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class bbf
  extends mca
  implements bbt, bbu, luu
{
  private static int aA;
  private static int aB;
  private static int aC;
  private static boolean aw;
  private static int az;
  AutoCompleteTextView Z;
  List<bbc> a;
  private List<bbc> aD;
  private ImageView aE;
  private boolean aF;
  private int aG;
  private final TextWatcher aH = new bbg(this);
  private final bbw aI = new bbw(this);
  private final bbq aJ = new bbq(this);
  private final bbe aK = new bbe(this);
  private final bbs aL = new bbs(this);
  private final cpe aM = new cpe(this);
  private final bex aN = new bbo(this);
  ImageButton aa;
  bbc ab;
  int ac;
  int ad;
  boolean ae;
  boolean af;
  final Rect ag = new Rect();
  final bbr ah = new bbr(this);
  beu ai;
  bfd aj;
  bbv ak;
  public bdk al;
  bdi am;
  bdm an;
  public Integer ao;
  Long ap;
  PhotoShapesLayout aq;
  public int ar;
  String as;
  boolean at;
  final int[] au = new int[2];
  final Rect av = new Rect();
  private Drawable ax;
  private Drawable ay;
  List<lwu> b;
  List<lwu> c;
  lwu d;
  
  public bbf()
  {
    new bez(this, this.bp, bfi.c, new bbi(this));
    new jeq(this.bp, new bbj(this), '\000');
    new jeq(this.bp, new bbk(this));
  }
  
  private final void z()
  {
    if ((this.aD != null) && (!this.aD.isEmpty()))
    {
      bbc localbbc = (bbc)this.aD.get(0);
      this.aF = true;
      localbbc.G = true;
    }
    this.ae = false;
    y();
  }
  
  public final int a(ojm[] paramArrayOfojm, String paramString)
  {
    this.a.clear();
    bdm localbdm1 = this.an;
    localbdm1.c.clear();
    localbdm1.a.a();
    this.ab = null;
    a(0);
    this.aD = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i;
    ojm localojm;
    int j;
    int k;
    label108:
    int i13;
    label122:
    int i14;
    label135:
    int i15;
    label149:
    int m;
    label157:
    int i12;
    if (paramArrayOfojm != null)
    {
      i = -1 + paramArrayOfojm.length;
      if (i >= 0)
      {
        localojm = paramArrayOfojm[i];
        j = localojm.c;
        if (j == 1)
        {
          k = 1;
          if (k == 0)
          {
            if (j != 3) {
              break label1057;
            }
            i13 = 1;
            if (i13 == 0)
            {
              if (j != 0) {
                break label1063;
              }
              i14 = 1;
              if (i14 == 0)
              {
                if (j != 4) {
                  break label1069;
                }
                i15 = 1;
                if (i15 == 0) {
                  break label1075;
                }
              }
            }
          }
          m = 1;
          if (m != 0)
          {
            if (localojm.b == null) {
              break label1587;
            }
            if (j != 0) {
              break label1081;
            }
            i12 = 1;
            label178:
            if ((i12 == 0) || (this.as.equals(localojm.b.b))) {
              break label1587;
            }
            localojm.c = 1;
          }
        }
      }
    }
    label684:
    label1069:
    label1457:
    label1587:
    for (int n = localojm.c;; n = j)
    {
      bbc localbbc;
      PhotoShapesLayout localPhotoShapesLayout;
      Resources localResources;
      Long localLong;
      label609:
      ojv localojv;
      String str1;
      String str2;
      label692:
      String str3;
      label717:
      String str4;
      label735:
      String str5;
      label751:
      int i1;
      if (localojm.e != null)
      {
        localbbc = new bbc();
        localPhotoShapesLayout = this.aq;
        localResources = localPhotoShapesLayout.getContext().getResources();
        if (bbc.a == null)
        {
          bbc.a = localResources.getDrawable(efj.pL);
          bbc.b = localResources.getDrawable(efj.pT);
          bbc.e = localResources.getDrawable(efj.pN);
          bbc.f = localResources.getDrawable(efj.pP);
          bbc.c = localResources.getDrawable(efj.pM);
          bbc.d = localResources.getDrawable(efj.pU);
          bbc.g = localResources.getDrawable(efj.qF);
          bbc.h = localResources.getDrawable(efj.pO);
          bbc.i = localResources.getDimensionPixelOffset(efj.mU);
          bbc.l = localResources.getDimensionPixelOffset(efj.mQ);
          bbc.m = localResources.getDimensionPixelOffset(efj.mW);
          Paint localPaint1 = new Paint();
          bbc.j = localPaint1;
          localPaint1.setColor(localResources.getColor(17170444));
          bbc.j.setStyle(Paint.Style.STROKE);
          bbc.j.setStrokeWidth(bbc.l);
          Paint localPaint2 = new Paint();
          bbc.k = localPaint2;
          localPaint2.setColor(localResources.getColor(17170443));
          bbc.k.setStyle(Paint.Style.STROKE);
          bbc.k.setStrokeWidth(bbc.m);
          bbc.n = localResources.getDimensionPixelOffset(efj.mV);
        }
        localbbc.o = duc.a(localPhotoShapesLayout.getContext(), localResources.getString(aau.nW), 8, 0, 0, localbbc);
        localbbc.p = duc.a(localPhotoShapesLayout.getContext(), localResources.getString(aau.nV), 9, 0, 0, localbbc);
        localbbc.q = localbbc.o.a.width();
        localbbc.r = localbbc.p.a.width();
        Bitmap localBitmap = BitmapFactory.decodeResource(localResources, efj.pV);
        localbbc.s = duc.a(localPhotoShapesLayout.getContext(), localBitmap, 0, 0, 6, localbbc, "content-descript", false);
        if (localojm.a != null) {
          break label1087;
        }
        localLong = null;
        localbbc.C = localLong;
        localbbc.F = localojm.e;
        localbbc.J = localojm.c;
        ojv[] arrayOfojv = localojm.g;
        localojv = null;
        if (arrayOfojv != null)
        {
          int i11 = localojm.g.length;
          localojv = null;
          if (i11 != 0) {
            localojv = localojm.g[0];
          }
        }
        if (localojv != null) {
          break label1103;
        }
        str1 = null;
        if (localojv != null) {
          break label1113;
        }
        str2 = null;
        localbbc.M = str2;
        if (localojm.b == null) {
          break label1123;
        }
        str3 = localojm.b.c;
        if (localojm.b == null) {
          break label1129;
        }
        str4 = localojm.b.b;
        localbbc.D = str4;
        if (str3 == null) {
          break label1135;
        }
        str5 = str3;
        localbbc.E = str5;
        if (localbbc.J != 3) {
          break label1142;
        }
        i1 = 1;
        if (i1 == 0) {
          break label1148;
        }
        if (!localbbc.M.equals(paramString)) {
          break label1580;
        }
      }
      for (String str7 = localResources.getString(aau.nE);; str7 = str1)
      {
        localbbc.x = bbc.b;
        localbbc.y = duc.a(localPhotoShapesLayout.getContext(), str7, 7, 0, 0, null);
        label825:
        int i5;
        label837:
        int i10;
        label854:
        boolean bool;
        label884:
        int i6;
        if (localbbc.J == 1)
        {
          i5 = 1;
          if (i5 == 0)
          {
            if (localbbc.J != 4) {
              break label1338;
            }
            i10 = 1;
            if (i10 == 0) {
              break label1344;
            }
          }
          if ((!localojm.h.booleanValue()) && (!localojm.i.booleanValue())) {
            break label1344;
          }
          bool = true;
          localbbc.N = bool;
          localbbc.t = new Rect();
          localbbc.u = new Rect();
          localbbc.v = new Rect();
          localbbc.K = new Point();
          localbbc.w = new Rect();
          if (n != 1) {
            break label1350;
          }
          i6 = 1;
          label960:
          if (i6 == 0) {
            break label1356;
          }
          if ((localojm.b != null) && (!TextUtils.isEmpty(localojm.b.c)))
          {
            bdm localbdm2 = this.an;
            String str6 = localojm.b.b;
            localbdm2.c.add(str6);
            localbdm2.a.a();
            localArrayList1.add(localbbc);
          }
        }
        label1075:
        label1081:
        label1087:
        label1103:
        label1489:
        for (;;)
        {
          localbbc.z = this.aK;
          i--;
          break;
          k = 0;
          break label108;
          i13 = 0;
          break label122;
          i14 = 0;
          break label135;
          i15 = 0;
          break label149;
          m = 0;
          break label157;
          i12 = 0;
          break label178;
          localLong = Long.valueOf(Long.parseLong(localojm.a));
          break label609;
          str1 = localojv.c;
          break label684;
          label1113:
          str2 = localojv.b;
          break label692;
          label1123:
          str3 = null;
          break label717;
          label1129:
          str4 = null;
          break label735;
          label1135:
          str5 = str1;
          break label751;
          label1142:
          i1 = 0;
          break label770;
          label1148:
          if (localbbc.J == 0) {}
          for (int i2 = 1;; i2 = 0)
          {
            if (i2 == 0) {
              break label1223;
            }
            if (localbbc.D.equals(paramString)) {
              str3 = localResources.getString(aau.nE);
            }
            localbbc.x = bbc.b;
            localbbc.y = duc.a(localPhotoShapesLayout.getContext(), str3, 7, 0, 0, null);
            break;
          }
          if (localbbc.J == 4) {}
          for (int i3 = 1;; i3 = 0)
          {
            if (i3 == 0) {
              break label1263;
            }
            localbbc.x = bbc.b;
            localbbc.y = null;
            break;
          }
          label1263:
          if (localbbc.J == 1) {}
          for (int i4 = 1;; i4 = 0)
          {
            if (i4 == 0) {
              break label1317;
            }
            localbbc.x = bbc.a;
            localbbc.y = duc.a(localPhotoShapesLayout.getContext(), str3, 6, 0, 0, null);
            break;
          }
          localbbc.x = null;
          localbbc.y = null;
          break label825;
          i5 = 0;
          break label837;
          i10 = 0;
          break label854;
          bool = false;
          break label884;
          i6 = 0;
          break label960;
          if (n == 3) {}
          for (int i7 = 1;; i7 = 0)
          {
            if (i7 == 0) {
              break label1424;
            }
            if ((localojm.g == null) || (localojm.g.length == 0) || (TextUtils.isEmpty(localojm.g[0].c))) {
              break label1045;
            }
            this.aD.add(localbbc);
            break;
          }
          if (n == 4) {}
          for (int i8 = 1;; i8 = 0)
          {
            if (i8 == 0) {
              break label1457;
            }
            localArrayList2.add(localbbc);
            break;
          }
          if (n == 0) {}
          for (int i9 = 1;; i9 = 0)
          {
            if (i9 == 0) {
              break label1489;
            }
            this.aD.add(localbbc);
            break;
          }
        }
        label1223:
        label1356:
        this.a.addAll(this.aD);
        label1338:
        label1344:
        label1350:
        this.a.addAll(localArrayList1);
        this.a.addAll(localArrayList2);
        this.aF = false;
        if (!this.aD.isEmpty())
        {
          this.aF = true;
          a(1);
        }
        this.aq.requestLayout();
        this.aq.invalidate();
        return this.a.size();
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.vP, paramViewGroup, false);
    if (localView == null) {
      throw new IllegalArgumentException("view must not be null");
    }
    Resources localResources = g();
    this.aq = ((PhotoShapesLayout)localView);
    this.aq.a = this;
    this.aq.b = this;
    this.aq.setOnTouchListener(this.aL);
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = new ArrayList();
    this.Z = ((AutoCompleteTextView)localView.findViewById(aaw.lm));
    this.Z.setAdapter(this.ak.c());
    this.Z.addTextChangedListener(this.aH);
    this.Z.setOnItemClickListener(new bbl(this));
    this.ax = localResources.getDrawable(efj.pN);
    this.ay = localResources.getDrawable(efj.pO);
    this.Z.setBackgroundDrawable(localResources.getDrawable(efj.pS));
    this.ad = 0;
    this.Z.setVisibility(8);
    this.aE = ((ImageView)localView.findViewById(aaw.jK));
    this.aE.setBackgroundDrawable(this.ax);
    this.aa = ((ImageButton)localView.findViewById(aaw.lY));
    this.aa.setOnClickListener(new bbm(this));
    if (!aw)
    {
      az = localResources.getDimensionPixelOffset(efj.mT);
      aA = localResources.getDimensionPixelOffset(efj.mS);
      aB = localResources.getDimensionPixelOffset(efj.mR);
      aC = localResources.getDimensionPixelOffset(efj.mU);
      aw = true;
    }
    return localView;
  }
  
  public final bbc a(Long paramLong)
  {
    for (int i = -1 + this.a.size(); i >= 0; i--)
    {
      bbc localbbc = (bbc)this.a.get(i);
      if ((localbbc.C != null) && (localbbc.C.equals(paramLong))) {
        return localbbc;
      }
    }
    return null;
  }
  
  final void a(int paramInt)
  {
    int i = 8;
    int i1;
    label53:
    int i2;
    label77:
    ImageButton localImageButton;
    switch (paramInt)
    {
    default: 
      AutoCompleteTextView localAutoCompleteTextView = this.Z;
      if (this.ad != 3)
      {
        i1 = i;
        localAutoCompleteTextView.setVisibility(i1);
        ImageView localImageView = this.aE;
        if (this.ad == 3) {
          break label772;
        }
        i2 = i;
        localImageView.setVisibility(i2);
        localImageButton = this.aa;
        if (this.ad == 3) {
          break label778;
        }
      }
      break;
    }
    for (;;)
    {
      localImageButton.setVisibility(i);
      do
      {
        do
        {
          return;
          z();
          if (this.aF)
          {
            this.ad = 0;
            a(1);
            break;
          }
          int i5 = this.ad;
          if (i5 == 1) {
            i5 = 0;
          }
          this.aG = i5;
          this.ad = paramInt;
          break;
          z();
        } while (this.ad != 0);
        int i4 = this.ad;
        if (i4 == 1) {
          i4 = 0;
        }
        this.aG = i4;
        this.ad = paramInt;
        break;
        if (this.ad == 3) {
          this.ah.b();
        }
        int i3 = this.ad;
        if (i3 == 1) {
          i3 = 0;
        }
        this.aG = i3;
        this.ad = paramInt;
        z();
        break;
      } while ((this.ad == 3) || (this.ad == 0));
      int j = this.ad;
      if (j == 1) {
        j = 0;
      }
      this.aG = j;
      this.ad = paramInt;
      this.aq.removeView(this.Z);
      this.aq.removeView(this.aE);
      this.aq.removeView(this.aa);
      this.aq.addView(this.Z);
      this.aq.addView(this.aE);
      if (this.ab.N)
      {
        this.aq.addView(this.aa);
        this.aa.setTag(aaw.lj, this.ab.C);
      }
      ArrayList localArrayList = new ArrayList(this.a.size());
      for (int k = -1 + this.a.size(); k >= 0; k--)
      {
        bbc localbbc = (bbc)this.a.get(k);
        if (this.ab != localbbc) {
          localbbc.G = false;
        }
        if (localbbc.D != null) {
          localArrayList.add(localbbc.D);
        }
      }
      ((clc)this.Z.getAdapter()).a(localArrayList);
      oji localoji = this.ab.F;
      float f1 = this.ag.width();
      float f2 = this.ag.height();
      float f3 = f1 * localoji.a.floatValue() + this.ag.left;
      float f4 = f1 * localoji.b.floatValue() + this.ag.left;
      float f5 = f2 * localoji.c.floatValue() + this.ag.top;
      float f6 = f2 * localoji.d.floatValue() + this.ag.top;
      int m = Math.round(f3 + (f4 - f3) / 2.0F);
      int n = Math.round(f5 + (f6 - f5) / 2.0F);
      this.ab.K.set(m, n);
      this.Z.setText(null);
      this.Z.setVisibility(0);
      efj.m().postDelayed(new bbh(this), 150L);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, this.ar);
      localgxw.d = gya.ad;
      localgxw.e = gya.ae;
      localgxx.a(localgxw);
      this.aq.requestLayout();
      this.aq.invalidate();
      if (this.ah == null) {
        break;
      }
      this.ah.a();
      break;
      i1 = 0;
      break label53;
      label772:
      i2 = 0;
      break label77;
      label778:
      i = 0;
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Canvas paramCanvas)
  {
    int i = 1;
    int j;
    if ((this.at) && (this.al.d))
    {
      if (this.ad != 0) {
        break label33;
      }
      j = i;
      if (j == 0) {
        break label38;
      }
    }
    label33:
    label38:
    label169:
    for (;;)
    {
      return;
      j = 0;
      break;
      if (i == this.ad) {}
      for (int k = i;; k = 0)
      {
        if ((k == 0) || (this.aD == null) || (this.aD.isEmpty())) {
          break label112;
        }
        bbc localbbc = (bbc)this.aD.get(0);
        if (!efj.b(localbbc.J)) {
          break;
        }
        localbbc.a(paramCanvas);
        return;
      }
      label112:
      if (2 == this.ad) {}
      for (;;)
      {
        if (i == 0) {
          break label169;
        }
        for (int m = -1 + this.a.size(); m >= 0; m--) {
          ((bbc)this.a.get(m)).a(paramCanvas);
        }
        break;
        i = 0;
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ar = this.m.getInt("account_id", -1);
    this.as = ((giz)this.bo.a(giz.class)).a(this.ar).b("gaia_id");
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    boolean bool;
    if ("pouf_delete_shape".equals(paramString))
    {
      String str5 = this.m.getString("view_id");
      bcp localbcp = this.al.b;
      Context localContext = f().getApplicationContext();
      int i = this.ar;
      long l3 = localbcp.o();
      String str6 = localbcp.j();
      long l4 = paramBundle.getLong("shape_id");
      String str7 = localbcp.k();
      if (!paramBundle.getBoolean("permanent_delete"))
      {
        bool = true;
        this.ao = Integer.valueOf(EsService.a(localContext, i, l3, str6, l4, str5, str7, bool));
        bz localbz = this.x;
        coo.a(null, f().getString(aau.po), false, false).a(localbz, "ProgressDialogHelper:progress_dialog");
      }
    }
    do
    {
      return;
      bool = false;
      break;
      if ("pouf_create_shape_and_share".equals(paramString))
      {
        long l2 = paramBundle.getLong("shape_id");
        RectF localRectF = (RectF)paramBundle.getParcelable("bounds");
        String str2 = paramBundle.getString("taggee_name");
        String str3 = paramBundle.getString("taggee_email");
        String str4 = paramBundle.getString("taggee_gaia_id");
        if (l2 != 0L)
        {
          this.aM.a(l2, str2, str3, str4);
          return;
        }
        this.aM.a(localRectF, str2, str3, str4);
        return;
      }
    } while (!"pouf_accept_shape_and_share".equals(paramString));
    long l1 = paramBundle.getLong("shape_id");
    String str1 = paramBundle.getString("taggee_gaia_id");
    this.aM.a(l1, str1);
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ai = ((beu)this.bo.a(beu.class));
    this.aj = ((bfd)this.bo.a(bfd.class));
    this.ak = ((bbv)this.bo.a(bbv.class));
    this.al = ((bdk)this.bo.a(bdk.class));
    this.am = ((bdi)this.bo.a(bdi.class));
    this.an = ((bdm)this.bo.a(bdm.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d_()
  {
    super.d_();
    this.aq = null;
    this.b = null;
    this.c = null;
    if (this.a == null) {
      return;
    }
    this.a = null;
    this.Z.setAdapter(null);
  }
  
  public final void m()
  {
    super.m();
    this.ai.a(this.aN);
    this.ak.a(this.aI);
    EsService.a(this.bn, this.aJ);
  }
  
  public final void n()
  {
    super.n();
    this.ai.b(this.aN);
    this.ak.b(this.aI);
    bbq localbbq = this.aJ;
    EsService.d.remove(localbbq);
  }
  
  public final void v()
  {
    int i;
    Rect localRect1;
    int k;
    label50:
    int i2;
    int i4;
    int i5;
    Rect localRect2;
    int i6;
    if (3 == this.ad)
    {
      i = 1;
      if (i != 0)
      {
        localRect1 = this.ab.t;
        int j = localRect1.left + localRect1.width() / 2;
        if (!this.ab.H) {
          break label317;
        }
        k = localRect1.bottom;
        int m = this.ax.getIntrinsicWidth();
        int n = this.ax.getIntrinsicHeight();
        this.aE.layout(j - m / 2, k, j + m / 2, k + n);
        int i1 = localRect1.left + localRect1.width() / 2;
        i2 = localRect1.top;
        int i3 = i1 - az / 2;
        i4 = i1 + az / 2;
        i5 = i2 + aA;
        localRect2 = new Rect(i3, i2, i4, i5);
        if (i3 >= aB) {
          break label326;
        }
        i6 = aB - i3;
      }
    }
    for (;;)
    {
      label174:
      int i7;
      if (i2 < 0) {
        i7 = aB - i2;
      }
      for (;;)
      {
        label187:
        localRect2.offset(i6, i7);
        int i8 = this.ax.getIntrinsicHeight();
        if (this.ab.H) {}
        for (int i9 = localRect2.top + aC;; i9 = i8 + localRect2.top - aC)
        {
          this.Z.layout(localRect2.left, i9, localRect2.right, i9 + localRect2.height());
          int i10 = localRect2.right - this.aa.getMeasuredWidth() - aC;
          int i11 = i9 + aC;
          this.aa.layout(i10, i11, i10 + this.aa.getMeasuredWidth(), i11 + this.aa.getMeasuredHeight());
          return;
          i = 0;
          break;
          label317:
          k = localRect1.top;
          break label50;
          label326:
          if (i4 <= this.aq.getMeasuredWidth()) {
            break label411;
          }
          i6 = this.aq.getMeasuredWidth() - i4 - aB;
          break label174;
          if (i5 <= this.aq.getMeasuredHeight()) {
            break label405;
          }
          i7 = this.aq.getMeasuredHeight() - i5 - aB;
          break label187;
        }
        label405:
        i7 = 0;
      }
      label411:
      i6 = 0;
    }
  }
  
  public final void w()
  {
    if (!this.a.isEmpty()) {
      a(2);
    }
  }
  
  public final void x()
  {
    if (3 != this.ad) {
      return;
    }
    this.aq.removeView(this.Z);
    this.aq.removeView(this.aE);
    this.aq.removeView(this.aa);
    this.ab.G = false;
    this.Z.setVisibility(8);
    z();
    int i = this.a.indexOf(this.ab);
    if (i >= 0) {
      this.a.add(-1 + this.a.size(), this.a.remove(i));
    }
    this.ab = null;
    a(this.aG);
    if (this.ah != null) {
      this.ah.b();
    }
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, this.ar);
    localgxw.d = gya.ae;
    localgxw.e = gya.ad;
    localgxx.a(localgxw);
    ((clc)this.Z.getAdapter()).a(null);
    this.aq.invalidate();
  }
  
  final void y()
  {
    if (this.aq == null) {
      return;
    }
    if (this.d != null) {
      this.d.a(false);
    }
    this.b.clear();
    this.c.clear();
    int i = this.a.size();
    int j = 0;
    if (j < i)
    {
      bbc localbbc3 = (bbc)this.a.get(j);
      this.b.remove(localbbc3);
      this.c.remove(localbbc3);
      oji localoji = localbbc3.F;
      float f1 = this.ag.width();
      float f2 = this.ag.height();
      float f3 = f1 * localoji.a.floatValue() + this.ag.left;
      int i3 = Math.round(f3 + (f1 * localoji.b.floatValue() + this.ag.left - f3) / 2.0F);
      int i4 = Math.round(f2 * localoji.c.floatValue() + this.ag.top);
      int i5 = Math.round(f2 * localoji.d.floatValue() + this.ag.top);
      int i6 = this.aq.getMeasuredHeight() - 2 * this.ac;
      int i7;
      label288:
      int i54;
      label316:
      int i55;
      int i56;
      int i10;
      int i11;
      int i35;
      label427:
      label458:
      int i36;
      label570:
      int i38;
      label604:
      int i19;
      label1095:
      int i20;
      label1111:
      Drawable localDrawable;
      if (localbbc3.G) {
        if (efj.b(localbbc3.J))
        {
          i7 = localbbc3.u.height() + localbbc3.o.a.height();
          int i8 = i6 - i7;
          int i9 = 0;
          if (i5 > i8)
          {
            if (3 != this.ad) {
              break label1195;
            }
            i54 = 1;
            i9 = 0;
            if (i54 == 0)
            {
              i55 = i5 - i4;
              if (0.0F <= 1.0F) {
                break label1201;
              }
              i56 = localbbc3.I;
              i5 = i56 + i4;
              i9 = 1;
            }
          }
          i10 = Math.round(this.ag.left);
          i11 = Math.round(this.ag.right);
          if (i9 == 0) {
            break label1328;
          }
          int i34 = aB;
          localbbc3.H = true;
          localbbc3.A = i3;
          localbbc3.B = i5;
          if (localbbc3.J != 1) {
            break label1273;
          }
          i35 = 1;
          if (i35 == 0) {
            break label1279;
          }
          localbbc3.a(localbbc3.A, localbbc3.B, bbc.h);
          localbbc3.x = bbc.c;
          if (localbbc3.x != null)
          {
            int i50 = localbbc3.A - localbbc3.x.getIntrinsicWidth() / 2;
            int i51 = localbbc3.B;
            int i52 = i50 + localbbc3.x.getIntrinsicWidth();
            int i53 = localbbc3.B + localbbc3.x.getIntrinsicHeight();
            localbbc3.t.set(i50, i51, i52, i53);
          }
          if (!efj.b(localbbc3.J)) {
            break label1308;
          }
          i36 = localbbc3.B + bbc.i - localbbc3.o.a.height();
          int i37 = localbbc3.q + localbbc3.r;
          if (!localbbc3.N) {
            break label1322;
          }
          i38 = localbbc3.s.a.width();
          if (localbbc3.y != null)
          {
            if (i37 > localbbc3.y.a.width()) {
              localbbc3.y.a(i37);
            }
            int i45 = localbbc3.A - localbbc3.y.a.width() / 2;
            localbbc3.w.set(i45, i36 - localbbc3.y.a.height(), i38 + (i45 + localbbc3.y.a.width()), i36);
            localbbc3.w = bbc.a(localbbc3.w, i34, i10, i11, localbbc3.v);
            int i46 = localbbc3.w.left;
            int i47 = localbbc3.w.top;
            int i48 = localbbc3.w.right - i38;
            int i49 = localbbc3.w.bottom;
            localbbc3.u.set(i46, i47, i48, i49);
          }
          if (efj.b(localbbc3.J))
          {
            int i41 = localbbc3.B + bbc.i;
            int i42 = localbbc3.w.left;
            localbbc3.o.a(localbbc3.q);
            localbbc3.p.a(localbbc3.r);
            int i43 = localbbc3.y.a.width() - (localbbc3.q + localbbc3.r);
            if (i43 > 0)
            {
              localbbc3.o.a(localbbc3.q + i43 / 2);
              localbbc3.p.a(localbbc3.r + i43 / 2);
            }
            localbbc3.o.a.set(i42, i41 - localbbc3.o.a.height(), i42 + localbbc3.o.a.width(), i41);
            int i44 = localbbc3.o.a.right;
            localbbc3.p.a.set(i44, i41 - localbbc3.p.a.height(), i44 + localbbc3.p.a.width(), i41);
          }
          if (localbbc3.y != null)
          {
            int i39 = localbbc3.u.right - bbc.i;
            int i40 = localbbc3.u.top;
            localbbc3.s.a.set(i39, i40, i39 + localbbc3.s.a.width(), i40 + localbbc3.s.a.height());
          }
          if (localbbc3.J != 4) {
            break label2066;
          }
          i19 = 1;
          if (i19 != 0)
          {
            if (3 != this.ad) {
              break label2072;
            }
            i20 = 1;
            if (i20 != 0)
            {
              ImageView localImageView = this.aE;
              if (i9 == 0) {
                break label2078;
              }
              localDrawable = this.ay;
              label1133:
              localImageView.setBackgroundDrawable(localDrawable);
            }
          }
          if (!efj.b(localbbc3.J)) {
            break label2087;
          }
          this.c.add(localbbc3);
        }
      }
      for (;;)
      {
        j++;
        break;
        i7 = localbbc3.u.height();
        break label288;
        i7 = localbbc3.t.height();
        break label288;
        label1195:
        i54 = 0;
        break label316;
        label1201:
        float f4 = i55 / this.aq.getMeasuredHeight();
        double d1;
        if (f4 > 0.85D) {
          d1 = 0.4D;
        }
        for (;;)
        {
          i56 = (int)(d1 * i55);
          localbbc3.I = i56;
          break;
          if (f4 > 0.6D) {
            d1 = 0.25D;
          } else {
            d1 = 0.0D;
          }
        }
        label1273:
        i35 = 0;
        break label427;
        label1279:
        localbbc3.a(localbbc3.A, localbbc3.B, bbc.g);
        localbbc3.x = bbc.d;
        break label458;
        label1308:
        i36 = localbbc3.B + bbc.i;
        break label570;
        label1322:
        i38 = 0;
        break label604;
        label1328:
        int i12 = aB;
        localbbc3.H = false;
        localbbc3.A = i3;
        localbbc3.B = i5;
        localbbc3.L = bbc.e;
        int i13;
        label1373:
        label1404:
        int i14;
        int i15;
        if (localbbc3.J == 1)
        {
          i13 = 1;
          if (i13 == 0) {
            break label2031;
          }
          localbbc3.a(localbbc3.A, localbbc3.B, bbc.e);
          localbbc3.x = bbc.a;
          if (localbbc3.x != null)
          {
            int i30 = localbbc3.A - localbbc3.x.getIntrinsicWidth() / 2;
            int i31 = localbbc3.B;
            int i32 = i30 + localbbc3.x.getIntrinsicWidth();
            int i33 = localbbc3.B + localbbc3.x.getIntrinsicHeight();
            localbbc3.t.set(i30, i31, i32, i33);
          }
          i14 = localbbc3.B + localbbc3.L.getIntrinsicHeight() - bbc.i;
          i15 = localbbc3.q + localbbc3.r;
          if (!localbbc3.N) {
            break label2060;
          }
        }
        label2060:
        for (int i16 = localbbc3.s.a.width();; i16 = 0)
        {
          if (localbbc3.y != null)
          {
            if (i15 > localbbc3.y.a.width()) {
              localbbc3.y.a(i15);
            }
            int i25 = localbbc3.A - localbbc3.y.a.width() / 2;
            localbbc3.w.set(i25, i14, i16 + (i25 + localbbc3.y.a.width()), i14 + localbbc3.y.a.height());
            localbbc3.w = bbc.a(localbbc3.w, i12, i10, i11, localbbc3.v);
            int i26 = localbbc3.w.left;
            int i27 = localbbc3.w.top;
            int i28 = localbbc3.w.right - i16;
            int i29 = localbbc3.w.bottom;
            localbbc3.u.set(i26, i27, i28, i29);
          }
          if ((efj.b(localbbc3.J)) && (localbbc3.G))
          {
            localbbc3.o.a(localbbc3.q);
            localbbc3.p.a(localbbc3.r);
            int i21 = localbbc3.w.width() - (localbbc3.q + localbbc3.r);
            if (i21 > 0)
            {
              localbbc3.o.a(localbbc3.q + i21 / 2);
              localbbc3.p.a(localbbc3.r + i21 / 2);
            }
            int i22 = localbbc3.w.bottom;
            int i23 = localbbc3.w.left;
            localbbc3.o.a.set(i23, i22, i23 + localbbc3.o.a.width(), i22 + localbbc3.o.a.height());
            int i24 = i23 + localbbc3.o.a.width();
            localbbc3.p.a.set(i24, i22, i24 + localbbc3.p.a.width(), i22 + localbbc3.p.a.height());
          }
          if (localbbc3.y == null) {
            break;
          }
          int i17 = localbbc3.u.right - bbc.i;
          int i18 = localbbc3.u.top;
          localbbc3.s.a.set(i17, i18, i17 + localbbc3.s.a.width(), i18 + localbbc3.s.a.height());
          break;
          i13 = 0;
          break label1373;
          label2031:
          localbbc3.a(localbbc3.A, localbbc3.B, bbc.f);
          localbbc3.x = bbc.b;
          break label1404;
        }
        label2066:
        i19 = 0;
        break label1095;
        label2072:
        i20 = 0;
        break label1111;
        label2078:
        localDrawable = this.ax;
        break label1133;
        label2087:
        this.b.add(localbbc3);
      }
    }
    SparseBooleanArray localSparseBooleanArray = new SparseBooleanArray(i);
    int k = 0;
    int m = 0;
    bbc localbbc1;
    int i1;
    label2166:
    int i2;
    label2184:
    bbc localbbc2;
    label2260:
    boolean bool2;
    label2273:
    Boolean localBoolean;
    boolean bool3;
    label2288:
    int n;
    if (m < i)
    {
      localbbc1 = (bbc)this.a.get(m);
      if ((this.ae) || (this.ad != 2)) {
        break label2404;
      }
      if (localbbc1.J == 4)
      {
        i1 = 1;
        if ((i1 != 0) || (localbbc1.J == 100)) {
          break label2404;
        }
        i2 = 0;
        if (i2 < i)
        {
          localbbc1.G = false;
          if ((m == i2) || (localSparseBooleanArray.get(m, false))) {
            break label2359;
          }
          localbbc2 = (bbc)this.a.get(i2);
          if ((!localbbc2.G) || (!Rect.intersects(localbbc1.d(), localbbc2.d()))) {
            break label2333;
          }
          localSparseBooleanArray.put(m, true);
        }
        if (localSparseBooleanArray.get(m, false)) {
          break label2365;
        }
        bool2 = true;
        localBoolean = Boolean.valueOf(bool2);
        if (localBoolean != null) {
          break label2371;
        }
        bool3 = false;
        if (!bool3) {
          break label2381;
        }
        localbbc1.G = true;
        n = k;
      }
    }
    for (;;)
    {
      label2303:
      if (n == 0) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        this.af = bool1;
        m++;
        k = n;
        break;
        i1 = 0;
        break label2166;
        label2333:
        if (Rect.intersects(localbbc1.d(), localbbc2.t))
        {
          localSparseBooleanArray.put(m, true);
          break label2260;
        }
        label2359:
        i2++;
        break label2184;
        label2365:
        bool2 = false;
        break label2273;
        label2371:
        bool3 = localBoolean.booleanValue();
        break label2288;
        label2381:
        n = k + 1;
        break label2303;
      }
      this.aq.invalidate();
      return;
      label2404:
      n = k;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbf
 * JD-Core Version:    0.7.0.1
 */