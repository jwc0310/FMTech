import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;

public final class med
  extends mek
{
  private mep c;
  private mep d;
  private mep e;
  private mep f;
  private mep g;
  
  static void a(mfd parammfd, boolean paramBoolean)
  {
    if ((parammfd instanceof meb)) {
      ((meb)parammfd).a(paramBoolean);
    }
  }
  
  public final void a()
  {
    mep localmep = this.e;
    this.b.remove(localmep);
    for (int i = 0; i < this.a.size(); i++) {
      this.a.get(i);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    this.c = a(new mee(this, paramActivity));
  }
  
  public final void a(Bundle paramBundle)
  {
    this.d = a(new mef(this, paramBundle));
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    this.e = a(new mei(this, paramBundle, paramView));
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.g != null)
    {
      mep localmep = this.g;
      this.b.remove(localmep);
    }
    if (!paramBoolean) {
      this.g = a(new meg(this, paramBoolean));
    }
    for (;;)
    {
      return;
      for (int i = 0; i < this.a.size(); i++) {
        a((mfd)this.a.get(i), paramBoolean);
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    this.f = a(new meh(this, paramBundle));
  }
  
  public final void c()
  {
    super.c();
    mep localmep1 = this.d;
    this.b.remove(localmep1);
    mep localmep2 = this.f;
    this.b.remove(localmep2);
  }
  
  public final void d()
  {
    mep localmep = this.c;
    this.b.remove(localmep);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     med
 * JD-Core Version:    0.7.0.1
 */