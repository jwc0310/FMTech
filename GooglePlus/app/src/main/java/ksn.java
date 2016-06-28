import java.util.HashMap;
import java.util.Map;

final class ksn
  implements ksm
{
  private Map<Class<? extends gxq>, ksm> a = new HashMap();
  
  ksn()
  {
    this.a.put(gxq.class, new ktm(this));
    this.a.put(kup.class, new ksp(this));
    this.a.put(kuo.class, new kso(this));
    this.a.put(kuq.class, new ksq(this));
    this.a.put(kur.class, new ksr(this));
    this.a.put(kus.class, new kss(this));
    this.a.put(kut.class, new kst(this));
    this.a.put(kuu.class, new ksu(this));
    this.a.put(kuv.class, new ksv(this));
    this.a.put(kuw.class, new ksw(this));
    this.a.put(kuy.class, new ksy(this));
    this.a.put(kva.class, new ksz(this));
    this.a.put(kvb.class, new kta(this));
    this.a.put(kvd.class, new ktc(this));
    this.a.put(kve.class, new ktd(this));
    this.a.put(kvg.class, new kte(this));
    this.a.put(kvh.class, new ktf(this));
    this.a.put(kvi.class, new ktg(this));
    this.a.put(kvj.class, new kth(this));
    this.a.put(kvk.class, new kti(this));
    this.a.put(kvl.class, new ktj(this));
    this.a.put(kvm.class, new ktk(this));
    this.a.put(kvc.class, new ktb(this));
    this.a.put(kux.class, new ksx(this));
  }
  
  public final void a(gxq paramgxq, rlj paramrlj, rkk paramrkk)
  {
    if ((paramgxq instanceof kuz))
    {
      kuz localkuz = (kuz)paramgxq;
      if (localkuz.b == null) {
        localkuz.b = localkuz.a(localkuz.a);
      }
      paramgxq = localkuz.b;
    }
    ksm localksm = (ksm)this.a.get(paramgxq.getClass());
    if (localksm != null)
    {
      localksm.a(paramgxq, paramrlj, paramrkk);
      return;
    }
    String str = String.valueOf(paramgxq);
    throw new IllegalStateException(31 + String.valueOf(str).length() + "No visual element handler for: " + str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ksn
 * JD-Core Version:    0.7.0.1
 */