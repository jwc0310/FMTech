import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.google.android.apps.photos.viewer.pager.HostPhotoPagerActivity;
import com.google.android.apps.plus.phone.TileCropActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.HashSet;
import java.util.Map;

public final class ccx
  extends cff
  implements View.OnClickListener, View.OnLongClickListener, luu
{
  final hwq Z;
  dcj a;
  private ColumnGridView aa;
  private cw<Cursor> ab;
  private String ac;
  private final dme ad;
  Integer b;
  String c;
  String d;
  
  public ccx()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lG;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.Z = localhwq;
    this.ad = new ccy(this);
    new ash(this, this.bp, 1);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.ug);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    int j = new jrh(this.bn).a;
    this.aa = ((ColumnGridView)localView.findViewById(aaw.dS));
    if (paramBundle != null)
    {
      this.c = paramBundle.getString("title");
      if (this.d == null) {
        this.d = paramBundle.getString("view_id");
      }
      if (paramBundle.containsKey("delete_request")) {
        this.b = Integer.valueOf(paramBundle.getInt("delete_request"));
      }
    }
    for (;;)
    {
      this.ac = jrf.h(jrf.d(this.d));
      this.a = new dcj(this.bn, null, this.aa, this.d);
      this.a.w = this;
      this.a.x = this;
      this.aa.p = true;
      this.aa.b(i);
      this.aa.setPadding(0, -i, 0, 0);
      this.aa.a(j);
      this.aa.c = true;
      this.aa.d(efj.qM);
      this.aa.a(this.a);
      ColumnGridView localColumnGridView = this.aa;
      localColumnGridView.s = this;
      localColumnGridView.c(0);
      k().a(1, null, this.ab).a();
      if ((paramBundle == null) && (this.m.containsKey("photo_picker_mode"))) {
        this.ar.a(this.m.getInt("photo_picker_mode"));
      }
      return localView;
      if (this.d == null) {
        this.d = this.m.getString("cluster_id");
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      super.a(paramInt1, paramInt2, paramIntent);
    }
    String str;
    do
    {
      do
      {
        do
        {
          return;
        } while (paramInt2 == 0);
        f().setResult(paramInt2, paramIntent);
        f().finish();
        return;
      } while ((paramIntent == null) || (!paramIntent.hasExtra("view_id")));
      str = paramIntent.getStringExtra("view_id");
    } while (TextUtils.equals(str, this.d));
    this.ac = jrf.h(jrf.d(this.d));
    this.d = str;
    k().b(1, null, this.ab).a();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ab = new ccz(this);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("dialog_delete_folder".equals(paramString))
    {
      mbf localmbf = this.bn;
      int i = this.am.c();
      String str = this.ac;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("op", 102);
      localIntent.putExtra("bucket_id", str);
      this.b = Integer.valueOf(EsService.a(localmbf, localIntent));
      anf localanf = this.av;
      int j = aau.eV;
      localanf.a(g().getString(j));
      return;
    }
    super.a(paramBundle, paramString);
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.co)
    {
      bz localbz = this.x;
      if (localbz.a("dialog_delete_folder") == null)
      {
        int i = aau.eU;
        String str1 = g().getString(i);
        int j = aau.eT;
        String str2 = g().getString(j);
        int k = aau.eS;
        String str3 = g().getString(k);
        int m = aau.cM;
        lut locallut = lut.a(str1, str2, str3, g().getString(m), 0, 0);
        locallut.n = this;
        locallut.p = 0;
        locallut.a(localbz, "dialog_delete_folder");
      }
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  public final boolean a(View paramView)
  {
    if (!(paramView instanceof PhotoTileView)) {
      return false;
    }
    PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
    if (this.aA.b == 1)
    {
      gxx localgxx2 = (gxx)this.bo.a(gxx.class);
      gxw localgxw2 = new gxw(this.bn);
      localgxw2.c = gxz.dm;
      localgxx2.a(localgxw2);
      if (!a(localPhotoTileView.t))
      {
        dbu localdbu = new dbu(this.bn, TileCropActivity.class, this.am.c());
        localdbu.a = localPhotoTileView.t;
        localdbu.b = this.m.getInt("photo_picker_crop_mode", 0);
        localdbu.e = Integer.valueOf(this.m.getInt("photo_min_width", 0));
        localdbu.f = Integer.valueOf(this.m.getInt("photo_min_height", 0));
        a(localdbu.a(), 0);
      }
    }
    for (;;)
    {
      return true;
      bdo localbdo = new bdo(this.bn, this.am.c());
      mbf localmbf = this.bn;
      localbdo.a.setClass(localmbf, HostPhotoPagerActivity.class);
      localbdo.c = localPhotoTileView.t;
      localbdo.g = this.az.b;
      localbdo.w = this.aA.c();
      localbdo.e = this.d;
      localbdo.p = Integer.valueOf(this.aA.b);
      localbdo.r = Boolean.valueOf(false);
      localbdo.m = Boolean.valueOf(this.m.getBoolean("force_return_edit_list"));
      Intent localIntent = localbdo.a();
      gxx localgxx1 = (gxx)this.bo.a(gxx.class);
      gxw localgxw1 = new gxw(this.bn);
      localgxw1.c = gxz.dm;
      localgxx1.a(localgxw1);
      a(localIntent, 1);
    }
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    if (this.c != null) {
      paramgpr.a(this.c);
    }
    if ((this.aA.c()) && ((0x4 & this.aC) == 0)) {
      c(paramgpr);
    }
    if (!this.aE) {
      paramgpr.b(aaw.co);
    }
  }
  
  public final void d()
  {
    super.d();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("view_id", this.d);
    if (this.c != null) {
      paramBundle.putString("title", this.c);
    }
    if (this.b != null) {
      paramBundle.putInt("delete_request", this.b.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    if (this.aa != null) {
      this.aa.e();
    }
    EsService.a(this.bn, this.ad);
    if (this.b != null)
    {
      int i = this.b.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.b.intValue());
        dme localdme = this.ad;
        int j = this.b.intValue();
        this.am.c();
        localdme.I(j, localdmx);
      }
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.ad;
    EsService.d.remove(localdme);
  }
  
  public final boolean onLongClick(View paramView)
  {
    boolean bool1 = paramView instanceof PhotoTileView;
    boolean bool2 = false;
    if (bool1)
    {
      b((PhotoTileView)paramView);
      c(0);
      bool2 = true;
    }
    return bool2;
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
    return gya.ai;
  }
  
  public final boolean t_()
  {
    if (this.aE) {
      return super.s_();
    }
    return super.t_();
  }
  
  protected final boolean v()
  {
    if (this.a == null) {}
    for (Cursor localCursor = null; (localCursor == null) || (localCursor.getCount() == 0); localCursor = this.a.c) {
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccx
 * JD-Core Version:    0.7.0.1
 */