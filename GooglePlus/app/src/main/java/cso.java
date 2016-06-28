import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.Spannable;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.plus.locations.LocationSharingRadioGroup;
import com.google.android.libraries.social.location.MarkerIconView;

public final class cso
{
  csx a;
  final View b;
  final Context c;
  boolean d;
  boolean e;
  nvd f;
  nxl g;
  boolean h;
  int i;
  boolean j;
  boolean k;
  boolean l;
  int m;
  private final int n;
  private boolean o;
  private boolean p;
  
  public cso(Context paramContext, View paramView, int paramInt, csx paramcsx)
  {
    this.c = paramContext;
    this.b = paramView;
    this.n = paramInt;
    this.a = paramcsx;
    this.m = csy.a;
  }
  
  private final void a(TextView paramTextView, int paramInt)
  {
    Uri localUri = efj.a(this.c, "plus_location", "https://support.google.com/plus/?hl=%locale%");
    Resources localResources = this.c.getResources();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localUri.toString();
    efj.a(paramTextView, (Spannable)Html.fromHtml(localResources.getString(paramInt, arrayOfObject)));
  }
  
  final void a()
  {
    int i1 = this.m;
    int i2 = this.m;
    int i3;
    View localView1;
    switch (csw.a[(i2 - 1)])
    {
    case 4: 
    case 5: 
    default: 
      i3 = csy.f;
      if (i1 == csy.b) {
        localView1 = this.b.findViewById(aaw.gF);
      }
      break;
    }
    for (;;)
    {
      if (localView1 != null) {
        localView1.setVisibility(8);
      }
      this.m = i3;
      switch (csw.a[(i3 - 1)])
      {
      default: 
        return;
        if (!this.d)
        {
          long l1 = PreferenceManager.getDefaultSharedPreferences(this.c).getLong("last_seen_onboarding", -1L);
          if (System.currentTimeMillis() - l1 <= 2592000000L) {}
          for (int i7 = 1;; i7 = 0)
          {
            if (i7 != 0) {
              break label197;
            }
            i3 = csy.b;
            break;
          }
        }
        if (this.p)
        {
          i3 = csy.e;
          break;
        }
        if (this.e)
        {
          i3 = csy.c;
          break;
        }
        i3 = csy.d;
        break;
        if (!d())
        {
          if (this.o)
          {
            i3 = csy.e;
            break;
          }
          i3 = csy.b;
          break;
        }
        i3 = csy.f;
        break;
        i3 = csy.c;
        break;
        if (i1 == csy.c) {
          localView1 = this.b.findViewById(aaw.ge);
        }
        break;
      case 1: 
        a(gxz.cE, gya.S);
        this.o = true;
        this.b.clearAnimation();
        this.b.setVisibility(0);
        View localView5 = this.b.findViewById(aaw.gF);
        a((TextView)localView5.findViewById(aaw.gG), aau.io);
        localView5.setVisibility(0);
        localView5.findViewById(aaw.bX).setOnClickListener(new csp(this, localView5));
        localView5.findViewById(aaw.di).setOnClickListener(new csq(this));
        return;
      case 2: 
        this.p = true;
        if (localView1 != null) {
          localView1.setVisibility(8);
        }
        this.b.clearAnimation();
        this.b.setVisibility(0);
        View localView4 = this.b.findViewById(aaw.ge);
        localView4.setVisibility(0);
        TextView localTextView2 = (TextView)localView4.findViewById(aaw.ea);
        Resources localResources = this.c.getResources();
        int i6;
        switch (this.g.e.e.b)
        {
        default: 
          i6 = aau.im;
        }
        for (;;)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.g.g;
          localTextView2.setText(localResources.getString(i6, arrayOfObject));
          ((TextView)localView4.findViewById(aaw.lr)).setText(this.g.e.n.a[0].f);
          if (this.f.a.length > 0) {
            ((TextView)localView4.findViewById(aaw.gR)).setText(this.f.a[0].f);
          }
          ViewFlipper localViewFlipper = (ViewFlipper)localView4.findViewById(aaw.eW);
          localViewFlipper.showNext();
          String str3 = ((giz)mbb.a(this.c, giz.class)).a(this.n).b("profile_photo_url");
          MarkerIconView localMarkerIconView1 = (MarkerIconView)localViewFlipper.findViewById(aaw.hH);
          MarkerIconView localMarkerIconView2 = (MarkerIconView)localViewFlipper.findViewById(aaw.bv);
          localMarkerIconView1.a(1, str3);
          localMarkerIconView2.a(2, str3);
          LocationSharingRadioGroup localLocationSharingRadioGroup = (LocationSharingRadioGroup)localView4.findViewById(aaw.io);
          localLocationSharingRadioGroup.a(this.g.e.a.a);
          localLocationSharingRadioGroup.setOnCheckedChangeListener(new csr(this, localViewFlipper, localView4));
          localLocationSharingRadioGroup.check(efj.a(this.g.e.n.a).a);
          ((Button)localView4.findViewById(aaw.fF)).setOnClickListener(new css(this));
          ((Button)localView4.findViewById(aaw.hN)).setOnClickListener(new cst(this, localView4));
          return;
          i6 = aau.il;
          continue;
          i6 = aau.ik;
        }
      case 3: 
        this.b.setVisibility(8);
        return;
      case 4: 
        a(gxz.cF, gya.T);
        View localView2 = this.b.findViewById(aaw.gM);
        TextView localTextView1 = (TextView)localView2.findViewById(aaw.lK);
        int i4;
        if (this.h)
        {
          i4 = aau.iq;
          localTextView1.setText(i4);
          if (!this.h) {
            break label1128;
          }
        }
        for (int i5 = aau.ip;; i5 = aau.ir)
        {
          a((TextView)localView2.findViewById(aaw.aI), i5);
          String str1 = ((giz)mbb.a(this.c, giz.class)).a(this.n).b("account_name");
          String str2 = this.c.getResources().getString(aau.iA, new Object[] { str1 });
          ((TextView)localView2.findViewById(aaw.o)).setText(str2);
          csv localcsv = new csv(this);
          localView2.findViewById(aaw.hN).setOnClickListener(localcsv);
          localView2.findViewById(aaw.fF).setOnClickListener(localcsv);
          localView2.setVisibility(0);
          if (localView1 != null) {
            break label1136;
          }
          this.b.clearAnimation();
          this.b.setVisibility(0);
          View localView3 = this.b;
          TranslateAnimation localTranslateAnimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, -1.0F, 2, 0.0F);
          localTranslateAnimation.setDuration(750L);
          localTranslateAnimation.setStartOffset(1000L);
          localView3.startAnimation(localTranslateAnimation);
          return;
          i4 = aau.is;
          break;
        }
        localView1.setVisibility(8);
        return;
      case 5: 
        label197:
        label1128:
        label1136:
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
        localEditor.putLong("last_seen_onboarding", System.currentTimeMillis());
        localEditor.commit();
        c();
        return;
        localView1 = null;
      }
    }
  }
  
  final void a(gxz paramgxz, gya paramgya)
  {
    gxx localgxx = (gxx)mbb.a(this.c, gxx.class);
    gxw localgxw = new gxw(this.c, this.n);
    localgxw.c = paramgxz;
    localgxw.d = paramgya;
    localgxx.a(localgxw);
  }
  
  public final void b()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
    localEditor.putLong("last_seen_onboarding", System.currentTimeMillis());
    localEditor.commit();
    c();
  }
  
  final void c()
  {
    if ((!this.f.b.booleanValue()) && (!this.k)) {
      this.i = 0;
    }
    this.b.setVisibility(8);
    csx localcsx = this.a;
    String str = this.g.e.a.a;
    int i1 = this.i;
    boolean bool1 = this.k;
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.j;
      bool2 = false;
      if (bool3) {
        bool2 = true;
      }
    }
    localcsx.a(str, i1, bool2);
  }
  
  final boolean d()
  {
    return (this.f.b.booleanValue()) && (this.h);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cso
 * JD-Core Version:    0.7.0.1
 */