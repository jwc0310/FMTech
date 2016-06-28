import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class efs<R extends efn, A extends efb>
  extends efp<R>
  implements eft<R>, egt<A>
{
  private AtomicReference<egs> a = new AtomicReference();
  final efc<A> g;
  
  public efs(efc<A> paramefc, efd paramefd)
  {
    super(((efd)efj.b(paramefd, "GoogleApiClient must not be null")).a());
    this.g = ((efc)efj.a(paramefc));
  }
  
  public efs(efc<exn> paramefc, efd paramefd, byte paramByte)
  {
    this(paramefc, paramefd);
  }
  
  public efs(efc<fbn> paramefc, efd paramefd, char paramChar)
  {
    this(paramefc, paramefd);
  }
  
  public efs(efd paramefd)
  {
    this(edl.a, paramefd);
  }
  
  public efs(efd paramefd, byte paramByte)
  {
    this(edu.a, paramefd);
  }
  
  public efs(efd paramefd, char paramChar)
  {
    this(ews.a, paramefd);
  }
  
  public efs(efd paramefd, int paramInt)
  {
    this(flp.a, paramefd);
  }
  
  public efs(efd paramefd, short paramShort)
  {
    this(fce.a, paramefd);
  }
  
  private final void a(RemoteException paramRemoteException)
  {
    c(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  public void a(int paramInt)
  {
    a(a(new Status(2001)));
  }
  
  public abstract void a(A paramA);
  
  public final void a(egs paramegs)
  {
    this.a.set(paramegs);
  }
  
  public final void b(A paramA)
  {
    try
    {
      a(paramA);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a(localDeadObjectException);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      a(localRemoteException);
    }
  }
  
  public final void c(Status paramStatus)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramStatus.g <= 0)
    {
      bool2 = bool1;
      if (bool2) {
        break label36;
      }
    }
    for (;;)
    {
      efj.b(bool1, "Failed result must not be success");
      a(a(paramStatus));
      return;
      bool2 = false;
      break;
      label36:
      bool1 = false;
    }
  }
  
  protected final void d()
  {
    egs localegs = (egs)this.a.getAndSet(null);
    if (localegs != null) {
      localegs.a(this);
    }
  }
  
  public final efc<A> e()
  {
    return this.g;
  }
  
  public int f()
  {
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efs
 * JD-Core Version:    0.7.0.1
 */