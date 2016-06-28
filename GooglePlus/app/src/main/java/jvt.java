import android.content.Context;

public final class jvt
  extends gzf
{
  static final String a = jvt.class.getName();
  private final int b;
  private final String c;
  private final String d;
  
  public jvt(int paramInt, String paramString1, String paramString2)
  {
    super(a);
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  protected final hae a(Context paramContext)
  {
    jvs localjvs = new jvs(paramContext, this.b, this.c, this.d);
    ((kbu)mbb.a(paramContext, kbu.class)).a(localjvs);
    hae localhae = new hae(localjvs.o, localjvs.q, null);
    if (localjvs.x) {}
    myq localmyq;
    for (qat localqat = localjvs.w;; localqat = null)
    {
      localmyq = (myq)localqat;
      if (localmyq != null) {
        break;
      }
      return localhae;
    }
    nut localnut = localmyq.a;
    if ((localjvs.n()) || (localnut == null) || (localnut.a == null) || (localnut.a.a == null) || (localnut.a.a.length < 2)) {
      return localhae;
    }
    ((jtm)mbb.a(paramContext, jtm.class)).a(this.b, this.c, localnut.a, true);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvt
 * JD-Core Version:    0.7.0.1
 */