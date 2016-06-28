import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

public abstract interface ezs
  extends IInterface
{
  public abstract int a(long paramLong);
  
  public abstract int a(Account paramAccount, PlaceReport paramPlaceReport);
  
  public abstract ReportingState a(Account paramAccount);
  
  public abstract UploadRequestResult a(UploadRequest paramUploadRequest);
  
  public abstract int b(Account paramAccount);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezs
 * JD-Core Version:    0.7.0.1
 */