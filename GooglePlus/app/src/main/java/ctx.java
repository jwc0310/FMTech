import android.content.SharedPreferences;

final class ctx
  implements jnn
{
  ctx(ctw paramctw) {}
  
  public final boolean a()
  {
    boolean bool1 = this.a.aa.c(this.a.Z.c());
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.a.Z.f().c("is_google_plus");
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.a.ab.a.getBoolean("com.google.android.libraries.social.people.providers.navigation.circlessettings.display_circles_key", false);
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctx
 * JD-Core Version:    0.7.0.1
 */