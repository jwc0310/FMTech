import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.views.OneProfileAvatarView;
import com.google.android.apps.plus.views.OneProfileHeader;
import com.google.android.apps.plus.views.OneProfileVideoThumbnailView;
import com.google.android.apps.plus.views.OneProfileVideosChannelView;
import com.google.android.apps.plus.views.OneProfileVideosVideoView;
import com.google.android.apps.plus.views.ProfileAlbumTileView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.oneprofile.about.LocalStarRating;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutActionsView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutBasicInfoView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutContactInfoView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutCurrentLocationView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutLinksView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutLocalContactInfoView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutPeopleView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutReviewSummaryView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutReviewView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutZagatListView;
import com.google.android.libraries.social.oneprofile.about.OneProfileReviewsSummaryView;
import com.google.android.libraries.social.squares.profile.about.OneProfileAboutSquaresView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.tabbar.TabBar;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class ddo
  extends dfz
{
  private static int aR = -1;
  private static int aU;
  private static Drawable aV;
  private static LayerDrawable aW;
  private static final String[] aX = { "type", "reviewId" };
  private static final String[] aY = { "type", "index" };
  private static final String[] aZ = { "type", "index" };
  public oea A;
  public boolean B;
  public boolean C;
  public boolean D;
  public boolean E;
  public String F;
  public boolean G;
  public boolean H;
  public boolean I;
  public boolean J;
  public int K;
  public String L;
  public String M;
  public String N;
  public String O;
  public String P;
  public String Q;
  public int R;
  public boolean S;
  public boolean T;
  public boolean U;
  public int V;
  public nxh W;
  public int X;
  public boolean Y;
  public String Z;
  public cya a;
  private final String aS;
  private final String aT;
  public String aa;
  public int ab;
  final lpw ac;
  public OneProfileHeader ad;
  public tp ae;
  public TabBar af;
  public String ag;
  boolean ah;
  int ai;
  public String aj;
  boolean ak;
  public boolean al;
  public jly am;
  public boolean an;
  public final DataSetObserver ao = new ddp(this);
  public final bot ap;
  public boolean aq;
  public dxq b;
  private final LayoutInflater ba;
  private dxp bb;
  private Cursor bc;
  private boolean bd = true;
  private final StreamGridView be;
  private int bf;
  private hqr bg;
  private long bh;
  private hqr bi;
  private hqr bj;
  private boolean bk;
  private final Runnable bl;
  private boolean bm;
  private boolean bn;
  private boolean bo;
  private ArrayList<String> bp;
  private int bq = -1;
  private hhd br;
  public lwa c;
  public jgl d;
  public jgb e;
  public jfp f;
  public jfm g;
  public jfr h;
  public dza i;
  public jgc j;
  public jgk k;
  public jfc l;
  public jfs m;
  public jgc n;
  public dxs o;
  public String p;
  public boolean q;
  public boolean r;
  public boolean s;
  public nxl t;
  public nwy u;
  public mua v;
  public mvk w;
  public nyv x;
  public ofk y;
  public ofg z;
  
  public ddo(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    super(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, null, paramlob);
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    this.aS = localgjb.b("gaia_id");
    this.aT = localgjb.b("domain_name");
    this.ap = ((bot)mbb.a(paramContext, bot.class));
    if (aR < 0) {
      aR = super.getViewTypeCount();
    }
    if (aU == 0)
    {
      Resources localResources = paramContext.getResources();
      aU = localResources.getDimensionPixelSize(efj.nt);
      aV = localResources.getDrawable(efj.oo);
      Drawable[] arrayOfDrawable = new Drawable[2];
      arrayOfDrawable[0] = localResources.getDrawable(efj.op);
      arrayOfDrawable[1] = aV;
      aW = new LayerDrawable(arrayOfDrawable);
    }
    this.ac = paramStreamGridView.s.a;
    ddq localddq = new ddq(this);
    paramStreamGridView.s.a = localddq;
    this.be = paramStreamGridView;
    this.av = null;
    this.bl = new ddr(this);
    this.ba = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private final boolean B()
  {
    if (this.R == 2) {}
    for (int i1 = 1; (i1 == 0) && (!this.S); i1 = 0) {
      return true;
    }
    return false;
  }
  
  private String C()
  {
    if (this.R == 2) {
      return "115239603441691718952";
    }
    return this.aS;
  }
  
  private final int D()
  {
    if (this.ai == 5) {
      return -this.ap.d();
    }
    return -this.ay.d;
  }
  
  public static Uri a(nxl paramnxl)
  {
    if ((efj.a(paramnxl) == 4) && (paramnxl.f.b.d.l != null) && (paramnxl.f.b.d.l.a != null) && (paramnxl.f.b.d.l.a.a != null)) {}
    for (String str = paramnxl.f.b.d.l.a.a; str == null; str = null) {
      return null;
    }
    int i1 = str.indexOf("https://www.google.com/maps");
    if (i1 >= 0) {
      str = str.substring(i1);
    }
    return Uri.parse(Uri.decode(str));
  }
  
  public static boolean a(ntr paramntr)
  {
    return !TextUtils.isEmpty(paramntr.b);
  }
  
  private static boolean a(qfp paramqfp)
  {
    qfq localqfq = paramqfp.c;
    qfr localqfr = paramqfp.d;
    boolean bool = false;
    if (localqfr != null)
    {
      String str = localqfr.a;
      bool = false;
      if (localqfq != null)
      {
        bool = false;
        if (str != null) {
          bool = true;
        }
      }
    }
    return bool;
  }
  
  private static int b(ntr paramntr)
  {
    if (paramntr.a != null) {
      return paramntr.a.length;
    }
    return 0;
  }
  
  private static int b(qfp paramqfp)
  {
    qfx[] arrayOfqfx = paramqfp.b;
    qfm[] arrayOfqfm = null;
    if (arrayOfqfx != null)
    {
      int i2 = paramqfp.b.length;
      arrayOfqfm = null;
      if (i2 != 0) {
        arrayOfqfm = paramqfp.b[0].c;
      }
    }
    int i1 = 0;
    if (arrayOfqfm != null) {
      i1 = arrayOfqfm.length;
    }
    return i1;
  }
  
  private final int h(int paramInt)
  {
    int i1 = 26;
    if (s()) {
      i1 = 26 + this.a.getViewTypeCount();
    }
    if ((paramInt < 0) || (paramInt >= i1))
    {
      Log.e("OneProfileStreamAdapter", 33 + "Unexpected view type: " + paramInt);
      return 0;
    }
    return paramInt + aR;
  }
  
  protected final View a(int paramInt1, Cursor paramCursor, int paramInt2, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramInt1 == 2) && (s()))
    {
      lpt locallpt = new lpt(-2);
      locallpt.a = this.ay.a;
      locallpt.setMargins(-this.ay.f, D(), -this.ay.f, 0);
      View localView = this.a.getView(paramInt2, paramView, paramViewGroup);
      localView.setLayoutParams(locallpt);
      return localView;
    }
    return super.a(paramInt1, paramCursor, paramInt2, paramView, paramViewGroup);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    OneProfileHeader localOneProfileHeader = (OneProfileHeader)this.ba.inflate(efj.vi, paramViewGroup, false);
    lpt locallpt = new lpt(-2);
    locallpt.a = this.ay.a;
    locallpt.setMargins(-this.ay.f, D(), -this.ay.f, 0);
    localOneProfileHeader.setLayoutParams(locallpt);
    return localOneProfileHeader;
  }
  
  public final void a(Cursor paramCursor, int paramInt)
  {
    switch (this.ai)
    {
    default: 
      super.a(paramCursor, paramInt);
    }
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.a(paramView, paramInt1, paramInt2, paramInt3);
    am_();
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    Resources localResources1 = this.aM.getResources();
    this.ad = ((OneProfileHeader)paramView);
    int i1 = -1;
    lpt locallpt = (lpt)this.ad.getLayoutParams();
    locallpt.a = this.be.a.a;
    locallpt.setMargins(-this.ay.f, D(), -this.ay.f, 0);
    if (this.bb != null)
    {
      OneProfileHeader localOneProfileHeader25 = this.ad;
      dxp localdxp = this.bb;
      localOneProfileHeader25.l.a = localdxp;
    }
    OneProfileHeader localOneProfileHeader1 = this.ad;
    dxq localdxq = this.b;
    lwa locallwa = this.c;
    localOneProfileHeader1.h = localdxq;
    localOneProfileHeader1.z.b = locallwa;
    String str7;
    OneProfileAvatarView localOneProfileAvatarView1;
    label332:
    int i23;
    label356:
    OneProfileHeader localOneProfileHeader22;
    label372:
    boolean bool3;
    Boolean localBoolean5;
    label450:
    boolean bool4;
    int i7;
    Boolean localBoolean3;
    boolean bool12;
    label516:
    Boolean localBoolean4;
    label640:
    label663:
    String str8;
    StringBuilder localStringBuilder1;
    Resources localResources2;
    int i20;
    label848:
    OneProfileHeader localOneProfileHeader11;
    label958:
    OneProfileHeader localOneProfileHeader20;
    label1046:
    String str20;
    StringBuilder localStringBuilder2;
    nxl localnxl1;
    label1108:
    Object localObject5;
    label1111:
    nxl localnxl2;
    Object localObject6;
    if (this.E)
    {
      OneProfileHeader localOneProfileHeader24 = this.ad;
      int i26 = aau.rs;
      String str27 = this.aM.getString(i26).toUpperCase();
      localOneProfileHeader24.z.a(efj.wy, str27, 1, null, null);
      OneProfileHeader localOneProfileHeader7 = this.ad;
      int i6 = this.ai;
      localOneProfileHeader7.z.a(i6);
      OneProfileHeader localOneProfileHeader8 = this.ad;
      TabBar localTabBar = this.af;
      localOneProfileHeader8.z.a(localTabBar);
      localTabBar.a(localOneProfileHeader8.z);
      OneProfileHeader localOneProfileHeader9 = this.ad;
      boolean bool2 = this.aq;
      localOneProfileHeader9.z.a(5, bool2);
      if (this.t == null) {
        break label3790;
      }
      this.ad.k = this.Q;
      j();
      str7 = this.t.d.f;
      localOneProfileAvatarView1 = this.ad.l;
      if (!TextUtils.equals(str7, localOneProfileAvatarView1.b))
      {
        if (!TextUtils.isEmpty(str7)) {
          break label2359;
        }
        localOneProfileAvatarView1.a(true);
      }
      if (!TextUtils.isEmpty(str7))
      {
        OneProfileHeader localOneProfileHeader21 = this.ad;
        if (this.E) {
          break label2390;
        }
        i23 = 1;
        OneProfileAvatarView localOneProfileAvatarView2 = localOneProfileHeader21.l;
        if (i23 == 0) {
          break label2396;
        }
        localOneProfileHeader22 = localOneProfileHeader21;
        localOneProfileAvatarView2.setOnClickListener(localOneProfileHeader22);
      }
      this.ad.a(this.bd);
      nvn localnvn = this.t.d;
      bool3 = false;
      if (localnvn != null)
      {
        nwn localnwn = this.t.d.a;
        bool3 = false;
        if (localnwn != null)
        {
          localBoolean5 = this.t.d.a.d;
          if (localBoolean5 != null) {
            break label2402;
          }
          bool3 = false;
        }
      }
      nvm localnvm1 = this.t.c;
      bool4 = false;
      i7 = 0;
      if (localnvm1 != null)
      {
        nxm localnxm = this.t.c.e;
        bool4 = false;
        i7 = 0;
        if (localnxm != null)
        {
          localBoolean3 = this.t.c.e.b;
          if (localBoolean3 != null) {
            break label2412;
          }
          bool12 = false;
          bool4 = false;
          i7 = 0;
          if (!bool12)
          {
            ors localors = this.t.c.e.a;
            bool4 = false;
            i7 = 0;
            if (localors != null)
            {
              osf[] arrayOfosf = this.t.c.e.a.c;
              bool4 = false;
              i7 = 0;
              if (arrayOfosf != null)
              {
                orn localorn = this.t.c.e.a.b;
                bool4 = false;
                i7 = 0;
                if (localorn != null)
                {
                  localBoolean4 = this.t.c.e.a.b.h;
                  if (localBoolean4 != null) {
                    break label2422;
                  }
                  bool4 = false;
                  if (this.t.c.e.a.c.length <= 0) {
                    break label2432;
                  }
                  i7 = 1;
                }
              }
            }
          }
        }
      }
      OneProfileHeader localOneProfileHeader10 = this.ad;
      str8 = this.Z;
      SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str8);
      localStringBuilder1 = new StringBuilder(str8).append('.');
      localResources2 = localOneProfileHeader10.getResources();
      if (bool3)
      {
        localSpannableStringBuilder1.append("  ");
        int i22 = -1 + localSpannableStringBuilder1.length();
        localSpannableStringBuilder1.setSpan(new lvd(localOneProfileHeader10.getContext(), efj.qg), i22, i22 + 1, 17);
        localStringBuilder1.append(localResources2.getString(aau.ry));
      }
      if (bool4)
      {
        if (i7 == 0) {
          break label2438;
        }
        i20 = efj.pH;
        String str23 = String.valueOf(localResources2.getString(aau.rn, new Object[] { str8 }));
        localStringBuilder1.append(1 + String.valueOf(str23).length() + str23 + ".");
        localSpannableStringBuilder1.append("  ");
        int i21 = -1 + localSpannableStringBuilder1.length();
        localSpannableStringBuilder1.setSpan(new lvd(localOneProfileHeader10.getContext(), i20), i21, i21 + 1, 17);
      }
      localOneProfileHeader10.m.setText(localSpannableStringBuilder1);
      localOneProfileHeader10.m.setContentDescription(localStringBuilder1.toString());
      localOneProfileHeader11 = this.ad;
      boolean bool5 = this.an;
      String str9 = this.aT;
      if (!bool5) {
        break label2505;
      }
      localOneProfileHeader11.n.setText(str9);
      localOneProfileHeader11.n.setVisibility(0);
      if (this.D)
      {
        localOneProfileHeader20 = this.ad;
        qgy localqgy = this.t.f.b.d.k;
        Integer localInteger3 = null;
        if (localqgy != null)
        {
          qfz localqfz = localqgy.a;
          localInteger3 = null;
          if (localqfz != null) {
            localInteger3 = localqfz.a;
          }
        }
        if (localInteger3 == null) {
          break label2518;
        }
        localOneProfileHeader20.o.a(localInteger3.intValue());
        localOneProfileHeader20.o.setVisibility(0);
      }
      if (!this.C) {
        break label2729;
      }
      str20 = efj.b(this.t);
      localStringBuilder2 = new StringBuilder();
      localnxl1 = this.t;
      switch (efj.a(localnxl1))
      {
      default: 
        localObject5 = null;
        if (!TextUtils.isEmpty((CharSequence)localObject5)) {
          localStringBuilder2.append((String)localObject5);
        }
        localnxl2 = this.t;
        switch (efj.a(localnxl2))
        {
        default: 
          localObject6 = null;
          label1163:
          if (!TextUtils.isEmpty((CharSequence)localObject6))
          {
            if (localStringBuilder2.length() > 0) {
              localStringBuilder2.append(" — ");
            }
            localStringBuilder2.append((String)localObject6);
          }
          if (localStringBuilder2.length() <= 0) {}
          break;
        }
        break;
      }
    }
    for (String str21 = localStringBuilder2.toString();; str21 = null)
    {
      int i8 = 0;
      Object localObject2 = null;
      Object localObject4 = str20;
      Object localObject3 = str21;
      for (;;)
      {
        label1225:
        label1254:
        boolean bool6;
        label1270:
        OneProfileHeader localOneProfileHeader14;
        label1344:
        OneProfileHeader localOneProfileHeader15;
        label1374:
        OneProfileHeader localOneProfileHeader16;
        label1404:
        OneProfileHeader localOneProfileHeader17;
        label1455:
        Long localLong1;
        OneProfileHeader localOneProfileHeader18;
        int i9;
        if (i1 != -1)
        {
          OneProfileHeader localOneProfileHeader19 = this.ad;
          localOneProfileHeader19.f = i1;
          localOneProfileHeader19.z.a = localOneProfileHeader19;
          OneProfileHeader localOneProfileHeader13 = this.ad;
          if (this.B) {
            break label3664;
          }
          bool6 = true;
          boolean bool7 = this.B;
          localOneProfileHeader13.t = bool6;
          localOneProfileHeader13.g.a();
          localOneProfileHeader13.p.a = localOneProfileHeader13.g;
          localOneProfileHeader13.p.b = bool7;
          localOneProfileHeader14 = this.ad;
          if (localObject4 == null) {
            break label3670;
          }
          localOneProfileHeader14.q.setText((CharSequence)localObject4);
          localOneProfileHeader14.q.setVisibility(0);
          localOneProfileHeader15 = this.ad;
          if (localObject3 == null) {
            break label3683;
          }
          localOneProfileHeader15.r.setText((CharSequence)localObject3);
          localOneProfileHeader15.r.setVisibility(0);
          localOneProfileHeader16 = this.ad;
          if (localObject2 == null) {
            break label3696;
          }
          localOneProfileHeader16.s.setText((CharSequence)localObject2);
          localOneProfileHeader16.s.setVisibility(0);
          localOneProfileHeader17 = this.ad;
          if (i8 == 0) {
            break label3709;
          }
          localOneProfileHeader17.s.setTextColor(OneProfileHeader.d);
          localOneProfileHeader17.s.setBackgroundDrawable(localOneProfileHeader17.getResources().getDrawable(efj.oX));
          localOneProfileHeader17.s.setOnClickListener(localOneProfileHeader17);
          o();
          nvm localnvm2 = this.t.c;
          Integer localInteger1 = null;
          if (localnvm2 != null)
          {
            nwe localnwe = this.t.c.b;
            localInteger1 = null;
            if (localnwe != null)
            {
              Integer localInteger2 = this.t.c.b.a;
              localInteger1 = null;
              if (localInteger2 != null) {
                localInteger1 = this.t.c.b.a;
              }
            }
          }
          nwy localnwy = this.u;
          localLong1 = null;
          if (localnwy != null)
          {
            nxa localnxa = this.u.a;
            localLong1 = null;
            if (localnxa != null)
            {
              Long localLong2 = this.u.a.a;
              localLong1 = null;
              if (localLong2 != null) {
                localLong1 = this.u.a.a;
              }
            }
          }
          localOneProfileHeader18 = this.ad;
          Resources localResources3 = localOneProfileHeader18.getResources();
          NumberFormat localNumberFormat = NumberFormat.getIntegerInstance();
          SpannableStringBuilder localSpannableStringBuilder2 = null;
          if (localInteger1 != null)
          {
            String str11 = localNumberFormat.format(localInteger1);
            localSpannableStringBuilder2 = new SpannableStringBuilder(localResources3.getQuantityString(efj.xV, localInteger1.intValue(), new Object[] { str11 }));
          }
          SpannableStringBuilder localSpannableStringBuilder3 = null;
          if (localLong1 != null)
          {
            boolean bool8 = localLong1.longValue() < 0L;
            localSpannableStringBuilder3 = null;
            if (bool8)
            {
              String str10 = localNumberFormat.format(localLong1);
              if (localLong1.longValue() <= 2147483647L) {
                break label3741;
              }
              i9 = 2147483647;
              label1714:
              localSpannableStringBuilder3 = new SpannableStringBuilder(localResources3.getQuantityString(efj.xW, i9, new Object[] { str10 }));
            }
          }
          if (localSpannableStringBuilder2 == null) {
            break label3751;
          }
          localOneProfileHeader18.w.setText(localSpannableStringBuilder2);
          localOneProfileHeader18.w.setVisibility(0);
          label1766:
          if (localSpannableStringBuilder3 == null) {
            break label3764;
          }
          localOneProfileHeader18.x.setText(localSpannableStringBuilder3);
          localOneProfileHeader18.x.setVisibility(0);
          label1790:
          if ((localSpannableStringBuilder2 == null) || (localSpannableStringBuilder3 == null)) {
            break label3777;
          }
          localOneProfileHeader18.y.setVisibility(0);
        }
        label2359:
        label2390:
        label2396:
        label2402:
        label2412:
        label2422:
        String str12;
        label2432:
        label2438:
        label2505:
        label2518:
        label2906:
        String str13;
        for (;;)
        {
          h();
          return;
          OneProfileHeader localOneProfileHeader2 = this.ad;
          int i2 = aau.rs;
          String str1 = this.aM.getString(i2).toUpperCase();
          if (this.r) {}
          for (gxt localgxt1 = pka.a;; localgxt1 = null)
          {
            localOneProfileHeader2.z.a(efj.wy, str1, 1, localgxt1, null);
            if ((this.q) || (k().booleanValue()))
            {
              OneProfileHeader localOneProfileHeader3 = this.ad;
              int i3 = aau.ru;
              String str2 = this.aM.getString(i3).toUpperCase();
              gxt localgxt2 = pka.p;
              localOneProfileHeader3.z.a(efj.wy, str2, 0, localgxt2, null);
            }
            String str3 = this.ap.b();
            String str4 = str3.toUpperCase(Locale.getDefault());
            boolean bool1 = this.q;
            Object localObject1 = null;
            if (bool1)
            {
              boolean bool13 = this.aq;
              localObject1 = null;
              if (bool13)
              {
                int i25 = this.ai;
                localObject1 = null;
                if (i25 != 5)
                {
                  Context localContext = this.aM;
                  String str25 = localContext.getString(aau.mg);
                  String str26 = String.format(localContext.getString(aau.lh), new Object[] { str3 });
                  Intent localIntent = ((hpo)mbb.a(this.aM, hpo.class)).c(this.ar);
                  ied localied = new ied(this.ar, pkh.J, str26, str25, 1);
                  localied.f = localContext.getString(aau.jk);
                  localied.g = localIntent;
                  localObject1 = localied;
                }
              }
            }
            OneProfileHeader localOneProfileHeader4 = this.ad;
            gxt localgxt3 = pka.e;
            localOneProfileHeader4.z.a(efj.wy, str4, 5, localgxt3, localObject1);
            if (localObject1 != null) {
              i1 = -1 + this.ad.z.c.size();
            }
            if ((this.q) || (l().booleanValue()))
            {
              OneProfileHeader localOneProfileHeader5 = this.ad;
              int i4 = aau.rt;
              String str5 = this.aM.getString(i4).toUpperCase();
              gxt localgxt4 = pka.o;
              localOneProfileHeader5.z.a(efj.wy, str5, 2, localgxt4, null);
            }
            if ((an_().booleanValue()) && (this.T))
            {
              OneProfileHeader localOneProfileHeader23 = this.ad;
              int i24 = aau.rw;
              String str24 = this.aM.getString(i24).toUpperCase();
              gxt localgxt6 = pka.J;
              localOneProfileHeader23.z.a(efj.wy, str24, 3, localgxt6, null);
            }
            if ((!m().booleanValue()) || (!this.U)) {
              break;
            }
            OneProfileHeader localOneProfileHeader6 = this.ad;
            int i5 = aau.rv;
            String str6 = this.aM.getString(i5).toUpperCase();
            gxt localgxt5 = pka.B;
            localOneProfileHeader6.z.a(efj.wy, str6, 4, localgxt5, null);
            break;
          }
          localOneProfileAvatarView1.b = str7;
          localOneProfileAvatarView1.b();
          localOneProfileAvatarView1.setContentDescription(localOneProfileAvatarView1.getResources().getString(aau.rg));
          break label332;
          i23 = 0;
          break label356;
          localOneProfileHeader22 = null;
          break label372;
          bool3 = localBoolean5.booleanValue();
          break label450;
          bool12 = localBoolean3.booleanValue();
          break label516;
          bool4 = localBoolean4.booleanValue();
          break label640;
          i7 = 0;
          break label663;
          i20 = efj.pC;
          String str22 = String.valueOf(localResources2.getString(aau.rf, new Object[] { str8 }));
          localStringBuilder1.append(1 + String.valueOf(str22).length() + str22 + ".");
          break label848;
          localOneProfileHeader11.n.setVisibility(8);
          break label958;
          localOneProfileHeader20.o.setVisibility(8);
          break label1046;
          if ((localnxl1.f.b.d.g == null) || (localnxl1.f.b.d.g.a == null) || (localnxl1.f.b.d.g.a.length <= 0)) {
            break label1108;
          }
          localObject5 = localnxl1.f.b.d.g.a[0].a;
          break label1111;
          if ((localnxl1.f.b.a == null) || (localnxl1.f.b.a.a == null) || (localnxl1.f.b.a.a.length <= 0)) {
            break label1108;
          }
          localObject5 = localnxl1.f.b.a.a[0].a;
          break label1111;
          qga localqga = localnxl2.f.b.d.e;
          if (localqga != null)
          {
            localObject6 = localqga.a.a;
            break label1163;
          }
          localObject6 = null;
          break label1163;
          label2729:
          if (this.t.e == null) {
            break label3821;
          }
          nwa localnwa = this.t.e.g;
          str12 = null;
          boolean bool11;
          String str19;
          Boolean localBoolean2;
          label2884:
          int i18;
          label2895:
          int i19;
          if (localnwa != null)
          {
            nvz[] arrayOfnvz = this.t.e.g.b;
            str12 = null;
            if (arrayOfnvz != null)
            {
              int i17 = this.t.e.g.b.length;
              str12 = null;
              if (i17 != 0)
              {
                nvz localnvz = this.t.e.g.b[0];
                bool11 = false;
                str19 = null;
                str12 = null;
                if (localnvz != null)
                {
                  str12 = localnvz.b;
                  str19 = localnvz.a;
                  nvt localnvt2 = localnvz.c;
                  bool11 = false;
                  if (localnvt2 != null)
                  {
                    localBoolean2 = localnvz.c.c;
                    if (localBoolean2 != null) {
                      break label3283;
                    }
                    bool11 = false;
                  }
                }
                if (TextUtils.isEmpty(str12)) {
                  break label3293;
                }
                i18 = 1;
                if (TextUtils.isEmpty(str19)) {
                  break label3299;
                }
                i19 = 1;
                if ((i18 == 0) || (i19 == 0) || (!bool11)) {
                  break label3305;
                }
                str12 = localResources1.getString(aau.qH, new Object[] { str12, str19 });
              }
            }
          }
          label2944:
          nvy localnvy = this.t.e.h;
          str13 = null;
          boolean bool10;
          String str18;
          Boolean localBoolean1;
          label3079:
          int i16;
          if (localnvy != null)
          {
            nvx[] arrayOfnvx = this.t.e.h.b;
            str13 = null;
            if (arrayOfnvx != null)
            {
              int i15 = this.t.e.h.b.length;
              str13 = null;
              if (i15 != 0)
              {
                nvx localnvx = this.t.e.h.b[0];
                bool10 = false;
                str18 = null;
                if (localnvx != null)
                {
                  str18 = localnvx.a;
                  nvt localnvt1 = localnvx.c;
                  bool10 = false;
                  if (localnvt1 != null)
                  {
                    localBoolean1 = localnvx.c.c;
                    if (localBoolean1 != null) {
                      break label3368;
                    }
                    bool10 = false;
                  }
                }
                if (TextUtils.isEmpty(str18)) {
                  break label3378;
                }
                i16 = 1;
                label3090:
                if (i16 == 0) {
                  break label3405;
                }
                if (!bool10) {
                  break label3384;
                }
                str13 = localResources1.getString(aau.qF, new Object[] { str18 });
              }
            }
          }
          label3118:
          boolean bool9 = this.B;
          String str14 = null;
          int i10 = 0;
          if (!bool9)
          {
            nvw localnvw = this.t.e.n;
            str14 = null;
            i10 = 0;
            if (localnvw != null)
            {
              nvv[] arrayOfnvv = this.t.e.n.a;
              str14 = null;
              i10 = 0;
              if (arrayOfnvv != null)
              {
                int i14 = this.t.e.n.a.length;
                str14 = null;
                i10 = 0;
                if (i14 != 0)
                {
                  i10 = 1;
                  str14 = this.t.e.n.a[0].f;
                }
              }
            }
          }
          if (i10 != 0)
          {
            if (!TextUtils.isEmpty(str14)) {}
            for (String str17 = localResources1.getString(aau.qn, new Object[] { str14 });; str17 = localResources1.getString(aau.qo))
            {
              localObject4 = str12;
              localObject3 = str13;
              i8 = 1;
              localObject2 = str17;
              break;
              label3283:
              bool11 = localBoolean2.booleanValue();
              break label2884;
              label3293:
              i18 = 0;
              break label2895;
              label3299:
              i19 = 0;
              break label2906;
              label3305:
              if (i19 != 0)
              {
                if (bool11)
                {
                  str12 = localResources1.getString(aau.qI, new Object[] { str19 });
                  break label2944;
                }
                str12 = localResources1.getString(aau.qJ, new Object[] { str19 });
                break label2944;
              }
              if (i18 != 0) {
                break label2944;
              }
              str12 = null;
              break label2944;
              label3368:
              bool10 = localBoolean1.booleanValue();
              break label3079;
              label3378:
              i16 = 0;
              break label3090;
              label3384:
              str13 = localResources1.getString(aau.qG, new Object[] { str18 });
              break label3118;
              label3405:
              str13 = null;
              break label3118;
            }
          }
          if (this.t.e.i == null) {
            break label3804;
          }
          String str15 = this.t.e.i.b;
          String[] arrayOfString = this.t.e.i.c;
          String str16 = null;
          if (arrayOfString != null)
          {
            int i13 = this.t.e.i.c.length;
            str16 = null;
            if (i13 != 0) {
              str16 = this.t.e.i.c[0];
            }
          }
          int i11;
          if (!TextUtils.isEmpty(str15))
          {
            i11 = 1;
            label3526:
            if (TextUtils.isEmpty(str16)) {
              break label3580;
            }
          }
          label3580:
          for (int i12 = 1;; i12 = 0)
          {
            if (i11 == 0) {
              break label3586;
            }
            localObject2 = localResources1.getString(aau.ra, new Object[] { str15 });
            localObject4 = str12;
            localObject3 = str13;
            i8 = 0;
            break;
            i11 = 0;
            break label3526;
          }
          label3586:
          if (i12 != 0)
          {
            localObject2 = localResources1.getString(aau.rb, new Object[] { str16 });
            localObject4 = str12;
            localObject3 = str13;
            i8 = 0;
            break label1225;
          }
          localObject4 = str12;
          localObject3 = str13;
          i8 = 0;
          localObject2 = null;
          break label1225;
          OneProfileHeader localOneProfileHeader12 = this.ad;
          localOneProfileHeader12.f = -1;
          localOneProfileHeader12.z.a = null;
          break label1254;
          label3664:
          bool6 = false;
          break label1270;
          label3670:
          localOneProfileHeader14.q.setVisibility(8);
          break label1344;
          label3683:
          localOneProfileHeader15.r.setVisibility(8);
          break label1374;
          label3696:
          localOneProfileHeader16.s.setVisibility(8);
          break label1404;
          label3709:
          localOneProfileHeader17.s.setTextColor(OneProfileHeader.e);
          localOneProfileHeader17.s.setBackgroundDrawable(null);
          localOneProfileHeader17.s.setOnClickListener(null);
          break label1455;
          label3741:
          i9 = localLong1.intValue();
          break label1714;
          label3751:
          localOneProfileHeader18.w.setVisibility(8);
          break label1766;
          label3764:
          localOneProfileHeader18.x.setVisibility(8);
          break label1790;
          label3777:
          localOneProfileHeader18.y.setVisibility(8);
          continue;
          label3790:
          this.ad.l.a(true);
        }
        label3804:
        localObject4 = str12;
        localObject3 = str13;
        i8 = 0;
        localObject2 = null;
        continue;
        label3821:
        i8 = 0;
        localObject2 = null;
        localObject3 = null;
        localObject4 = null;
      }
    }
  }
  
  public final void a(View paramView, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    int i1 = paramCursor.getPosition();
    int i2 = i1 + g(2);
    label171:
    label219:
    label348:
    label482:
    label504:
    label637:
    label1278:
    int i8;
    label283:
    label462:
    label623:
    label754:
    label884:
    label1019:
    dds localdds;
    label670:
    label686:
    label719:
    label863:
    label1140:
    label1272:
    ProfileAlbumTileView localProfileAlbumTileView;
    label768:
    label797:
    label830:
    label1240:
    label1632:
    label1892:
    label1898:
    label2158:
    dza localdza;
    switch (this.ai)
    {
    default: 
      super.a(paramView, paramCursor, paramViewGroup);
      return;
    case 1: 
      jgd localjgd = (jgd)paramView;
      boolean bool1 = this.q;
      boolean bool2 = this.B;
      boolean bool3 = this.C;
      jgl localjgl;
      jge localjge;
      int i16;
      if (this.q)
      {
        localjgl = this.d;
        localjgd.p = bool1;
        localjgd.q = bool2;
        localjgd.r = bool3;
        localjgd.s = localjgl;
        if (localjgd.t != null)
        {
          if (localjgl == null) {
            break label482;
          }
          localjge = new jge(localjgd);
          if (localjgd.c() != null) {
            break label462;
          }
          localjgd.t.setOnClickListener(localjge);
          localjgd.t.setBackgroundDrawable(localjgd.getResources().getDrawable(eyg.as));
          localjgd.t.setPadding(jgd.l, jgd.l, jgd.l, jgd.l);
          localjgd.u.setVisibility(0);
        }
        localjgd.setFocusable(true);
        hfa localhfa = new hfa(localjgd.getContext(), loh.a);
        int i12 = localjgd.getPaddingTop();
        int i13 = localjgd.getPaddingBottom();
        int i14 = localjgd.getPaddingLeft();
        int i15 = localjgd.getPaddingRight();
        if (!localhfa.b()) {
          break label504;
        }
        i16 = eyg.aj;
        localjgd.setBackgroundResource(i16);
        localjgd.setPadding(i14, i12, i15, i13);
        int i17 = paramCursor.getInt(0);
        switch (i17)
        {
        default: 
          localjgd.a(this.t);
          switch (i17)
          {
          }
          break;
        }
      }
      for (;;)
      {
        b(paramView, i2);
        return;
        localjgl = null;
        break;
        localjgd.t.setOnClickListener(new gxn(localjge));
        break label171;
        localjgd.t.setOnClickListener(null);
        localjgd.u.setVisibility(8);
        break label219;
        i16 = eyg.ai;
        break label283;
        OneProfileAboutReviewView localOneProfileAboutReviewView2 = (OneProfileAboutReviewView)paramView;
        localOneProfileAboutReviewView2.a = paramCursor.getString(1);
        localOneProfileAboutReviewView2.b = this.n;
        break label348;
        OneProfileAboutLocalContactInfoView localOneProfileAboutLocalContactInfoView2 = (OneProfileAboutLocalContactInfoView)paramView;
        if (!this.S) {}
        for (boolean bool7 = true;; bool7 = false)
        {
          localOneProfileAboutLocalContactInfoView2.a = bool7;
          break;
        }
        ((OneProfileAboutContactInfoView)paramView).a = this.g;
        break label348;
        OneProfileAboutPeopleView localOneProfileAboutPeopleView = (OneProfileAboutPeopleView)paramView;
        oon localoon;
        omz localomz3;
        Object localObject1;
        Object localObject2;
        int i21;
        int i22;
        String str14;
        int i36;
        jfw localjfw3;
        int i23;
        int i24;
        int i25;
        int i26;
        String str12;
        int i29;
        String str13;
        jfw localjfw1;
        jfw localjfw2;
        if ((this.v != null) && (this.v.a != null))
        {
          localoon = this.v.a.a;
          if (localoon != null) {
            break label1240;
          }
          localomz3 = null;
          localObject1 = null;
          localObject2 = null;
          if ((localObject1 == null) || (((omz)localObject1).a == null) || (((omz)localObject1).b == null) || (((omz)localObject1).b.length == 0)) {
            break label1272;
          }
          i21 = 1;
          if ((!localOneProfileAboutPeopleView.p) && (i21 == 0)) {
            break label1278;
          }
          i22 = 1;
          if (i22 != 0)
          {
            if (!localOneProfileAboutPeopleView.p) {
              break label1284;
            }
            int i37 = efj.Ry;
            str14 = localOneProfileAboutPeopleView.getContext().getResources().getString(i37);
            int i35 = efj.Rz;
            String str15 = localOneProfileAboutPeopleView.getContext().getResources().getString(i35);
            if (localObject1 == null) {
              break label1324;
            }
            i36 = ((omz)localObject1).a.intValue();
            if (i21 == 0) {
              break label1330;
            }
            localjfw3 = localOneProfileAboutPeopleView.a((omz)localObject1);
            localOneProfileAboutPeopleView.a(str14, i36, 10, true);
            localOneProfileAboutPeopleView.a(str15, localjfw3);
          }
          if (i22 != 0) {
            break label1336;
          }
          i23 = 1;
          if ((localObject2 == null) || (((omz)localObject2).a == null) || (((omz)localObject2).b == null) || (((omz)localObject2).b.length == 0)) {
            break label1342;
          }
          i24 = 1;
          if ((localomz3 == null) || (localomz3.a == null) || (localomz3.b == null) || (localomz3.b.length == 0)) {
            break label1348;
          }
          i25 = 1;
          if ((!localOneProfileAboutPeopleView.p) && (i24 == 0) && (i25 == 0)) {
            break label1354;
          }
          i26 = 1;
          if (i26 != 0)
          {
            if (i23 == 0)
            {
              View localView2 = new View(localOneProfileAboutPeopleView.getContext());
              localView2.setBackgroundDrawable(localOneProfileAboutPeopleView.getResources().getDrawable(eyg.ak));
              LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, localOneProfileAboutPeopleView.getResources().getDimensionPixelSize(aaw.pb));
              int i27 = OneProfileAboutPeopleView.l;
              localLayoutParams.bottomMargin = i27;
              localLayoutParams.topMargin = i27;
              localOneProfileAboutPeopleView.b.addView(localView2, localLayoutParams);
            }
            if (!localOneProfileAboutPeopleView.p) {
              break label1366;
            }
            int i33 = efj.Rv;
            str12 = localOneProfileAboutPeopleView.getContext().getResources().getString(i33);
            if (localomz3 == null) {
              break label1360;
            }
            i29 = localomz3.a.intValue();
            int i30 = efj.Rw;
            str13 = localOneProfileAboutPeopleView.getContext().getResources().getString(i30);
            if (i25 == 0) {
              break label1409;
            }
            localjfw1 = localOneProfileAboutPeopleView.a(localomz3);
            localOneProfileAboutPeopleView.a(str12, i29, 11, true);
            if (localOneProfileAboutPeopleView.p) {
              break label1421;
            }
            boolean bool6 = true;
            if ((localObject2 != null) && (((omz)localObject2).a.intValue() > 0))
            {
              int i32 = efj.Rt;
              localOneProfileAboutPeopleView.b(localOneProfileAboutPeopleView.getContext().getResources().getString(i32), ((omz)localObject2).a.intValue(), 9, true);
              if (i24 == 0) {
                break label1415;
              }
              localjfw2 = localOneProfileAboutPeopleView.a((omz)localObject2);
              localOneProfileAboutPeopleView.a(str13, localjfw2);
              bool6 = false;
            }
            if ((localomz3 != null) && (localomz3.a.intValue() > 0))
            {
              int i31 = efj.Ru;
              localOneProfileAboutPeopleView.b(localOneProfileAboutPeopleView.getContext().getResources().getString(i31), localomz3.a.intValue(), 11, bool6);
              localOneProfileAboutPeopleView.a(str13, localjfw1);
            }
          }
        }
        for (;;)
        {
          if ((i23 != 0) && (i26 == 0)) {}
          localOneProfileAboutPeopleView.c = this.e;
          break;
          localoon = null;
          break label623;
          omz localomz1 = localoon.b;
          omz localomz2 = localoon.a;
          localomz3 = localoon.c;
          localObject1 = localomz2;
          localObject2 = localomz1;
          break label637;
          i21 = 0;
          break label670;
          i22 = 0;
          break label686;
          int i34 = efj.Rx;
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = localOneProfileAboutPeopleView.a;
          str14 = localOneProfileAboutPeopleView.getContext().getResources().getString(i34, arrayOfObject4);
          break label719;
          i36 = 0;
          break label754;
          localjfw3 = null;
          break label768;
          i23 = 0;
          break label797;
          i24 = 0;
          break label830;
          i25 = 0;
          break label863;
          i26 = 0;
          break label884;
          i29 = 0;
          break label1019;
          int i28 = efj.Rs;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = localOneProfileAboutPeopleView.a;
          str12 = localOneProfileAboutPeopleView.getContext().getResources().getString(i28, arrayOfObject3);
          i29 = -1;
          break label1019;
          localjfw1 = null;
          break label1053;
          localjfw2 = null;
          break label1140;
          localOneProfileAboutPeopleView.a(str13, localjfw1);
        }
        ((OneProfileAboutCurrentLocationView)paramView).a = this.f;
        continue;
        OneProfileAboutLocalContactInfoView localOneProfileAboutLocalContactInfoView1 = (OneProfileAboutLocalContactInfoView)paramView;
        localOneProfileAboutLocalContactInfoView1.b = this.m;
        if (!this.S) {}
        for (boolean bool5 = true;; bool5 = false)
        {
          localOneProfileAboutLocalContactInfoView1.a = bool5;
          break;
        }
        ((OneProfileAboutReviewSummaryView)paramView).a = this.j;
        continue;
        ((OneProfileAboutZagatListView)paramView).a = this.k;
        continue;
        ((OneProfileAboutLinksView)paramView).a = this.h;
        continue;
        ((OneProfileAboutActionsView)paramView).a = this.l;
        continue;
        this.br = ((hhd)paramView);
        this.br.a(this.bc, jjf.c(this.p), this.q);
        continue;
        OneProfileAboutSquaresView localOneProfileAboutSquaresView = (OneProfileAboutSquaresView)paramView;
        ofk localofk = this.y;
        ofg localofg = this.z;
        oea localoea = this.A;
        int i19;
        if (localOneProfileAboutSquaresView.p)
        {
          odk[] arrayOfodk = localofg.a;
          if ((arrayOfodk == null) || (arrayOfodk.length == 0))
          {
            i19 = 1;
            if (i19 == 0) {
              break label1804;
            }
            localOneProfileAboutSquaresView.t.setVisibility(8);
            localOneProfileAboutSquaresView.a.removeAllViews();
            localOneProfileAboutSquaresView.b.setVisibility(8);
            View localView1 = LayoutInflater.from(localOneProfileAboutSquaresView.getContext()).inflate(aau.CA, localOneProfileAboutSquaresView.a, false);
            Button localButton = (Button)localView1.findViewById(aau.Cs);
            efj.a(localButton, new gxq(pjo.Z));
            localButton.setOnClickListener(new gxn(new lgm(localOneProfileAboutSquaresView)));
            ((ImageView)localView1.findViewById(aau.Cv)).setColorFilter(localOneProfileAboutSquaresView.getResources().getColor(az.P), PorterDuff.Mode.MULTIPLY);
            localOneProfileAboutSquaresView.a.addView(localView1);
            localOneProfileAboutSquaresView.c = new gxq(pjo.r);
          }
        }
        for (;;)
        {
          efj.f(localOneProfileAboutSquaresView);
          break;
          i19 = 0;
          break label1632;
          if (localoea.a != 2)
          {
            if (localoea.b != 2) {
              break label1898;
            }
            String[] arrayOfString5 = localoea.c;
            if ((arrayOfString5 != null) && (arrayOfString5.length != 0)) {
              break label1892;
            }
          }
          for (int i20 = 1;; i20 = 0)
          {
            if (i20 == 0) {
              break label1898;
            }
            localOneProfileAboutSquaresView.t.setVisibility(0);
            localOneProfileAboutSquaresView.a.removeAllViews();
            localOneProfileAboutSquaresView.b.setVisibility(0);
            localOneProfileAboutSquaresView.c = new gxq(pjo.p);
            break;
          }
          localOneProfileAboutSquaresView.a(localofk);
          continue;
          oed[] arrayOfoed = localofk.a;
          if ((arrayOfoed == null) || (arrayOfoed.length == 0)) {}
          for (int i18 = 1;; i18 = 0)
          {
            if (i18 != 0) {
              break label1948;
            }
            localOneProfileAboutSquaresView.a(localofk);
            break;
          }
        }
        jgm localjgm = (jgm)mbb.b(this.aM, jgm.class);
        jgn localjgn = null;
        if (localjgm != null)
        {
          boolean bool4 = localjgm.a(this.aM, this.ar);
          localjgn = null;
          if (bool4) {
            localjgn = localjgm.a(this.aM);
          }
        }
        if (localjgn != null)
        {
          OneProfileAboutBasicInfoView localOneProfileAboutBasicInfoView = (OneProfileAboutBasicInfoView)paramView;
          String str11 = localjgn.h();
          if (localOneProfileAboutBasicInfoView.b) {
            localOneProfileAboutBasicInfoView.a.setText(str11);
          }
        }
      }
    case 2: 
      label1053:
      label1324:
      label1330:
      label1336:
      label1342:
      label1348:
      label1354:
      label1360:
      label1366:
      int i7 = paramCursor.getCount();
      label1284:
      label1415:
      label1421:
      label1948:
      if ((this.aj == null) || (i1 != i7 - 1))
      {
        i8 = 1;
        if (i8 != 0)
        {
          if ((i7 - i1 < 30) && (this.aj != null) && (!this.ak))
          {
            this.ak = true;
            localdds = new dds(this, jjf.c(this.p));
            if (Build.VERSION.SDK_INT >= 11) {
              break label2342;
            }
            String[] arrayOfString4 = new String[1];
            arrayOfString4[0] = this.aj;
            localdds.execute(arrayOfString4);
          }
          localProfileAlbumTileView = (ProfileAlbumTileView)paramView;
          localdza = this.i;
          localProfileAlbumTileView.e.setText(paramCursor.getString(3));
          if (!paramCursor.isNull(6)) {
            break label2374;
          }
          localProfileAlbumTileView.f.setVisibility(4);
          label2205:
          localProfileAlbumTileView.g.a(ipf.a(localProfileAlbumTileView.getContext(), paramCursor.getString(5), ipm.a));
          if (paramCursor.isNull(8)) {
            break label3401;
          }
        }
      }
      label1409:
      label1804:
      break;
    }
    label2342:
    label2374:
    label3401:
    for (int i11 = paramCursor.getInt(8);; i11 = -1)
    {
      Bitmap localBitmap = null;
      switch (i11)
      {
      }
      for (;;)
      {
        localProfileAlbumTileView.h.setImageBitmap(localBitmap);
        localProfileAlbumTileView.i = paramCursor.getString(2);
        localProfileAlbumTileView.setOnClickListener(localProfileAlbumTileView);
        localProfileAlbumTileView.j = localdza;
        b(paramView, i2);
        return;
        i8 = 0;
        break;
        Executor localExecutor2 = AsyncTask.THREAD_POOL_EXECUTOR;
        String[] arrayOfString3 = new String[1];
        arrayOfString3[0] = this.aj;
        localdds.executeOnExecutor(localExecutor2, arrayOfString3);
        break label2158;
        localProfileAlbumTileView.f.setVisibility(0);
        int i9 = paramCursor.getInt(6);
        TextView localTextView = localProfileAlbumTileView.f;
        Resources localResources2 = localProfileAlbumTileView.getContext().getResources();
        int i10 = efj.xc;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i9);
        localTextView.setText(localResources2.getQuantityString(i10, i9, arrayOfObject2));
        break label2205;
        localBitmap = ProfileAlbumTileView.d;
        continue;
        localBitmap = ProfileAlbumTileView.b;
        continue;
        localBitmap = ProfileAlbumTileView.a;
        continue;
        localBitmap = ProfileAlbumTileView.c;
      }
      if (paramCursor.getInt(paramCursor.getColumnIndexOrThrow("profileItemType")) == 2) {
        this.ap.a(paramView, paramCursor, this.ar, (hgz)mbb.a(this.aM, hgz.class));
      }
      b(paramView, i2);
      return;
      switch (paramCursor.getInt(0))
      {
      default: 
        b(paramView, i2);
        return;
      case 20: 
        OneProfileVideosChannelView localOneProfileVideosChannelView = (OneProfileVideosChannelView)paramView;
        String str9;
        String str10;
        if (this.aa != null)
        {
          str9 = this.aa;
          ntr localntr2 = this.w.a.b;
          if (localntr2 == null) {
            break label2686;
          }
          str10 = localntr2.b;
          localOneProfileVideosChannelView.c = str10;
          if (localOneProfileVideosChannelView.c == null) {
            break label2692;
          }
          localOneProfileVideosChannelView.b.setText(localOneProfileVideosChannelView.getResources().getString(aau.rz, new Object[] { str9 }));
          localOneProfileVideosChannelView.setOnClickListener(localOneProfileVideosChannelView);
        }
        for (;;)
        {
          localOneProfileVideosChannelView.a = this.o;
          break;
          str9 = this.Z;
          break label2591;
          label2686:
          str10 = null;
          break label2615;
          localOneProfileVideosChannelView.b.setText(null);
          localOneProfileVideosChannelView.setOnClickListener(null);
        }
      }
      OneProfileVideosVideoView localOneProfileVideosVideoView = (OneProfileVideosVideoView)paramView;
      ntr localntr1 = this.w.a.b;
      int i6 = paramCursor.getInt(1);
      String str6;
      String str7;
      String str5;
      String str3;
      String str4;
      String str2;
      if ((i6 >= 0) && (localntr1 != null) && (localntr1.a != null) && (localntr1.a.length > i6))
      {
        ojf localojf = localntr1.a[i6];
        qch localqch = localojf.z;
        str6 = null;
        if (localqch != null) {
          str6 = localojf.z.a;
        }
        str7 = localojf.i;
        if (localojf.l != null)
        {
          str5 = localojf.l.a;
          Date localDate = new Date(localojf.l.d.longValue());
          String str8 = localOneProfileVideosVideoView.f.format(localDate);
          str3 = str7;
          str4 = str6;
          str2 = str8;
        }
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(str5))
        {
          localOneProfileVideosVideoView.b = efj.A(str5);
          localOneProfileVideosVideoView.setOnClickListener(new dxt(localOneProfileVideosVideoView));
          label2902:
          if (TextUtils.isEmpty(str4)) {
            break label2982;
          }
          localOneProfileVideosVideoView.c.a(ipf.a(localOneProfileVideosVideoView.getContext(), str4, ipm.a));
          label2931:
          if (str3 == null) {
            break label2994;
          }
          localOneProfileVideosVideoView.d.setText(str3);
          if (str2 == null) {
            break label3006;
          }
          localOneProfileVideosVideoView.e.setText(str2);
        }
        for (;;)
        {
          localOneProfileVideosVideoView.a = this.o;
          break;
          localOneProfileVideosVideoView.setOnClickListener(null);
          break label2902;
          localOneProfileVideosVideoView.c.a(null);
          break label2931;
          localOneProfileVideosVideoView.d.setText(null);
          break label2946;
          localOneProfileVideosVideoView.e.setText(null);
        }
        switch (paramCursor.getInt(0))
        {
        default: 
        case 17: 
          for (;;)
          {
            b(paramView, i2);
            return;
            OneProfileReviewsSummaryView localOneProfileReviewsSummaryView = (OneProfileReviewsSummaryView)paramView;
            qfp localqfp = this.x.a;
            qfq localqfq = localqfp.c;
            qfr localqfr = localqfp.d;
            if ((localqfq != null) && (localqfr != null))
            {
              Resources localResources1 = localOneProfileReviewsSummaryView.getResources();
              int i3 = efj.QS;
              int i4 = localqfq.a.intValue();
              Object[] arrayOfObject1 = new Object[1];
              arrayOfObject1[0] = localqfq.a;
              String str1 = localResources1.getQuantityString(i3, i4, arrayOfObject1);
              localOneProfileReviewsSummaryView.a.setText(str1);
              int i5 = localOneProfileReviewsSummaryView.getResources().getColor(ehr.cU);
              localOneProfileReviewsSummaryView.b.p = new ColorDrawable(i5);
              localOneProfileReviewsSummaryView.b.a(ipf.a(localOneProfileReviewsSummaryView.getContext(), localqfr.a, ipm.a));
            }
          }
        }
        ddt localddt;
        if ((paramCursor.getCount() - i1 < 10) && (this.ag != null) && (!this.ah))
        {
          this.ah = true;
          localddt = new ddt(this, jjf.c(this.p));
          if (Build.VERSION.SDK_INT >= 11) {
            break label3337;
          }
          String[] arrayOfString2 = new String[1];
          arrayOfString2[0] = this.ag;
          localddt.execute(arrayOfString2);
        }
        for (;;)
        {
          OneProfileAboutReviewView localOneProfileAboutReviewView1 = (OneProfileAboutReviewView)paramView;
          localOneProfileAboutReviewView1.a(this.x.a, paramCursor.getInt(1), this.ay.a(1));
          localOneProfileAboutReviewView1.b = this.n;
          break;
          Executor localExecutor1 = AsyncTask.THREAD_POOL_EXECUTOR;
          String[] arrayOfString1 = new String[1];
          arrayOfString1[0] = this.ag;
          localddt.executeOnExecutor(localExecutor1, arrayOfString1);
        }
        str3 = str7;
        str4 = str6;
        str2 = null;
        str5 = null;
        continue;
        str2 = null;
        str3 = null;
        str4 = null;
        str5 = null;
      }
    }
  }
  
  public final void a(dxp paramdxp)
  {
    this.bb = paramdxp;
    if (this.ad != null) {
      this.ad.l.a = paramdxp;
    }
  }
  
  protected final void a(eab parameab)
  {
    parameab.u = eai.b;
    super.a(parameab);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.bd = paramBoolean;
    if (this.ad != null) {
      this.ad.a(paramBoolean);
    }
  }
  
  public final boolean a(long paramLong)
  {
    if (paramLong != 0L) {
      if (this.bh == paramLong) {}
    }
    while (this.bg == null)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final void am_()
  {
    if ((this.aN[1].c == null) || (this.af == null)) {
      return;
    }
    int i5;
    label59:
    int i7;
    label97:
    int i8;
    int i2;
    int i1;
    label133:
    label166:
    boolean bool1;
    if (this.be.g == 0) {
      if (this.ad != null)
      {
        View localView = this.be.getChildAt(0);
        if (localView != null)
        {
          i5 = localView.getTop();
          this.bf = i5;
          OneProfileHeader localOneProfileHeader = this.ad;
          int i6 = this.bf;
          localOneProfileHeader.i.f(i6);
          if (this.ae != null) {
            break label257;
          }
          i7 = 0;
          i8 = this.ad.getHeight() - i7;
          if (i8 + this.bf > aU) {
            break label269;
          }
          this.bk = true;
          i2 = 0;
          i1 = 255;
          if (this.ae != null)
          {
            if (!this.bk) {
              break label376;
            }
            aV.setAlpha(255);
            this.ae.b(aV);
          }
          bool1 = this.af.a(5, this.aq);
          if (!this.bk) {
            break label411;
          }
        }
      }
    }
    label257:
    label269:
    label411:
    for (int i3 = 0;; i3 = 4)
    {
      int i4 = this.af.getVisibility();
      boolean bool2 = false;
      if (i4 != i3) {
        bool2 = true;
      }
      if (!(bool2 | bool1)) {
        break;
      }
      this.af.setVisibility(i3);
      Runnable localRunnable = this.bl;
      efj.m().removeCallbacks(localRunnable);
      efj.m().post(localRunnable);
      return;
      i5 = 0;
      break label59;
      i7 = this.ae.c();
      break label97;
      this.bk = false;
      int i9 = 255 * (this.bf + i8 / 2 - aU) / (i8 / 2 - aU);
      if (i9 > 255) {
        i9 = 255;
      }
      for (;;)
      {
        int i10 = 255 - i9;
        i1 = i9;
        i2 = i10;
        break;
        if (i9 < 0) {
          i9 = 0;
        }
      }
      this.bk = false;
      i1 = 255;
      i2 = 0;
      break label133;
      this.bk = true;
      this.bf = 0;
      i1 = 255;
      i2 = 0;
      break label133;
      label376:
      aW.getDrawable(0).setAlpha(i1);
      aW.getDrawable(1).setAlpha(i2);
      this.ae.b(aW);
      break label166;
    }
  }
  
  public final Boolean an_()
  {
    nxl localnxl = this.t;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localnxl != null)
    {
      nvm localnvm = this.t.c;
      bool1 = false;
      if (localnvm != null)
      {
        nxo localnxo = this.t.c.c;
        bool1 = false;
        if (localnxo != null)
        {
          localBoolean = this.t.c.c.b;
          if (localBoolean != null) {
            break label97;
          }
        }
      }
    }
    label97:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2)
      {
        boolean bool3 = bjt.a(this.w);
        bool1 = false;
        if (bool3) {
          bool1 = true;
        }
      }
      return Boolean.valueOf(bool1);
    }
  }
  
  public final int b(int paramInt)
  {
    switch (this.ai)
    {
    default: 
      return super.b(paramInt);
    case 1: 
    case 3: 
    case 4: 
      Cursor localCursor3 = this.aN[2].c;
      localCursor3.moveToPosition(paramInt);
      return h(localCursor3.getInt(0));
    case 5: 
      Cursor localCursor2 = this.aN[2].c;
      if ((localCursor2 != null) && (localCursor2.getCount() > paramInt))
      {
        localCursor2.moveToPosition(paramInt);
        switch (localCursor2.getInt(localCursor2.getColumnIndexOrThrow("profileItemType")))
        {
        default: 
          throw new IllegalArgumentException();
        case 1: 
          return h(24);
        }
        return h(23);
      }
      break;
    }
    if (s()) {
      return h(26 + this.a.getItemViewType(paramInt));
    }
    Cursor localCursor1 = this.aN[2].c;
    if ((this.aj != null) && (paramInt == -1 + localCursor1.getCount())) {
      return h(16);
    }
    return h(15);
  }
  
  public final Cursor b(long paramLong)
  {
    int i1;
    label17:
    boolean bool1;
    int i2;
    label49:
    boolean bool2;
    boolean bool3;
    int i31;
    label134:
    nxl localnxl11;
    int i30;
    label193:
    qgi localqgi;
    int i29;
    label297:
    int i28;
    label391:
    int i27;
    label399:
    nwj localnwj;
    int i24;
    label491:
    int i26;
    label516:
    int i18;
    label540:
    nxl localnxl1;
    boolean bool5;
    int i3;
    label605:
    oon localoon;
    label674:
    int i17;
    label712:
    ofk localofk;
    int i4;
    label860:
    nxv localnxv4;
    int i15;
    label947:
    int i14;
    label1047:
    int i13;
    label1148:
    nwl localnwl;
    int i12;
    if ((this.bg == null) || (a(paramLong)))
    {
      i1 = 1;
      if (i1 == 0) {
        break label2722;
      }
      this.bh = paramLong;
      bool1 = this.q;
      if ((!this.q) || (this.B)) {
        break label1439;
      }
      i2 = 1;
      bool2 = this.C;
      bool3 = this.D;
      this.bg = new hqr(aX);
      if (bool3)
      {
        nxl localnxl12 = this.t;
        String str1 = localnxl12.g;
        String str2 = efj.d(localnxl12);
        String str3 = efj.b(localnxl12);
        if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str3))) {
          break label1445;
        }
        i31 = 1;
        if (i31 != 0)
        {
          Object[] arrayOfObject17 = new Object[2];
          arrayOfObject17[0] = Integer.valueOf(13);
          arrayOfObject17[1] = null;
          this.bg.a(arrayOfObject17);
        }
      }
      if (bool2)
      {
        localnxl11 = this.t;
        if (TextUtils.isEmpty(efj.c(localnxl11))) {
          break label1451;
        }
        i30 = 1;
        if (i30 != 0)
        {
          Object[] arrayOfObject16 = new Object[2];
          arrayOfObject16[0] = Integer.valueOf(14);
          arrayOfObject16[1] = null;
          this.bg.a(arrayOfObject16);
        }
      }
      if (bool3)
      {
        localqgi = this.t.f.b.d;
        if ((localqgi.k == null) || (localqgi.k.a == null) || (localqgi.k.a.a == null) || (localqgi.k.a.b == null)) {
          break label1569;
        }
        i29 = 1;
        if (i29 != 0)
        {
          Object[] arrayOfObject15 = new Object[2];
          arrayOfObject15[0] = Integer.valueOf(9);
          arrayOfObject15[1] = null;
          this.bg.a(arrayOfObject15);
        }
      }
      if (bool3)
      {
        nxl localnxl10 = this.t;
        if ((localnxl10.f.b.d.r == null) && (efj.f(localnxl10) == null))
        {
          qhh localqhh = efj.e(localnxl10);
          if ((localqhh == null) || (localqhh.a.length <= 0)) {
            break label1601;
          }
          i28 = 1;
          if (i28 == 0) {
            break label1607;
          }
        }
        i27 = 1;
        if (i27 != 0)
        {
          Object[] arrayOfObject14 = new Object[2];
          arrayOfObject14[0] = Integer.valueOf(10);
          arrayOfObject14[1] = null;
          this.bg.a(arrayOfObject14);
        }
      }
      if (bool2)
      {
        nxl localnxl9 = this.t;
        if (!efj.h(localnxl9)) {
          break label1724;
        }
        localnwj = localnxl9.f.b;
        if (!efj.a(localnwj)) {
          break label1625;
        }
        qgr[] arrayOfqgr = localnwj.d.i.a;
        int i23 = arrayOfqgr.length;
        i24 = 0;
        if (i24 >= i23) {
          break label1724;
        }
        qgs[] arrayOfqgs = arrayOfqgr[i24].b;
        int i25 = arrayOfqgs.length;
        i26 = 0;
        if (i26 >= i25) {
          break label1619;
        }
        if (TextUtils.isEmpty(arrayOfqgs[i26].a)) {
          break label1613;
        }
        i18 = 1;
        if (i18 != 0)
        {
          Object[] arrayOfObject13 = new Object[2];
          arrayOfObject13[0] = Integer.valueOf(11);
          arrayOfObject13[1] = null;
          this.bg.a(arrayOfObject13);
        }
      }
      localnxl1 = this.t;
      boolean bool4 = this.q;
      bool5 = this.B;
      if ((!bool4) || (bool2)) {
        break label1730;
      }
      i3 = 1;
      if (i3 != 0)
      {
        Object[] arrayOfObject12 = new Object[2];
        arrayOfObject12[0] = Integer.valueOf(1);
        arrayOfObject12[1] = null;
        this.bg.a(arrayOfObject12);
      }
      if (!this.q)
      {
        if ((this.v == null) || (this.v.a == null)) {
          break label1854;
        }
        localoon = this.v.a.a;
        if (localoon == null) {
          break label1932;
        }
        omz localomz1 = localoon.c;
        if (localomz1 == null) {
          break label1860;
        }
        omy[] arrayOfomy3 = localomz1.b;
        if ((arrayOfomy3 == null) || (arrayOfomy3.length == 0)) {
          break label1860;
        }
        i17 = 1;
        if (i17 == 0) {}
      }
      else
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(0);
        arrayOfObject1[1] = null;
        this.bg.a(arrayOfObject1);
      }
      if ((this.ap.a(this.q, this.ar)) || ((this.bc != null) && (this.bc.getCount() != 0)))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(25);
        arrayOfObject2[1] = null;
        this.bg.a(arrayOfObject2);
      }
      boolean bool6 = this.q;
      localofk = this.y;
      ofg localofg = this.z;
      oea localoea = this.A;
      if (!bool6) {
        break label1944;
      }
      if ((localofk == null) || (localofg == null) || (localoea == null)) {
        break label1938;
      }
      i4 = 1;
      if (i4 != 0)
      {
        Object[] arrayOfObject11 = new Object[2];
        arrayOfObject11[0] = Integer.valueOf(22);
        arrayOfObject11[1] = null;
        this.bg.a(arrayOfObject11);
      }
      if (i2 == 0)
      {
        nxl localnxl8 = this.t;
        if (localnxl8 == null) {
          break label2058;
        }
        localnxv4 = localnxl8.e;
        if (localnxv4 == null) {
          break label2058;
        }
        if ((localnxv4.f == null) || (TextUtils.isEmpty(localnxv4.f.b))) {
          break label1993;
        }
        i15 = 1;
        if (i15 == 0) {}
      }
      else
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(2);
        arrayOfObject3[1] = null;
        this.bg.a(arrayOfObject3);
      }
      if (i2 == 0)
      {
        nxl localnxl7 = this.t;
        if ((localnxl7 == null) || (localnxl7.e == null) || (localnxl7.e.h == null) || (localnxl7.e.h.b == null) || (localnxl7.e.h.b.length <= 0)) {
          break label2064;
        }
        i14 = 1;
        if (i14 == 0) {}
      }
      else
      {
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Integer.valueOf(3);
        arrayOfObject4[1] = null;
        this.bg.a(arrayOfObject4);
      }
      if (!this.B) {
        if (i2 == 0)
        {
          nxl localnxl6 = this.t;
          if (localnxl6 == null) {
            break label2070;
          }
          nxv localnxv3 = localnxl6.e;
          if (localnxv3 == null) {
            break label2070;
          }
          nvw localnvw = localnxv3.n;
          if (localnvw == null) {
            break label2070;
          }
          nvv[] arrayOfnvv = localnvw.a;
          if ((arrayOfnvv == null) || (arrayOfnvv.length == 0)) {
            break label2070;
          }
          i13 = 1;
          if (i13 == 0) {}
        }
        else
        {
          Object[] arrayOfObject10 = new Object[2];
          arrayOfObject10[0] = Integer.valueOf(4);
          arrayOfObject10[1] = null;
          this.bg.a(arrayOfObject10);
        }
      }
      if (i2 == 0)
      {
        nxl localnxl5 = this.t;
        if (localnxl5 == null) {
          break label2099;
        }
        nxv localnxv2 = localnxl5.e;
        if (localnxv2 == null) {
          break label2099;
        }
        localnwl = localnxv2.i;
        if (localnwl == null) {
          break label2099;
        }
        if (TextUtils.isEmpty(localnwl.b)) {
          break label2076;
        }
        i12 = 1;
      }
    }
    nxv localnxv1;
    for (;;)
    {
      if (i12 != 0)
      {
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = Integer.valueOf(5);
        arrayOfObject5[1] = null;
        this.bg.a(arrayOfObject5);
      }
      if (i2 != 0) {
        break label2113;
      }
      nxl localnxl4 = this.t;
      if (localnxl4 == null) {
        break label2613;
      }
      localnxv1 = localnxl4.e;
      if (localnxv1 == null) {
        break label2613;
      }
      nwb localnwb = localnxv1.e;
      if (localnwb != null) {}
      switch (localnwb.b)
      {
      default: 
        nxc localnxc = localnxv1.m;
        if ((localnxc == null) || (localnxc.b == null) || (localnxc.b.length <= 0)) {
          break label2477;
        }
        nxb[] arrayOfnxb = localnxc.b;
        int i10 = arrayOfnxb.length;
        for (int i11 = 0; i11 < i10; i11++) {
          switch (arrayOfnxb[i11].a)
          {
          }
        }
        i1 = 0;
        break label17;
        label1439:
        i2 = 0;
        break label49;
        label1445:
        i31 = 0;
        break label134;
        label1451:
        if (!TextUtils.isEmpty(efj.b(localnxl11)))
        {
          i30 = 1;
          break label193;
        }
        qgm localqgm = efj.i(localnxl11);
        if ((localqgm != null) && (!TextUtils.isEmpty(localqgm.a)))
        {
          i30 = 1;
          break label193;
        }
        qga[] arrayOfqga = efj.k(localnxl11);
        if ((arrayOfqga != null) && (arrayOfqga.length != 0))
        {
          qga localqga = arrayOfqga[0];
          if ((localqga.a != null) && (localqga.a.b != null) && (!TextUtils.isEmpty(localqga.a.b.a)))
          {
            i30 = 1;
            break label193;
          }
        }
        i30 = 0;
        break label193;
        label1569:
        qgf localqgf = localqgi.s;
        if ((localqgf != null) && (localqgf.a != null))
        {
          i29 = 1;
          break label297;
        }
        i29 = 0;
        break label297;
        label1601:
        i28 = 0;
        break label391;
        label1607:
        i27 = 0;
        break label399;
        label1613:
        i26++;
        break label516;
        label1619:
        i24++;
        break label491;
        label1625:
        if (efj.b(localnwj))
        {
          nxz[] arrayOfnxz = localnwj.b.a;
          int i19 = arrayOfnxz.length;
          for (int i20 = 0;; i20++)
          {
            if (i20 >= i19) {
              break label1724;
            }
            nxu[] arrayOfnxu = arrayOfnxz[i20].b;
            int i21 = arrayOfnxu.length;
            for (int i22 = 0;; i22++)
            {
              if (i22 >= i21) {
                break label1718;
              }
              nxu localnxu = arrayOfnxu[i22];
              if ((localnxu.a != null) && (localnxu.b != null))
              {
                i18 = 1;
                break;
              }
            }
          }
        }
        label1718:
        label1724:
        i18 = 0;
        break label540;
        label1730:
        if (localnxl1 != null)
        {
          nvn localnvn3 = localnxl1.d;
          if (localnvn3 != null)
          {
            if ((localnvn3.d != null) && (!TextUtils.isEmpty(localnvn3.d.b)))
            {
              i3 = 1;
              break label605;
            }
            if ((localnvn3.e != null) && (!TextUtils.isEmpty(localnvn3.e.b)))
            {
              i3 = 1;
              break label605;
            }
          }
          if (!bool5)
          {
            nxv localnxv5 = localnxl1.e;
            if ((localnxv5 != null) && (localnxv5.k != null) && (!TextUtils.isEmpty(localnxv5.k.b)))
            {
              i3 = 1;
              break label605;
            }
          }
        }
        i3 = 0;
        break label605;
        label1854:
        localoon = null;
        break label674;
        label1860:
        omz localomz2 = localoon.b;
        if (localomz2 != null)
        {
          omy[] arrayOfomy2 = localomz2.b;
          if ((arrayOfomy2 != null) && (arrayOfomy2.length != 0))
          {
            i17 = 1;
            break label712;
          }
        }
        omz localomz3 = localoon.a;
        if (localomz3 != null)
        {
          omy[] arrayOfomy1 = localomz3.b;
          if ((arrayOfomy1 != null) && (arrayOfomy1.length != 0))
          {
            i17 = 1;
            break label712;
          }
        }
        label1932:
        i17 = 0;
        break label712;
        label1938:
        i4 = 0;
        break label860;
        label1944:
        if (localofk != null)
        {
          oed[] arrayOfoed = localofk.a;
          if ((arrayOfoed == null) || (arrayOfoed.length == 0)) {}
          for (int i16 = 1;; i16 = 0)
          {
            if (i16 != 0) {
              break label1987;
            }
            i4 = 1;
            break;
          }
        }
        label1987:
        i4 = 0;
        break label860;
        label1993:
        if ((localnxv4.o != null) && (!TextUtils.isEmpty(localnxv4.o.b)))
        {
          i15 = 1;
          break label947;
        }
        if ((localnxv4.g != null) && (localnxv4.g.b != null) && (localnxv4.g.b.length > 0))
        {
          i15 = 1;
          break label947;
        }
        label2058:
        i15 = 0;
        break label947;
        label2064:
        i14 = 0;
        break label1047;
        label2070:
        i13 = 0;
        break label1148;
        label2076:
        if ((localnwl.c != null) && (localnwl.c.length > 0)) {
          i12 = 1;
        } else {
          label2099:
          i12 = 0;
        }
        break;
      }
    }
    int i9 = 1;
    if (i9 != 0)
    {
      label2113:
      Object[] arrayOfObject6 = new Object[2];
      arrayOfObject6[0] = Integer.valueOf(6);
      arrayOfObject6[1] = null;
      this.bg.a(arrayOfObject6);
    }
    nvr localnvr;
    int i8;
    if (!bool2) {
      if (!bool1)
      {
        nxl localnxl3 = this.t;
        if (localnxl3 == null) {
          break label2688;
        }
        nvn localnvn2 = localnxl3.d;
        if (localnvn2 == null) {
          break label2688;
        }
        localnvr = localnvn2.c;
        if (localnvr == null) {
          break label2688;
        }
        if ((localnvr.c == null) || (localnvr.c.length <= 0)) {
          break label2619;
        }
        i8 = 1;
        label2207:
        if (i8 == 0) {}
      }
      else
      {
        Object[] arrayOfObject9 = new Object[2];
        arrayOfObject9[0] = Integer.valueOf(7);
        arrayOfObject9[1] = null;
        this.bg.a(arrayOfObject9);
      }
    }
    nxl localnxl2 = this.t;
    int i5;
    label2297:
    Integer localInteger;
    int i6;
    if (localnxl2 != null)
    {
      nvn localnvn1 = localnxl2.d;
      if (localnvn1 != null)
      {
        nwg localnwg = localnvn1.g;
        if (localnwg != null)
        {
          nwf[] arrayOfnwf = localnwg.a;
          if ((arrayOfnwf != null) && (arrayOfnwf.length > 0))
          {
            i5 = 1;
            if (i5 != 0)
            {
              Object[] arrayOfObject8 = new Object[2];
              arrayOfObject8[0] = Integer.valueOf(8);
              arrayOfObject8[1] = null;
              this.bg.a(arrayOfObject8);
            }
            if (!bool3) {
              break label2722;
            }
            qgy localqgy = this.t.f.b.d.k;
            if (localqgy == null) {
              break label2710;
            }
            qfz localqfz = localqgy.a;
            if (localqfz == null) {
              break label2710;
            }
            localInteger = localqfz.b;
            if (localInteger != null) {
              break label2700;
            }
            i6 = 0;
            label2386:
            if (i6 <= 0) {
              break label2716;
            }
          }
        }
      }
    }
    label2688:
    label2700:
    label2710:
    label2716:
    for (int i7 = 1;; i7 = 0)
    {
      if (i7 == 0) {
        break label2722;
      }
      Iterator localIterator = efj.g(this.t).iterator();
      while (localIterator.hasNext())
      {
        qgj localqgj = (qgj)localIterator.next();
        Object[] arrayOfObject7 = new Object[2];
        arrayOfObject7[0] = Integer.valueOf(12);
        arrayOfObject7[1] = localqgj.e;
        this.bg.a(arrayOfObject7);
      }
      i9 = 1;
      break;
      label2477:
      if ((localnxv1.j != null) && (!TextUtils.isEmpty(localnxv1.j.a)))
      {
        i9 = 1;
        break;
      }
      if (localnxv1.l != null) {}
      switch (localnxv1.l.b)
      {
      default: 
        nws localnws = localnxv1.b;
        if ((localnws != null) && (localnws.b != null) && (localnws.b.length > 0)) {
          i9 = 1;
        }
        break;
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
        i9 = 1;
        break;
        label2613:
        i9 = 0;
        break;
        label2619:
        if ((localnvr.b != null) && (localnvr.b.length > 0))
        {
          i8 = 1;
          break label2207;
        }
        if ((localnvr.d != null) && (localnvr.d.length > 0))
        {
          i8 = 1;
          break label2207;
        }
        if ((localnvr.a != null) && (localnvr.a.length > 0))
        {
          i8 = 1;
          break label2207;
        }
        i8 = 0;
        break label2207;
        i5 = 0;
        break label2297;
        i6 = localInteger.intValue();
        break label2386;
        i6 = 0;
        break label2386;
      }
    }
    label2722:
    return this.bg;
  }
  
  public final View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    lpt locallpt = new lpt(-2);
    locallpt.a = 1;
    switch (this.ai)
    {
    default: 
      return super.b(paramContext, paramCursor, paramViewGroup);
    case 1: 
      int i5 = paramCursor.getInt(0);
      View localView4;
      switch (i5)
      {
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 23: 
      case 24: 
      default: 
        return null;
      case 0: 
        localView4 = this.ba.inflate(efj.va, paramViewGroup, false);
      }
      for (;;)
      {
        localView4.setTag(Integer.valueOf(i5));
        localView4.setLayoutParams(locallpt);
        return localView4;
        localView4 = this.ba.inflate(this.ap.e(), paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.ve, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.vf, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.vg, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uV, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uZ, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.vb, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uT, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uU, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.vd, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.vh, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uW, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uS, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.uY, paramViewGroup, false);
        continue;
        localView4 = this.ba.inflate(efj.vc, paramViewGroup, false);
        ((OneProfileAboutReviewView)localView4).a = paramCursor.getString(1);
        continue;
        localView4 = this.ba.inflate(efj.uX, paramViewGroup, false);
      }
    case 2: 
      View localView3;
      if ((this.aj != null) && (paramCursor.getPosition() == -1 + paramCursor.getCount()))
      {
        localView3 = this.ba.inflate(efj.uu, paramViewGroup, false);
        locallpt.a = this.ay.a;
      }
      for (;;)
      {
        localView3.setLayoutParams(locallpt);
        return localView3;
        localView3 = this.ba.inflate(efj.vj, paramViewGroup, false);
      }
    case 5: 
      int i3 = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("profileItemType"));
      if (i3 == 2) {}
      int i4;
      for (Object localObject = this.ap.a(paramContext, paramViewGroup);; localObject = this.ba.inflate(i4, paramViewGroup, false))
      {
        ((View)localObject).setLayoutParams(locallpt);
        return localObject;
        i4 = this.ap.a(i3);
      }
    case 3: 
      int i2 = paramCursor.getInt(0);
      View localView2;
      switch (i2)
      {
      default: 
        return null;
      case 20: 
        localView2 = this.ba.inflate(efj.vl, paramViewGroup, false);
        locallpt.a = this.ay.a;
      }
      for (;;)
      {
        localView2.setTag(Integer.valueOf(i2));
        localView2.setLayoutParams(locallpt);
        return localView2;
        localView2 = this.ba.inflate(efj.vm, paramViewGroup, false);
      }
    }
    int i1 = paramCursor.getInt(0);
    View localView1;
    switch (i1)
    {
    default: 
      return null;
    case 17: 
      localView1 = this.ba.inflate(efj.vk, paramViewGroup, false);
    }
    for (;;)
    {
      localView1.setTag(Integer.valueOf(i1));
      localView1.setLayoutParams(locallpt);
      return localView1;
      localView1 = this.ba.inflate(efj.vc, paramViewGroup, false);
      continue;
      localView1 = this.ba.inflate(efj.uu, paramViewGroup, false);
      locallpt.a = this.ay.a;
    }
  }
  
  public final void c()
  {
    if (this.bk)
    {
      tp localtp = this.ae;
      int i1 = 0;
      if (localtp == null) {}
      for (;;)
      {
        this.be.a(1, i1 + aU);
        return;
        i1 = this.ae.c();
      }
    }
    this.be.a(0, this.bf);
  }
  
  public final void c(int paramInt)
  {
    this.af.a(paramInt);
    if (this.ad != null) {
      this.ad.z.a(paramInt);
    }
    this.ai = paramInt;
  }
  
  public final void c(Cursor paramCursor)
  {
    this.bc = paramCursor;
    if (this.br != null) {
      this.br.a(this.bc, jjf.c(this.p), this.q);
    }
  }
  
  public final boolean d()
  {
    boolean bool1;
    int i2;
    label45:
    int i3;
    boolean bool2;
    int i4;
    if (this.bj != null)
    {
      this.bj.moveToFirst();
      if (this.bj.getInt(0) != 17) {
        break label106;
      }
      bool1 = true;
      int i1 = this.bj.getCount();
      if (!bool1) {
        break label111;
      }
      i2 = 1;
      i3 = i1 - i2;
      if ((this.x == null) || (this.x.a == null)) {
        break label119;
      }
      qfp localqfp = this.x.a;
      bool2 = a(localqfp);
      i4 = b(localqfp);
    }
    for (;;)
    {
      if ((bool1 != bool2) || (i3 != i4))
      {
        return true;
        label106:
        bool1 = false;
        break;
        label111:
        i2 = 0;
        break label45;
      }
      return false;
      label119:
      i4 = 0;
      bool2 = false;
    }
  }
  
  public final byte[] d(int paramInt)
  {
    nxl localnxl = this.t;
    nxn localnxn = null;
    if (localnxl != null)
    {
      localnxn = null;
      switch (paramInt)
      {
      }
    }
    while (localnxn == null)
    {
      return new byte[0];
      nxv localnxv3 = this.t.e;
      localnxn = null;
      if (localnxv3 != null)
      {
        localnxn = this.t.e.f;
        continue;
        nxv localnxv2 = this.t.e;
        localnxn = null;
        if (localnxv2 != null)
        {
          localnxn = this.t.e.o;
          continue;
          nvn localnvn = this.t.d;
          localnxn = null;
          if (localnvn != null)
          {
            localnxn = this.t.d.d;
            continue;
            nxv localnxv1 = this.t.e;
            localnxn = null;
            if (localnxv1 != null) {
              localnxn = this.t.e.k;
            }
          }
        }
      }
    }
    return qat.a(localnxn);
  }
  
  public final Cursor e()
  {
    if (d())
    {
      this.bj = new hqr(aY);
      if ((this.x != null) && (this.x.a != null))
      {
        qfp localqfp = this.x.a;
        boolean bool = a(localqfp);
        int i1 = b(localqfp);
        if (bool)
        {
          hqr localhqr3 = this.bj;
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = Integer.valueOf(17);
          arrayOfObject3[1] = Integer.valueOf(0);
          localhqr3.a(arrayOfObject3);
        }
        for (int i2 = 0; i2 < i1; i2++)
        {
          hqr localhqr2 = this.bj;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(18);
          arrayOfObject2[1] = Integer.valueOf(i2);
          localhqr2.a(arrayOfObject2);
        }
        if (this.ag != null)
        {
          hqr localhqr1 = this.bj;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(19);
          arrayOfObject1[1] = Integer.valueOf(0);
          localhqr1.a(arrayOfObject1);
        }
      }
    }
    return this.bj;
  }
  
  public final boolean f()
  {
    int i1;
    int i3;
    label46:
    int i4;
    int i7;
    label107:
    int i6;
    int i5;
    if ((this.bi != null) && (this.bi.moveToFirst()))
    {
      if (this.bi.getInt(0) != 20) {
        break label137;
      }
      i1 = 1;
      int i2 = this.bi.getCount();
      if (i1 == 0) {
        break label142;
      }
      i3 = 1;
      i4 = i2 - i3;
      if ((this.w == null) || (this.w.a == null) || (this.w.a.b == null)) {
        break label155;
      }
      ntr localntr = this.w.a.b;
      if (TextUtils.isEmpty(localntr.b)) {
        break label147;
      }
      i7 = 1;
      int i8 = b(localntr);
      i6 = i7;
      i5 = i8;
    }
    for (;;)
    {
      if ((i1 != i6) || (i4 != i5))
      {
        return true;
        label137:
        i1 = 0;
        break;
        label142:
        i3 = 0;
        break label46;
        label147:
        i7 = 0;
        break label107;
      }
      return false;
      label155:
      i5 = 0;
      i6 = 0;
    }
  }
  
  public final Cursor g()
  {
    if (f())
    {
      this.bi = new hqr(aZ);
      if ((this.w != null) && (this.w.a != null) && (this.w.a.b != null))
      {
        ntr localntr = this.w.a.b;
        if (!TextUtils.isEmpty(localntr.b)) {}
        for (int i1 = 1;; i1 = 0)
        {
          int i2 = b(localntr);
          if (i1 != 0)
          {
            hqr localhqr2 = this.bi;
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(20);
            arrayOfObject2[1] = Integer.valueOf(0);
            localhqr2.a(arrayOfObject2);
          }
          for (int i3 = 0; i3 < i2; i3++)
          {
            hqr localhqr1 = this.bi;
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = Integer.valueOf(21);
            arrayOfObject1[1] = Integer.valueOf(i3);
            localhqr1.a(arrayOfObject1);
          }
        }
      }
    }
    return this.bi;
  }
  
  public final int getCount()
  {
    if (s())
    {
      int i1 = this.a.getCount();
      if (2 >= this.aO) {
        throw new ArrayIndexOutOfBoundsException(2);
      }
      hqg localhqg = this.aN[2];
      if ((localhqg.b) && ((i1 != 0) || (localhqg.a))) {
        i1++;
      }
      int i2 = i1 + e_(1);
      if ((this.bq >= 0) && (i2 != this.bq))
      {
        StreamGridView localStreamGridView = this.be;
        localStreamGridView.d();
        localStreamGridView.i = i2;
        if (localStreamGridView.i > 0) {
          localStreamGridView.i += localStreamGridView.a.a;
        }
        localStreamGridView.i = (1 + localStreamGridView.i);
      }
      this.bq = i2;
      return i2;
    }
    return super.getCount();
  }
  
  public final Object getItem(int paramInt)
  {
    int i1 = e_(1);
    if ((s()) && (paramInt >= i1))
    {
      int i2 = paramInt - i1;
      return this.a.getItem(i2);
    }
    return super.getItem(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    int i1 = e_(1);
    if ((s()) && (paramInt >= i1))
    {
      int i2 = paramInt - i1;
      return this.a.getItemId(i2);
    }
    return super.getItemId(paramInt);
  }
  
  public final int getViewTypeCount()
  {
    return 5 + (26 + aR);
  }
  
  public final void h()
  {
    if (this.ad == null) {
      return;
    }
    if (this.r)
    {
      Cursor localCursor = this.aN[2].c;
      if ((localCursor != null) && (localCursor.getCount() == 0))
      {
        String str3;
        String str4;
        if (this.B)
        {
          str3 = this.Z;
          switch (this.ai)
          {
          case 1: 
          default: 
            str4 = null;
          }
        }
        for (;;)
        {
          if (str4 == null) {
            break label271;
          }
          this.ad.a(true, this.bn, str4);
          return;
          str3 = this.aa;
          break;
          if (this.al)
          {
            if (this.q)
            {
              int i6 = aau.mo;
              Object[] arrayOfObject5 = { str3 };
              str4 = this.aM.getString(i6, arrayOfObject5);
            }
            else
            {
              int i5 = aau.rd;
              Object[] arrayOfObject4 = { str3 };
              str4 = this.aM.getString(i5, arrayOfObject4);
            }
          }
          else
          {
            str4 = null;
            continue;
            if (this.q)
            {
              int i4 = aau.mn;
              Object[] arrayOfObject3 = { str3 };
              str4 = this.aM.getString(i4, arrayOfObject3);
            }
            else
            {
              int i3 = aau.rc;
              Object[] arrayOfObject2 = { str3 };
              str4 = this.aM.getString(i3, arrayOfObject2);
            }
          }
        }
        label271:
        this.ad.a(false, false, null);
        return;
      }
      if (localCursor == null) {}
      boolean bool;
      String str2;
      switch (this.ai)
      {
      default: 
        bool = false;
        str2 = null;
      }
      for (;;)
      {
        this.ad.a(bool, false, str2);
        return;
        int i2 = aau.jn;
        str2 = this.aM.getString(i2);
        bool = true;
      }
    }
    switch (this.ai)
    {
    default: 
      this.ad.a(false, false, null);
      return;
    }
    int i1 = aau.re;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.Z;
    String str1 = this.aM.getString(i1, arrayOfObject1);
    this.ad.a(true, false, str1);
  }
  
  public final boolean isEmpty()
  {
    if (s()) {
      return this.a.isEmpty();
    }
    return super.isEmpty();
  }
  
  public final void j()
  {
    boolean bool1 = true;
    if (this.ad == null) {
      return;
    }
    int i6;
    label30:
    boolean bool7;
    if (this.J) {
      if (!TextUtils.isEmpty(this.O))
      {
        i6 = bool1;
        if (i6 == 0) {
          break label131;
        }
        OneProfileHeader localOneProfileHeader6 = this.ad;
        String str7 = this.O;
        nxh localnxh = this.W;
        int i9 = this.V;
        boolean bool6 = this.Y;
        if (B()) {
          break label125;
        }
        bool7 = bool1;
        label75:
        localOneProfileHeader6.a(str7, localnxh, i9, bool6, bool7);
      }
    }
    label90:
    for (boolean bool2 = bool1;; bool2 = false)
    {
      if (bool2)
      {
        OneProfileHeader localOneProfileHeader4 = this.ad;
        int i7 = this.bf;
        localOneProfileHeader4.i.f(i7);
        return;
        i6 = 0;
        break label30;
        label125:
        bool7 = false;
        break label75;
        if (this.M == null) {
          continue;
        }
        OneProfileHeader localOneProfileHeader5 = this.ad;
        String str5 = C();
        String str6 = this.M;
        boolean bool5 = this.Y;
        if (!B()) {}
        for (int i8 = bool1;; i8 = 0)
        {
          if (TextUtils.equals(str6, localOneProfileHeader5.j)) {
            break label205;
          }
          if (!TextUtils.isEmpty(str6)) {
            break label207;
          }
          localOneProfileHeader5.b();
          break;
        }
        break label90;
        localOneProfileHeader5.j = str6;
        localOneProfileHeader5.i.b = lym.a;
        com.google.android.apps.plus.views.CoverPhotoImageView localCoverPhotoImageView2 = localOneProfileHeader5.i;
        Context localContext = localOneProfileHeader5.getContext();
        long l1 = Long.parseLong(str6);
        ipm localipm;
        if (bool5)
        {
          localipm = ipm.d;
          localCoverPhotoImageView2.a(ipf.a(localContext, str5, l1, null, null, localipm));
          if (i8 == 0) {
            break label300;
          }
        }
        for (Object localObject3 = null;; localObject3 = localOneProfileHeader5)
        {
          localOneProfileHeader5.a((View.OnClickListener)localObject3);
          break;
          localipm = ipm.a;
          break label256;
        }
        bool2 = false;
      }
      OneProfileHeader localOneProfileHeader3;
      String str3;
      int i4;
      String str4;
      int i5;
      if (this.I)
      {
        if (this.O == null) {
          break label521;
        }
        localOneProfileHeader3 = this.ad;
        str3 = this.O;
        i4 = this.X;
        str4 = this.P;
        boolean bool4 = B();
        i5 = 0;
        if (!bool4) {
          i5 = bool1;
        }
        if (!TextUtils.equals(str3, localOneProfileHeader3.j))
        {
          if (!TextUtils.isEmpty(str3)) {
            break label422;
          }
          localOneProfileHeader3.b();
        }
      }
      while (!bool1)
      {
        this.ad.b();
        OneProfileHeader localOneProfileHeader1 = this.ad;
        int i1 = this.bf;
        localOneProfileHeader1.i.f(i1);
        return;
        localOneProfileHeader3.j = str3;
        localOneProfileHeader3.i.b = lym.b;
        com.google.android.apps.plus.views.CoverPhotoImageView localCoverPhotoImageView1 = localOneProfileHeader3.i;
        localCoverPhotoImageView1.d = ipf.a(localCoverPhotoImageView1.getContext(), str4, ipm.a);
        localOneProfileHeader3.i.a(ipf.a(localOneProfileHeader3.getContext(), str3, ipm.a));
        localOneProfileHeader3.i.g(i4);
        Object localObject2 = null;
        if (i5 != 0) {}
        for (;;)
        {
          localOneProfileHeader3.a((View.OnClickListener)localObject2);
          break;
          localObject2 = localOneProfileHeader3;
        }
        if (this.M != null)
        {
          OneProfileHeader localOneProfileHeader2 = this.ad;
          String str1 = C();
          String str2 = this.M;
          int i2 = this.X;
          boolean bool3 = B();
          int i3 = 0;
          if (!bool3) {
            i3 = bool1;
          }
          if (!TextUtils.equals(str2, localOneProfileHeader2.j)) {
            if (TextUtils.isEmpty(str2))
            {
              localOneProfileHeader2.b();
            }
            else
            {
              localOneProfileHeader2.j = str2;
              localOneProfileHeader2.i.b = lym.b;
              localOneProfileHeader2.i.a(ipf.a(localOneProfileHeader2.getContext(), str1, Long.parseLong(str2), null, null, ipm.a));
              localOneProfileHeader2.i.g(i2);
              Object localObject1 = null;
              if (i3 != 0) {}
              for (;;)
              {
                localOneProfileHeader2.a((View.OnClickListener)localObject1);
                break;
                localObject1 = localOneProfileHeader2;
              }
            }
          }
        }
        else
        {
          bool1 = bool2;
        }
      }
      break;
    }
  }
  
  public final Boolean k()
  {
    nxl localnxl = this.t;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localnxl != null)
    {
      nvm localnvm = this.t.c;
      bool1 = false;
      if (localnvm != null)
      {
        nxo localnxo = this.t.c.c;
        bool1 = false;
        if (localnxo != null)
        {
          localBoolean = this.t.c.c.c;
          if (localBoolean != null) {
            break label81;
          }
        }
      }
    }
    label81:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return Boolean.valueOf(bool1);
    }
  }
  
  public final Boolean l()
  {
    nxl localnxl = this.t;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localnxl != null)
    {
      nvm localnvm = this.t.c;
      bool1 = false;
      if (localnvm != null)
      {
        nxo localnxo = this.t.c.c;
        bool1 = false;
        if (localnxo != null)
        {
          localBoolean = this.t.c.c.a;
          if (localBoolean != null) {
            break label81;
          }
        }
      }
    }
    label81:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return Boolean.valueOf(bool1);
    }
  }
  
  public final Boolean m()
  {
    nxl localnxl = this.t;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localnxl != null)
    {
      nvm localnvm = this.t.c;
      bool1 = false;
      if (localnvm != null)
      {
        nxo localnxo = this.t.c.c;
        bool1 = false;
        if (localnxo != null)
        {
          localBoolean = this.t.c.c.d;
          if (localBoolean != null) {
            break label81;
          }
        }
      }
    }
    label81:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return Boolean.valueOf(bool1);
    }
  }
  
  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    if (s()) {
      a(true, this.bq);
    }
  }
  
  public final void o()
  {
    if (this.ad == null) {
      return;
    }
    if (this.bm)
    {
      OneProfileHeader localOneProfileHeader5 = this.ad;
      ArrayList localArrayList = this.bp;
      localOneProfileHeader5.v.a(localArrayList);
      localOneProfileHeader5.v.setVisibility(0);
      localOneProfileHeader5.v.a(false);
      localOneProfileHeader5.u.setVisibility(8);
      return;
    }
    if (this.bn)
    {
      OneProfileHeader localOneProfileHeader4 = this.ad;
      boolean bool = this.B;
      localOneProfileHeader4.v.a(null);
      localOneProfileHeader4.v.a(6);
      CirclesButton localCirclesButton2 = localOneProfileHeader4.v;
      Resources localResources = localOneProfileHeader4.getResources();
      if (bool) {}
      for (int i1 = aau.hT;; i1 = aau.bM)
      {
        localCirclesButton2.a(localResources.getString(i1));
        localOneProfileHeader4.v.a(false);
        localOneProfileHeader4.v.setVisibility(0);
        localOneProfileHeader4.u.setVisibility(8);
        return;
      }
    }
    if (this.bo)
    {
      OneProfileHeader localOneProfileHeader3 = this.ad;
      localOneProfileHeader3.v.a(true);
      CirclesButton localCirclesButton1 = localOneProfileHeader3.v;
      if (localCirclesButton1.c)
      {
        localCirclesButton1.c = false;
        localCirclesButton1.requestLayout();
      }
      localOneProfileHeader3.v.setVisibility(0);
      localOneProfileHeader3.u.setVisibility(8);
      return;
    }
    if (this.G)
    {
      OneProfileHeader localOneProfileHeader2 = this.ad;
      localOneProfileHeader2.v.setVisibility(8);
      localOneProfileHeader2.u.setVisibility(0);
      return;
    }
    OneProfileHeader localOneProfileHeader1 = this.ad;
    localOneProfileHeader1.v.setVisibility(8);
    localOneProfileHeader1.u.setVisibility(8);
  }
  
  public final void p()
  {
    
    if ((this.q) || (this.E) || (this.t == null) || (!this.am.c))
    {
      this.bo = false;
      this.bn = false;
      this.bm = false;
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      if (this.s)
      {
        this.bn = false;
        this.bm = false;
        this.bo = true;
      }
      else if (this.G)
      {
        this.bo = false;
        this.bn = false;
        this.bm = false;
      }
      else if (TextUtils.isEmpty(this.F))
      {
        this.bo = false;
        this.bm = false;
        this.bn = true;
      }
      else
      {
        this.bo = false;
        this.bn = false;
        this.bm = true;
        this.bp = this.am.b(this.F);
      }
    }
  }
  
  public final Long q()
  {
    if (!TextUtils.isEmpty(this.M)) {
      return Long.valueOf(Long.parseLong(this.M));
    }
    return null;
  }
  
  public final byte[] r()
  {
    if ((this.t == null) || (this.t.d == null) || (this.t.d.c == null)) {
      return new byte[0];
    }
    return qat.a(this.t.d.c);
  }
  
  final boolean s()
  {
    return this.ai == 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddo
 * JD-Core Version:    0.7.0.1
 */