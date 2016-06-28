import android.os.ConditionVariable;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class iug
  implements HttpUrlRequestListener
{
  iug(iuf paramiuf) {}
  
  public final void a(HttpUrlRequest paramHttpUrlRequest)
  {
    this.a.a(paramHttpUrlRequest);
  }
  
  public final void b(HttpUrlRequest paramHttpUrlRequest)
  {
    try
    {
      this.a.d = paramHttpUrlRequest.b();
      this.a.e = paramHttpUrlRequest.a();
      this.a.f = paramHttpUrlRequest.e();
      this.a.g = paramHttpUrlRequest.c();
      this.a.h = paramHttpUrlRequest.h();
      return;
    }
    finally
    {
      this.a.b.open();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iug
 * JD-Core Version:    0.7.0.1
 */