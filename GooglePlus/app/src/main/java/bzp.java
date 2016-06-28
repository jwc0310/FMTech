import android.os.Handler;
import android.os.Message;
import android.view.View;

final class bzp
  extends Handler
{
  bzp(bzo parambzo) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      bzo localbzo = this.a;
      if ((localbzo.i()) && (!localbzo.ao))
      {
        View localView = localbzo.N;
        if (localView != null) {
          localbzo.b(localView);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzp
 * JD-Core Version:    0.7.0.1
 */