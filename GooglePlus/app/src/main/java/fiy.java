import android.os.RemoteException;

public final class fiy
{
  public final fjq a;
  
  public fiy(fjq paramfjq)
  {
    this.a = ((fjq)efj.a(paramfjq));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fiy)) {
      return false;
    }
    try
    {
      boolean bool = this.a.a(((fiy)paramObject).a);
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
      int i = this.a.k();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fiy
 * JD-Core Version:    0.7.0.1
 */