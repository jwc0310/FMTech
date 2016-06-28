import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;

public final class lbx
  extends gzf
{
  private final kcg a;
  private final int b;
  private final String c;
  private final boolean d;
  private final kyn l;
  private final kzc[] m;
  
  public lbx(Context paramContext, int paramInt, String paramString, kzc[] paramArrayOfkzc, boolean paramBoolean)
  {
    super("EditSquareStreamOrderTask");
    this.c = paramString;
    this.b = paramInt;
    this.a = new kch().a(paramContext, this.b).a();
    this.l = ((kyn)mbb.a(paramContext, kyn.class));
    this.m = paramArrayOfkzc;
    this.d = paramBoolean;
  }
  
  private static String a(Context paramContext, boolean paramBoolean)
  {
    Resources localResources = paramContext.getResources();
    if (paramBoolean) {
      return localResources.getString(ev.u);
    }
    return null;
  }
  
  private final String[] d()
  {
    ArrayList localArrayList = new ArrayList();
    for (kzc localkzc : this.m) {
      if (!TextUtils.isEmpty(localkzc.a)) {
        localArrayList.add(localkzc.a);
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  private final hae f(Context paramContext)
  {
    String[] arrayOfString = d();
    kzf localkzf = new kzf(paramContext, this.a, this.c);
    localkzf.a();
    if (localkzf.a.n()) {
      return new hae(localkzf.a.o, localkzf.a.q, a(paramContext, localkzf.a.n()));
    }
    kyf localkyf = localkzf.b();
    if (this.d)
    {
      lcl locallcl = new lcl(paramContext, this.a, this.c, arrayOfString);
      locallcl.a.i();
      locallcl.a.c("ReorderSquareCategoriesOp");
      if (locallcl.a.n()) {
        return new hae(locallcl.a.o, locallcl.a.q, a(paramContext, locallcl.a.n()));
      }
    }
    try
    {
      qxt[] arrayOfqxt = new qxt[this.m.length];
      for (int i = 0; i < arrayOfqxt.length; i++)
      {
        arrayOfqxt[i] = new qxt();
        arrayOfqxt[i].b = this.m[i].b;
        arrayOfqxt[i].a = this.m[i].a;
      }
      localkyf.a(arrayOfqxt);
      this.l.a(this.b, localkyf);
      return new hae(true);
    }
    catch (Exception localException)
    {
      return new hae(0, localException, a(paramContext, true));
    }
  }
  
  private final hae g(Context paramContext)
  {
    kbu localkbu = (kbu)mbb.a(paramContext, kbu.class);
    kzk localkzk = new kzk(paramContext, this.a, this.c);
    localkbu.a(localkzk);
    if (localkzk.n()) {
      return new hae(localkzk.o, localkzk.q, a(paramContext, localkzk.n()));
    }
    qat localqat;
    if (localkzk.x) {
      localqat = localkzk.w;
    }
    for (;;)
    {
      oed localoed = ((mvm)localqat).a.a;
      lbs locallbs;
      if (this.d)
      {
        odp localodp = localoed.b.b;
        oen localoen = new oen();
        localoen.a = d();
        locallbs = new lbs(paramContext, this.a, this.c, localodp, localoen);
        localkbu.a(locallbs);
        if (!locallbs.n()) {}
      }
      try
      {
        this.l.a(this.b, new kyf(localoed));
        label187:
        return new hae(locallbs.o, locallbs.q, a(paramContext, locallbs.n()));
        localqat = null;
        continue;
        try
        {
          odw[] arrayOfodw = new odw[this.m.length];
          for (int i = 0; i < arrayOfodw.length; i++)
          {
            arrayOfodw[i] = new odw();
            arrayOfodw[i].b = this.m[i].b;
            arrayOfodw[i].a = this.m[i].a;
            arrayOfodw[i].c = this.m[i].c;
          }
          localoed.c = new oeh();
          localoed.c.a = arrayOfodw;
          this.l.a(this.b, new kyf(localoed));
          return new hae(true);
        }
        catch (Exception localException1)
        {
          return new hae(0, localException1, a(paramContext, true));
        }
      }
      catch (Exception localException2)
      {
        break label187;
      }
    }
  }
  
  protected final hae a(Context paramContext)
  {
    if (kyo.a(paramContext, this.b)) {
      return f(paramContext);
    }
    return g(paramContext);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getResources().getString(ev.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbx
 * JD-Core Version:    0.7.0.1
 */