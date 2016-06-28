import android.content.Context;

final class gjx
  implements gji
{
  gjx(gjt paramgjt) {}
  
  public final String a()
  {
    return "add_effective_gaia_id";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    if (paramgje.c("is_managed_account")) {
      paramgje.c("effective_gaia_id", paramgje.b("gaia_id"));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjx
 * JD-Core Version:    0.7.0.1
 */