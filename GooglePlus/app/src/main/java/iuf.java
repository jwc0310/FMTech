import android.os.ConditionVariable;
import java.io.IOException;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

abstract class iuf
{
  final ConditionVariable b = new ConditionVariable();
  final kcb c;
  int d;
  long e;
  byte[] f;
  IOException g;
  boolean h;
  public final HttpUrlRequestListener i = new iug(this);
  
  protected iuf(kcb paramkcb)
  {
    this.c = paramkcb;
  }
  
  public abstract void a();
  
  protected abstract void a(HttpUrlRequest paramHttpUrlRequest);
  
  protected abstract HttpUrlRequest b();
  
  public final void c()
  {
    this.b.close();
    b().f();
    this.b.block();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iuf
 * JD-Core Version:    0.7.0.1
 */