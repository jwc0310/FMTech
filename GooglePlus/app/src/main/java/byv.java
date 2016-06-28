import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.ArrayList;

public final class byv
  extends cjx
  implements jjc
{
  private int Z;
  final long a;
  private boolean aa;
  private boolean ab;
  private hum at;
  private byx au;
  private boolean av;
  boolean b;
  private final cw<ArrayList<hur>> c = new byw(this);
  private int d;
  
  public byv()
  {
    this(false);
  }
  
  public byv(boolean paramBoolean)
  {
    gxl localgxl = new gxl(pkf.r);
    this.bo.a(gxs.class, localgxl);
    new gxj(this.bp, (byte)0);
    new jie(this.bp).d = this;
    this.a = SystemClock.elapsedRealtime();
    this.av = true;
    this.b = false;
    this.as = paramBoolean;
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.c);
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
    this.d = (1 + this.d);
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
    this.ak.a = true;
    a(this.au);
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
    this.ab = f().getIntent().getExtras().getBoolean("people_notification_list_title", false);
    if (paramBundle != null)
    {
      this.d = paramBundle.getInt("circle_adds_per_session");
      this.Z = paramBundle.getInt("dismiss_per_session");
      this.av = paramBundle.getBoolean("first_time_people_and_pages");
      this.b = paramBundle.getBoolean("duration_event_logged");
    }
    this.aj = true;
    this.au = new byx(this);
  }
  
  public final void a(PeopleListRowView paramPeopleListRowView, String paramString)
  {
    this.aa = true;
    super.a(paramPeopleListRowView, paramString);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    if (this.ab)
    {
      int i = aau.iT;
      paramgpr.a(g().getString(i));
    }
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
  
  public final void ae_()
  {
    k().b(2, null, this.c);
  }
  
  public final void b_(View paramView)
  {
    this.Z = (1 + this.Z);
    gxz localgxz2;
    if (this.aa)
    {
      localgxz2 = gxz.bR;
      this.aa = false;
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
    this.at = ((hum)this.bo.a(hum.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("circle_adds_per_session", this.d);
    paramBundle.putInt("dismiss_per_session", this.Z);
    paramBundle.putBoolean("first_time_people_and_pages", this.av);
    paramBundle.putBoolean("duration_event_logged", this.b);
  }
  
  public final void o()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_people_notification_acceptance_per_session", this.d);
    localBundle.putInt("extra_people_notification_dismiss_per_session", this.Z);
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
    return efj.vs;
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byv
 * JD-Core Version:    0.7.0.1
 */