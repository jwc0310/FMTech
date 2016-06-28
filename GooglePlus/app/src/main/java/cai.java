import android.database.Cursor;
import android.os.Bundle;

final class cai
  implements cw<Cursor>
{
  cai(cah paramcah) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    Bundle localBundle = this.a.m;
    if ((localBundle != null) && (localBundle.getBoolean("clear_db", false))) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        localBundle.putBoolean("clear_db", false);
        this.a.b = null;
        this.a.ad = true;
        cah localcah = this.a;
        localcah.J();
      }
      return new cwz(this.a.bn, this.a.am.c(), bool);
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cai
 * JD-Core Version:    0.7.0.1
 */