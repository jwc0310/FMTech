import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public final class grv
  implements by, gth, guc, meu, mfd
{
  final bp a;
  final grl b;
  private final String c;
  private final ics d;
  private final otk e;
  private final grb f;
  
  grv(bp parambp, grl paramgrl, String paramString, ics paramics, otk paramotk, grb paramgrb, mek parammek)
  {
    this.a = parambp;
    this.b = paramgrl;
    this.c = paramString;
    this.d = paramics;
    this.e = paramotk;
    this.f = paramgrb;
    parammek.a(this);
    parambp.b.a.d.a(this);
  }
  
  private final void a(String paramString, rbr paramrbr)
  {
    String str = this.a.getString(17039370);
    pyg localpyg = (pyg)gtq.g.l();
    if (paramString != null) {
      localpyg.b(paramString);
    }
    if (paramrbr != null) {
      localpyg.a(paramrbr);
    }
    if (str != null) {
      localpyg.d(str);
    }
    pye localpye = (pye)localpyg.e();
    if (!localpye.ao_()) {
      throw new pzr();
    }
    gtq localgtq = (gtq)localpye;
    gtl localgtl = new gtl();
    Bundle localBundle = new Bundle();
    efj.a(localBundle, "TIKTOK_FRAGMENT_ARGUMENT", localgtq);
    localgtl.f(localBundle);
    localgtl.a(this.a.b.a.d, null);
  }
  
  private final void c()
  {
    View localView = this.a.findViewById(efj.EB);
    nj.a.c(localView, 4);
  }
  
  public final void P_()
  {
    if (this.a.b.a.d.a("menu_fragment_tag") == null)
    {
      View localView = this.a.findViewById(efj.EB);
      nj.a.c(localView, 0);
      return;
    }
    c();
  }
  
  public final void a(int paramInt, qrw paramqrw)
  {
    int i = 1;
    this.a.b.a.d.c();
    switch (grw.a[(paramInt - 1)])
    {
    }
    label317:
    bk localbk;
    do
    {
      qsl localqsl;
      do
      {
        return;
        int m;
        rbh localrbh;
        String str5;
        if ((0x1 & paramqrw.u().a) == i)
        {
          m = i;
          if (m == 0) {
            break label317;
          }
          localrbh = paramqrw.u().b().c();
          str5 = this.c;
          switch (ict.a[localrbh.b().ordinal()])
          {
          }
        }
        String str6;
        for (String str7 = localrbh.a;; str7 = 1 + String.valueOf(str5).length() + String.valueOf(str6).length() + str5 + "/" + str6)
        {
          Intent localIntent2 = new Intent().setAction("android.intent.action.VIEW").setPackage(this.f.b()).setData(Uri.parse(str7)).putExtra("account_id", this.e.a());
          if (this.a.getPackageManager().resolveActivity(localIntent2, 0) == null) {
            localIntent2.setPackage(null);
          }
          this.a.startActivity(localIntent2);
          return;
          m = 0;
          break;
          str6 = localrbh.a;
          if (str5.endsWith("/")) {
            str5 = str5.substring(0, -1 + str5.length());
          }
          if (str6.startsWith("/")) {
            str6 = str6.substring(i);
          }
        }
        qsv localqsv = paramqrw.u();
        if (localqsv.p()) {}
        for (rbr localrbr = localqsv.q();; localrbr = localqsv.d())
        {
          a(this.d.b(localqsv.o()), localrbr);
          return;
        }
        Intent localIntent1 = this.f.a(this.a, this.e.a(), paramqrw.w().b);
        this.a.startActivity(localIntent1);
        return;
        localqsl = paramqrw.s();
        if ((0x1 & localqsl.a) == i) {}
        while (i != 0)
        {
          String str2 = this.d.b(paramqrw.s().c());
          String str3 = this.d.b(paramqrw.s().d());
          String str4 = this.d.b(paramqrw.s().o());
          pyg localpyg = ((pyg)gtq.g.l()).a(paramqrw);
          if (str2 != null) {
            localpyg.b(str2);
          }
          if (str3 != null) {
            localpyg.c(str3);
          }
          if (str4 != null) {
            localpyg.d(str4);
          }
          pye localpye2 = (pye)localpyg.e();
          if (!localpye2.ao_())
          {
            throw new pzr();
            i = 0;
          }
          else
          {
            gtq localgtq2 = (gtq)localpye2;
            gsv localgsv = new gsv();
            Bundle localBundle2 = new Bundle();
            efj.a(localBundle2, "TIKTOK_FRAGMENT_ARGUMENT", localgtq2);
            localgsv.f(localBundle2);
            localgsv.a(this.a.b.a.d, null);
            return;
          }
        }
      } while (!localqsl.p());
      a(null, localqsl.q());
      return;
      localbk = this.a.b.a.d.a(efj.ED);
    } while ((localbk == null) || (!localbk.i()));
    gse localgse = (gse)localbk;
    if (localgse.a == null) {
      throw new IllegalStateException("peer() called before initialized");
    }
    gsf localgsf = (gsf)localgse.a;
    String str1 = localgsf.e.b(paramqrw.s().r());
    pye localpye1 = (pye)((pyg)gtq.g.l()).c(str1).e();
    if (!localpye1.ao_()) {
      throw new pzr();
    }
    gtq localgtq1 = (gtq)localpye1;
    gsq localgsq = new gsq();
    Bundle localBundle1 = new Bundle();
    efj.a(localBundle1, "TIKTOK_FRAGMENT_ARGUMENT", localgtq1);
    localgsq.f(localBundle1);
    localgsf.f = localgsq;
    localgsf.f.a(localgsf.d.b.a.d, null);
    oxz localoxz = localgsf.b;
    grc localgrc = localgsf.c;
    qsd localqsd = paramqrw.s().b();
    if (localqsd != null) {}
    int k;
    for (int j = i;; k = 0)
    {
      efj.c(j, "Requires an item ID");
      localoxz.a(new grd(localgrc, localqsd), localgsf.g.a(paramqrw));
      return;
    }
  }
  
  public final String b()
  {
    return this.b.a;
  }
  
  public final void m_()
  {
    this.a.b.a.d.b(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     grv
 * JD-Core Version:    0.7.0.1
 */