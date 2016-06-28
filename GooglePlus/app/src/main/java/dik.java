import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.RectF;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class dik
  extends mca
  implements dij, diw, gpq, lee
{
  boolean Z;
  int a;
  boolean aa;
  int ab = -1;
  did ac;
  final dha ad = new cye(this, this.bp);
  RecyclerView ae;
  private git af;
  private Bundle ag;
  private dhd ah;
  private jov ai;
  private dia aj;
  private final cw<Cursor> ak = new dio(this);
  private final cw<dih> al = new dip(this);
  private aep am;
  private final jpe an;
  String b;
  jyy c;
  gzj d;
  
  public dik()
  {
    new gpk(this, this.bp, this);
    this.an = new dil(this);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.AV, paramViewGroup, false);
    this.ae = ((RecyclerView)localView.findViewById(ehr.O));
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    this.am = new aep(this.bn, i);
    this.am.a = new die(this.ac, i);
    this.ae.a(this.am);
    this.ae.a(this.ac);
    return localView;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.a(paramInt1, paramInt2, paramIntent);
      return;
      if (paramIntent != null)
      {
        byte[] arrayOfByte = paramIntent.getByteArrayExtra("data");
        if (arrayOfByte != null)
        {
          bor localbor = new bor(this.bn, this.a, arrayOfByte);
          gzj localgzj4 = this.d;
          localgzj4.d.a(localbor, false);
          localgzj4.b(localbor);
          continue;
          if (paramIntent != null)
          {
            RectF localRectF = (RectF)paramIntent.getParcelableExtra("coordinates");
            int i = paramIntent.getIntExtra("photo_picker_rotation", 0);
            if (paramInt1 == 109) {}
            for (boolean bool = true;; bool = false)
            {
              if (!paramIntent.hasExtra("photo_id")) {
                break label223;
              }
              long l = paramIntent.getLongExtra("photo_id", 0L);
              boh localboh = new boh(this.a, this.b, String.valueOf(l), localRectF, i, bool);
              gzj localgzj3 = this.d;
              localgzj3.d.a(localboh, false);
              localgzj3.b(localboh);
              break;
            }
            label223:
            if (paramIntent.hasExtra("tile_id"))
            {
              String str2 = paramIntent.getStringExtra("tile_id");
              bog localbog = new bog(this.a, this.b, str2, localRectF, i, bool);
              gzj localgzj2 = this.d;
              localgzj2.d.a(localbog, false);
              localgzj2.b(localbog);
            }
            else
            {
              String str1 = paramIntent.getStringExtra("photo_url");
              if (str1 != null)
              {
                boq localboq = new boq(this.a, this.b, str1, localRectF);
                gzj localgzj1 = this.d;
                localgzj1.d.a(localboq, false);
                localgzj1.b(localboq);
              }
            }
          }
        }
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    this.b = this.m.getString("gaia_id");
    this.a = this.af.c();
    this.ac = new did(this.bn);
    this.ai.a(ehr.af, this.an);
    this.aj = new dia(f());
    if (paramBundle != null)
    {
      this.aa = paramBundle.getBoolean("is_first_load");
      this.Z = paramBundle.getBoolean("editing_profile_photo");
      this.ac.e = paramBundle.getString("tagline");
      this.ac.b(paramBundle.getInt("all_squares_visibility"), paramBundle.getInt("all_followed_collexions_visibility"));
      this.ac.a(paramBundle.getStringArrayList("editing_profile_photo"));
      this.ab = paramBundle.getInt("last_fully_visible_view_position", -1);
    }
    for (;;)
    {
      this.d.a("editProfileTask", new diq(this)).a("UploadProfilePhotoTask", new diu(this)).a("SetScrapbookPhotoTask", new dis(this)).a("SetScrapbookPhotoForTileIdTask", new dir(this)).a("UploadCoverPhotoTask", new dit(this)).a("getPhotoTask", new din(this)).a("getCoverPhotoTask", new dim(this));
      return;
      this.aa = true;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(ehr.P);
    paramgpr.c(ehr.P).setEnabled(true);
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      did localdid3 = this.ac;
      localdid3.h.add(paramString);
      localdid3.a.b();
    }
    for (;;)
    {
      did localdid2 = this.ac;
      if (localdid2.c != null)
      {
        localdid2.g = 1;
        localdid2.c(-1 + dig.b);
      }
      return;
      did localdid1 = this.ac;
      localdid1.h.remove(paramString);
      localdid1.a.b();
    }
  }
  
  @TargetApi(21)
  public final void a(tp paramtp)
  {
    paramtp.b(aw.B);
    paramtp.c(true);
    if (Build.VERSION.SDK_INT >= 21) {
      paramtp.a(0.0F);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    did localdid = this.ac;
    if (paramBoolean) {}
    for (int i = 2;; i = 3)
    {
      localdid.f = i;
      localdid.c(-1 + dig.b);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    quq localquq;
    did localdid1;
    quo[] arrayOfquo;
    qut localqut;
    did localdid2;
    int k;
    int j;
    if (i == ehr.P)
    {
      localquq = new quq();
      localquq.b = this.ac.g;
      localquq.c = this.ac.f;
      localdid1 = this.ac;
      if (localdid1.c == null)
      {
        arrayOfquo = null;
        localquq.a = arrayOfquo;
        localqut = new qut();
        localqut.a = this.ac.b().trim();
        localdid2 = this.ac;
        if ((localdid2.d == null) || (!localdid2.d.moveToFirst())) {
          break label707;
        }
        k = localdid2.d.getInt(localdid2.d.getColumnIndexOrThrow("followed_collexions_flairs_visibility"));
        j = localdid2.d.getInt(localdid2.d.getColumnIndexOrThrow("squares_flairs_visibility"));
      }
    }
    for (;;)
    {
      String str1;
      label184:
      int m;
      if (localdid2.j.b == null)
      {
        str1 = "";
        if ((k == localdid2.f) && (j == localdid2.g) && (TextUtils.equals(str1, localdid2.b())) && (localdid2.i.equals(localdid2.h))) {
          break label589;
        }
        m = 1;
        label238:
        if (m == 0) {
          break label595;
        }
        jzf localjzf = new jzf(this.a, this.b, localquq, null, null, localqut, this.ac.k.b);
        gzj localgzj = this.d;
        localgzj.d.a(localjzf, false);
        localgzj.b(localjzf);
      }
      for (;;)
      {
        mbf localmbf1 = this.bn;
        gxr localgxr1 = new gxr();
        gxq localgxq1 = new gxq(pka.c);
        localgxr1.b.add(localgxq1);
        new gwz(4, localgxr1.a(this.bn)).b(localmbf1);
        return true;
        localdid1.i.clear();
        ArrayList localArrayList = new ArrayList();
        localdid1.c.moveToPosition(-1);
        if (localdid1.c.moveToNext())
        {
          String str2 = localdid1.c.getString(localdid1.c.getColumnIndexOrThrow("square_id"));
          if (TextUtils.isEmpty(localdid1.c.getString(localdid1.c.getColumnIndexOrThrow("is_visible")))) {
            localdid1.i.add(str2);
          }
          qus localqus = new qus();
          localqus.b = str2;
          quo localquo = new quo();
          if (!localdid1.h.contains(str2)) {}
          for (boolean bool = true;; bool = false)
          {
            localquo.a = Boolean.valueOf(bool);
            localquo.a(qus.a, localqus);
            localArrayList.add(localquo);
            break;
          }
        }
        arrayOfquo = (quo[])localArrayList.toArray(new quo[localArrayList.size()]);
        break;
        str1 = localdid2.j.b;
        break label184;
        label589:
        m = 0;
        break label238;
        label595:
        Intent localIntent = new Intent();
        localIntent.putExtra("should_refresh_data", false);
        f().setResult(-1, localIntent);
        f().finish();
      }
      if (i == 16908332)
      {
        mbf localmbf2 = this.bn;
        gxr localgxr2 = new gxr();
        gxq localgxq2 = new gxq(pka.b);
        localgxr2.b.add(localgxq2);
        new gwz(4, localgxr2.a(this.bn)).b(localmbf2);
        return true;
      }
      return false;
      label707:
      j = 0;
      k = 0;
    }
  }
  
  public final void b(tp paramtp) {}
  
  public final void b(boolean paramBoolean)
  {
    int i = 2;
    did localdid2;
    if (paramBoolean)
    {
      this.ac.h.clear();
      localdid2 = this.ac;
      if (localdid2.c != null)
      {
        localdid2.a(i, localdid2.c.getCount());
        if (!paramBoolean) {
          break label167;
        }
      }
    }
    for (;;)
    {
      localdid2.g = i;
      localdid2.c(-1 + dig.b);
      return;
      did localdid1 = this.ac;
      if (localdid1.c == null) {
        break;
      }
      localdid1.c.moveToPosition(-1);
      ArrayList localArrayList = new ArrayList();
      while (localdid1.c.moveToNext()) {
        localArrayList.add(localdid1.c.getString(localdid1.c.getColumnIndexOrThrow("square_id")));
      }
      localdid1.h.clear();
      localdid1.h.addAll(localArrayList);
      break;
      label167:
      i = 3;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    mbb localmbb = this.bo;
    localmbb.a(lee.class, this);
    localmbb.a(diw.class, this);
    localmbb.a(dij.class, this);
    localmbb.a(dha.class, this.ad);
    this.af = ((git)this.bo.a(git.class));
    this.ag = ((gvj)this.bo.a(gvj.class)).a();
    this.d = ((gzj)this.bo.a(gzj.class));
    this.c = ((jyy)this.bo.a(jyy.class));
    this.ai = ((jov)this.bo.a(jov.class));
    this.ah = ((dhd)this.bo.a(dhd.class));
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    cv localcv = k();
    localcv.a(1, null, this.ak);
    localcv.a(2, null, this.al);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("is_first_load", this.aa);
    paramBundle.putBoolean("editing_profile_photo", this.Z);
    paramBundle.putString("tagline", this.ac.b());
    paramBundle.putInt("all_squares_visibility", this.ac.g);
    paramBundle.putInt("all_followed_collexions_visibility", this.ac.f);
    paramBundle.putStringArrayList("editing_profile_photo", new ArrayList(this.ac.h));
    paramBundle.putInt("last_fully_visible_view_position", this.am.j());
  }
  
  public final void v()
  {
    this.Z = false;
    dgz localdgz = this.ah.e().a(aI_().getString(aw.h));
    bp localbp = f();
    Intent localIntent = efj.b("camera-photo.jpg");
    int i = localbp.getPackageManager().queryIntentActivities(localIntent, 65536).size();
    boolean bool = false;
    if (i > 0) {
      bool = true;
    }
    localdgz.a(bool).b(true).a().a(h(), "change_photo");
  }
  
  public final void w()
  {
    boolean bool = true;
    this.Z = bool;
    dgz localdgz = this.ah.e().a(aI_().getString(aw.i));
    bp localbp = f();
    Intent localIntent = efj.b("camera-photo.jpg");
    if (localbp.getPackageManager().queryIntentActivities(localIntent, 65536).size() > 0) {}
    for (;;)
    {
      localdgz.a(bool).a().a(h(), "change_photo");
      return;
      bool = false;
    }
  }
  
  public final void x()
  {
    gjb localgjb = this.af.f();
    Uri.Builder localBuilder = new Uri.Builder().scheme("https").authority("aboutme.google.com");
    Boolean localBoolean = this.ac.l.b;
    if (localBoolean == null) {}
    for (boolean bool = false;; bool = localBoolean.booleanValue())
    {
      if ((bool) || (this.ac.c()))
      {
        localBuilder.appendQueryParameter("referer", "gplus_android");
        localBuilder.appendQueryParameter("pageId", this.b);
      }
      dhg localdhg = new dhg();
      localdhg.a = localBuilder.build();
      localdhg.b = localgjb.b("account_name");
      Intent localIntent = new Intent("android.intent.action.VIEW", localdhg.a());
      ay.a(f(), localIntent, this.ag);
      return;
    }
  }
  
  public final void y()
  {
    this.aj.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dik
 * JD-Core Version:    0.7.0.1
 */