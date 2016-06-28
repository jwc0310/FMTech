import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.plus.actionbar.NotificationButtonView;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.service.EsService;
import java.util.List;

public final class dbj
  implements giv, gpq, hdt, mes, mfa, mfd
{
  private int a;
  private boolean b;
  private Context c;
  
  public dbj(HomeActivity paramHomeActivity, mek parammek)
  {
    parammek.a(this);
    this.c = paramHomeActivity;
    ikt localikt = paramHomeActivity.d;
    localikt.g.add(this);
    ((ikt)localikt);
  }
  
  private final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d.g.a = "android_nots_gmh";
      this.d.f.c(this);
      this.d.e.a(this);
      return;
    }
    this.d.g.a = "android_default_gmh";
    this.d.f.d(this);
    this.d.e.a.remove(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("notification_bar_visible");
      b(this.b);
    }
  }
  
  public final void a(gpr paramgpr)
  {
    this.d.g.a(paramgpr);
    NotificationButtonView localNotificationButtonView = (NotificationButtonView)mm.a(paramgpr.c(aaw.gj));
    localNotificationButtonView.a = 0;
    if (localNotificationButtonView.b) {
      localNotificationButtonView.a();
    }
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    if ((this.d.i != null) && (this.d.i.C())) {
      localgqe.a = true;
    }
  }
  
  public final void a(tp paramtp)
  {
    this.a = paramtp.a();
    paramtp.d(false);
    paramtp.e(false);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean == this.b) {
      return;
    }
    this.b = paramBoolean;
    gxx localgxx;
    gxw localgxw;
    if (paramBoolean)
    {
      Context localContext4 = this.c;
      ikt localikt4 = this.d.d;
      efj.k();
      EsService.b(localContext4, localikt4.e);
      Context localContext5 = this.c;
      ikt localikt5 = this.d.d;
      efj.k();
      EsService.d(localContext5, localikt5.e);
      b(paramBoolean);
      if (this.d.i != null) {
        this.d.i.b(paramBoolean);
      }
      localgxx = (gxx)this.d.m.a(gxx.class);
      Context localContext3 = this.c;
      ikt localikt3 = this.d.d;
      efj.k();
      localgxw = new gxw(localContext3, localikt3.e);
      if (!paramBoolean) {
        break label238;
      }
    }
    label238:
    for (gxz localgxz = gxz.bl;; localgxz = gxz.bm)
    {
      localgxw.c = localgxz;
      localgxx.a(localgxw);
      return;
      Context localContext1 = this.c;
      ikt localikt1 = this.d.d;
      efj.k();
      EsService.a(localContext1, localikt1.e);
      Context localContext2 = this.c;
      ikt localikt2 = this.d.d;
      efj.k();
      EsService.d(localContext2, localikt2.e);
      break;
    }
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramgiu2 == giu.c)
    {
      Intent localIntent = this.d.getIntent();
      if (localIntent.getBooleanExtra("show_notifications", false))
      {
        localIntent.putExtra("destination", 10);
        this.d.d(localIntent);
        localIntent.removeExtra("show_notifications");
      }
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    ikt localikt = this.d.d;
    efj.k();
    int j = localikt.e;
    boolean bool;
    if (i == aaw.iq)
    {
      if (this.d.i != null) {
        this.d.i.y();
      }
      bool = true;
    }
    int k;
    do
    {
      return bool;
      if (i == aaw.gj)
      {
        a(false);
        HomeActivity localHomeActivity = this.d;
        gxr localgxr = new gxr();
        gxq localgxq = new gxq(pjt.a);
        localgxr.b.add(localgxq);
        new gwz(4, localgxr.a(this.d)).b(localHomeActivity);
        return true;
      }
      if (i == aaw.cB)
      {
        if (this.d.i != null) {
          this.d.i.z();
        }
        gxx localgxx = (gxx)this.d.m.a(gxx.class);
        gxw localgxw = new gxw(this.c, j);
        localgxw.c = gxz.bA;
        localgxw.d = gya.u;
        localgxx.a(localgxw);
        return true;
      }
      if ((i == aaw.ec) || (i == aaw.dA))
      {
        this.d.g.a(paramMenuItem);
        return true;
      }
      if (i == aaw.gZ)
      {
        a(false);
        return this.d.b(j);
      }
      k = aaw.gA;
      bool = false;
    } while (i != k);
    cwg localcwg = (cwg)this.d.i;
    if (!localcwg.b.a("mark_all_as_read")) {
      localcwg.b.b(new cvq(localcwg.f(), "update_lvv_task", localcwg.a));
    }
    return true;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("notification_bar_visible", this.b);
  }
  
  public final void b(tp paramtp)
  {
    paramtp.c(this.a);
  }
  
  public final boolean t_()
  {
    a(false);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbj
 * JD-Core Version:    0.7.0.1
 */