import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public final class auk
  implements ank
{
  private final Activity a;
  private final aud b;
  
  public auk(Activity paramActivity, aud paramaud)
  {
    this.a = paramActivity;
    this.b = paramaud;
  }
  
  public final void a()
  {
    this.b.a();
  }
  
  public final void a(aci paramaci) {}
  
  public final boolean a(aci paramaci, Menu paramMenu)
  {
    paramMenu.add(0, aaw.jM, 0, aau.pr);
    return true;
  }
  
  public final boolean a(aci paramaci, MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.jM) {
      ((aog)mbb.a(this.a, aog.class)).a();
    }
    return true;
  }
  
  public final boolean b(aci paramaci, Menu paramMenu)
  {
    isq localisq = this.b.b;
    int i;
    if (localisq != null)
    {
      i = localisq.b;
      if (i <= 0) {
        break label44;
      }
    }
    label44:
    for (String str = String.valueOf(i);; str = "")
    {
      paramaci.b(str);
      return true;
      i = 0;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auk
 * JD-Core Version:    0.7.0.1
 */