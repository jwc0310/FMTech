import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class gpk
  implements mbo, mck, mes, mfd
{
  public gpl a;
  public boolean b = true;
  private final bk c;
  private final gpq d;
  private boolean e;
  private boolean f;
  
  public gpk(bk parambk, mek parammek, gpq paramgpq)
  {
    this.c = parambk;
    this.d = paramgpq;
    parammek.a(this);
  }
  
  public final void a()
  {
    if (this.a != null) {
      this.a.b();
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((gpl)parammbb.b(gpl.class));
    ((mci)parammbb.a(mci.class)).a.add(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    boolean bool = true;
    Bundle localBundle = this.c.m;
    if ((localBundle == null) || (localBundle.getBoolean("ActionBarFragmentMixin.Enabled", bool))) {}
    for (;;)
    {
      this.b = bool;
      return;
      bool = false;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    if ((this.e) && (this.b)) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool != this.f)
      {
        this.f = bool;
        if (this.a != null)
        {
          if (!bool) {
            break;
          }
          this.a.a(this.d);
        }
      }
      return;
    }
    this.a.b(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpk
 * JD-Core Version:    0.7.0.1
 */