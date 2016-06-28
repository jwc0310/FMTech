import android.content.Context;
import android.view.MenuItem;
import android.view.View;

public final class acm
  extends xx
{
  public acm(acl paramacl, Context paramContext, ye paramye)
  {
    super(paramContext, paramye, null, false, aau.D);
    Object localObject;
    int i;
    if (!((xp)paramye.getItem()).e())
    {
      if (paramacl.g == null)
      {
        localObject = (View)paramacl.e;
        this.e = ((View)localObject);
      }
    }
    else
    {
      this.g = paramacl.o;
      i = paramye.size();
    }
    for (int k = 0;; k++)
    {
      boolean bool = false;
      if (k < i)
      {
        MenuItem localMenuItem = paramye.getItem(k);
        if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null)) {
          bool = true;
        }
      }
      else
      {
        this.h = bool;
        return;
        localObject = paramacl.g;
        break;
      }
    }
  }
  
  public final void onDismiss()
  {
    super.onDismiss();
    this.j.m = null;
    this.j.p = 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acm
 * JD-Core Version:    0.7.0.1
 */