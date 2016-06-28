import android.content.Context;

final class jyu
  implements inj
{
  private final jyl a;
  
  jyu(Context paramContext)
  {
    this.a = ((jyl)mbb.a(paramContext, jyl.class));
  }
  
  public final void a(gje paramgje, mtu parammtu)
  {
    if ((parammtu != null) && (parammtu.a != null) && (parammtu.a.b != null) && (parammtu.a.b.c != null))
    {
      paramgje.c("profile_suspended", efj.b(Boolean.valueOf(efj.b(parammtu.a.b.c.g))));
      paramgje.c("profile_has_strikes", efj.b(Boolean.valueOf(efj.b(parammtu.a.b.c.j))));
      paramgje.c("suspension_status_checked", false);
    }
  }
  
  public final boolean a(gjb paramgjb, mtt parammtt)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyu
 * JD-Core Version:    0.7.0.1
 */