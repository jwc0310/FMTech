import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.notifications.ui.GunsListView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;
import java.util.HashSet;

public final class cwg
  extends mca
  implements cvk, cvy, cw<jds>, gzi, jag, lvy
{
  private GunsListView Z;
  public int a;
  private jaq aa;
  private jaa ab;
  private cvu ac;
  private View ad;
  private cvs ae;
  private boolean af = false;
  private boolean ag = false;
  private boolean ah = false;
  private long ai = 0L;
  private lvz aj = new lvz(this, this.bp);
  public gzj b;
  private giz c;
  private hgs d;
  
  private void a(jan paramjan, long paramLong)
  {
    long l = this.c.a(this.a).a("guns_notifications_last_sync_time", 0L);
    if ((this.d.a() - l >= paramLong) && (!this.b.a("sync_task")))
    {
      this.ag = true;
      lvz locallvz = this.aj;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
      this.b.b(new cwe(f(), "sync_task", this.a, paramjan));
    }
  }
  
  public final void A_()
  {
    this.aj.b();
    a(jan.d, 0L);
  }
  
  public final int B()
  {
    return 0;
  }
  
  public final boolean C()
  {
    return false;
  }
  
  public final boolean O_()
  {
    return this.ag;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Ap, paramViewGroup, false);
    this.Z = ((GunsListView)localView.findViewById(aau.wy));
    this.Z.b = this;
    this.aj.a(new gxq(pjt.e));
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(aau.wA)).a = this.Z;
    this.ac = new cvu(f(), this.Z, this.aj);
    this.ad = localView.findViewById(aau.wx);
    MediaView localMediaView = (MediaView)this.ad.findViewById(aau.wF);
    localMediaView.a(ipf.a(this.bn, "//ssl.gstatic.com/s2/oz/images/notifications/jingles_eb4e5306b38f83915d82034fa93390d9/xxhdpi_anim.gif", ipm.d));
    localMediaView.o = false;
    localMediaView.e(4);
    localMediaView.a(1);
    localMediaView.S = false;
    localMediaView.a(new ColorDrawable(0));
    this.ad.setOnClickListener(new cwh(this, localMediaView));
    return localView;
  }
  
  public final fu<jds> a(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 0) {
      return new cvj(this.bn, this.a);
    }
    return null;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ae = new cvs();
    this.a = this.m.getInt("account_id", -1);
    this.ah = this.m.getBoolean("prefetch_enabled");
    this.ai = this.m.getLong("prefetch_interval");
    if (paramBundle != null)
    {
      this.af = paramBundle.getBoolean("is_active");
      if (paramBundle.containsKey("pending_keys"))
      {
        cvs localcvs = this.ae;
        for (String str : paramBundle.getStringArray("pending_keys")) {
          if (str != null) {
            localcvs.b.add(str);
          }
        }
      }
    }
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.b = localgzj;
    if ((this.ab.b(this.a) != jak.f) && (this.c.c(this.a)) && (this.aa.d())) {
      this.b.b(new cwd(this.bn, this.a));
    }
  }
  
  public final void a(fu<jds> paramfu) {}
  
  public final void a(String paramString)
  {
    String str1 = String.valueOf("mark_as_read_");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      if (!this.b.a(str3)) {
        this.b.b(new cvr(f(), str3, this.a, paramString));
      }
      return;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (paramString.startsWith("sync_task"))
    {
      this.c.b(this.a).b("guns_notifications_last_sync_time", this.d.a()).d();
      if (!this.b.a("sync_task"))
      {
        this.ag = false;
        lvz locallvz = this.aj;
        if (locallvz.a != null)
        {
          localSwipeRefreshLayoutWithUpScroll = locallvz.a;
          if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
            break label93;
          }
          localSwipeRefreshLayoutWithUpScroll.a(false);
        }
      }
    }
    label93:
    do
    {
      do
      {
        do
        {
          return;
        } while (localSwipeRefreshLayoutWithUpScroll.m == null);
        if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      } while (localSwipeRefreshLayoutWithUpScroll.m.O_());
      Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
      long l = localSwipeRefreshLayoutWithUpScroll.o;
      efj.m().postDelayed(localRunnable, l);
      return;
      if ((paramString.equals("paging_task")) && (!this.b.a(paramString)))
      {
        GunsListView localGunsListView2 = this.Z;
        localGunsListView2.a.findViewById(aau.wN).setVisibility(8);
        localGunsListView2.c = false;
        return;
      }
      if ((paramString.equals("paging_check_task")) && (!hae.a(paramhae)))
      {
        GunsListView localGunsListView1 = this.Z;
        localGunsListView1.a.findViewById(aau.wN).setVisibility(0);
        localGunsListView1.c = true;
        this.b.b(new cwc(f(), "paging_task", this.a, jan.d));
        return;
      }
    } while (!paramString.startsWith("mark_as_read_"));
    hae.a(paramhae);
  }
  
  public final void ai_()
  {
    if (!this.b.a("paging_check_task")) {
      this.b.b(new cvi(f(), "paging_check_task", this.a));
    }
  }
  
  public final void b(String paramString)
  {
    ((jab)mbb.a(this.bn, jab.class)).a(this.a, paramString);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.af = paramBoolean;
    if ((paramBoolean) && (!this.b.a("update_lvv_task"))) {
      this.b.b(new cwf(f(), "update_lvv_task", this.a));
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((giz)this.bo.a(giz.class));
    this.d = ((hgs)this.bo.a(hgs.class));
    this.aa = ((jaq)this.bo.a(jaq.class));
    this.ab = ((jaa)this.bo.a(jaa.class));
  }
  
  public final void c(String paramString)
  {
    ((jab)mbb.a(this.bn, jab.class)).b(this.a, paramString);
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    cvu localcvu = this.ac;
    if (this != null) {
      localcvu.c.add(this);
    }
    this.Z.setAdapter(this.ac);
    this.Z.setOnCreateContextMenuListener(this.ac);
    k().a(0, null, this);
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putBoolean("is_active", this.af);
    cvs localcvs = this.ae;
    paramBundle.putStringArray("pending_keys", (String[])localcvs.b.toArray(new String[localcvs.b.size()]));
    super.e(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    if (this.ah) {
      a(jan.b, this.ai);
    }
  }
  
  public final void y()
  {
    a(jan.d, 0L);
  }
  
  public final void z() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwg
 * JD-Core Version:    0.7.0.1
 */