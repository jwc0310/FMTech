import android.content.Context;

final class gjz
  implements gji
{
  gjz(gjt paramgjt) {}
  
  public final String a()
  {
    return "upgrade:remove_account_status";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    switch (paramgje.a("account_status", 0))
    {
    case 0: 
    case 2: 
    default: 
      return;
    case 1: 
      paramgje.c("is_bad", true);
      return;
    case 3: 
      paramgje.c("gplus_no_mobile_tos", true);
      return;
    case 4: 
      paramgje.c("is_google_plus", true);
      paramgje.c("logged_in", true);
      return;
    }
    paramgje.c("is_google_plus", true);
    paramgje.c("logged_out", true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjz
 * JD-Core Version:    0.7.0.1
 */