import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ljc
{
  public final ArrayList<String> a;
  public final ArrayList<qzz> b;
  public final ArrayList<kx> c;
  private final Map<rac, rgq<ljb>> d;
  
  ljc(Map<rac, rgq<ljb>> paramMap)
  {
    this.d = paramMap;
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = new ArrayList();
  }
  
  public final void a(int paramInt)
  {
    this.a.ensureCapacity(paramInt);
    this.b.ensureCapacity(paramInt);
    this.c.ensureCapacity(paramInt);
  }
  
  public final void a(aip paramaip)
  {
    pye localpye;
    if ((paramaip instanceof rab))
    {
      localpye = (pye)((rab)paramaip).e();
      if (!localpye.ao_()) {
        throw new pzr();
      }
    }
    for (qzz localqzz = (qzz)localpye;; localqzz = (qzz)paramaip)
    {
      this.b.add(localqzz);
      return;
    }
  }
  
  public final void a(List<qzz> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      qzz localqzz = (qzz)localIterator.next();
      String str = localqzz.c;
      this.a.add(str);
      a(localqzz);
    }
  }
  
  public final void a(qzz paramqzz)
  {
    rgq localrgq = (rgq)this.d.get(paramqzz.o());
    if (localrgq != null)
    {
      ((ljb)localrgq.a()).a(paramqzz, this);
      return;
    }
    a(paramqzz);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljc
 * JD-Core Version:    0.7.0.1
 */