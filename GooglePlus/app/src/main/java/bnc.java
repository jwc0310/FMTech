import android.content.Context;
import android.util.Log;

public final class bnc
  extends gzf
{
  private int a;
  private Context b;
  
  public bnc(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString);
    this.a = paramInt;
    this.b = paramContext;
  }
  
  protected final hae a()
  {
    kck localkck = new kck();
    localkck.n = true;
    localkck.a("Notification sync");
    try
    {
      brg.a(this.b, this.a, localkck, null, brm.c, 1, 4, null, false);
      return new hae(true);
    }
    catch (Exception localException)
    {
      Log.e("FetchNotificationsTask", "Error fetching notifications", localException);
      return new hae(false);
    }
    finally
    {
      if (Log.isLoggable("FetchNotificationsTask", 3)) {
        new StringBuilder(47).append("FetchNotificationsTask complete, success: true");
      }
      localkck.e();
    }
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnc
 * JD-Core Version:    0.7.0.1
 */