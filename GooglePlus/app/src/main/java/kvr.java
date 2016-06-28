import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.MediaRouteActionProvider;
import android.support.v7.app.MediaRouteButton;
import android.view.Menu;
import android.view.MenuInflater;
import java.util.List;

public final class kvr
  extends bk
{
  private MediaRouteActionProvider Z;
  private aao a;
  private fqn aa;
  private int ab;
  private aap b;
  private String c;
  private aam d;
  
  public kvr()
  {
    d(true);
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.ab = paramBundle.getInt("account_id");
    }
    for (;;)
    {
      this.a = aao.a(f());
      this.b = new kvs(this);
      this.aa = ((fqn)mbb.a(f(), fqn.class));
      return;
      Bundle localBundle = this.m;
      if (localBundle != null) {
        this.ab = localBundle.getInt("account_id");
      }
    }
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.a(paramMenu, paramMenuInflater);
    if (this.d == null) {}
    MediaRouteActionProvider localMediaRouteActionProvider;
    aam localaam1;
    do
    {
      do
      {
        return;
        paramMenuInflater.inflate(efj.VS, paramMenu);
        this.Z = ((MediaRouteActionProvider)mm.b(paramMenu.findItem(eyg.br)));
        localMediaRouteActionProvider = this.Z;
        localaam1 = this.d;
        if (localaam1 == null) {
          throw new IllegalArgumentException("selector must not be null");
        }
      } while (localMediaRouteActionProvider.f.equals(localaam1));
      aam localaam2 = localMediaRouteActionProvider.f;
      localaam2.a();
      if (!localaam2.b.isEmpty()) {
        localMediaRouteActionProvider.d.a(localMediaRouteActionProvider.e);
      }
      localaam1.a();
      if (!localaam1.b.isEmpty()) {
        localMediaRouteActionProvider.d.a(localaam1, localMediaRouteActionProvider.e, 0);
      }
      localMediaRouteActionProvider.f = localaam1;
      localMediaRouteActionProvider.d();
    } while (localMediaRouteActionProvider.g == null);
    localMediaRouteActionProvider.g.a(localaam1);
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putInt("account_id", this.ab);
    super.e(paramBundle);
  }
  
  public final void p_()
  {
    super.p_();
    this.c = efj.A(f(), this.ab);
    this.d = new aan().a(this.aa.a(this.c)).a();
    this.a.a(this.d, this.b, 1);
  }
  
  public final void q_()
  {
    this.Z = null;
    this.a.a(this.b);
    this.d = null;
    this.c = null;
    super.q_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvr
 * JD-Core Version:    0.7.0.1
 */