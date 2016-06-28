import android.os.Parcel;
import android.os.RemoteException;

public class bm
  extends RuntimeException
{
  public bm(RemoteException paramRemoteException)
  {
    super(paramRemoteException);
  }
  
  public bm(String paramString)
  {
    super(paramString);
  }
  
  public bm(String paramString, Parcel paramParcel)
  {
    super(paramString + " Parcel: pos=" + paramParcel.dataPosition() + " size=" + paramParcel.dataSize());
  }
  
  public bm(String paramString, Exception paramException)
  {
    super(paramString, paramException);
  }
  
  public bm(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bm
 * JD-Core Version:    0.7.0.1
 */