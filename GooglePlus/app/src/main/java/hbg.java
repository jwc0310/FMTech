import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.List;

public class hbg
{
  public hbg(dka paramdka) {}
  
  public void a()
  {
    dka localdka = this.a;
    PreferenceManager.getDefaultSharedPreferences(localdka.a).edit().putBoolean("have_fingerprints_been_generated", true).commit();
    Iterator localIterator = localdka.b.a(new String[] { "logged_in" }).iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      localdka.a.getContentResolver().notifyChange(jqx.a(i), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbg
 * JD-Core Version:    0.7.0.1
 */