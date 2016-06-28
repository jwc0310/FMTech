import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;

public final class ino
  extends mca
  implements gzi, ili, inl, ins
{
  private hue Z;
  long a;
  private int aa;
  private int ab;
  private ikz b;
  private giz c;
  private gzj d;
  
  public ino()
  {
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.d = localgzj;
    this.Z = new hue(this.bp);
    this.aa = -1;
    this.a = -9223372036854775808L;
  }
  
  private final void x()
  {
    if (this.a != -9223372036854775808L)
    {
      long l = Math.max(this.a - System.currentTimeMillis(), 0L);
      this.Z.a(new inp(this), l);
    }
  }
  
  public final void a()
  {
    this.b.e();
  }
  
  public final void a(int paramInt)
  {
    boolean bool = true;
    this.aa = paramInt;
    gjb localgjb1 = this.c.a(paramInt);
    String str = localgjb1.b("account_name");
    if (localgjb1.c("PlusiAccountUpdateExtension.oob_required"))
    {
      int m = this.c.a(str);
      gjb localgjb2 = this.c.a(m);
      gzj localgzj = this.d;
      mbf localmbf = this.bn;
      if (localgjb2.a("page_count", 0) > 0) {
        localgzj.b(new inr(localmbf, "oob", str, null, null, null, bool, false));
      }
    }
    for (;;)
    {
      return;
      bool = false;
      break;
      if (localgjb1.c("gplus_skinny_page"))
      {
        this.b.aG_();
        bw localbw = h();
        int localint = new int();
        Bundle localBundle = new Bundle();
        localBundle.putString("account_name", str);
        localint.f(localBundle);
        localint.a(localbw, "oob_select_page");
        return;
      }
      int i = this.ab;
      int j = 0;
      if (i == 5) {}
      while (j == 0)
      {
        ikz localikz = this.b;
        int k = do.c;
        localikz.b(g().getString(k), "G+ upgrade failed");
        return;
        this.ab = (1 + this.ab);
        this.a = (2000L * (1L << this.ab) + System.currentTimeMillis());
        x();
        j = bool;
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.aa = paramBundle.getInt("account_id");
      this.ab = paramBundle.getInt("retry_count");
      this.a = paramBundle.getLong("next_retry_time_ms");
      x();
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("oob".equals(paramString))
    {
      if (paramhae == null) {
        this.b.e();
      }
    }
    else {
      return;
    }
    if (paramhae.b != 200) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.b.aF_();
      return;
    }
    String str1 = this.c.a(this.aa).b("account_name");
    Bundle localBundle1 = paramhae.a();
    hqw localhqw = (hqw)localBundle1.getParcelable("oob_response");
    if (localhqw != null)
    {
      this.b.aG_();
      oci localoci = (oci)localhqw.a(new oci());
      boolean bool = localBundle1.getBoolean("allow_non_google_accounts");
      if ((localoci != null) && (localoci.a != null) && (localoci.a.a != null) && (localoci.a.a.length == 2) && (localoci.a.a[0].a != null) && (localoci.a.a[1].b != null) && (localoci.a.a[1].b.a == 2)) {}
      for (int j = 1; j != 0; j = 0)
      {
        mbf localmbf = this.bn;
        bw localbw2 = h();
        String str2 = localoci.a.a[0].a.a;
        if (localoci.a.c != null)
        {
          String str3 = String.valueOf(localoci.a.c);
          str2 = 14 + String.valueOf(str3).length() + String.valueOf(str2).length() + "<b>" + str3 + "</b><p></p>" + str2;
        }
        Bundle localBundle3 = new Bundle();
        localBundle3.putString("title", localoci.a.b);
        localBundle3.putString("message", str2);
        localBundle3.putString("positive", localoci.a.a[1].b.b);
        localBundle3.putString("negative", localmbf.getString(do.a));
        localBundle3.putBoolean("non_google_account", bool);
        localBundle3.putBoolean("shown_page_tos", efj.b(localoci.c));
        ink localink = new ink();
        localink.f(localBundle3);
        localink.a(localbw2, "accept_tos");
        return;
      }
      bw localbw1 = h();
      iok localiok = new iok();
      Bundle localBundle2 = new Bundle();
      localBundle2.putString("AccountName", str1);
      localiok.f(localBundle2);
      cl localcl = localbw1.a();
      localcl.a(localiok, "signup");
      localcl.a("signup");
      localcl.b();
      return;
    }
    v();
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = this.c.a(this.aa).b("account_name");
    this.b.a(this.bn.getString(do.d));
    obw localobw = new obw();
    localobw.a = 2;
    this.d.b(new inr(this.bn, "oob", str, null, localobw, null, paramBoolean1, paramBoolean2));
  }
  
  public final void c(Bundle paramBundle)
  {
    this.c = ((giz)this.bo.a(giz.class));
    this.b = ((ikz)this.bo.a(ikz.class));
    this.bo.a(inl.class, this);
    this.bo.a(ins.class, this);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("account_id", this.aa);
    paramBundle.putInt("retry_count", this.ab);
    paramBundle.putLong("next_retry_time_ms", this.a);
  }
  
  final void v()
  {
    gjb localgjb = this.c.a(this.aa);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    this.b.a(str1, str2);
  }
  
  public final void w()
  {
    v();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ino
 * JD-Core Version:    0.7.0.1
 */