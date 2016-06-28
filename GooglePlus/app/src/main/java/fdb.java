import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class fdb
  extends Handler
{
  private final fcc a;
  
  public fdb(fcc paramfcc)
  {
    this.a = paramfcc;
  }
  
  public fdb(fcc paramfcc, Looper paramLooper)
  {
    super(paramLooper);
    this.a = paramfcc;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
      return;
    }
    Location localLocation = new Location((Location)paramMessage.obj);
    this.a.a(localLocation);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdb
 * JD-Core Version:    0.7.0.1
 */