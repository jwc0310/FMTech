import android.util.Log;
import com.google.android.libraries.social.socialcast.impl.CastService;
import java.io.IOException;

public final class kvx
  implements fqi
{
  public kvx(CastService paramCastService) {}
  
  public final void a()
  {
    try
    {
      this.a.D.a("urn:x-cast:com.google.android.apps.socialcast", this.a.c);
      this.a.D.a(this.a.d, true, new kvv(this.a));
      return;
    }
    catch (IOException localIOException)
    {
      this.a.e();
    }
  }
  
  public final void a(String paramString)
  {
    if (Log.isLoggable("CastService", 4))
    {
      String str = String.valueOf(paramString);
      if (str.length() == 0) {
        break label36;
      }
      "Connection to gcore client failed: ".concat(str);
    }
    for (;;)
    {
      this.a.e();
      return;
      label36:
      new String("Connection to gcore client failed: ");
    }
  }
  
  public final void b(String paramString)
  {
    if (Log.isLoggable("CastService", 4))
    {
      String str = String.valueOf(paramString);
      if (str.length() == 0) {
        break label36;
      }
      "Disconnected from app. ".concat(str);
    }
    for (;;)
    {
      this.a.e();
      return;
      label36:
      new String("Disconnected from app. ");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvx
 * JD-Core Version:    0.7.0.1
 */