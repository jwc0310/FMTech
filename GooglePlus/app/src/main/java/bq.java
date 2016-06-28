import android.os.Handler;
import android.os.Message;

final class bq
  extends Handler
{
  bq(bp parambp) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
    case 1: 
      do
      {
        return;
      } while (!this.a.c);
      this.a.a(false);
      return;
    }
    this.a.j_();
    this.a.b.a.d.i();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bq
 * JD-Core Version:    0.7.0.1
 */