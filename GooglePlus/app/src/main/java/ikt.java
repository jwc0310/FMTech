import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ikt
  implements git, gjh, ilc, mbo, mes, meu, mez, mfa, mfb, mfd
{
  final bp a;
  ilb b;
  String c;
  public String d;
  public int e = -1;
  ikv f;
  public final List<giv> g = new ArrayList();
  private giz h;
  private giu i = giu.a;
  private ilf j;
  private ilf k;
  private int l;
  private boolean m;
  private final hue n;
  
  public ikt(bp parambp, mek parammek)
  {
    this.a = parambp;
    parammek.a(this);
    this.n = new hue(parammek);
  }
  
  public ikt(bp parambp, mek parammek, giz paramgiz, ilb paramilb, ilj paramilj)
  {
    if (paramilj == null) {
      throw new NullPointerException();
    }
    this.n = new hue(parammek);
    this.a = parambp;
    this.h = paramgiz;
    this.b = paramilb;
    parammek.a(this);
  }
  
  private final void a(ilf paramilf, giu paramgiu, int paramInt, boolean paramBoolean)
  {
    giu localgiu = this.i;
    int i1 = this.e;
    this.j = paramilf;
    this.i = paramgiu;
    this.e = paramInt;
    if ((paramBoolean) || (paramgiu != localgiu) || (paramInt != i1)) {}
    for (boolean bool = true;; bool = false)
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext()) {
        ((giv)localIterator.next()).a(bool, localgiu, paramgiu, i1, paramInt);
      }
    }
  }
  
  private final boolean a(ilf paramilf, int paramInt)
  {
    return (this.h.c(paramInt)) && (this.b.a(paramilf, paramInt));
  }
  
  private final void i()
  {
    int i1;
    giu localgiu1;
    ilf localilf1;
    boolean bool2;
    label89:
    Object localObject;
    ilf localilf2;
    boolean bool1;
    if ((this.m) && (this.k != null))
    {
      i1 = this.l;
      if (i1 == -1) {
        break label130;
      }
      localgiu1 = giu.c;
      localilf1 = this.k;
      if ((i1 != -1) || (this.e == -1)) {
        break label163;
      }
      if (!a(localilf1, this.e)) {
        break label143;
      }
      int i2 = this.e;
      giu localgiu3 = giu.c;
      ilf localilf3 = this.j;
      if (this.k.c == -1) {
        break label137;
      }
      bool2 = true;
      localObject = localgiu3;
      i1 = i2;
      boolean bool3 = bool2;
      localilf2 = localilf3;
      bool1 = bool3;
    }
    for (;;)
    {
      this.l = -1;
      this.k = null;
      a(localilf2, (giu)localObject, i1, bool1);
      return;
      label130:
      localgiu1 = giu.b;
      break;
      label137:
      bool2 = false;
      break label89;
      label143:
      giu localgiu2 = giu.a;
      i1 = -1;
      localObject = localgiu2;
      localilf2 = null;
      bool1 = false;
      continue;
      label163:
      localObject = localgiu1;
      localilf2 = localilf1;
      bool1 = false;
    }
  }
  
  private final void j()
  {
    if ((this.f != null) || (this.c != null) || (this.k != null)) {}
    for (int i1 = 1;; i1 = 0)
    {
      if ((i1 == 0) && (this.e != -1) && (!a(this.j, this.e))) {
        a(null, giu.a, -1, false);
      }
      return;
    }
  }
  
  public final ikt a(mbb parammbb)
  {
    parammbb.a(git.class, this);
    parammbb.a(ikt.class, this);
    return this;
  }
  
  public final void a()
  {
    this.m = true;
    h();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    if ((this.h == null) && (this.b == null))
    {
      this.h = ((giz)parammbb.a(giz.class));
      this.b = ((ilb)parammbb.a(ilb.class));
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    ilf localilf;
    if (paramBundle != null)
    {
      this.d = paramBundle.getString("account_key");
      this.e = paramBundle.getInt("account_id");
      this.i = giu.values()[paramBundle.getInt("account_handler_state")];
      this.j = ((ilf)paramBundle.getParcelable("completed_login_request"));
      localilf = (ilf)paramBundle.getParcelable("queued_login_request");
      if (localilf != null) {
        break label131;
      }
    }
    label131:
    for (ikv localikv = null;; localikv = new ikv(this, localilf))
    {
      this.f = localikv;
      this.k = ((ilf)paramBundle.getParcelable("pending_login_request"));
      this.l = paramBundle.getInt("pending_id");
      this.c = paramBundle.getString("tag");
      this.m = true;
      this.h.a(this);
      this.b.a(this);
      return;
    }
  }
  
  public final void a(ilf paramilf)
  {
    if (paramilf.e == null) {
      paramilf.e = this.d;
    }
    if (paramilf.e == null) {
      paramilf.e = mbb.a(this.a, "LoginAccountHandler.account_key", null);
    }
    if (paramilf.h)
    {
      paramilf.a(this.a, this.a.getIntent());
      if (!this.h.c(paramilf.k)) {
        paramilf.k = -1;
      }
    }
    this.c = UUID.randomUUID().toString();
    this.f = new ikv(this, paramilf);
    this.n.a(pdt.a(new iku(this)));
  }
  
  public final void a(ilf paramilf, String paramString, int paramInt)
  {
    if (TextUtils.equals(paramString, this.c))
    {
      this.c = null;
      this.k = paramilf;
      this.l = paramInt;
      i();
    }
  }
  
  public final void az_()
  {
    if (this.m) {
      j();
    }
  }
  
  public final void b()
  {
    this.m = true;
    h();
  }
  
  public final void b(Bundle paramBundle)
  {
    this.m = false;
    paramBundle.putString("account_key", this.d);
    paramBundle.putInt("account_id", this.e);
    paramBundle.putInt("account_handler_state", this.i.ordinal());
    paramBundle.putParcelable("completed_login_request", this.j);
    if (this.f == null) {}
    for (Object localObject = null;; localObject = this.f.a)
    {
      paramBundle.putParcelable("queued_login_request", (Parcelable)localObject);
      paramBundle.putParcelable("pending_login_request", this.k);
      paramBundle.putInt("pending_id", this.l);
      paramBundle.putString("tag", this.c);
      return;
    }
  }
  
  public final int c()
  {
    efj.k();
    return this.e;
  }
  
  public final boolean d()
  {
    efj.k();
    return this.e != -1;
  }
  
  public final boolean e()
  {
    efj.k();
    return (this.h.c(this.e)) && (this.h.a(this.e).a());
  }
  
  public final gjb f()
  {
    efj.k();
    return this.h.a(this.e);
  }
  
  final void h()
  {
    j();
    if (this.a.isFinishing()) {
      return;
    }
    if ((this.m) && (this.f != null)) {
      this.f.b.run();
    }
    i();
  }
  
  public final void m_()
  {
    this.h.b(this);
    this.b.b(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ikt
 * JD-Core Version:    0.7.0.1
 */