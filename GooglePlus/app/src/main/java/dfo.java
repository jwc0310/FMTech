import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

final class dfo
  extends Thread
{
  dfo(dfn paramdfn, Location paramLocation) {}
  
  public final void run()
  {
    bmb localbmb = new bmb(this.b.a, this.b.b, new ijs(this.a, null), null, false);
    localbmb.i();
    Bundle localBundle = new Bundle();
    if ((this.b.e) && (this.a.getExtras() != null)) {
      localBundle.putString("location_source", this.a.getExtras().getString("location_source"));
    }
    int i;
    lmg locallmg2;
    String str1;
    if (localbmb.a != null)
    {
      i = 1;
      if (i == 0) {
        break label185;
      }
      locallmg2 = localbmb.a;
      str1 = "finest_location";
    }
    for (;;)
    {
      if (locallmg2 != null)
      {
        localBundle.putParcelable(str1, locallmg2);
        String str2 = locallmg2.a(this.b.a);
        if (!TextUtils.isEmpty(str2)) {
          localBundle.putString("location_description", str2);
        }
      }
      this.a.setExtras(localBundle);
      this.b.d.post(new dfp(this));
      return;
      i = 0;
      break;
      label185:
      if (localbmb.c != null) {}
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label219;
        }
        locallmg2 = localbmb.c;
        str1 = "finest_location";
        break;
      }
      label219:
      lmg locallmg1 = localbmb.b;
      int k = 0;
      if (locallmg1 != null) {
        k = 1;
      }
      if (k != 0)
      {
        locallmg2 = localbmb.b;
        str1 = "coarse_location";
      }
      else
      {
        locallmg2 = null;
        str1 = null;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfo
 * JD-Core Version:    0.7.0.1
 */