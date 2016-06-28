import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.social.help.TooltipView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;

public final class juo
  extends mca
  implements juw, luu
{
  static int af;
  private static Drawable ai;
  private static boolean aj;
  private static String[] aw;
  MediaView Z;
  MentionMultiAutoCompleteTextView a;
  MediaView aa;
  View ab;
  juz ac;
  int ad = -1;
  boolean ae = false;
  int ag;
  private View ah;
  private View ak;
  private View al;
  private View am;
  private View an;
  private EditText ao;
  private EditText ap;
  private View aq;
  private LinearLayout ar;
  private ArrayList<View> as = new ArrayList();
  private List<kip> at;
  private juu au = new juu(this);
  private gzj av;
  private lut ax;
  private git ay;
  private final View.OnClickListener az = new juq(this);
  MediaView b;
  ImageView c;
  MediaView d;
  
  private final MediaView a(View paramView, int paramInt1, gxt paramgxt, int paramInt2)
  {
    MediaView localMediaView = (MediaView)b(paramView, paramInt1, paramgxt, paramInt2);
    localMediaView.r = ai;
    return localMediaView;
  }
  
  private static void a(MediaView paramMediaView, ipf paramipf)
  {
    if ((paramMediaView.t != null) && (paramMediaView.t.equals(paramipf))) {
      return;
    }
    paramMediaView.a(paramipf);
  }
  
  private <T extends View> T b(View paramView, int paramInt1, gxt paramgxt, int paramInt2)
  {
    View localView = paramView.findViewById(paramInt1);
    if (paramInt2 == -1) {}
    for (Object localObject = new gxq(paramgxt);; localObject = new kva(paramgxt, paramInt2))
    {
      efj.a(localView, (gxq)localObject);
      localView.setOnClickListener(new gxn(this.az));
      return localView;
    }
  }
  
  private final void b(int paramInt)
  {
    this.ad = paramInt;
    if (TextUtils.isEmpty(this.a.getText().toString())) {}
    for (String str = this.a.getHint().toString();; str = this.a.getText().toString())
    {
      irs localirs = new irs(this.bn);
      int i = ((git)this.bo.a(git.class)).c();
      localirs.a.putExtra("account_id", i);
      localirs.a.putExtra("header_text", str);
      localirs.a.putExtra("media_picker_mode", 3);
      Boolean localBoolean = Boolean.valueOf(true);
      localirs.a.putExtra("copy_content_uri_in_picker", localBoolean);
      a(localirs.a, 1);
      return;
    }
  }
  
  private final jux c(int paramInt)
  {
    if (paramInt == -2) {
      return this.ac.a(0);
    }
    if ((paramInt >= 0) && (paramInt < this.ac.c())) {
      return this.ac.a(paramInt);
    }
    return null;
  }
  
  private final void w()
  {
    this.ar.setVisibility(0);
    int i;
    int j;
    label52:
    int i5;
    label80:
    int k;
    label100:
    int m;
    label124:
    int n;
    label134:
    int i1;
    label180:
    ViewGroup localViewGroup;
    MediaView localMediaView2;
    ImageView localImageView;
    int i2;
    if (!this.ac.l())
    {
      i = 1;
      ipf localipf = this.ac.a(0).a();
      this.aa.a(localipf);
      MediaView localMediaView1 = this.aa;
      if (i == 0) {
        break label382;
      }
      j = 0;
      localMediaView1.setVisibility(j);
      if (i != 0)
      {
        ViewGroup.LayoutParams localLayoutParams = this.ab.getLayoutParams();
        if (localipf != null) {
          break label389;
        }
        i5 = af;
        localLayoutParams.height = i5;
      }
      View localView1 = this.ab;
      if (i == 0) {
        break label398;
      }
      k = 0;
      localView1.setVisibility(k);
      View localView2 = this.aq;
      if ((i == 0) || (localipf != null)) {
        break label405;
      }
      m = 0;
      localView2.setVisibility(m);
      n = 0;
      if (n >= this.as.size()) {
        return;
      }
      View localView3 = (View)this.as.get(n);
      jux localjux = this.ac.a(n);
      if (localjux != null) {
        break label412;
      }
      i1 = 8;
      localView3.setVisibility(i1);
      if (localjux != null)
      {
        ((EditText)localView3.findViewById(ehr.dB)).setText(localjux.a);
        localViewGroup = (ViewGroup)localView3.findViewById(ehr.dz);
        localMediaView2 = (MediaView)localView3.findViewById(ehr.dx);
        localImageView = (ImageView)localView3.findViewById(ehr.dy);
        if ((!this.ac.l()) && (this.ac.k())) {
          break label418;
        }
        i2 = 1;
        label273:
        if (i2 == 0) {
          break label496;
        }
        if (localjux.a() == null) {
          break label424;
        }
        localMediaView2.a(localjux.a());
        localMediaView2.setVisibility(0);
        mbf localmbf2 = this.bn;
        int i4 = eyg.aG;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(n + 1);
        arrayOfObject2[1] = Integer.valueOf(this.ac.c());
        localMediaView2.setContentDescription(localmbf2.getString(i4, arrayOfObject2));
        localImageView.setVisibility(8);
        label365:
        localViewGroup.setVisibility(0);
      }
    }
    for (;;)
    {
      n++;
      break label134;
      i = 0;
      break;
      label382:
      j = 8;
      break label52;
      label389:
      i5 = this.ag;
      break label80;
      label398:
      k = 8;
      break label100;
      label405:
      m = 8;
      break label124;
      label412:
      i1 = 0;
      break label180;
      label418:
      i2 = 0;
      break label273;
      label424:
      localMediaView2.setVisibility(8);
      localImageView.setVisibility(0);
      mbf localmbf1 = this.bn;
      int i3 = eyg.aF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(n + 1);
      arrayOfObject1[1] = Integer.valueOf(this.ac.c());
      localImageView.setContentDescription(localmbf1.getString(i3, arrayOfObject1));
      break label365;
      label496:
      localViewGroup.setVisibility(8);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    bp localbp = f();
    if (!aj)
    {
      Resources localResources2 = localbp.getResources();
      String[] arrayOfString = new String[2];
      aw = arrayOfString;
      arrayOfString[0] = localResources2.getString(eyg.av);
      aw[1] = localResources2.getString(eyg.aK);
      af = (int)localResources2.getDimension(efj.Th);
      ai = localResources2.getDrawable(efj.Tl);
      aj = true;
    }
    View localView1 = localLayoutInflater.inflate(efj.To, paramViewGroup, false);
    this.ah = localView1.findViewById(ehr.dv);
    efj.a(this.ah, new gxq(pjz.h));
    View localView2 = this.ah;
    if ((Build.VERSION.SDK_INT >= 19) && (localView2 != null)) {
      localView2.setAccessibilityLiveRegion(1);
    }
    this.a = ((MentionMultiAutoCompleteTextView)localView1.findViewById(ehr.dQ));
    efj.a(this.a, new gxq(pjz.j));
    this.a.setOnFocusChangeListener(new jut(this));
    this.a.requestFocus();
    this.a.addTextChangedListener(new juv(this));
    this.a.a(this, ((git)this.bo.a(git.class)).c(), null, (kim)this.bo.a(kim.class));
    int i;
    if (paramBundle == null)
    {
      Bundle localBundle = this.m;
      if (localBundle != null)
      {
        String str;
        if (TextUtils.isEmpty(this.ac.g())) {
          str = localBundle.getString("editable_post_text");
        }
        while (!TextUtils.isEmpty(str))
        {
          SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str);
          Parcelable[] arrayOfParcelable = localBundle.getParcelableArray("editable_post_text_url_spans");
          if (arrayOfParcelable != null)
          {
            int i3 = 0;
            for (;;)
            {
              if (i3 < arrayOfParcelable.length)
              {
                khu localkhu = (khu)arrayOfParcelable[i3];
                localSpannableStringBuilder.setSpan(localkhu.a, localkhu.b, localkhu.c, 33);
                i3++;
                continue;
                str = this.ac.g();
                break;
              }
            }
          }
          this.a.setText(localSpannableStringBuilder);
          this.a.setSelection(localSpannableStringBuilder.length());
          this.ac.a(kia.a(this.a.getText()), false);
          this.at = this.a.b();
        }
      }
      this.ak = localView1.findViewById(ehr.dC);
      this.al = b(localView1, ehr.dD, pjz.b, -1);
      this.am = localView1.findViewById(ehr.dG);
      this.b = a(localView1, ehr.dE, pjz.f, -1);
      this.c = ((ImageView)localView1.findViewById(ehr.dH));
      if (Build.VERSION.SDK_INT < 17) {
        break label1294;
      }
      i = 1;
      label535:
      if ((i == 0) || (g().getConfiguration().getLayoutDirection() != 1)) {
        break label1300;
      }
    }
    label1294:
    label1300:
    for (int j = 1;; j = 0)
    {
      if (j != 0) {
        this.c.setScaleX(-this.c.getScaleX());
      }
      b(localView1, ehr.dF, pjz.b, -1);
      this.an = localView1.findViewById(ehr.dK);
      this.d = a(localView1, ehr.dI, pjz.g, 0);
      MediaView localMediaView1 = this.d;
      mbf localmbf1 = this.bn;
      int k = eyg.aG;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(1);
      arrayOfObject1[1] = Integer.valueOf(2);
      localMediaView1.setContentDescription(localmbf1.getString(k, arrayOfObject1));
      this.Z = a(localView1, ehr.dJ, pjz.g, 1);
      MediaView localMediaView2 = this.Z;
      mbf localmbf2 = this.bn;
      int m = eyg.aG;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(2);
      arrayOfObject2[1] = Integer.valueOf(2);
      localMediaView2.setContentDescription(localmbf2.getString(m, arrayOfObject2));
      this.ao = ((EditText)localView1.findViewById(ehr.dL));
      efj.a(this.ao, new kva(pjz.i, 0));
      this.ao.addTextChangedListener(new juv(this, 0));
      this.ao.setOnFocusChangeListener(new jut(this));
      this.ap = ((EditText)localView1.findViewById(ehr.dM));
      efj.a(this.ap, new kva(pjz.i, 1));
      this.ap.addTextChangedListener(new juv(this, 1));
      this.ap.setOnFocusChangeListener(new jut(this));
      this.ar = ((LinearLayout)localView1.findViewById(ehr.dN));
      this.aa = ((MediaView)b(localView1, ehr.dO, pjz.g, -1));
      this.ab = localView1.findViewById(ehr.dw);
      this.aq = b(localView1, ehr.dP, pjz.g, -1);
      long l = this.ac.j();
      for (int n = 0; n < l; n++)
      {
        View localView3 = localLayoutInflater.inflate(efj.Tp, this.ar, false);
        int i1 = this.as.size();
        ImageView localImageView = (ImageView)localView3.findViewById(ehr.dA);
        efj.a(localImageView, new kva(pjz.l, i1));
        localImageView.setOnClickListener(new gxn(new jur(this, i1)));
        EditText localEditText = (EditText)localView3.findViewById(ehr.dB);
        efj.a(localEditText, new kva(pjz.i, i1));
        localEditText.addTextChangedListener(new juv(this, i1));
        Resources localResources1 = g();
        int i2 = eyg.aH;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i1 + 1);
        localEditText.setHint(localResources1.getString(i2, arrayOfObject3));
        localEditText.setOnFocusChangeListener(new jut(this));
        gxn localgxn = new gxn(new jus(this, i1));
        MediaView localMediaView3 = (MediaView)localView3.findViewById(ehr.dx);
        efj.a(localMediaView3, new kva(pjz.g, i1));
        localMediaView3.setOnClickListener(localgxn);
        View localView4 = localView3.findViewById(ehr.dz);
        efj.a(localView4, new kva(pjz.d, i1));
        localView4.setOnClickListener(localgxn);
        if (n == l - 1L) {
          ((EditText)localView3.findViewById(ehr.dB)).setImeOptions(6);
        }
        this.as.add(localView3);
        this.ar.addView(localView3);
      }
      this.at = paramBundle.getParcelableArrayList("ORIGINAL_MENTIONS");
      break;
      i = 0;
      break label535;
    }
    this.ac.a(this);
    return localView1;
  }
  
  public final void a()
  {
    v();
  }
  
  public final void a(int paramInt)
  {
    v();
    if (paramInt < this.ac.c())
    {
      int i = -1 + this.ac.c();
      View localView = ((View)this.as.get(i)).findViewById(ehr.dB);
      if (localView != null)
      {
        localView.requestFocus();
        efj.j(localView);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if (this.ax != null) {
      this.ax.a(false);
    }
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1) {
        break label38;
      }
      this.ad = -1;
    }
    for (;;)
    {
      return;
      label38:
      ArrayList localArrayList = paramIntent.getParcelableArrayListExtra("shareables");
      if ((localArrayList != null) && (!localArrayList.isEmpty())) {}
      for (ipf localipf = ((ipa)localArrayList.get(0)).e(); localipf != null; localipf = ((irl)this.bo.a(irl.class)).a(paramIntent))
      {
        this.av.b(new jwr(((git)this.bo.a(git.class)).c(), localipf));
        return;
      }
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    gxt localgxt;
    if (paramInt == 0)
    {
      localgxt = pjz.e;
      b(this.ad);
    }
    for (;;)
    {
      mbf localmbf = this.bn;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(localgxt);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.bn)).b(localmbf);
      jux localjux;
      do
      {
        return;
        localgxt = pjz.k;
        localjux = c(this.ad);
      } while (localjux == null);
      if (this.ac.c() == 2) {
        this.ac.b(true);
      }
      localjux.a(this.bn, null, null, true);
      if ((this.ad == 0) && (this.ac.c() == 2))
      {
        this.ac.m();
        this.ac.a();
      }
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle, String paramString) {}
  
  public final void b() {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c()
  {
    v();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ac = ((jwa)((kij)this.bo.a(kij.class)).a(jwa.class)).a;
    if (paramBundle != null) {
      this.ad = paramBundle.getInt("INDEX_PENDING_PHOTO");
    }
    this.av = ((gzj)mbb.a(this.bn, gzj.class));
    gzj localgzj = this.av;
    juu localjuu = this.au;
    localgzj.a.add(localjuu);
    this.ay = ((git)this.bo.a(git.class));
    this.bo.a(iee.class, new iee(this.bn));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (this.N == null) {}
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = this.N.getViewTreeObserver();
    } while (!localViewTreeObserver.isAlive());
    localViewTreeObserver.addOnGlobalLayoutListener(new jup(this));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("INDEX_PENDING_PHOTO", this.ad);
    paramBundle.putParcelableArrayList("ORIGINAL_MENTIONS", (ArrayList)this.at);
  }
  
  public final void m()
  {
    super.m();
    if ((this.N != null) && (this.N.getMeasuredWidth() > 0)) {
      this.ae = true;
    }
  }
  
  public final void n()
  {
    this.ae = false;
    super.n();
  }
  
  final void v()
  {
    this.ah.setVisibility(0);
    this.ak.setVisibility(8);
    this.ar.setVisibility(8);
    if (!this.ac.d())
    {
      List localList = this.a.b();
      if ((localList != null) && (this.at != null)) {
        ((kim)this.bo.a(kim.class)).a(localList, this.at);
      }
      this.ah.setVisibility(8);
    }
    iee localiee;
    Resources localResources;
    ied localied;
    do
    {
      return;
      if (this.ac.c() != 2) {
        break label537;
      }
      this.ak.setVisibility(0);
      ipf localipf1 = this.ac.a(0).a();
      ipf localipf2 = this.ac.a(1).a();
      this.al.setVisibility(8);
      this.am.setVisibility(8);
      this.an.setVisibility(8);
      this.ao.setText(this.ac.a(0).a);
      this.ap.setText(this.ac.a(1).a);
      if ((localipf1 != null) && (localipf2 != null))
      {
        this.an.setVisibility(0);
        a(this.d, localipf1);
        a(this.Z, localipf2);
        return;
      }
      if (localipf1 == null) {
        break;
      }
      this.am.setVisibility(0);
      a(this.b, localipf1);
      localiee = (iee)mbb.a(this.bn, iee.class);
      localResources = this.bn.getResources();
      String str1 = this.bn.getString(eyg.aB);
      String str2 = this.bn.getString(eyg.aA);
      localied = new ied(this.ay.c(), pjz.a, str1, str2, 1);
    } while (!localiee.a(localied));
    TooltipView localTooltipView = new TooltipView(this.bn);
    localTooltipView.a(localied);
    localTooltipView.b = (localResources.getDimensionPixelSize(efj.Tk) - localTooltipView.a / 2);
    localTooltipView.c = 1;
    localTooltipView.a(1);
    int i = (int)(0.33D * this.am.getMeasuredWidth());
    int j = localResources.getDimensionPixelSize(efj.Tj);
    int k = localResources.getDimensionPixelSize(efj.Ti);
    FrameLayout localFrameLayout = new FrameLayout(this.bn);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    mi.a.a(localLayoutParams, i);
    mi.a.b(localLayoutParams, j);
    localLayoutParams.gravity = 8388629;
    localFrameLayout.setLayoutParams(localLayoutParams);
    localFrameLayout.setPadding(0, 0, 0, k);
    localFrameLayout.addView(localTooltipView);
    ((ViewGroup)this.am).addView(localFrameLayout);
    localiee.c(localTooltipView);
    localTooltipView.sendAccessibilityEvent(8);
    return;
    this.al.setVisibility(0);
    return;
    label537:
    w();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     juo
 * JD-Core Version:    0.7.0.1
 */