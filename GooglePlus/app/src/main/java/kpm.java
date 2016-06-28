import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class kpm
{
  public String a;
  public boolean b;
  public Integer c;
  public String d;
  public String e;
  private final Context f;
  
  public kpm(Context paramContext)
  {
    this.f = paramContext;
  }
  
  public final Intent a()
  {
    if (!TextUtils.isEmpty(this.a)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Missing required field: personId.");
      gjb localgjb = ((git)mbb.a(this.f, git.class)).f();
      gcm localgcm = ((gcn)mbb.a(this.f, gcn.class)).a().c(this.a).a(localgjb.b("account_name")).a(mbb.a(this.f, "com.google.android.libraries.social.appid", 300)).e(this.d).f(this.e);
      if (this.c != null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(0xFFFFFF & this.c.intValue());
        localgcm.d(String.format("#%06X", arrayOfObject));
      }
      if (localgjb.c("is_plus_page")) {
        localgcm.b(localgjb.b("gaia_id"));
      }
      if (this.b) {
        localgcm.a(new int[] { 6, 0, 3, 1, 2, 4 });
      }
      return localgcm.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpm
 * JD-Core Version:    0.7.0.1
 */