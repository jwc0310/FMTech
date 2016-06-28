import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;
import com.google.android.apps.plus.views.PhotoAlbumView;
import com.google.android.apps.plus.views.PhotoTileView;
import java.util.ArrayList;

public final class chs
  extends cff
  implements View.OnLongClickListener
{
  dgj a;
  private GridView b;
  private boolean c;
  private final hwq d;
  
  public chs()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.d = localhwq;
  }
  
  private final boolean C()
  {
    return ((gzj)this.bo.a(gzj.class)).a("GetTrashPhotosTask");
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    PhotoAlbumView localPhotoAlbumView = (PhotoAlbumView)super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.up);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    this.a = new dgj(this.bn, null);
    this.a.w = this;
    this.a.x = this;
    this.b = ((GridView)localPhotoAlbumView.findViewById(aaw.dS));
    this.b.setNumColumns(new jrh(this.bn).a);
    this.b.setHorizontalSpacing(i);
    this.b.setVerticalSpacing(i);
    this.b.setAdapter(this.a);
    this.b.setSelector(efj.qM);
    if (paramBundle != null) {
      this.c = paramBundle.getBoolean("refresh_complete");
    }
    if ((this.c) || (!this.am.e())) {
      k().a(0, null, new cht(this));
    }
    c(localPhotoAlbumView);
    return localPhotoAlbumView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle == null) && (this.am.e())) {
      z_();
    }
    ((gzj)this.bo.a(gzj.class)).a(new hak(this.bn, this.x));
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if (paramString.equals("empty_trash"))
    {
      ArrayList localArrayList = paramBundle.getStringArrayList("fingerprints");
      boc localboc = new boc(this.bn, this.am.c(), localArrayList, false);
      localboc.a = g().getString(aau.fG);
      gzj localgzj = (gzj)this.bo.a(gzj.class);
      localgzj.d.a(localboc, false);
      localgzj.b(localboc);
      return;
    }
    super.a(paramBundle, paramString);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (paramString == null) || (f() == null) || (f().isFinishing())) {}
    while (!TextUtils.equals(paramString, "GetTrashPhotosTask")) {
      return;
    }
    if (hae.a(paramhae)) {
      this.aB = true;
    }
    this.c = true;
    if (this.aB)
    {
      String str = g().getString(aau.rR);
      Toast.makeText(f(), str, 0).show();
      c(this.N);
      return;
    }
    k().a(0, null, new cht(this));
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.da)
    {
      lut locallut;
      Bundle localBundle;
      dgj localdgj;
      ArrayList localArrayList;
      if (i())
      {
        int i = aau.fE;
        String str1 = g().getString(i);
        int j = aau.fF;
        String str2 = g().getString(j);
        int k = aau.fE;
        String str3 = g().getString(k);
        int m = aau.cM;
        locallut = lut.a(str1, str2, str3, g().getString(m), 0, 0);
        localBundle = locallut.m;
        localdgj = this.a;
        localArrayList = new ArrayList(localdgj.c.getCount());
        if ((localdgj.c != null) && (!localdgj.c.isClosed())) {
          break label177;
        }
      }
      for (;;)
      {
        localBundle.putStringArrayList("fingerprints", localArrayList);
        locallut.n = this;
        locallut.p = 0;
        locallut.a(this.x, "empty_trash");
        return true;
        label177:
        int n = localdgj.c.getPosition();
        if (localdgj.c.moveToFirst()) {
          do
          {
            localArrayList.add(localdgj.c.getString(1));
          } while (localdgj.c.moveToNext());
        }
        localdgj.c.moveToPosition(n);
      }
    }
    return super.a(paramMenuItem);
  }
  
  protected final boolean a(View paramView)
  {
    return (paramView instanceof PhotoTileView);
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    paramgpr.d(aau.oh);
    if ((this.a != null) && (this.a.getCount() > 0)) {
      paramgpr.b(aaw.da);
    }
  }
  
  final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if (!C())
      {
        hwq localhwq3 = this.d;
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
      a(this.d);
      G();
      return;
      hwq localhwq2 = this.d;
      hwt localhwt2 = hwt.a;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      continue;
      hwq localhwq1 = this.d;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("refresh_complete", this.c);
  }
  
  public final boolean onLongClick(View paramView)
  {
    b((PhotoTileView)paramView);
    c(0);
    return true;
  }
  
  public final gya r_()
  {
    return gya.al;
  }
  
  protected final boolean v()
  {
    if (this.a == null) {}
    for (Cursor localCursor = null; (localCursor == null) || (localCursor.getCount() == 0); localCursor = this.a.c) {
      return true;
    }
    return false;
  }
  
  public final boolean y_()
  {
    return (super.y_()) || (C());
  }
  
  public final boolean z()
  {
    return super.z();
  }
  
  public final void z_()
  {
    super.z_();
    bp localbp = f();
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    if ((localbp != null) && (!C()))
    {
      localgzj.b(new bnj(localbp, this.am.c()));
      this.c = false;
      c(this.N);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chs
 * JD-Core Version:    0.7.0.1
 */