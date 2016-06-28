import android.app.PendingIntent;
import android.os.IInterface;

public abstract interface fcp
  extends IInterface
{
  public abstract void a(int paramInt, PendingIntent paramPendingIntent);
  
  public abstract void a(int paramInt, String[] paramArrayOfString);
  
  public abstract void b(int paramInt, String[] paramArrayOfString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcp
 * JD-Core Version:    0.7.0.1
 */