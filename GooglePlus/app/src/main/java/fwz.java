import android.accounts.Account;
import com.google.android.gms.location.reporting.UploadRequest;

public class fwz
{
  public final UploadRequest a;
  
  public fwz(Account paramAccount, String paramString, long paramLong, int paramInt)
  {
    fdv localfdv = UploadRequest.a(paramAccount, paramString, paramLong);
    long l = paramInt;
    localfdv.d = l;
    localfdv.e = l;
    this.a = new UploadRequest(localfdv);
  }
  
  public UploadRequest a()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fwz
 * JD-Core Version:    0.7.0.1
 */