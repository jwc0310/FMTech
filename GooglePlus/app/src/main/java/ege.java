import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ege
  extends egj
{
  private final Map<efb, efh> b;
  
  public ege(Map<efb, efh> paramMap)
  {
    super(paramMap, (byte)0);
    Object localObject;
    this.b = localObject;
  }
  
  public final void a()
  {
    int i = eeo.a(this.a.c);
    if (i != 0)
    {
      ConnectionResult localConnectionResult = new ConnectionResult(i, null);
      this.a.a.a(new egf(this, this.a, localConnectionResult));
    }
    for (;;)
    {
      return;
      if (this.a.e) {
        this.a.d.n();
      }
      Iterator localIterator = this.b.keySet().iterator();
      while (localIterator.hasNext())
      {
        efb localefb = (efb)localIterator.next();
        localefb.a((efh)this.b.get(localefb));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ege
 * JD-Core Version:    0.7.0.1
 */