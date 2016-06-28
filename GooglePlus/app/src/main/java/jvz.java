import android.content.Context;

final class jvz
  extends jwp
{
  static final String a = String.valueOf(jvz.class.getName()).concat("SetVote");
  private final nul l;
  
  public jvz(int paramInt1, String paramString1, String paramString2, nul paramnul, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(a, paramInt1, paramString1, paramString2, paramInt2, paramInt3, paramBoolean);
    this.l = paramnul;
  }
  
  protected final hae a(Context paramContext)
  {
    jvy localjvy = new jvy(paramContext, this.b, this.c, this.d, this.l);
    ((kbu)mbb.a(paramContext, kbu.class)).a(localjvy);
    int i = localjvy.o;
    Exception localException = localjvy.q;
    boolean bool = localjvy.n();
    nuc localnuc;
    if (localjvy.n())
    {
      localnuc = null;
      return a(paramContext, i, localException, bool, localnuc);
    }
    if (localjvy.x) {}
    for (qat localqat = localjvy.w;; localqat = null)
    {
      localnuc = ((mys)localqat).a.a;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvz
 * JD-Core Version:    0.7.0.1
 */