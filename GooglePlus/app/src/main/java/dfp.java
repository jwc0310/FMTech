import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

final class dfp
  implements Runnable
{
  dfp(dfo paramdfo) {}
  
  public final void run()
  {
    Context localContext;
    String str1;
    Bundle localBundle;
    String str2;
    if (this.a.b.e)
    {
      localContext = this.a.b.a;
      str1 = String.valueOf(this.a.a.getExtras().getString("location_source"));
      localBundle = this.a.a.getExtras();
      if (localBundle == null) {
        break label152;
      }
      localBundle.setClassLoader(lmg.class.getClassLoader());
      str2 = String.valueOf(localBundle.getString("location_description"));
      if (str2.length() == 0) {
        break label160;
      }
    }
    label152:
    label160:
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      Toast.makeText(localContext, str3, 0).show();
      if (!this.a.b.f) {
        this.a.b.c.a(this.a.a);
      }
      return;
      localBundle = Bundle.EMPTY;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfp
 * JD-Core Version:    0.7.0.1
 */