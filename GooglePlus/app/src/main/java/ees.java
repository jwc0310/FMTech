import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class ees
  extends Handler
{
  private final Context a;
  
  ees(Context paramContext) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      new StringBuilder("Don't know how to handle this message: ").append(paramMessage.what);
    }
    int i;
    do
    {
      return;
      i = eer.a(this.a);
    } while (!eer.b(i));
    eer.b(i, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ees
 * JD-Core Version:    0.7.0.1
 */