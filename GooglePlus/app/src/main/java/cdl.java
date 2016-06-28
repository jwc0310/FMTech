import android.view.View;
import android.widget.Toast;

final class cdl
  extends dme
{
  cdl(cda paramcda) {}
  
  public final void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean, dmx paramdmx)
  {
    int i = 1;
    if ((this.a.b == null) || (this.a.b.intValue() != paramInt1)) {
      i = 0;
    }
    label154:
    for (;;)
    {
      if (i != 0)
      {
        bp localbp = this.a.f();
        this.a.ac = efj.a(localbp, paramInt2, paramString, false, paramBoolean, this.a.d, null);
        this.a.ab.startAnimation(this.a.ae);
      }
      return;
      this.a.b = null;
      cda.a(this.a);
      if (paramdmx != null)
      {
        if (paramdmx.c != 200) {}
        for (int j = i;; j = 0)
        {
          if (j == 0) {
            break label154;
          }
          Toast.makeText(this.a.bn, aau.mm, 0).show();
          i = 0;
          break;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdl
 * JD-Core Version:    0.7.0.1
 */