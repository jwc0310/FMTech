import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;

final class czg
  extends Handler
{
  czg(czf paramczf) {}
  
  public final void handleMessage(Message paramMessage)
  {
    int i = paramMessage.arg1;
    this.a.b.setProgress(i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czg
 * JD-Core Version:    0.7.0.1
 */