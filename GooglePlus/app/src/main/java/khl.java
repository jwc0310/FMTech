public final class khl
  implements oxo<pfk<kx>, String>
{
  volatile boolean a = false;
  
  public khl(khk paramkhk, String paramString, boolean paramBoolean) {}
  
  public final ouq<oxm<pfk<kx>>> a()
  {
    if (this.a) {
      return ouq.a(phu.b(oxm.a(pff.a, oxn.a)));
    }
    pye localpye1 = (pye)((pyg)qvg.a.l()).c(((pyg)qwg.c.l()).m(this.b)).d(((pyg)qwk.c.l()).f(this.c)).e();
    if (!localpye1.ao_()) {
      throw new pzr();
    }
    qvg localqvg = (qvg)localpye1;
    pcf localpcf = new pcf(this.d.c.a(this.d.a));
    gjb localgjb = this.d.e.a(this.d.a.a());
    if (localgjb.c("is_managed_account"))
    {
      String str = localgjb.b("effective_gaia_id");
      pye localpye2 = (pye)((pyg)mgw.c.l()).h(str).e();
      if (!localpye2.ao_()) {
        throw new pzr();
      }
      mgw localmgw = (mgw)localpye2;
      if (localmgw == null) {
        throw new NullPointerException();
      }
      localpcf.b = ((mgw)localmgw);
    }
    pic localpic = this.d.f.a(localpcf, localqvg);
    ouq localouq = ouq.a(efj.a(localpic, pdt.a(new khm(this, localpic)), this.d.b));
    this.d.d.a(localouq.a(), (String)this.b);
    return localouq;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     khl
 * JD-Core Version:    0.7.0.1
 */