import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class bqm
  implements mez, mfd
{
  private final bp a;
  
  public bqm(bp parambp, mek parammek)
  {
    this.a = parambp;
    parammek.a(this);
  }
  
  public final void b()
  {
    List localList = hsb.a();
    if (localList == null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      hsg localhsg = (hsg)localIterator.next();
      localStringBuilder.append(localhsg.a).append("<br/><br/>").append(Log.getStackTraceString(localhsg.b)).append("<br/><br/>");
    }
    bz localbz = this.a.b.a.d;
    lut.b(null, localStringBuilder.toString(), this.a.getString(aau.mf), null).a(localbz, null);
    hsb.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqm
 * JD-Core Version:    0.7.0.1
 */