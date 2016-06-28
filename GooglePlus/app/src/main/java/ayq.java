import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ayq
  extends mca
  implements gzi, luu
{
  private static final bfc c = new bfc(aaw.jE);
  private bfd Z;
  byte[] a;
  private bdk aa;
  private bdm ab;
  private Integer ac;
  private guf ad;
  private final gug ae;
  git b;
  private final gzj d;
  
  public ayq()
  {
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.d = localgzj;
    this.ad = new ayr(this);
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    this.ae = localgug.a(aaw.iX, this.ad);
    new bez(this, this.bp, c, new ays(this));
    new jeq(this.bp, new ayt(this), '\000');
    new jeq(this.bp, new ayu(this), (short)0);
  }
  
  private final void z()
  {
    Intent localIntent = this.aa.b.c(f().getApplicationContext());
    this.ae.a(aaw.iX, localIntent);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    switch (((Integer)paramBundle.getIntegerArrayList("operation_list").get(paramInt)).intValue())
    {
    default: 
      Log.e("PhotoSetAsFragment", "Unknown operation");
      return;
    case 0: 
      if (this.aa.b.M())
      {
        z();
        return;
      }
      int i = aau.en;
      String str1 = g().getString(i);
      int j = aau.mf;
      String str2 = g().getString(j);
      int k = aau.cM;
      lut locallut = lut.a(null, str1, str2, g().getString(k), 0, 0);
      locallut.n = this;
      locallut.p = 0;
      locallut.a(this.x, "confirm_profile_photo");
      return;
    }
    y();
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("confirm_profile_photo".equals(paramString)) {
      z();
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("UploadProfilePhotoTask".equals(paramString))
    {
      efj.a(this.x);
      if (paramhae != null) {
        if (paramhae.b == 200) {
          break label49;
        }
      }
    }
    label49:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.a = null;
        this.ac = null;
      }
      return;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((bfd)this.bo.a(bfd.class));
    this.aa = ((bdk)this.bo.a(bdk.class));
    this.ab = ((bdm)this.bo.a(bdm.class));
    this.b = ((git)this.bo.a(git.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void m()
  {
    super.m();
    bfd localbfd = this.Z;
    bfc localbfc = c;
    bcp localbcp = this.aa.b;
    if ((localbcp.P()) && (!localbcp.H()) && (!localbcp.E()) && (this.aa.d) && ((w()) || (x()))) {}
    for (boolean bool = true;; bool = false)
    {
      localbfd.a(localbfc, bool);
      if (this.a != null)
      {
        int i = this.b.c();
        this.d.b(new bor(f(), i, this.a));
        bz localbz = this.x;
        int j = aau.tg;
        coo.a(null, g().getString(j), false, false).a(localbz, "ProgressDialogHelper:progress_dialog");
      }
      return;
    }
  }
  
  final void v()
  {
    bfd localbfd = this.Z;
    bfc localbfc = c;
    bcp localbcp = this.aa.b;
    if ((localbcp.P()) && (!localbcp.H()) && (!localbcp.E()) && (this.aa.d) && ((w()) || (x()))) {}
    for (boolean bool = true;; bool = false)
    {
      localbfd.a(localbfc, bool);
      return;
    }
  }
  
  final boolean w()
  {
    if (this.aa.b.C()) {}
    String str;
    List localList;
    do
    {
      return true;
      if (!this.b.e()) {
        return false;
      }
      str = this.b.f().b("gaia_id");
      localList = Collections.unmodifiableList(this.ab.c);
    } while ((localList != null) && (localList.contains(str)));
    return false;
  }
  
  final boolean x()
  {
    bcp localbcp = this.aa.b;
    return (!iqw.a(localbcp.a().c)) || (!localbcp.G());
  }
  
  @SuppressLint({"InlinedApi", "NewApi"})
  public final void y()
  {
    Intent localIntent = this.aa.b.b(f());
    int i = aau.sU;
    a(Intent.createChooser(localIntent, g().getString(i)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayq
 * JD-Core Version:    0.7.0.1
 */