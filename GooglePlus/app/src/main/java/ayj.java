import android.content.Context;
import android.widget.Toast;

final class ayj
  extends dme
{
  ayj(ayg paramayg) {}
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean, dmx paramdmx)
  {
    super.a(paramInt1, paramInt2, paramBoolean, paramdmx);
    if ((this.a.d == null) || (this.a.d.intValue() != paramInt1)) {}
    do
    {
      return;
      this.a.d = null;
    } while (paramdmx == null);
    int i;
    label61:
    Context localContext;
    if (paramdmx.c != 200)
    {
      i = 1;
      if (i == 0) {
        break label103;
      }
      localContext = this.a.f().getApplicationContext();
      if (!paramBoolean) {
        break label105;
      }
    }
    label103:
    label105:
    for (int j = aau.pi;; j = aau.eW)
    {
      Toast.makeText(localContext, j, 1).show();
      return;
      i = 0;
      break label61;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayj
 * JD-Core Version:    0.7.0.1
 */