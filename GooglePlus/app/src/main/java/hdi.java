import android.content.Context;
import android.text.TextUtils;

public final class hdi
  implements hdg
{
  Context a;
  ifj b;
  private int c = -1;
  private hdk d = null;
  private hdm e = new hdm(this);
  private hdn f = new hdn(this);
  private kaz g = new hdl();
  
  public hdi(Context paramContext)
  {
    this.a = paramContext;
    mbb localmbb = mbb.b(paramContext);
    this.b = ((ifj)localmbb.a(ifj.class));
    hdh localhdh = (hdh)localmbb.b(hdh.class);
    if (localhdh != null) {
      this.c = localhdh.a;
    }
  }
  
  private final hdk a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    hdk localhdk2;
    if (this.d != null)
    {
      localhdk2 = this.d;
      this.d = ((hdk)this.d.b);
      localhdk2.b = null;
    }
    for (hdk localhdk1 = localhdk2;; localhdk1 = new hdk(this))
    {
      int i = efj.r(this.a, paramInt1);
      localhdk1.a(0xFFFFFEFF & 0xFFFFFFFB & paramInt4 & 0xFFFFFFDF, paramipf, i, paramInt2, paramInt3);
      return localhdk1;
    }
  }
  
  private final void a(iph paramiph, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      paramiph.d = null;
      return;
    case 1: 
      paramiph.d = this.e;
      return;
    }
    paramiph.d = this.f;
  }
  
  final iph a(hdk paramhdk, kbb paramkbb)
  {
    iph localiph = (iph)this.b.a(paramhdk);
    if (localiph == null)
    {
      localiph = new iph(this.b, paramhdk);
      a(localiph, paramhdk.a);
    }
    for (;;)
    {
      this.b.a(localiph, paramkbb);
      return localiph;
      paramhdk.b = this.d;
      this.d = paramhdk;
    }
  }
  
  public final kaz a(Context paramContext, String paramString, int paramInt1, int paramInt2, kbb paramkbb)
  {
    if (TextUtils.isEmpty(paramString))
    {
      paramkbb.a(this.g);
      return this.g;
    }
    return a(a(ipf.a(paramContext, paramString, ipm.a), paramInt1, this.c, paramInt2, 0), paramkbb);
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return;
    }
    hdk localhdk = a(ipf.a(this.a, paramString, ipm.a), 2, this.c, 1, 0);
    if ((iph)this.b.a(localhdk) == null)
    {
      iph localiph = new iph(this.b, localhdk);
      a(localiph, localhdk.a);
      this.b.c(localiph);
      return;
    }
    localhdk.b = this.d;
    this.d = localhdk;
  }
  
  public final Object b(String paramString, int paramInt1, int paramInt2)
  {
    int i = this.c;
    if (TextUtils.isEmpty(paramString)) {
      return this.g;
    }
    return new hdj(this, null, a(ipf.a(this.a, paramString, ipm.a), 2, i, paramInt2, 16)).a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdi
 * JD-Core Version:    0.7.0.1
 */