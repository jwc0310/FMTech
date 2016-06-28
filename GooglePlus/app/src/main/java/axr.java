import android.os.Bundle;

public class axr
  extends mca
  implements bci
{
  private bch Z;
  public axu a;
  private beu aa;
  private aud ab;
  public bdk b;
  public long c;
  public final bco d = new bco();
  
  public axr()
  {
    new bez(this, this.bp, bfd.a, new axs(this));
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("media_proxy"))) {}
    for (bcp localbcp1 = (bcp)paramBundle.getParcelable("media_proxy");; localbcp1 = null)
    {
      int i = axt.a[(-1 + axv.a(this.m))];
      Object localObject = null;
      int j;
      switch (i)
      {
      default: 
        bcw localbcw = ((bcw)localObject).a(localbcp1).a(f(), this.m);
        localbcw.l = this.ab.b;
        localbcw.w = true;
        bcp localbcp2 = localbcw.a();
        localbcp2.a(this.bn);
        bdk localbdk = this.b;
        localbdk.b = localbcp2;
        localbdk.a.a();
        this.Z = ((bch)h().a("load_fragment"));
        if (this.Z != null)
        {
          j = 1;
          label176:
          if (j == 0)
          {
            int k = axv.a(this.m);
            switch (axt.a[(k - 1)])
            {
            }
          }
        }
        break;
      }
      for (;;)
      {
        this.Z.c(true);
        this.Z.f(this.m);
        cl localcl = h().a();
        localcl.a(this.Z, "load_fragment");
        localcl.b();
        return;
        localObject = new bda();
        break;
        localObject = new bdd();
        break;
        localObject = new bct();
        break;
        j = 0;
        break label176;
        this.Z = new bcj();
        continue;
        this.Z = new bca();
        continue;
        this.Z = new bce();
      }
    }
  }
  
  public final void a(bch parambch)
  {
    parambch.c = new bby(this);
    parambch.a(this.b.b);
    this.Z = parambch;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(bci.class, this);
    this.aa = ((beu)this.bo.a(beu.class));
    this.b = ((bdk)this.bo.a(bdk.class));
    this.ab = ((aud)this.bo.a(aud.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.b.b != null) {
      paramBundle.putParcelable("media_proxy", this.b.b);
    }
  }
  
  public final boolean v()
  {
    return (this.Z == null) || (this.Z.d);
  }
  
  public final void w()
  {
    if (this.a != null) {
      this.a.a(v());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axr
 * JD-Core Version:    0.7.0.1
 */