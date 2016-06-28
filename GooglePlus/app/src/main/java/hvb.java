import android.content.Context;

final class hvb
  implements hul
{
  private final hyi a;
  private final giz b;
  private final Context c;
  
  hvb(Context paramContext)
  {
    this.c = paramContext;
    this.a = ((hyi)mbb.a(paramContext, hyi.class));
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final void a(int paramInt, String paramString)
  {
    hvg localhvg = new hvg(this.c, paramInt, paramString);
    gzj.a(this.c, localhvg);
  }
  
  public final boolean a(int paramInt)
  {
    gjb localgjb = this.b.a(paramInt);
    if (localgjb == null) {}
    while ((localgjb.c("is_dasher_account")) && (!this.a.b(huy.b, paramInt))) {
      return false;
    }
    return this.a.b(huy.a, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvb
 * JD-Core Version:    0.7.0.1
 */