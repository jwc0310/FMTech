import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Set;

public class gxe
  implements mbo, mes, mfa, mfd
{
  public boolean a = true;
  private Context b;
  private Set<Integer> c;
  
  public gxe(mek parammek)
  {
    parammek.a(this);
  }
  
  public gxe(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  private static Integer c(View paramView)
  {
    gxq localgxq = efj.h(paramView);
    if (localgxq != null) {
      return Integer.valueOf(localgxq.hashCode());
    }
    String str = String.valueOf(paramView.getClass().getName());
    throw new IllegalArgumentException(127 + String.valueOf(str).length() + str + " must either implement the VisualElementProvider interface or have a VisualElement attached to it in order to be " + "impressionable");
  }
  
  public final void a()
  {
    if (this.a)
    {
      gwz.a(this.b, -1);
      this.a = false;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.a = paramBundle.getBoolean("analytics_log_impression", true);
      if (paramBundle.containsKey("analytics_log_impression_views"))
      {
        ArrayList localArrayList = paramBundle.getIntegerArrayList("analytics_log_impression_views");
        this.c = new fpi();
        this.c.addAll(localArrayList);
      }
    }
  }
  
  public final void a(View paramView)
  {
    Integer localInteger = c(paramView);
    if (this.c == null) {
      this.c = new fpi();
    }
    if (!this.c.contains(localInteger))
    {
      gwz.a(paramView, -1);
      this.c.add(localInteger);
    }
  }
  
  public final gxe b(View paramView)
  {
    if (this.c != null) {
      this.c.remove(c(paramView));
    }
    return this;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("analytics_log_impression", this.a);
    if ((this.c != null) && (!this.c.isEmpty())) {
      paramBundle.putIntegerArrayList("analytics_log_impression_views", new ArrayList(this.c));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxe
 * JD-Core Version:    0.7.0.1
 */