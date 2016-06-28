import android.app.Activity;
import android.os.Bundle;
import java.util.HashMap;

public class ani
  implements mes, mfa, mfb, mfc, mfd
{
  public Bundle a;
  public String b;
  boolean c = true;
  public aci d;
  private final tt e;
  
  public ani(Activity paramActivity, mek parammek)
  {
    this.e = ((tt)paramActivity);
    parammek.a(this);
  }
  
  public final void a()
  {
    if ((this.b != null) && (this.a != null)) {
      a(this.b, this.a);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.b = paramBundle.getString("com.google.android.apps.photos.actionbar.mode.Mode");
      this.a = paramBundle.getBundle("com.google.android.apps.photos.actionbar.mode.FactoryArgs");
    }
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    ang localang = (ang)((anh)mbb.a(this.e, anh.class)).a.get(paramString);
    this.b = paramString;
    this.a = paramBundle;
    anj localanj = new anj(this, localang.a(this.e, paramBundle));
    this.c = false;
    this.d = this.e.e().a(localanj);
    this.c = true;
  }
  
  public final void aK_()
  {
    c();
  }
  
  public final void b(Bundle paramBundle)
  {
    if ((this.b != null) && (this.a != null))
    {
      paramBundle.putString("com.google.android.apps.photos.actionbar.mode.Mode", this.b);
      paramBundle.putBundle("com.google.android.apps.photos.actionbar.mode.FactoryArgs", this.a);
    }
  }
  
  public final void c()
  {
    if (this.d != null)
    {
      this.c = false;
      this.d.c();
      this.c = true;
      this.d = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ani
 * JD-Core Version:    0.7.0.1
 */