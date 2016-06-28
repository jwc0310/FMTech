import android.content.Context;

final class gjw
  implements gji
{
  gjw(gjt paramgjt) {}
  
  public final String a()
  {
    return "upgrade_direct_login_to_managed_login";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    boolean bool2;
    boolean bool3;
    if (paramgje.a("is_direct_login"))
    {
      bool2 = paramgje.a("is_direct_login", false);
      if (!bool2)
      {
        bool3 = true;
        paramgje.c("is_managed_account", bool3);
        paramgje.i("is_direct_login");
      }
    }
    for (boolean bool1 = bool2;; bool1 = false)
    {
      if ((paramgje.a("is_plus_page", false)) && (!bool1)) {
        paramgje.c("is_managed_account", true);
      }
      return;
      bool3 = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjw
 * JD-Core Version:    0.7.0.1
 */