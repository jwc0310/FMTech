import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.File;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class hvy
  implements HttpUrlRequestListener
{
  hvy(hvu paramhvu, String paramString, File paramFile, Map paramMap) {}
  
  public final void a(HttpUrlRequest paramHttpUrlRequest)
  {
    if (Log.isLoggable("DlResUtil", 4))
    {
      long l = paramHttpUrlRequest.a();
      String str = this.a;
      new StringBuilder(43 + String.valueOf(str).length()).append("Downloading ").append(l).append(" bytes for ").append(str);
    }
  }
  
  public final void b(HttpUrlRequest paramHttpUrlRequest)
  {
    if ((paramHttpUrlRequest.c() != null) || (paramHttpUrlRequest.b() != 200))
    {
      if (this.b.exists()) {
        this.b.delete();
      }
      this.d.b.edit().putString(this.a, "FAILED").apply();
      return;
    }
    this.d.b.edit().putString(this.a, (String)this.c.get(this.a)).apply();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvy
 * JD-Core Version:    0.7.0.1
 */