import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.Toast;

final class clx
  extends dme
{
  clx(clw paramclw) {}
  
  public final void a(int paramInt, ojj paramojj, dmx paramdmx)
  {
    if ((this.a.a == null) || (!this.a.a.equals(Integer.valueOf(paramInt)))) {
      return;
    }
    this.a.a = null;
    int i;
    if (paramdmx.c != 200)
    {
      i = 1;
      if (i == 0) {
        break label121;
      }
      Toast.makeText(this.a.g, this.a.g.getResources().getString(aau.fu), 1).show();
    }
    label181:
    for (;;)
    {
      this.a.f();
      cou localcou = new cou(this.a, this);
      efj.m().post(localcou);
      return;
      i = 0;
      break;
      label121:
      Boolean localBoolean = paramojj.f;
      boolean bool = false;
      if (localBoolean == null) {}
      for (;;)
      {
        if (!bool) {
          break label181;
        }
        Toast.makeText(this.a.g, this.a.g.getResources().getString(aau.fv), 1).show();
        break;
        bool = localBoolean.booleanValue();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clx
 * JD-Core Version:    0.7.0.1
 */