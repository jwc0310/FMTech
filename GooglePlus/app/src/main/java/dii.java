import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

public final class dii
  extends hqe<dih>
{
  private final int d;
  private final String e;
  private final fv f = new fv(this);
  private dih h;
  
  public dii(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.d = paramInt;
    this.e = ((git)mbb.a(paramContext, git.class)).f().b("gaia_id");
  }
  
  private static void a(dih paramdih)
  {
    if (paramdih != null)
    {
      if ((paramdih.a != null) && (!paramdih.a.isClosed()))
      {
        paramdih.a.close();
        paramdih.a = null;
      }
      if ((paramdih.b != null) && (!paramdih.b.isClosed()))
      {
        paramdih.b.close();
        paramdih.b = null;
      }
    }
  }
  
  private dih r()
  {
    dih localdih = new dih();
    try
    {
      Context localContext = this.l;
      jyw localjyw = (jyw)mbb.a(localContext, jyw.class);
      gzj.b(localContext, new jzh(this.d, this.e, true));
      localdih.a = localjyw.a(this.d);
      localdih.b = ((kyn)mbb.a(localContext, kyn.class)).e(this.d);
      return localdih;
    }
    catch (RuntimeException localRuntimeException)
    {
      a(localdih);
    }
    return localdih;
  }
  
  protected final void i()
  {
    super.i();
    h();
    a(this.h);
    this.h = null;
  }
  
  protected final boolean o()
  {
    Context localContext = this.l;
    super.o();
    localContext.getContentResolver().registerContentObserver(((jyv)mbb.a(localContext, jyv.class)).b(), false, this.f);
    return true;
  }
  
  protected final boolean p()
  {
    super.p();
    this.l.getContentResolver().unregisterContentObserver(this.f);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dii
 * JD-Core Version:    0.7.0.1
 */