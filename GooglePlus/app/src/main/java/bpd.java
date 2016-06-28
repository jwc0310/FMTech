import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.collexions.impl.abuse.CollexionAbuseBannerView;
import com.google.android.libraries.social.spaces.SpaceFollowButton;
import com.google.android.libraries.social.spaces.SpaceHeaderView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;

public final class bpd
  extends dfz
{
  final kwz a;
  final bpg b;
  String c;
  String d;
  String e;
  String f;
  String g;
  String h;
  Integer i;
  Integer j;
  Integer k;
  Integer l;
  boolean m;
  hmu n;
  boolean o;
  boolean p;
  private final kxq q;
  private final int r;
  
  public bpd(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    super(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob);
    mbb localmbb = mbb.b(paramContext);
    this.q = ((kxq)localmbb.a(kxq.class));
    this.a = ((kwz)localmbb.a(kwz.class));
    this.b = ((bpg)localmbb.a(bpg.class));
    this.r = super.getViewTypeCount();
    this.ax = 0;
  }
  
  private final boolean c()
  {
    return (this.o) && (e_(2) == 0);
  }
  
  private final lpt d()
  {
    lpt locallpt = new lpt(-2);
    locallpt.setMargins(-this.ay.f, -this.ay.d, -this.ay.f, 0);
    locallpt.a = this.ay.a;
    return locallpt;
  }
  
  public final void I_()
  {
    this.ax = 0;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    if (paramCursor.getPosition() == 0)
    {
      LinearLayout localLinearLayout = new LinearLayout(this.aM);
      localLinearLayout.setClipChildren(false);
      localLinearLayout.setOrientation(1);
      SpaceHeaderView localSpaceHeaderView = (SpaceHeaderView)this.q.a(paramContext, paramViewGroup);
      localSpaceHeaderView.g.setOnClickListener(new bpe(this));
      localSpaceHeaderView.a(kxn.c);
      localLinearLayout.addView(localSpaceHeaderView);
      ViewStub localViewStub = new ViewStub(this.aM);
      localViewStub.setLayoutResource(aau.wh);
      localLinearLayout.addView(localViewStub);
      localLinearLayout.setLayoutParams(d());
      return localLinearLayout;
    }
    View localView = localLayoutInflater.inflate(aau.wf, paramViewGroup, false);
    localView.setLayoutParams(d());
    return localView;
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    int i1;
    label21:
    LinearLayout localLinearLayout;
    Context localContext;
    String str2;
    label178:
    SpaceFollowButton localSpaceFollowButton;
    kxg localkxg;
    if (paramCursor.getPosition() == 0)
    {
      if (TextUtils.isEmpty(this.d)) {
        break label484;
      }
      i1 = 1;
      if (i1 != 0)
      {
        localLinearLayout = (LinearLayout)paramView;
        SpaceHeaderView localSpaceHeaderView = (SpaceHeaderView)localLinearLayout.getChildAt(0);
        localSpaceHeaderView.a(this.d);
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.h;
        String str1 = this.g;
        localSpaceHeaderView.a(arrayOfString, str1, str1);
        int i2 = this.i.intValue();
        int i3 = this.j.intValue();
        localContext = this.aM;
        str2 = ((git)mbb.a(localContext, git.class)).f().b("domain_name");
        switch (this.k.intValue())
        {
        case 2: 
        default: 
          str2 = localContext.getString(ehr.z);
        case 4: 
          localSpaceHeaderView.a(i2, i3, str2);
          localSpaceHeaderView.a(this.e);
          if (!TextUtils.isEmpty(this.f)) {
            localSpaceHeaderView.a(ipf.a(this.aM, this.f, ipm.a));
          }
          localSpaceHeaderView.a((kxp)mbb.b(this.aM, kxp.class));
          localSpaceFollowButton = localSpaceHeaderView.g;
          Integer localInteger = this.l;
          if (localInteger != null) {}
          switch (localInteger.intValue())
          {
          default: 
            localkxg = kxg.a;
          }
          break;
        }
      }
    }
    CollexionAbuseBannerView localCollexionAbuseBannerView;
    for (;;)
    {
      localSpaceFollowButton.a(localkxg);
      localSpaceFollowButton.a = ((kxe)mbb.a(this.aM, kxe.class));
      localSpaceFollowButton.a(localSpaceFollowButton.b);
      hmu localhmu;
      if ((this.n != null) && (this.n.a != 0))
      {
        View localView = localLinearLayout.getChildAt(1);
        if ((localView instanceof ViewStub)) {
          localView = ((ViewStub)localView).inflate();
        }
        localCollexionAbuseBannerView = (CollexionAbuseBannerView)localView;
        localCollexionAbuseBannerView.setBackgroundResource(aau.vY);
        localhmu = this.n;
        localCollexionAbuseBannerView.c = localhmu;
        if ((localhmu == null) || ((localhmu.a != 1) && (localhmu.a != 3))) {
          break label649;
        }
      }
      switch (localhmu.b)
      {
      default: 
        localCollexionAbuseBannerView.setVisibility(8);
        return;
        label484:
        i1 = 0;
        break label21;
        str2 = localContext.getString(ehr.B);
        break label178;
        str2 = localContext.getString(ehr.A);
        break label178;
        localkxg = kxg.c;
        continue;
        localkxg = kxg.b;
        continue;
        localkxg = kxg.h;
      }
    }
    int i4 = efj.HK;
    int i5 = efj.HL;
    gxq localgxq = new gxq(pjn.ac);
    for (;;)
    {
      localCollexionAbuseBannerView.setVisibility(0);
      localCollexionAbuseBannerView.a.setText(i4);
      localCollexionAbuseBannerView.b.setText(i5);
      efj.a(localCollexionAbuseBannerView.b, localgxq);
      return;
      i4 = efj.HI;
      i5 = efj.HY;
      localgxq = new gxq(pjn.ak);
      continue;
      i4 = efj.HJ;
      i5 = efj.HL;
      localgxq = new gxq(pjn.S);
    }
    label649:
    localCollexionAbuseBannerView.setVisibility(8);
  }
  
  protected final void a(eab parameab)
  {
    parameab.u = eai.e;
    super.a(parameab);
  }
  
  protected final boolean a(Cursor paramCursor)
  {
    llr localllr = llr.a(paramCursor.getBlob(37));
    return (localllr != null) && (localllr.d != null) && (localllr.d.a == 4);
  }
  
  public final int b(int paramInt)
  {
    if (c()) {
      return 1 + this.r;
    }
    return super.b(paramInt);
  }
  
  public final void b(Cursor paramCursor)
  {
    if (paramCursor != this.aN[1].c) {}
    for (int i1 = 1;; i1 = 0)
    {
      super.a(1, paramCursor);
      if (i1 != 0) {
        a(true, -1);
      }
      return;
    }
  }
  
  public final int b_(int paramInt)
  {
    return 0 + this.r;
  }
  
  public final int getCount()
  {
    int i1 = super.getCount();
    if (c()) {}
    for (int i2 = 1;; i2 = 0) {
      return i2 + i1;
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    int i1 = e_(1);
    if ((c()) && (paramInt >= i1)) {
      return 1;
    }
    return super.getItemViewType(paramInt);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i1 = e_(1);
    if ((c()) && (paramInt >= i1))
    {
      if ((paramView == null) || (paramView.getId() != efj.zi))
      {
        paramView = LayoutInflater.from(this.aM).inflate(aau.wg, paramViewGroup, false);
        Resources localResources = this.aM.getResources();
        lpt locallpt = new lpt(-2);
        int i2 = localResources.getDimensionPixelSize(aau.wa);
        locallpt.setMargins(-this.ay.f, i2, -this.ay.f, 0);
        locallpt.a = this.ay.a;
        paramView.setLayoutParams(locallpt);
      }
      int i4;
      if (this.p)
      {
        efj.a(paramView, new gxq(pjn.al));
        if (this.k.intValue() == 3)
        {
          i4 = ehr.l;
          paramView.setOnClickListener(new gxn(new bpf(this)));
        }
      }
      for (int i3 = i4;; i3 = ehr.p)
      {
        ((TextView)paramView.findViewById(efj.zg)).setText(i3);
        return paramView;
        i4 = ehr.m;
        break;
        ((TextView)paramView.findViewById(efj.zh)).setText(ehr.q);
      }
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 2 + this.r;
  }
  
  public final boolean isEmpty()
  {
    if (super.isEmpty())
    {
      if (!TextUtils.isEmpty(this.d)) {}
      for (int i1 = 1; i1 == 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpd
 * JD-Core Version:    0.7.0.1
 */