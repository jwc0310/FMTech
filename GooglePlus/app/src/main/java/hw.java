import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hw
  extends Handler
{
  public hw(hv paramhv, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (!this.a.c) {
      return;
    }
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      paramMessage.getData();
      return;
    case 2: 
      this.a.a((ir)paramMessage.obj);
      return;
    case 3: 
      this.a.a((hh)paramMessage.obj);
      return;
    case 5: 
      return;
    case 6: 
      return;
    case 7: 
      return;
    case 4: 
      return;
    }
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hw
 * JD-Core Version:    0.7.0.1
 */