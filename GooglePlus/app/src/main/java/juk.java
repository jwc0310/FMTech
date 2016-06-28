import android.content.Context;

final class juk
  extends jwp
{
  static final String a = String.valueOf(juk.class.getName()).concat("ClearVote");
  
  public juk(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(a, paramInt1, paramString1, paramString2, paramInt2, paramInt3, paramBoolean);
  }
  
  protected final hae a(Context paramContext)
  {
    juj localjuj = new juj(paramContext, this.b, this.c, this.d);
    ((kbu)mbb.a(paramContext, kbu.class)).a(localjuj);
    int i = localjuj.o;
    Exception localException = localjuj.q;
    boolean bool = localjuj.n();
    nuc localnuc;
    if (localjuj.n())
    {
      localnuc = null;
      return a(paramContext, i, localException, bool, localnuc);
    }
    if (localjuj.x) {}
    for (qat localqat = localjuj.w;; localqat = null)
    {
      localnuc = ((mym)localqat).a.a;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     juk
 * JD-Core Version:    0.7.0.1
 */