final class kgr
  implements Runnable
{
  kgr(kgq paramkgq, kx paramkx) {}
  
  public final void run()
  {
    kgn localkgn = this.b.b;
    qzz localqzz1 = this.a.e();
    kx localkx = this.b.a;
    qvm localqvm1 = (qvm)localqzz1.b(qvm.d);
    pye localpye1 = (pye)((pyg)((pyg)qvm.c.l()).a(localqvm1)).e(localkx.b().booleanValue()).e();
    if (!localpye1.ao_()) {
      throw new pzr();
    }
    qvm localqvm2 = (qvm)localpye1;
    rab localrab = (rab)((rab)qzz.d.l()).a(localqzz1);
    pyl localpyl = (pyl)qvm.d;
    localrab.a(localpyl);
    localrab.b();
    pyb localpyb = ((pyi)localrab.a).b;
    pyd localpyd = localpyl.d;
    localpyb.a.remove(localpyd);
    if (localpyb.a.isEmpty()) {
      localpyb.c = false;
    }
    pye localpye2 = (pye)((rab)((rab)localrab).a(qvm.d, localqvm2)).e();
    if (!localpye2.ao_()) {
      throw new pzr();
    }
    qzz localqzz2 = (qzz)localpye2;
    localkgn.h.a(new lku(localkgn.d, localqzz2, true, 0, 0), localkgn.m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgr
 * JD-Core Version:    0.7.0.1
 */