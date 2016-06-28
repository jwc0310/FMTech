import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public abstract interface fcs
  extends IInterface
{
  public abstract Location a();
  
  public abstract Status a(GestureRequest paramGestureRequest, PendingIntent paramPendingIntent);
  
  public abstract ActivityRecognitionResult a(String paramString);
  
  public abstract void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent);
  
  public abstract void a(PendingIntent paramPendingIntent);
  
  public abstract void a(PendingIntent paramPendingIntent, fcp paramfcp, String paramString);
  
  public abstract void a(Location paramLocation);
  
  public abstract void a(Location paramLocation, int paramInt);
  
  public abstract void a(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, fcp paramfcp);
  
  public abstract void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent);
  
  public abstract void a(LocationRequest paramLocationRequest, fed paramfed);
  
  public abstract void a(LocationRequest paramLocationRequest, fed paramfed, String paramString);
  
  public abstract void a(LocationSettingsRequest paramLocationSettingsRequest, fcv paramfcv, String paramString);
  
  public abstract void a(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent);
  
  public abstract void a(LocationRequestInternal paramLocationRequestInternal, fed paramfed);
  
  public abstract void a(LocationRequestUpdateData paramLocationRequestUpdateData);
  
  public abstract void a(fcp paramfcp, String paramString);
  
  public abstract void a(fed paramfed);
  
  public abstract void a(List<ParcelableGeofence> paramList, PendingIntent paramPendingIntent, fcp paramfcp, String paramString);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void a(String[] paramArrayOfString, fcp paramfcp, String paramString);
  
  public abstract Location b(String paramString);
  
  public abstract IBinder b();
  
  public abstract Status b(PendingIntent paramPendingIntent);
  
  public abstract Status c(PendingIntent paramPendingIntent);
  
  public abstract LocationAvailability c(String paramString);
  
  public abstract Status d(PendingIntent paramPendingIntent);
  
  public abstract void e(PendingIntent paramPendingIntent);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcs
 * JD-Core Version:    0.7.0.1
 */