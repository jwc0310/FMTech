import android.content.Context;
import android.os.Bundle;
import android.util.Log;

final class kra
  implements kqz
{
  private frj a;
  
  kra(Context paramContext)
  {
    this.a = ((frj)mbb.a(paramContext, frj.class));
  }
  
  public final void a(String paramString1, String paramString2, qat paramqat, Bundle paramBundle)
  {
    try
    {
      byte[] arrayOfByte = qat.a(paramqat);
      int i = 0;
      if (paramBundle != null) {
        i = paramBundle.getInt("latency_event_code", 0);
      }
      this.a.a(paramString2, paramString1, i, arrayOfByte);
      return;
    }
    catch (Throwable localThrowable)
    {
      Log.e("AnalyticsTransmitter", "Cannot send log record", localThrowable);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kra
 * JD-Core Version:    0.7.0.1
 */