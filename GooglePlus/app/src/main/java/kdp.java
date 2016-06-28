import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class kdp
  implements mbo, mea, mfb, mfd
{
  final kds a;
  kfs b;
  kez c;
  public PreferenceScreen d;
  public kdr e;
  private Context f;
  
  public kdp(kds paramkds, mek parammek)
  {
    this.a = paramkds;
    parammek.a(this);
  }
  
  public final void a()
  {
    this.a.x();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((kfs)parammbb.a(kfs.class));
    this.f = paramContext;
  }
  
  public final void a(ket paramket)
  {
    if (this.e == null) {
      this.e = new kdr(this);
    }
    this.e.b = paramket.p;
    paramket.p = this.e;
  }
  
  public final void b()
  {
    this.d = this.b.a();
    this.c = new kez(this.f);
  }
  
  public final void c()
  {
    if (this.e != null)
    {
      kdr localkdr = this.e;
      if (localkdr.a != null)
      {
        localkdr.a.b(true);
        localkdr.a = null;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdp
 * JD-Core Version:    0.7.0.1
 */