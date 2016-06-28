import android.os.SystemClock;
import java.util.List;

final class bvu
  extends efj
{
  private long abj = 0L;
  private boolean abk = true;
  
  bvu(bvr parambvr) {}
  
  public final void a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    default: 
    case 1: 
    case 2: 
      do
      {
        return;
        this.abj = SystemClock.elapsedRealtime();
        return;
      } while ((!this.abk) || (this.abj == 0L));
      bvr localbvr3 = this.abl;
      kpz localkpz = new kpz(36, this.abj);
      localkpz.a();
      bvr.a(localbvr3, localkpz);
      this.abk = false;
      return;
    case 5: 
      bvr localbvr2 = this.abl;
      gxr localgxr2 = new gxr();
      gxq localgxq3 = bvr.a;
      localgxr2.b.add(localgxq3);
      bvr.a(localbvr2, new gwz(-1, localgxr2));
      return;
    }
    bvr localbvr1 = this.abl;
    gxr localgxr1 = new gxr();
    gxq localgxq1 = bvr.b;
    localgxr1.b.add(localgxq1);
    gxq localgxq2 = bvr.a;
    localgxr1.b.add(localgxq2);
    bvr.a(localbvr1, new gwz(4, localgxr1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvu
 * JD-Core Version:    0.7.0.1
 */