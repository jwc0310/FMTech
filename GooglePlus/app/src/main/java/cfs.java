import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.BestPhotosTileListView;
import java.util.HashSet;
import java.util.Map;

public final class cfs
  extends cff
  implements View.OnClickListener, cw<Cursor>
{
  private Integer Z;
  String a;
  private boolean aa;
  private final hwq ab;
  private final dme ac;
  private BestPhotosTileListView b;
  private deq c;
  private boolean d;
  
  public cfs()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.ab = localhwq;
    new gzc(this, new cfu(this));
    this.ac = new cft(this);
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((this.d) && (this.Z == null))
      {
        hwq localhwq3 = this.ab;
        hwt localhwt3 = hwt.c;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
      }
    }
    for (;;)
    {
      a(this.ab);
      G();
      return;
      hwq localhwq2 = this.ab;
      hwt localhwt2 = hwt.a;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      continue;
      hwq localhwq1 = this.ab;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.uc);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    this.c = new deq(this.bn, null, this.am.c(), jrf.o(this.a));
    this.c.w = this;
    this.c.g = i;
    this.b = ((BestPhotosTileListView)localView.findViewById(aaw.lH));
    this.b.setRecyclerListener(new cfv());
    this.b.setAdapter(this.c);
    k().a(0, null, this);
    c(localView);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new des(this.bn, this.am.c(), jrf.o(this.a));
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    boolean bool = true;
    if ((this.Z == null) || (this.Z.intValue() != paramInt)) {
      return;
    }
    this.Z = null;
    int i;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = bool;
        if (i == 0) {
          break label89;
        }
      }
    }
    for (;;)
    {
      this.aB = bool;
      if (!this.aB) {
        break label94;
      }
      Toast.makeText(f(), aau.rQ, 0).show();
      c(this.N);
      return;
      i = 0;
      break;
      label89:
      bool = false;
    }
    label94:
    Y_();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("refresh_request")) {
        this.Z = Integer.valueOf(paramBundle.getInt("refresh_request"));
      }
      this.aa = paramBundle.getBoolean("refreshed");
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  public final boolean a(View paramView)
  {
    String str1 = (String)paramView.getTag(aaw.ln);
    if (TextUtils.isEmpty(str1)) {
      return false;
    }
    int i = ((Integer)paramView.getTag(aaw.lo)).intValue();
    int j = this.am.c();
    Intent localIntent1;
    if (i == 1)
    {
      bdo localbdo = new bdo(f(), j);
      localbdo.p = Integer.valueOf(this.aA.b);
      localbdo.b = str1;
      localbdo.e = jrf.o(this.a);
      localbdo.g = this.az.b;
      localbdo.w = this.aA.c();
      localIntent1 = localbdo.a();
      gxx localgxx1 = (gxx)this.bo.a(gxx.class);
      gxw localgxw1 = new gxw(this.bn);
      localgxw1.c = gxz.dm;
      localgxx1.a(localgxw1);
    }
    Intent localIntent2;
    for (Object localObject = localIntent1;; localObject = localIntent2)
    {
      b((Intent)localObject);
      return true;
      String str2 = (String)paramView.getTag(aaw.kX);
      jqa localjqa = new jqa(f(), HostStreamSingleAlbumTileActivity.class, j);
      localjqa.a = str2;
      localjqa.c = Integer.valueOf(5);
      localjqa.f = this.az.b;
      localjqa.k = Boolean.valueOf(true);
      localIntent2 = localjqa.a();
      gxx localgxx2 = (gxx)this.bo.a(gxx.class);
      gxw localgxw2 = new gxw(this.bn);
      localgxw2.c = gxz.do;
      localgxx2.a(localgxw2);
    }
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    paramgpr.d(aau.of);
    a(paramgpr, 0);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.Z != null) {
      paramBundle.putInt("refresh_request", this.Z.intValue());
    }
    paramBundle.putBoolean("refreshed", this.aa);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.ac);
    if (this.Z != null)
    {
      int i = this.Z.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label89;
      }
      if (v())
      {
        hwq localhwq = this.ab;
        hwt localhwt = hwt.a;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
    }
    return;
    label89:
    dmx localdmx = EsService.a(this.Z.intValue());
    a(this.Z.intValue(), localdmx);
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.ac;
    EsService.d.remove(localdme);
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.b);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.b);
  }
  
  public final gya r_()
  {
    return gya.am;
  }
  
  protected final boolean v()
  {
    if (this.c == null) {}
    for (Cursor localCursor = null; (localCursor == null) || (localCursor.getCount() == 0); localCursor = this.c.c) {
      return true;
    }
    return false;
  }
  
  public final boolean y_()
  {
    return (this.Z != null) || (super.y_());
  }
  
  public final void z_()
  {
    super.z_();
    if (this.Z != null) {
      return;
    }
    this.aB = false;
    bp localbp = f();
    int i = this.am.c();
    String str = this.a;
    Intent localIntent = EsService.e.a(localbp, EsService.class);
    localIntent.putExtra("op", 78);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("gaia_id", str);
    this.Z = Integer.valueOf(EsService.a(localbp, localIntent));
    this.aa = true;
    c(this.N);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfs
 * JD-Core Version:    0.7.0.1
 */