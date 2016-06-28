import android.content.Context;
import android.content.res.Resources;

public final class ign
{
  private static final long d = 5L * mfr.b.d;
  private static final long e = 100L * mfr.b.d;
  private static final long f = 512L * mfr.b.d;
  public igo a;
  public igk b;
  public igk c;
  
  public ign(Context paramContext)
  {
    igq localigq = new igq();
    localigq.a = efj.M(paramContext);
    igp localigp;
    if (localigq.a < 48)
    {
      Resources localResources = paramContext.getApplicationContext().getResources();
      localigp = new igp();
      localigp.a = localResources.getInteger(efj.MZ);
      localigp.c = localResources.getInteger(efj.MX);
      localigp.b = localResources.getInteger(efj.MY);
      localigp.e = localResources.getInteger(efj.Na);
      localigp.d = localResources.getInteger(efj.Na);
    }
    for (;;)
    {
      localigp.f = true;
      this.a = new igo(localigp);
      igl localigl1 = new igl();
      localigl1.a = "media";
      localigl1.b = d;
      localigl1.c = e;
      localigl1.d = 0.1F;
      this.b = new igk(localigl1);
      igl localigl2 = new igl();
      localigl2.a = "media_sync";
      localigl2.b = 0L;
      localigl2.c = f;
      localigl2.d = 0.25F;
      this.c = new igk(localigl2);
      return;
      if (localigq.a < 64) {
        localigp = localigq.a(paramContext, efj.MP, efj.MO);
      } else {
        localigp = localigq.a(paramContext, efj.MR, efj.MQ);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ign
 * JD-Core Version:    0.7.0.1
 */