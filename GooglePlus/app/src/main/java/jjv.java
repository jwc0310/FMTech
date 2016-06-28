import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class jjv
  extends gzf
{
  private final fyy a;
  private final fyl b;
  private boolean c;
  
  public jjv(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, "SetContactsSyncEnabledTask");
    fym localfym = (fym)mbb.a(paramContext, fym.class);
    this.b = ((fyl)mbb.a(paramContext, fyl.class));
    this.a = localfym.a();
    this.c = paramBoolean;
  }
  
  protected final hae a()
  {
    frs localfrs = this.a.a(10L, TimeUnit.SECONDS);
    fsh localfsh;
    int i;
    if (localfrs.a())
    {
      localfsh = this.b.a(this.a, this.c).a();
      if (localfsh.aN_().a()) {
        i = 200;
      }
    }
    for (;;)
    {
      if (jid.a())
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Boolean.valueOf(this.c);
        arrayOfObject[1] = Integer.valueOf(i);
        jid.a("SetContactsSyncEnabledTask", String.format("isSyncEnabled: %s. statusCode: %s", arrayOfObject));
      }
      this.a.d();
      return new hae(i, null, null);
      i = localfsh.aN_().b();
      continue;
      i = localfrs.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjv
 * JD-Core Version:    0.7.0.1
 */