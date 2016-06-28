import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.ArrayList;
import java.util.List;

public final class ckf
  extends cjx
  implements jjc
{
  private final cw<ArrayList<hur>> Z = new ckg(this);
  final long a;
  private int aa;
  private int ab;
  private boolean at;
  private hum au;
  private ckl av;
  ill b;
  boolean c;
  boolean d;
  
  public ckf()
  {
    this(false);
  }
  
  public ckf(boolean paramBoolean)
  {
    gxl localgxl = new gxl(pkf.w);
    this.bo.a(gxs.class, localgxl);
    new gxj(this.bp, (byte)0);
    new jie(this.bp).d = this;
    this.a = SystemClock.elapsedRealtime();
    this.c = true;
    this.d = false;
    this.as = paramBoolean;
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.Z);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(124);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  protected final int E()
  {
    return 33;
  }
  
  protected final void F()
  {
    super.F();
    kat localkat = (kat)this.bo.b(kat.class);
    if (localkat != null) {
      localkat.a(localkat.a(5, 2));
    }
  }
  
  protected final void G()
  {
    this.aa = (1 + this.aa);
  }
  
  protected final boolean H()
  {
    return true;
  }
  
  final void M()
  {
    int i = this.am.c();
    a(efj.e(this.bn, i, null));
  }
  
  public final int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 12: 
      return 194;
    case 13: 
      return 231;
    }
    return 195;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    b(localView);
    TextView localTextView = (TextView)localView.findViewById(aaw.fq);
    if (localTextView != null) {
      localTextView.setOnClickListener(new cki(this));
    }
    a(this.av);
    hwq localhwq = this.ar;
    int i = aau.jq;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    localhwq.a = false;
    localhwq.h = new ckj(this);
    return localView;
  }
  
  protected final hgh a(int paramInt1, int paramInt2)
  {
    return new hvk(a(paramInt1), null, null);
  }
  
  protected final void a(int paramInt, Intent paramIntent)
  {
    if (paramInt == -1) {
      new kqf(101).b(this.bn);
    }
    for (;;)
    {
      super.a(paramInt, paramIntent);
      return;
      kat localkat = (kat)this.bo.b(kat.class);
      if (localkat != null) {
        localkat.a(null);
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.aa = paramBundle.getInt("circle_adds_per_session");
      this.ab = paramBundle.getInt("dismiss_per_session");
      this.c = paramBundle.getBoolean("first_time_people_and_pages");
      this.d = paramBundle.getBoolean("duration_event_logged");
    }
    this.aj = true;
    this.av = new ckl(this);
  }
  
  public final void a(PeopleListRowView paramPeopleListRowView, String paramString)
  {
    this.at = true;
    super.a(paramPeopleListRowView, paramString);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    if (!this.av.isEmpty()) {
      paramgpr.b(aaw.J);
    }
    int i = aau.iT;
    paramgpr.a(g().getString(i));
  }
  
  protected final void a(hae paramhae)
  {
    super.a(paramhae);
    new kqf(102).b(this.bn);
    kat localkat = (kat)this.bo.b(kat.class);
    if (localkat != null) {
      localkat.a(null);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.J)
    {
      M();
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  public final void ae_()
  {
    k().b(2, null, this.Z);
  }
  
  public final void b_(View paramView)
  {
    this.ab = (1 + this.ab);
    gxz localgxz2;
    if (this.at)
    {
      localgxz2 = gxz.bR;
      this.at = false;
    }
    for (gxz localgxz1 = localgxz2;; localgxz1 = gxz.bQ)
    {
      int i = this.am.c();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = localgxz1;
      localgxx.a(localgxw);
      super.b_(paramView);
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.au = ((hum)this.bo.a(hum.class));
    ill localill = new ill(this.bn, this.am.c());
    localill.a.add(ine.class);
    this.b = localill;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("circle_adds_per_session", this.aa);
    paramBundle.putInt("dismiss_per_session", this.ab);
    paramBundle.putBoolean("first_time_people_and_pages", this.c);
    paramBundle.putBoolean("duration_event_logged", this.d);
  }
  
  public final void o()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_people_notification_acceptance_per_session", this.aa);
    localBundle.putInt("extra_people_notification_dismiss_per_session", this.ab);
    int i = this.am.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.bP;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    super.o();
  }
  
  public final gya r_()
  {
    return gya.t;
  }
  
  protected final int w()
  {
    return efj.vp;
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.Z);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckf
 * JD-Core Version:    0.7.0.1
 */