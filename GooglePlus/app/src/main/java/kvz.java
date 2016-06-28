import android.os.AsyncTask;
import android.util.Log;
import com.google.android.libraries.social.socialcast.impl.CastService;

public final class kvz
  extends AsyncTask<String, Object, String>
{
  public kvz(CastService paramCastService) {}
  
  private String a()
  {
    try
    {
      String str = this.a.o.a(this.a.getApplicationContext(), this.a.k);
      this.a.m = str;
      return str;
    }
    catch (Exception localException)
    {
      Log.e("CastService", "error getting auth token", localException);
    }
    return "";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvz
 * JD-Core Version:    0.7.0.1
 */