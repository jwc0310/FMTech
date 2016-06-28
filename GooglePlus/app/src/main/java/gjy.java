import android.content.Context;

final class gjy
  implements gji
{
  gjy(gjt paramgjt) {}
  
  public final String a()
  {
    return "upgrade:account_status";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    if (paramgje.c("non_google_plus"))
    {
      paramgje.i("non_google_plus");
      paramgje.c("account_status", 2);
      return;
    }
    if (paramgje.c("notifications_only"))
    {
      paramgje.i("notifications_only");
      paramgje.c("account_status", 3);
      return;
    }
    if (paramgje.c("logged_in"))
    {
      paramgje.i("logged_in");
      paramgje.c("account_status", 4);
      return;
    }
    paramgje.c("account_status", 5);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjy
 * JD-Core Version:    0.7.0.1
 */