import android.content.Context;
import android.util.Log;

public final class csa
  extends gzf
{
  private final int a;
  
  public csa(Context paramContext, int paramInt)
  {
    super(paramContext, "RecordReminderAckdTask");
    this.a = paramInt;
  }
  
  protected final hae a()
  {
    ojj localojj = new ojj();
    localojj.l = Boolean.valueOf(false);
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    blv localblv = new blv(this.e, this.a, localojj);
    localblv.i();
    if (Log.isLoggable("RecordReminderAckdTask", 3))
    {
      int i = localblv.o;
      new StringBuilder(72).append("Told the server that we've shown the reminder. Rpc response: ").append(i);
    }
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csa
 * JD-Core Version:    0.7.0.1
 */