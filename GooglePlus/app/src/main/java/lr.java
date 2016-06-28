import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

final class lr
  extends Handler
{
  lr(lq paramlq) {}
  
  lr(lq paramlq, Handler paramHandler)
  {
    super(paramHandler.getLooper());
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      throw new RuntimeException("Unknown message " + paramMessage);
    case 1: 
      this.a.b.onShowPress(this.a.g);
    }
    do
    {
      return;
      lq locallq = this.a;
      locallq.a.removeMessages(3);
      locallq.e = false;
      locallq.f = true;
      locallq.b.onLongPress(locallq.g);
      return;
    } while (this.a.c == null);
    if (!this.a.d)
    {
      this.a.c.onSingleTapConfirmed(this.a.g);
      return;
    }
    this.a.e = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lr
 * JD-Core Version:    0.7.0.1
 */