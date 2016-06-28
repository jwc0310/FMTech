import android.app.Activity;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import java.util.List;

public final class kws
  implements gqh
{
  private final MenuItem a;
  private kwd b;
  
  public kws(MenuItem paramMenuItem, boolean paramBoolean, kwd paramkwd)
  {
    this.a = paramMenuItem;
    paramMenuItem.setChecked(paramBoolean);
    this.b = paramkwd;
  }
  
  public final boolean a(Activity paramActivity)
  {
    boolean bool1 = this.a.isChecked();
    MenuItem localMenuItem = this.a;
    boolean bool2;
    boolean bool3;
    label38:
    String str1;
    String str2;
    label119:
    gxr localgxr;
    if (!bool1)
    {
      bool2 = true;
      localMenuItem.setChecked(bool2);
      if (bool1) {
        break label206;
      }
      bool3 = true;
      kwd localkwd = this.b;
      ((giz)mbb.a(paramActivity, giz.class)).b(localkwd.m()).b("socialcast_private_posts", bool3).d();
      if (((AccessibilityManager)paramActivity.getSystemService("accessibility")).isEnabled())
      {
        str1 = paramActivity.getResources().getString(dl.q);
        str2 = paramActivity.getResources().getString(dl.p);
        if (!bool1) {
          break label212;
        }
        Toast.makeText(paramActivity, str2, 0).show();
      }
      localgxr = new gxr();
      if (!bool1) {
        break label219;
      }
    }
    label206:
    label212:
    label219:
    for (gxt localgxt = pke.a;; localgxt = pke.c)
    {
      gxq localgxq = new gxq(localgxt);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(paramActivity)).b(paramActivity);
      this.b.v();
      return true;
      bool2 = false;
      break;
      bool3 = false;
      break label38;
      str2 = str1;
      break label119;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kws
 * JD-Core Version:    0.7.0.1
 */