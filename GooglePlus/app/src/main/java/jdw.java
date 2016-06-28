import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

public final class jdw
  implements Runnable
{
  private int a;
  private Intent b;
  private Service c;
  
  public jdw(Service paramService, int paramInt, Intent paramIntent)
  {
    this.c = paramService;
    this.a = paramInt;
    this.b = paramIntent;
  }
  
  public final void run()
  {
    if ((this.b != null) && (!TextUtils.isEmpty(this.b.getAction())))
    {
      Context localContext = this.c.getApplicationContext();
      jdv localjdv = (jdv)mbb.a(localContext, jdv.class);
      String str = this.b.getAction();
      jdu localjdu = (jdu)localjdv.a.get(str);
      if (localjdu != null) {
        localjdu.a(this.b, localContext);
      }
    }
    this.c.stopSelfResult(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdw
 * JD-Core Version:    0.7.0.1
 */