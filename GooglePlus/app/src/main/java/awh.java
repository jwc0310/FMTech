import android.content.Context;

final class awh
  extends gzf
{
  awh(awc paramawc, Context paramContext, String paramString, int paramInt, oik paramoik, boolean paramBoolean)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    mbf localmbf = this.d.bn;
    int i = this.a;
    oik localoik = this.b;
    int j;
    int k;
    Exception localException;
    if (this.c)
    {
      j = 2;
      bhs localbhs = new bhs(localmbf, i, localoik, j);
      ((kbu)mbb.a(this.d.bn, kbu.class)).a(localbhs);
      k = localbhs.o;
      localException = localbhs.q;
      if (!localbhs.n()) {
        break label121;
      }
    }
    label121:
    for (String str = this.d.bn.getString(aau.uV);; str = null)
    {
      return new hae(k, localException, str);
      j = 1;
      break;
    }
  }
  
  public final String b()
  {
    mbf localmbf = this.d.bn;
    if (this.c) {}
    for (int i = aau.vy;; i = aau.vH) {
      return localmbf.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awh
 * JD-Core Version:    0.7.0.1
 */