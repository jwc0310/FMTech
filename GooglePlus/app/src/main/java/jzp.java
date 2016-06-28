import android.content.Context;

final class jzp
  extends ci
  implements lzl
{
  private final Context b;
  private final String c;
  private final String d;
  private final boolean e;
  private final boolean f;
  
  public jzp(Context paramContext, bw parambw, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parambw);
    this.b = paramContext;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  private final int d(int paramInt)
  {
    if ((b() == 1) && (this.f)) {
      paramInt = 1;
    }
    return paramInt;
  }
  
  public final bk a(int paramInt)
  {
    switch (d(paramInt))
    {
    default: 
      return null;
    case 0: 
      return ((hhl)mbb.a(this.b, hhl.class)).a(aw.dC, this.c, this.d, false);
    }
    return ((kyt)mbb.a(this.b, kyt.class)).a(aw.dC, this.c, this.d);
  }
  
  public final int b()
  {
    if ((this.e) && (this.f)) {
      return 2;
    }
    if ((this.e) || (this.f)) {
      return 1;
    }
    return 0;
  }
  
  public final CharSequence b(int paramInt)
  {
    switch (d(paramInt))
    {
    default: 
      return null;
    case 0: 
      return this.b.getString(efj.Ua);
    }
    return this.b.getString(efj.Ud);
  }
  
  public final gxq c(int paramInt)
  {
    switch (d(paramInt))
    {
    default: 
      return null;
    case 0: 
      return new gxq(pka.d);
    }
    return new gxq(pka.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzp
 * JD-Core Version:    0.7.0.1
 */