import android.content.Context;

final class gjv
  implements gji
{
  gjv(gjt paramgjt) {}
  
  public final String a()
  {
    return "upgrade:active_to_logged_in";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    if (paramgje.c("active"))
    {
      paramgje.i("active");
      paramgje.c("logged_in", true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjv
 * JD-Core Version:    0.7.0.1
 */