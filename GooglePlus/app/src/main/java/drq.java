import android.content.Context;
import android.util.Log;

public final class drq
  extends gzf
{
  private final Context a;
  private final int b;
  private final byte[] c;
  
  public drq(Context paramContext, int paramInt, byte[] paramArrayOfByte)
  {
    super(paramContext, "UpdateSourceBackgroundTask");
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramArrayOfByte;
  }
  
  protected final hae a()
  {
    for (;;)
    {
      try
      {
        omk localomk1 = new omk();
        byte[] arrayOfByte = this.c;
        omk localomk2 = (omk)qat.b(localomk1, arrayOfByte, 0, arrayOfByte.length);
        bmq localbmq = new bmq(this.a, this.b, localomk2);
        localbmq.i();
        int i = localbmq.o;
        Exception localException = localbmq.q;
        if (localbmq.n())
        {
          efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
          str = this.e.getString(aau.bD);
          return new hae(i, localException, str);
        }
      }
      catch (qas localqas)
      {
        Log.e("UpdateSourceBackgroundTask", "Failed to parse binary proto data", localqas);
        return new hae(false);
      }
      String str = null;
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.jn);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drq
 * JD-Core Version:    0.7.0.1
 */