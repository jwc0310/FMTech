import android.app.Activity;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class fey
  extends eus<few>
{
  Activity d;
  private final bk e;
  private evd<few> f;
  private final List<x> g = new ArrayList();
  
  fey(bk parambk)
  {
    this.e = parambk;
  }
  
  public final void a()
  {
    if ((this.d != null) && (this.f != null) && (this.a == null)) {
      try
      {
        fes.a(this.d);
        ffj localffj = fit.a(this.d).b(new evc(this.d));
        if (localffj == null) {
          return;
        }
        this.f.a(new few(this.e, localffj));
        Iterator localIterator = this.g.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            x localx = (x)localIterator.next();
            few localfew = (few)this.a;
            try
            {
              localfew.a.a(new fex(localfew, localx));
            }
            catch (RemoteException localRemoteException2)
            {
              throw new bm(localRemoteException2);
            }
          }
        }
        return;
      }
      catch (RemoteException localRemoteException1)
      {
        throw new bm(localRemoteException1);
        this.g.clear();
        return;
      }
      catch (eep localeep) {}
    }
  }
  
  protected final void a(evd<few> paramevd)
  {
    this.f = paramevd;
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fey
 * JD-Core Version:    0.7.0.1
 */