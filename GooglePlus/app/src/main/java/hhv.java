import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.spaces.SpaceHeaderView;
import com.google.android.libraries.social.ui.views.coverphotoimageview.CoverPhotoImageView;
import java.util.ArrayList;
import java.util.List;

public final class hhv
  extends mca
  implements View.OnTouchListener, gpq, gzi, hhm, isi, kxa
{
  private static final RectF ao = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
  ndr[] Z;
  final hwq a = new hwq(this.bp);
  private int aA;
  private MotionEvent aB;
  private ndr aC;
  private ndr aD;
  private ndr aE;
  private final ArgbEvaluator aF = new ArgbEvaluator();
  private final gpk aG = new gpk(this, this.bp, this);
  private final gug aH = new gug(this.bp, (byte)0).a(this.bo).a(ehr.aN, this.as);
  int aa = -1;
  hib[] ab;
  git ac;
  kwz ad;
  SpaceHeaderView ae;
  RecyclerView af;
  hic ag;
  RectF ah = new RectF(ao);
  ipf ai;
  ipf aj;
  ipf ak;
  int al = -1;
  String am;
  gzj an;
  private TextView ap;
  private final cw<Cursor> aq = new hhw(this);
  private final cw<nfn> ar = new hhx(this);
  private final guf as = new hhy(this);
  private hpo at;
  private kxq au;
  private kxi av;
  private TextView aw;
  private ImageButton ax;
  private ImageButton ay;
  private boolean az;
  final isg b = new isg(this.bp);
  CharSequence c;
  hhn d;
  
  public hhv()
  {
    new gxj(this.bp, (byte)0);
  }
  
  private final float a(float paramFloat)
  {
    return Math.min(Math.abs(paramFloat), this.aA) / this.aA;
  }
  
  static int a(ndr paramndr)
  {
    return Color.rgb(paramndr.a.intValue(), paramndr.b.intValue(), paramndr.c.intValue());
  }
  
  public static hhv a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("clx_id", paramString);
    hhv localhhv = new hhv();
    localhhv.f(localBundle);
    return localhhv;
  }
  
  private final ndr a(int paramInt)
  {
    if ((this.Z != null) && (paramInt >= 0)) {
      return this.Z[paramInt];
    }
    return null;
  }
  
  private final int b(boolean paramBoolean)
  {
    int i;
    if ((this.Z == null) || (this.Z.length == 0)) {
      i = -1;
    }
    do
    {
      return i;
      i = this.aa;
      if (paramBoolean) {
        return (i + 1) % this.Z.length;
      }
      if (i == 0) {
        return -1 + this.Z.length;
      }
    } while (i <= 0);
    return i - 1;
  }
  
  private final void x()
  {
    if (!TextUtils.isEmpty(this.c))
    {
      TextView localTextView2 = this.ap;
      int j = aaw.nN;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.c;
      localTextView2.setContentDescription(g().getString(j, arrayOfObject));
      return;
    }
    TextView localTextView1 = this.ap;
    int i = aaw.nT;
    localTextView1.setContentDescription(g().getString(i));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ae = ((SpaceHeaderView)this.au.a(this.bn, paramViewGroup));
    this.ae.b(ehr.aU);
    this.aw = ((TextView)this.ae.e.findViewById(ehr.aO));
    this.ae.setOnTouchListener(this);
    this.ax = ((ImageButton)this.ae.e.findViewById(ehr.aL));
    this.ax.setOnClickListener(new hhz(this));
    this.ay = ((ImageButton)this.ae.e.findViewById(ehr.aJ));
    this.ay.setOnClickListener(new hia(this));
    this.ad.a(this);
    this.ae.a(kxn.c);
    efj.a(this.ae, new gxq(pjn.V));
    if (efj.B(aI_()))
    {
      SpaceHeaderView localSpaceHeaderView = this.ae;
      if (Build.VERSION.SDK_INT >= 19) {
        localSpaceHeaderView.a.setAccessibilityLiveRegion(1);
      }
    }
    if (this.az)
    {
      ScrollView localScrollView = (ScrollView)LayoutInflater.from(this.bn).inflate(ehr.aQ, paramViewGroup, false);
      LinearLayout localLinearLayout2 = (LinearLayout)LayoutInflater.from(this.bn).inflate(ehr.aP, paramViewGroup, false);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      localLinearLayout2.addView(this.ae, 0, localLayoutParams2);
      localScrollView.addView(localLinearLayout2);
      this.af = ((RecyclerView)localLinearLayout2.findViewById(ehr.aF));
      this.af.k = true;
      aew localaew2 = new aew(this.bn);
      localaew2.a(0);
      this.af.a(localaew2);
      this.ap = ((TextView)localScrollView.findViewById(ehr.aA));
      x();
      return localScrollView;
    }
    LinearLayout localLinearLayout1 = (LinearLayout)LayoutInflater.from(this.bn).inflate(ehr.aP, paramViewGroup, false);
    localLinearLayout1.findViewById(ehr.aA).setPadding(0, efj.y(this.bn), 0, this.bn.getResources().getDimensionPixelSize(aau.zh));
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -1, 3.0F);
    localLinearLayout1.addView(this.ae, 0, localLayoutParams1);
    this.af = ((RecyclerView)localLinearLayout1.findViewById(ehr.aF));
    this.af.k = true;
    aew localaew1 = new aew(this.bn);
    localaew1.a(1);
    this.af.a(localaew1);
    this.ap = ((TextView)localLinearLayout1.findViewById(ehr.aA));
    x();
    return localLinearLayout1;
  }
  
  public final void a(Bundle paramBundle)
  {
    int i = 1;
    super.a(paramBundle);
    this.am = this.m.getString("clx_id");
    Resources localResources = this.bn.getResources();
    if (localResources.getConfiguration().orientation == i) {}
    for (;;)
    {
      this.az = i;
      this.aA = localResources.getDimensionPixelSize(aau.yU);
      if (paramBundle != null)
      {
        this.aa = paramBundle.getInt("COLOR_INDEX");
        this.Z = ((ndr[])((hqy)paramBundle.getParcelable("COLORS")).a(ndr.b()));
        if ((this.Z != null) && (this.aa != -1))
        {
          ndr localndr = this.Z[this.aa];
          kwz localkwz = this.ad;
          int j = a(localndr);
          localkwz.a(j, localndr.d, new kxb(localkwz.a, j));
        }
        this.al = paramBundle.getInt("COLOR_INITIAL");
        this.aj = ((ipf)paramBundle.getParcelable("PHOTO_INITIAL"));
        this.ak = ((ipf)paramBundle.getParcelable("SELECTED_USER_PHOTO"));
        this.ah = ((RectF)paramBundle.getParcelable("CROP_COORDINATES"));
        if (paramBundle.containsKey("PHOTO_CURRENT"))
        {
          this.ai = ((ipf)paramBundle.getParcelable("PHOTO_CURRENT"));
          this.c = paramBundle.getCharSequence("SELECTED_PHOTO_DESCRIPTION");
          if (this.ae != null) {
            a(this.ai, this.c);
          }
        }
      }
      return;
      i = 0;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a("");
    paramgpr.b(ehr.aK);
    paramgpr.c(ehr.aK).setEnabled(true);
  }
  
  public final void a(ipf paramipf)
  {
    this.ak = paramipf;
    Intent localIntent = this.at.a(this.ac.c(), this.ak);
    this.aH.a(ehr.aN, localIntent);
  }
  
  final void a(ipf paramipf, CharSequence paramCharSequence)
  {
    CoverPhotoImageView localCoverPhotoImageView = this.ae.a;
    localCoverPhotoImageView.Q = iqr.b;
    localCoverPhotoImageView.f();
    this.c = paramCharSequence;
    x();
    SpaceHeaderView localSpaceHeaderView = this.ae;
    int i = aaw.oF;
    Object[] arrayOfObject = { paramCharSequence };
    String str = g().getString(i, arrayOfObject);
    localSpaceHeaderView.a.setContentDescription(str);
    localSpaceHeaderView.a(paramipf);
    this.aG.a();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("UpdateCollexionCoverPhotoTask".equals(paramString)) {
      if (hae.a(paramhae)) {
        Toast.makeText(this.bn, aaw.nU, 1).show();
      }
    }
    while (!"CropAndSavePhotoTask".equals(paramString))
    {
      return;
      f().finish();
      return;
    }
    hwq localhwq;
    hwt localhwt;
    if (hae.a(paramhae))
    {
      if (Log.isLoggable("CollexionEditHeader", 4))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramhae.d;
        String.format("onBackgroundTaskFinished failed : %s", arrayOfObject);
      }
      Toast.makeText(this.bn, aaw.oG, 1).show();
      localhwq = this.a;
      localhwt = hwt.b;
      if (localhwt == null) {
        throw new NullPointerException();
      }
    }
    else
    {
      ipf localipf = ipf.a(this.bn, (Uri)paramhae.a().getParcelable("image_uri"), ipm.a);
      int i = aaw.oE;
      a(localipf, g().getString(i));
      if (this.ak != null) {
        if (this.ak.d == null) {
          break label223;
        }
      }
      label223:
      for (int j = 1;; j = 0)
      {
        if (j != 0) {
          efj.a(this.ak.d.toString(), this.bn);
        }
        this.ak = null;
        break;
      }
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
  }
  
  public final void a(kxb paramkxb)
  {
    this.aw.setTextColor(paramkxb.e);
    CharSequence localCharSequence = this.ad.d;
    int m;
    if (TextUtils.isEmpty(localCharSequence)) {
      m = aaw.nR;
    }
    int i;
    for (String str1 = g().getString(m);; str1 = String.format(g().getString(i), new Object[] { localCharSequence }))
    {
      this.aw.setContentDescription(str1);
      if (localCharSequence != null)
      {
        TextView localTextView = this.aw;
        String str2 = localCharSequence.toString();
        if (Build.VERSION.SDK_INT >= 16) {
          localTextView.announceForAccessibility(str2);
        }
      }
      ndr localndr1 = a(b(false));
      if (localndr1 != null)
      {
        ImageButton localImageButton2 = this.ax;
        int k = aaw.nP;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localndr1.d;
        localImageButton2.setContentDescription(g().getString(k, arrayOfObject2));
      }
      ndr localndr2 = a(b(true));
      if (localndr2 != null)
      {
        ImageButton localImageButton1 = this.ay;
        int j = aaw.nP;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localndr2.d;
        localImageButton1.setContentDescription(g().getString(j, arrayOfObject1));
      }
      this.aG.a();
      return;
      i = aaw.nQ;
    }
  }
  
  public final void a(tp paramtp) {}
  
  final void a(boolean paramBoolean)
  {
    this.aa = b(paramBoolean);
    ndr localndr = a(this.aa);
    if (localndr == null) {
      return;
    }
    kwz localkwz = this.ad;
    int i = a(localndr);
    localkwz.a(i, localndr.d, new kxb(localkwz.a, i));
    gwz.a(this.ae, 21);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == ehr.aK)
    {
      mbf localmbf = this.bn;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pjn.B);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.bn)).b(localmbf);
      if ((this.aa < 0) || (this.aa > this.Z.length) || (this.ae == null) || (this.ae.a == null)) {}
      ipf localipf;
      int i;
      for (;;)
      {
        return true;
        localipf = this.ae.a.t;
        i = this.ad.b.a;
        if ((i != this.al) || (!efj.c(localipf, this.aj))) {
          break;
        }
        f().finish();
      }
      int j = this.ac.c();
      String str = this.am;
      int k;
      if (i != this.al)
      {
        k = a(this.Z[this.aa]);
        label202:
        if (efj.c(localipf, this.aj)) {
          break label249;
        }
      }
      for (;;)
      {
        hls localhls = new hls(j, str, k, localipf);
        this.an.c(localhls);
        break;
        k = -1;
        break label202;
        label249:
        localipf = null;
      }
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  public final void c(int paramInt)
  {
    if ((paramInt == 2) && ((this.Z == null) || (this.ab == null))) {
      v();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ac = ((git)this.bo.a(git.class));
    this.au = ((kxq)this.bo.a(kxq.class));
    this.ad = new kwz(this.bn);
    this.bo.a(kwz.class, this.ad);
    this.an = ((gzj)this.bo.a(gzj.class));
    this.an.a.add(this);
    this.d = ((hhn)this.bo.a(hhn.class));
    this.at = ((hpo)this.bo.a(hpo.class));
    this.bo.a(isi.class, this);
    this.av = ((kxq)this.bo.a(kxq.class)).a(this.bn).a(f());
    new gxl(new kuu(pjn.x, this.m.getString("clx_id"))).a(this.bo);
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    hwq localhwq = this.a;
    hwt localhwt = hwt.a;
    if (localhwt == null) {
      throw new NullPointerException();
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
    k().a(0, null, this.aq);
    k().a(1, null, this.ar);
  }
  
  public final void d_()
  {
    super.d_();
    this.ae = null;
    this.aw = null;
    this.af = null;
    this.ag = null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("COLOR_INDEX", this.aa);
    paramBundle.putParcelable("COLORS", new hqy(this.Z));
    paramBundle.putInt("COLOR_INITIAL", this.al);
    paramBundle.putParcelable("PHOTO_INITIAL", this.aj);
    if ((this.ae != null) && (this.ae.a != null)) {
      paramBundle.putParcelable("PHOTO_CURRENT", this.ae.a.t);
    }
    paramBundle.putParcelable("SELECTED_USER_PHOTO", this.ak);
    paramBundle.putParcelable("CROP_COORDINATES", this.ah);
    paramBundle.putCharSequence("SELECTED_PHOTO_DESCRIPTION", this.c);
  }
  
  public final void f_()
  {
    super.f_();
    if (this.av != null) {
      this.av.a(null);
    }
  }
  
  public final void m()
  {
    super.m();
    this.d.a(((hho)mbb.a(this.bn, hho.class)).f(), this);
  }
  
  public final void n()
  {
    super.n();
    this.d.b(((hho)mbb.a(this.bn, hho.class)).f(), this);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    label233:
    do
    {
      do
      {
        int n;
        do
        {
          return false;
          if (paramMotionEvent.getY() < this.ae.a.getHeight()) {
            break;
          }
          n = 1;
        } while (n == 0);
        if ((this.Z == null) || (this.aa == -1)) {}
        for (;;)
        {
          return true;
          n = 0;
          break;
          this.aB = MotionEvent.obtain(paramMotionEvent);
          this.aE = a(b(false));
          this.aD = a(this.aa);
          this.aC = a(b(true));
        }
      } while (this.aB == null);
      MotionEvent localMotionEvent2 = this.aB;
      this.aB = null;
      float f3;
      if (this.aD != null)
      {
        f3 = paramMotionEvent.getX() - localMotionEvent2.getX();
        if (a(f3) >= 0.5F) {
          break label233;
        }
        kwz localkwz2 = this.ad;
        int m = a(this.aD);
        localkwz2.a(m, this.aD.d, new kxb(localkwz2.a, m));
      }
      for (;;)
      {
        paramView.performClick();
        return true;
        boolean bool2 = f3 < 0.0F;
        boolean bool3 = false;
        if (bool2) {
          bool3 = true;
        }
        a(bool3);
      }
    } while (this.aB == null);
    MotionEvent localMotionEvent1 = this.aB;
    if ((this.aE == null) || (this.aC == null) || (this.aD == null)) {
      return true;
    }
    float f1 = paramMotionEvent.getX() - localMotionEvent1.getX();
    float f2 = a(f1);
    boolean bool1 = f1 < 0.0F;
    int i = 0;
    if (bool1) {
      i = 1;
    }
    if (i != 0) {}
    for (int j = a(this.aC);; j = a(this.aE))
    {
      int k = ((Integer)this.aF.evaluate(f2, Integer.valueOf(a(this.aD)), Integer.valueOf(j))).intValue();
      kwz localkwz1 = this.ad;
      localkwz1.a(k, null, new kxb(localkwz1.a, k));
      break;
    }
  }
  
  final void v()
  {
    Toast.makeText(this.bn, aaw.oH, 1).show();
    f().finish();
  }
  
  public final void w()
  {
    hwq localhwq = this.a;
    hwt localhwt = hwt.b;
    if (localhwt == null) {
      throw new NullPointerException();
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hhv
 * JD-Core Version:    0.7.0.1
 */