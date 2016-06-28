import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public final class aui
  implements ank
{
  private final aud a;
  private final Activity b;
  private final String c;
  private final int d;
  private final int e;
  
  public aui(Activity paramActivity, aud paramaud, String paramString, int paramInt1, int paramInt2)
  {
    this.b = paramActivity;
    this.a = paramaud;
    this.c = paramString;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final void a()
  {
    this.a.a();
  }
  
  public final void a(aci paramaci) {}
  
  public final boolean a(aci paramaci, Menu paramMenu)
  {
    if (this.c != null) {}
    for (String str = this.c;; str = this.b.getString(aau.nH))
    {
      paramMenu.add(0, aaw.cJ, 0, str);
      return true;
    }
  }
  
  public final boolean a(aci paramaci, MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.cJ) {
      ((anw)mbb.a(this.b, anw.class)).a();
    }
    return true;
  }
  
  public final boolean b(aci paramaci, Menu paramMenu)
  {
    int i = this.a.b.b;
    if ((this.d <= i) && (this.e >= i)) {}
    for (boolean bool = true;; bool = false)
    {
      paramMenu.findItem(aaw.cJ).setEnabled(bool);
      paramaci.b(String.valueOf(i));
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aui
 * JD-Core Version:    0.7.0.1
 */