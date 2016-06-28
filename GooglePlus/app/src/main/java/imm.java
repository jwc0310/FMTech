import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class imm
  extends mca
  implements gjn, gzi, ikz
{
  private static final String[] ac = { "update_account", "prepare_accounts", "logout_during_login", "logout", "load_accounts_add", "load_accounts_add_account_activity", "are_accounts_ready_for_login" };
  String Z;
  imt a;
  int aa;
  boolean ab;
  private giz ad;
  private gjm ae;
  private ilk af;
  private final gzj ag;
  private final hue ah;
  private boolean ai;
  private Runnable aj;
  private boolean ak;
  private boolean al;
  private boolean am;
  private String[] an;
  private hug ao;
  ilf b;
  String c;
  String d;
  
  public imm()
  {
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.ag = localgzj;
    this.ah = new hue(this.bp);
    this.aa = -1;
  }
  
  private final void A()
  {
    if (this.aa != -1)
    {
      c(this.aa);
      return;
    }
    e();
  }
  
  private final void B()
  {
    a(false);
  }
  
  private final void C()
  {
    String str;
    if ((this.s) && ((this.ak) || (this.ab)) && (!this.al))
    {
      str = this.b.a;
      if (str == null) {
        break label46;
      }
    }
    for (;;)
    {
      a(str);
      return;
      label46:
      str = this.bn.getString(efj.Oy);
    }
  }
  
  public static imm a(bw parambw)
  {
    imm localimm = (imm)parambw.a("login.fragment");
    if (localimm == null)
    {
      localimm = new imm();
      cl localcl = parambw.a();
      localcl.a(localimm, "login.fragment");
      localcl.b();
      parambw.b();
    }
    return localimm;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    this.aa = paramInt2;
    imq localimq = new imq("logout_during_login", paramInt1, this.a);
    this.ag.b(localimq);
  }
  
  private void b(int paramInt)
  {
    if (!this.ad.c(paramInt))
    {
      b(32 + "Not a valid account: " + paramInt);
      return;
    }
    gjb localgjb = this.ad.a(paramInt);
    a(localgjb.b("account_name"), localgjb.b("effective_gaia_id"));
  }
  
  private final void b(String paramString)
  {
    String str1 = this.b.b;
    if ("com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST".equals(str1)) {
      if (this.d == null) {
        break label55;
      }
    }
    label55:
    for (String str2 = this.d;; str2 = this.b.o)
    {
      str1 = this.bn.getString(efj.Ow, new Object[] { str2 });
      b(str1, paramString);
      return;
    }
  }
  
  private final void c(int paramInt)
  {
    Iterator localIterator = this.bo.c(ilu.class).iterator();
    int i = -1;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      i = ((ilu)localIterator.next()).a(paramInt);
    } while (i == -1);
    if ((i != -1) && (i != paramInt))
    {
      a(i, paramInt);
      return;
    }
    if (this.b.g) {
      this.ad.a(this.b.e, paramInt);
    }
    a(false);
    this.a.a(this.b, this.c, paramInt);
  }
  
  private final void c(String paramString1, String paramString2)
  {
    int i = this.ad.b(paramString1);
    if (i == -1)
    {
      b("Viewer account id invalid");
      return;
    }
    a(this.ad.a(i).b("account_name"), paramString2);
  }
  
  private final boolean x()
  {
    if (this.ak) {}
    while (this.ag.a("are_accounts_ready_for_login")) {
      return false;
    }
    if (this.b.j) {
      return true;
    }
    this.ag.b(new imo("are_accounts_ready_for_login", this.a));
    return false;
  }
  
  private void y()
  {
    boolean bool1 = true;
    this.af.a(h());
    int i;
    if (this.d != null)
    {
      a(this.d, this.Z);
      i = bool1;
      if (i == 0) {
        break label46;
      }
    }
    label159:
    label546:
    label548:
    label551:
    for (;;)
    {
      return;
      i = 0;
      break;
      label46:
      int j = this.b.c;
      int k;
      label67:
      label120:
      int m;
      label123:
      int n;
      int i1;
      label199:
      int i2;
      label247:
      int i4;
      imt localimt;
      ilf localilf;
      boolean bool2;
      int i5;
      label317:
      int i3;
      if (j != -1)
      {
        b(j);
        k = bool1;
        if (k != 0) {
          break label374;
        }
        String str1 = this.b.o;
        String str2 = this.b.p;
        if (str1 == null) {
          break label386;
        }
        if (this.ad.b(str1, str2) == -1) {
          break label376;
        }
        a(str1, str2);
        m = bool1;
        if (m != 0) {
          break label390;
        }
        if (this.b.q == null) {
          break label392;
        }
        c(this.b.q, this.b.p);
        n = bool1;
        if (n != 0) {
          break label396;
        }
        if (!this.b.h) {
          break label466;
        }
        if (this.b.k == -1) {
          break label398;
        }
        b(this.b.k);
        i1 = bool1;
        if (i1 != 0) {
          break label470;
        }
        if (this.b.r == null) {
          break label472;
        }
        int i6 = this.b.r.a(this.ad);
        if (i6 == -1) {
          break label472;
        }
        b(i6);
        i2 = bool1;
        if (i2 != 0) {
          break label476;
        }
        if (!this.b.f) {
          break label542;
        }
        i4 = this.ad.c(this.b.e);
        localimt = this.a;
        localilf = this.b;
        bool2 = localilf.d;
        if (localimt.d.c(i4)) {
          break label478;
        }
        i5 = 0;
        if (i5 == 0) {
          break label542;
        }
        if (i4 == -1) {
          break label536;
        }
        b(i4);
        i3 = bool1;
        label337:
        if (i3 != 0) {
          break label546;
        }
        if (this.b.s == null) {
          break label548;
        }
        this.am = bool1;
        z();
      }
      for (;;)
      {
        if (bool1) {
          break label551;
        }
        e();
        return;
        k = 0;
        break label67;
        label374:
        break;
        label376:
        b("Account not found");
        break label120;
        m = 0;
        break label123;
        break;
        n = 0;
        break label159;
        break;
        if (this.b.l != null)
        {
          a(this.b.l, this.b.m);
          i1 = bool1;
          break label199;
        }
        if (this.b.n != null)
        {
          c(this.b.n, this.b.m);
          i1 = bool1;
          break label199;
        }
        label466:
        i1 = 0;
        break label199;
        label470:
        break;
        label472:
        i2 = 0;
        break label247;
        label476:
        break;
        label478:
        if (localimt.b(localilf, i4) != null)
        {
          i5 = 0;
          break label317;
        }
        if ((bool2) && (!localimt.d.a(i4).c("logged_in")))
        {
          i5 = 0;
          break label317;
        }
        i5 = bool1;
        break label317;
        i3 = 0;
        break label337;
        i3 = 0;
        break label337;
        break;
        bool1 = false;
      }
    }
  }
  
  private final void z()
  {
    bk localbk1;
    bk localbk2;
    if ((this.am) && (this.s))
    {
      this.af.a(h());
      this.am = false;
      this.al = true;
      ikr localikr = (ikr)this.bo.a(this.b.s);
      String str = localikr.getClass().getName();
      bw localbw = h();
      localbk1 = localbw.a(str);
      if (localbk1 != null) {
        break label140;
      }
      Bundle localBundle = this.b.t;
      localbk2 = localikr.a(localBundle);
      localbk2.f(localBundle);
      localbw.a().a(localbk2, str).b();
      localbw.b();
    }
    for (;;)
    {
      ((iks)localbk2).a(this.b);
      return;
      label140:
      localbk2 = localbk1;
    }
  }
  
  public final void a()
  {
    this.ag.b(new imp("load_accounts_add_account_activity", this.ae));
  }
  
  public final void a(int paramInt)
  {
    a(paramInt, -1);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1) {
        v();
      }
    }
    else {
      return;
    }
    e();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ab = paramBundle.getBoolean("logging_in");
      this.ai = paramBundle.getBoolean("login_pending");
      if (this.ai) {
        v();
      }
      this.am = paramBundle.getBoolean("interactive_login_pending");
      this.al = paramBundle.getBoolean("logging_in_interactively");
      this.ak = paramBundle.getBoolean("preparing_accounts");
      this.an = paramBundle.getStringArray("account_names_snapshot");
      this.b = ((ilf)paramBundle.getParcelable("login_request"));
      this.c = paramBundle.getString("tag");
      this.d = paramBundle.getString("selected_account_name");
      this.Z = paramBundle.getString("selected_effective_gaia_id");
      this.aa = paramBundle.getInt("account_id_to_login");
    }
  }
  
  public final void a(String paramString)
  {
    this.af.a(h(), paramString, this.b.i);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    int i = 1;
    paramhaa.c = false;
    if ("update_account".equals(paramString)) {
      if (paramhae == null) {
        this.af.b(h());
      }
    }
    label519:
    label528:
    label632:
    do
    {
      return;
      int i1 = paramhae.a().getInt("account_id");
      if (paramhae.a().getBoolean("has_irrecoverable_error"))
      {
        Intent localIntent = (Intent)this.a.b.get(i1);
        if (localIntent != null)
        {
          a(localIntent, i);
          return;
        }
        this.af.c(h());
        return;
      }
      if (paramhae.a().getBoolean("has_recoverable_error"))
      {
        this.af.b(h());
        return;
      }
      imt localimt = this.a;
      ilf localilf = this.b;
      boolean bool1 = localilf.d;
      boolean bool2 = localimt.d.c(i1);
      int i2 = 0;
      if (!bool2) {}
      while (i2 == 0)
      {
        if (this.ad.c(i1))
        {
          ilh localilh2 = this.a.b(this.b, i1);
          if (localilh2 != null)
          {
            String str = localilh2.getClass().getName();
            bw localbw = h();
            bk localbk = localbw.a(str);
            if (localbk == null)
            {
              localbk = localilh2.a();
              if (localbk != null)
              {
                localbw.a().a(localbk, str).b();
                localbw.b();
              }
            }
            ili localili = (ili)localbk;
            if (localili != null)
            {
              localili.a(i1);
              return;
              ilh localilh1 = localimt.b(localilf, i1);
              i2 = 0;
              if (localilh1 != null) {
                continue;
              }
              if (bool1)
              {
                boolean bool3 = localimt.d.a(i1).c("logged_in");
                i2 = 0;
                if (!bool3) {
                  continue;
                }
              }
              i2 = i;
              continue;
            }
          }
        }
        b(52 + "Login request not satisfied for account: " + i1);
        return;
      }
      c(i1);
      return;
      if ("prepare_accounts".equals(paramString)) {
        this.ak = false;
      }
      do
      {
        y();
        return;
        if ("logout_during_login".equals(paramString))
        {
          A();
          return;
        }
        if ("logout".equals(paramString))
        {
          B();
          return;
        }
        if ("load_accounts_add".equals(paramString))
        {
          int n;
          if (paramhae != null)
          {
            if (paramhae.b != 200) {
              if (i == 0) {
                break label528;
              }
            }
          }
          else
          {
            n = 0;
            if (paramhae != null) {
              break label519;
            }
          }
          for (;;)
          {
            b(this.bn.getString(efj.Ox), 54 + "Load accounts for add account task failed: " + n);
            return;
            i = 0;
            break;
            n = paramhae.b;
          }
          this.an = paramhae.a().getStringArray("account_name_array");
          this.ae.a(this);
          return;
        }
        if ("load_accounts_add_account_activity".equals(paramString))
        {
          int m;
          if (paramhae != null)
          {
            if (paramhae.b != 200) {
              if (i == 0) {
                break label641;
              }
            }
          }
          else
          {
            m = 0;
            if (paramhae != null) {
              break label632;
            }
          }
          for (;;)
          {
            b(this.bn.getString(efj.Ox), 58 + "Load accounts for add account activity failed: " + m);
            return;
            i = 0;
            break;
            m = paramhae.b;
          }
          HashSet localHashSet = new HashSet(Arrays.asList(paramhae.a().getStringArray("account_name_array")));
          localHashSet.removeAll(Arrays.asList(this.an));
          if (!localHashSet.isEmpty())
          {
            this.d = ((String)localHashSet.iterator().next());
            if (!x()) {
              break;
            }
            a(this.d, null);
            return;
          }
          e();
          return;
        }
        if (!"are_accounts_ready_for_login".equals(paramString)) {
          break;
        }
        if (paramhae != null)
        {
          int j = paramhae.b;
          int k = 0;
          if (j != 200) {
            k = i;
          }
          if (k == 0) {}
        }
        else
        {
          b(this.bn.getString(efj.Ox), "Task result has error");
          return;
        }
      } while (paramhae.a().getBoolean("are_accounts_ready_for_login"));
    } while (this.ak);
    label641:
    this.ak = i;
    C();
    imr localimr = new imr("prepare_accounts", this.a);
    this.ag.b(localimr);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    int i = 1;
    this.d = paramString1;
    this.Z = paramString2;
    int j = this.ad.b(paramString1, paramString2);
    imt localimt;
    ilf localilf;
    boolean bool;
    int k;
    if (this.ad.c(j))
    {
      localimt = this.a;
      localilf = this.b;
      bool = localilf.d;
      if (!localimt.d.c(j))
      {
        k = 0;
        if (k == 0) {
          break label150;
        }
        c(j);
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label155;
      }
      return;
      if (localimt.b(localilf, j) != null)
      {
        k = 0;
        break;
      }
      if ((bool) && (!localimt.d.a(j).c("logged_in")))
      {
        k = 0;
        break;
      }
      k = i;
      break;
      label150:
      i = 0;
    }
    label155:
    if (this.b.j)
    {
      b("RPCs disallowed");
      return;
    }
    C();
    ims localims = new ims("update_account", this.d, this.Z, this.a, this.b);
    this.ag.b(localims);
  }
  
  final void a(boolean paramBoolean)
  {
    for (String str : ac) {
      this.ag.b(str);
    }
    this.af.a(h());
    this.ab = false;
    this.al = false;
    if ((!paramBoolean) && (i())) {
      this.x.a().a(this).b();
    }
  }
  
  public final void aF_()
  {
    this.af.b(h());
  }
  
  public final void aG_()
  {
    this.af.a(h());
  }
  
  public final void aH_()
  {
    w();
  }
  
  public final void b(String paramString1, String paramString2)
  {
    String str1 = String.valueOf(paramString2);
    if (str1.length() != 0) {}
    for (String str2 = "Login failed: ".concat(str1);; str2 = new String("Login failed: "))
    {
      Log.e("LoginHelperFragment", str2);
      if (paramString1 != null) {
        Toast.makeText(this.bn, paramString1, 1).show();
      }
      e();
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((imt)this.bo.a(ilb.class));
    this.ad = ((giz)this.bo.a(giz.class));
    this.ae = ((gjm)this.bo.a(gjm.class));
    this.af = ((ilk)this.bo.a(ilk.class));
    this.bo.a(ikz.class, this);
  }
  
  public final void d()
  {
    this.ag.b(new imp("load_accounts_add", this.ae));
  }
  
  public final void e()
  {
    if (this.ab)
    {
      a(false);
      this.a.a(this.b, this.c, -1);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("logging_in", this.ab);
    paramBundle.putBoolean("login_pending", this.ai);
    paramBundle.putBoolean("preparing_accounts", this.ak);
    paramBundle.putParcelable("login_request", this.b);
    paramBundle.putString("tag", this.c);
    paramBundle.putString("selected_account_name", this.d);
    paramBundle.putString("selected_effective_gaia_id", this.Z);
    paramBundle.putInt("account_id_to_login", this.aa);
    paramBundle.putStringArray("account_names_snapshot", this.an);
    paramBundle.putBoolean("interactive_login_pending", this.am);
    paramBundle.putBoolean("logging_in_interactively", this.al);
  }
  
  public final void m()
  {
    super.m();
    C();
    z();
  }
  
  public final void p_()
  {
    super.p_();
    if ((this.ai) && (this.ao == null)) {
      v();
    }
  }
  
  public final void q_()
  {
    super.q_();
    this.ah.a(this.ao);
    this.ao = null;
  }
  
  final void v()
  {
    this.ai = true;
    if (this.aj == null) {
      this.aj = pdt.a(new imn(this));
    }
    this.ao = this.ah.a(this.aj);
  }
  
  final void w()
  {
    this.ai = false;
    this.aj = null;
    if (x()) {
      y();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imm
 * JD-Core Version:    0.7.0.1
 */