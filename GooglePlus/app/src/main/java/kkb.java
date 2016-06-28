import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class kkb
  implements mes, mfa, mfd
{
  boolean a;
  boolean b;
  boolean c;
  private ArrayList<x> d = new ArrayList();
  
  public kkb(Activity paramActivity, mek parammek)
  {
    parammek.a(this);
  }
  
  private final void d()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.a = paramBundle.getBoolean("disable_reshares");
      this.b = paramBundle.getBoolean("disable_comments");
      this.c = paramBundle.getBoolean("notify_via_email");
    }
  }
  
  public final boolean a()
  {
    if (!this.b) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      d();
      return this.b;
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("disable_reshares", this.a);
    paramBundle.putBoolean("disable_comments", this.b);
    paramBundle.putBoolean("notify_via_email", this.c);
  }
  
  public final boolean b()
  {
    if (!this.a) {}
    for (boolean bool = true;; bool = false)
    {
      this.a = bool;
      d();
      return this.a;
    }
  }
  
  public final boolean c()
  {
    if (!this.c) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      d();
      return this.c;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkb
 * JD-Core Version:    0.7.0.1
 */