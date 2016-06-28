import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;

public final class mm
{
  private static mq a = new mn();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      a = new mp();
      return;
    }
    if (i >= 11)
    {
      a = new mo();
      return;
    }
  }
  
  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof hc)) {
      return ((hc)paramMenuItem).setActionView(paramView);
    }
    return a.a(paramMenuItem, paramView);
  }
  
  public static MenuItem a(MenuItem paramMenuItem, ll paramll)
  {
    if ((paramMenuItem instanceof hc)) {
      paramMenuItem = ((hc)paramMenuItem).a(paramll);
    }
    return paramMenuItem;
  }
  
  public static View a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof hc)) {
      return ((hc)paramMenuItem).getActionView();
    }
    return a.a(paramMenuItem);
  }
  
  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof hc))
    {
      ((hc)paramMenuItem).setShowAsAction(paramInt);
      return;
    }
    a.a(paramMenuItem, paramInt);
  }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof hc)) {
      return ((hc)paramMenuItem).setActionView(paramInt);
    }
    return a.b(paramMenuItem, paramInt);
  }
  
  public static ll b(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof hc)) {
      return ((hc)paramMenuItem).a();
    }
    return null;
  }
  
  public static boolean c(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof hc)) {
      return ((hc)paramMenuItem).expandActionView();
    }
    return a.b(paramMenuItem);
  }
  
  public static boolean d(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof hc)) {
      return ((hc)paramMenuItem).isActionViewExpanded();
    }
    return a.c(paramMenuItem);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mm
 * JD-Core Version:    0.7.0.1
 */