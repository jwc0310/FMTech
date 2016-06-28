import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.Toast;

final class cag
  extends dme
{
  cag(caf paramcaf) {}
  
  public final void a(int paramInt, ojj paramojj, dmx paramdmx)
  {
    if (this.a.a != paramInt) {
      return;
    }
    int i;
    if (paramdmx.c != 200)
    {
      i = 1;
      if (i == 0) {
        break label97;
      }
      Toast.makeText(this.a.g, this.a.g.getResources().getString(aau.rM), 1).show();
    }
    label157:
    for (;;)
    {
      this.a.f();
      cou localcou = new cou(this.a, this);
      efj.m().post(localcou);
      return;
      i = 0;
      break;
      label97:
      Boolean localBoolean = paramojj.c;
      boolean bool = false;
      if (localBoolean == null) {}
      for (;;)
      {
        if (!bool) {
          break label157;
        }
        Toast.makeText(this.a.g, this.a.g.getResources().getString(aau.rO), 1).show();
        break;
        bool = localBoolean.booleanValue();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cag
 * JD-Core Version:    0.7.0.1
 */