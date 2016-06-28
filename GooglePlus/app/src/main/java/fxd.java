import android.util.Log;

public class fxd
{
  public fxd(cta paramcta) {}
  
  public void a(fxu paramfxu)
  {
    if (Log.isLoggable("FriendLocations", 2))
    {
      String str = String.valueOf(paramfxu);
      new StringBuilder(16 + String.valueOf(str).length()).append("onCameraChange: ").append(str);
    }
    if ((paramfxu.a() != this.a.ah) || (this.a.Z != null))
    {
      this.a.ah = paramfxu.a();
      this.a.z().run();
    }
    while (!this.a.ad.a()) {
      return;
    }
    cta localcta = this.a;
    if (localcta.al == null) {
      localcta.al = new ctd(localcta, 500L);
    }
    localcta.al.run();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fxd
 * JD-Core Version:    0.7.0.1
 */