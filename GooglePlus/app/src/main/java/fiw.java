import android.os.RemoteException;

public final class fiw
{
  public final fjh a;
  
  public fiw(fjh paramfjh)
  {
    this.a = ((fjh)efj.a(paramfjh));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fiw)) {
      return false;
    }
    try
    {
      boolean bool = this.a.a(((fiw)paramObject).a);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = this.a.j();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fiw
 * JD-Core Version:    0.7.0.1
 */