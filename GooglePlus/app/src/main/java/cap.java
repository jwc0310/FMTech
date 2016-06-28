import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public final class cap
  extends mca
  implements View.OnClickListener, cw<Cursor>, dty, gpq, gxv, gzi, luu, lvc
{
  private final hwq Z;
  String a;
  private ListView aa;
  private cxn ab;
  private Integer ac;
  private Integer ad;
  private bti ae;
  private final dme af;
  private final gpk b = new gpk(this, this.bp, this);
  private git c;
  private giz d;
  
  public cap()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.Z = localhwq;
    this.af = new caq(this);
  }
  
  private final void a(View paramView)
  {
    if (paramView == null) {
      return;
    }
    hwq localhwq = this.Z;
    hwt localhwt = hwt.b;
    if (localhwt == null) {
      throw new NullPointerException();
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
    this.b.a();
  }
  
  private final boolean a(jpo paramjpo)
  {
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    if (!localgzj.a("CopyPhotosToAlbumTask"))
    {
      localgzj.d.a(paramjpo, false);
      localgzj.b(paramjpo);
      return true;
    }
    return false;
  }
  
  private void v()
  {
    if (this.ac != null) {
      return;
    }
    this.ac = Integer.valueOf(EsService.b(this.bn, this.c.c(), this.m.getString("gaia_id"), null));
    a(this.N);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.tZ, paramViewGroup, false);
    if (TextUtils.isEmpty(this.m.getString("gaia_id"))) {
      throw new IllegalArgumentException("EXTRA_GAIA_ID must be set!");
    }
    this.ab = new cxn(this.bn, null, this.c.c(), this.m.getString("gaia_id"));
    this.ab.g = this;
    this.aa = ((ListView)localView.findViewById(aaw.ew));
    this.aa.setRecyclerListener(new cas());
    this.aa.setAdapter(this.ab);
    k().a(0, null, this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    mbf localmbf = this.bn;
    int i = this.c.c();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.m.getString("gaia_id");
    return new cxp(localmbf, i, jrf.a(2, arrayOfString));
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  final void a(int paramInt, dmx paramdmx)
  {
    if ((this.ac == null) || (this.ac.intValue() != paramInt)) {}
    for (;;)
    {
      return;
      this.ac = null;
      if (paramdmx != null)
      {
        if (paramdmx.c != 200) {}
        for (int i = 1; i != 0; i = 0)
        {
          String str = g().getString(aau.rQ);
          Toast.makeText(f(), str, 0).show();
          a(this.N);
          return;
        }
      }
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("refresh_request")) {
        this.ac = Integer.valueOf(paramBundle.getInt("refresh_request"));
      }
      if (paramBundle.containsKey("get_album_tiles_request")) {
        this.ad = Integer.valueOf(paramBundle.getInt("get_album_tiles_request"));
      }
      if (paramBundle.containsKey("cluster_id")) {
        this.a = paramBundle.getString("cluster_id");
      }
    }
    for (;;)
    {
      if (f().getIntent().hasExtra("media_resolver")) {
        this.ae = ((bti)f().getIntent().getParcelableExtra("media_resolver"));
      }
      return;
      v();
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if (TextUtils.equals(paramString, "copy_to_album"))
    {
      String str1 = paramBundle.getString("cluster_id");
      String str2 = paramBundle.getString("album_id");
      if ((TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str1))) {
        str2 = jrf.d(str1);
      }
      bp localbp = f();
      int i = this.c.c();
      jpr localjpr = new jpr(this.c.c(), this.ae);
      efj.a(str2, "existingAlbumId must not be empty");
      if (a(new jpo(localbp, i, str2, null, null, localjpr))) {
        this.a = str1;
      }
      if (Log.isLoggable("AddToAlbumFragment", 3)) {
        new StringBuilder(33 + String.valueOf(str1).length()).append("User selected album [cluster id:").append(str1).append("]");
      }
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    paramgpr.d(aau.ez);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, int paramInt)
  {
    if (paramInt == -1)
    {
      bp localbp = f();
      int i = this.c.c();
      jpr localjpr = new jpr(this.c.c(), this.ae);
      efj.a(paramString, "newAlbumTitle must not be empty");
      if (a(new jpo(localbp, i, null, null, paramString, localjpr))) {
        this.a = null;
      }
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("CopyPhotosToAlbumTask".equals(paramString)) {
      if (paramhae != null) {
        if (paramhae.b == 200) {
          break label51;
        }
      }
    }
    label51:
    for (int i = 1; i != 0; i = 0)
    {
      this.a = null;
      Toast.makeText(f(), aau.uV, 1).show();
      return;
    }
    bp localbp = f();
    int j = this.c.c();
    if (TextUtils.isEmpty(this.a))
    {
      this.a = null;
      v();
    }
    for (;;)
    {
      Toast.makeText(localbp, aau.bI, 1).show();
      localbp.setResult(-1);
      localbp.finish();
      return;
      AsyncTask.execute(new car(this, localbp, j, paramhae.a().getInt("num_photos_added")));
      this.ad = Integer.valueOf(EsService.a(localbp, j, this.d.a(j).b("gaia_id"), this.a, null));
    }
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      v();
      return true;
    }
    return false;
  }
  
  public final void a_(boolean paramBoolean)
  {
    if ((paramBoolean) && (f() != null)) {
      v();
    }
    a(this.N);
  }
  
  final void b(int paramInt, dmx paramdmx)
  {
    if ((this.ad == null) || (this.ad.intValue() != paramInt)) {
      return;
    }
    if (paramdmx.c != 200) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (Log.isLoggable("AddToAlbumFragment", 6))) {
        Log.e("AddToAlbumFragment", "Error getting album tiles.", paramdmx.d);
      }
      Toast.makeText(f(), aau.bI, 1).show();
      this.ad = null;
      this.a = null;
      bp localbp = f();
      localbp.setResult(-1);
      localbp.finish();
      return;
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.c = ((git)this.bo.a(git.class));
    this.d = ((giz)this.bo.a(giz.class));
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    localgzj.a.add(this);
    localgzj.a(new hak(this.bn, this.x));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ac != null) {
      paramBundle.putInt("refresh_request", this.ac.intValue());
    }
    if (this.ad != null) {
      paramBundle.putInt("get_album_tiles_request", this.ad.intValue());
    }
    if (this.a != null) {
      paramBundle.putString("cluster_id", this.a);
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.af);
    if (this.ac != null)
    {
      int j = this.ac.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(j)))
      {
        dmx localdmx2 = EsService.a(this.ac.intValue());
        a(this.ac.intValue(), localdmx2);
      }
    }
    if (this.ad != null)
    {
      int i = this.ad.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx1 = EsService.a(this.ad.intValue());
        b(this.ad.intValue(), localdmx1);
      }
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.af;
    EsService.d.remove(localdme);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.fK)
    {
      locallvb = new lvb();
      str1 = g().getString(aau.lp);
      locallvb.a.putString("dialog_title", str1);
      str2 = g().getString(aau.tl);
      locallvb.a.putString("hint_text", str2);
      str3 = g().getString(aau.lq);
      locallvb.a.putString("notice_text", str3);
      localluy = locallvb.a();
      localluy.n = this;
      localluy.p = 0;
      localluy.a(this.x, "create_album");
    }
    while (i != aaw.V)
    {
      lvb locallvb;
      String str1;
      String str2;
      String str3;
      luy localluy;
      return;
    }
    String str4 = (String)paramView.getTag(aaw.lp);
    Integer localInteger = (Integer)paramView.getTag(aaw.kQ);
    Resources localResources = g();
    int j = this.ae.a();
    int k = efj.xm;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(j);
    arrayOfObject[1] = str4;
    String str5 = localResources.getQuantityString(k, j, arrayOfObject);
    if ((localInteger != null) && (2 != localInteger.intValue())) {}
    for (String str6 = localResources.getString(aau.ey);; str6 = null)
    {
      int m = aau.ex;
      String str7 = g().getString(m);
      int n = aau.cM;
      lut locallut = lut.a(str5, str6, str7, g().getString(n), 0, 0);
      locallut.ab = this;
      locallut.m.putString("cluster_id", (String)paramView.getTag(aaw.kX));
      locallut.m.putString("album_id", (String)paramView.getTag(aaw.kR));
      locallut.a(this.x, "copy_to_album");
      return;
    }
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.aa);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.aa);
  }
  
  public final gya r_()
  {
    return gya.ao;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cap
 * JD-Core Version:    0.7.0.1
 */