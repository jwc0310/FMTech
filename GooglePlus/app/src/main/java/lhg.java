import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class lhg
  extends Handler
{
  private WeakReference<lhe> a;
  
  public lhg(lhe paramlhe)
  {
    this.a = new WeakReference(paramlhe);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    lhe locallhe = (lhe)this.a.get();
    if (locallhe != null) {}
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      locallhe.c();
      return;
    }
    locallhe.d = true;
    locallhe.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhg
 * JD-Core Version:    0.7.0.1
 */