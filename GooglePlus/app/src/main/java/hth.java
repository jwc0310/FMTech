import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class hth
  implements View.OnClickListener
{
  hth(htg paramhtg) {}
  
  public final void onClick(View paramView)
  {
    htg localhtg = this.a;
    hte localhte = new hte();
    List localList = localhtg.a;
    Bundle localBundle1 = localhtg.b;
    hsz localhsz = new hsz(new StringWriter());
    Collections.sort(localList, new htb());
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      hta localhta = (hta)localIterator.next();
      if (localBundle1.getBoolean(localhta.a(), false))
      {
        String str2 = String.valueOf(localhta.a());
        localhsz.println(15 + String.valueOf(str2).length() + "-- " + str2 + " ----------\n");
        localhta.a(localhsz);
        localhsz.println("");
      }
    }
    String str1 = localhsz.toString();
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("bundled_text_key", str1);
    localhte.f(localBundle2);
    localhtg.f().b.a.d.a().b(aau.zH, localhte).a(null).b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hth
 * JD-Core Version:    0.7.0.1
 */