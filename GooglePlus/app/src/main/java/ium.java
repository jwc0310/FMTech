import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

final class ium
  extends iuf
{
  String a;
  private final Context j;
  private final String k;
  private HttpUrlRequest l;
  
  public ium(Context paramContext, kcb paramkcb, String paramString)
  {
    super(paramkcb);
    this.j = paramContext;
    this.k = paramString;
  }
  
  public final void a()
  {
    kl localkl = new kl();
    localkl.putAll(this.c.a(this.k));
    localkl.put("Content-Range", "bytes */*");
    Context localContext = this.j;
    String str = this.k;
    HttpUrlRequestListener localHttpUrlRequestListener = this.i;
    this.l = ixd.a(localContext).a(str, 3, localkl, localHttpUrlRequestListener);
    this.l.a("PUT");
  }
  
  protected final void a(HttpUrlRequest paramHttpUrlRequest)
  {
    List localList = new iti(paramHttpUrlRequest.k()).a("Range");
    if ((localList == null) || (localList.isEmpty()))
    {
      if (Log.isLoggable("MediaUploader", 3))
      {
        String str = String.valueOf(localList);
        new StringBuilder(31 + String.valueOf(str).length()).append("Invalid response range header: ").append(str);
      }
      return;
    }
    this.a = ((String)localList.get(0));
  }
  
  protected final HttpUrlRequest b()
  {
    return this.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ium
 * JD-Core Version:    0.7.0.1
 */