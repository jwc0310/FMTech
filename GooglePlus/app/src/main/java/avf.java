import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class avf<DataType, TransformedType>
  extends Handler
{
  public ave<TransformedType> a;
  private avh<DataType, TransformedType> b;
  
  public avf(Looper paramLooper, avh<DataType, TransformedType> paramavh, ave<TransformedType> paramave)
  {
    super(paramLooper);
    this.a = paramave;
    this.b = paramavh;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    Object localObject;
    do
    {
      return;
      localObject = paramMessage.obj;
    } while (this.a == null);
    avg localavg = new avg(this, this.b.a(localObject));
    efj.m().post(localavg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avf
 * JD-Core Version:    0.7.0.1
 */