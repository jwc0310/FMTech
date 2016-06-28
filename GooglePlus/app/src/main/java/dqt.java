import android.content.Context;
import android.util.Log;

public final class dqt
  extends gzf
{
  private Context a;
  private int b;
  private ojj c;
  
  public dqt(Context paramContext, int paramInt, ojj paramojj)
  {
    super(paramContext, "SetPhotosSettingsTask");
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramojj;
  }
  
  protected final hae a()
  {
    try
    {
      ojj localojj1 = new ojj();
      byte[] arrayOfByte = qat.a(this.c);
      localojj2 = (ojj)qat.b(localojj1, arrayOfByte, 0, arrayOfByte.length);
      blv localblv = new blv(this.a, this.b, localojj2);
      localblv.i();
      int i = localblv.o;
      Exception localException = localblv.q;
      boolean bool = localblv.n();
      String str = null;
      if (bool)
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        str = this.e.getString(aau.oQ);
      }
      return new hae(i, localException, str);
    }
    catch (qas localqas)
    {
      for (;;)
      {
        Log.e("SetPhotosSettingsTask", "Failed to load photos settings", localqas);
        ojj localojj2 = null;
      }
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.jn);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqt
 * JD-Core Version:    0.7.0.1
 */