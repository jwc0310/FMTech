import android.content.Context;

final class hcr
  implements hcq
{
  private final Context a;
  private final lri b;
  
  public hcr(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((lri)mbb.b(paramContext, lri.class));
  }
  
  private final boolean a(int paramInt)
  {
    return (this.b != null) && (this.b.a(paramInt)) && (mbb.b(this.a, gww.class) != null);
  }
  
  public final void a(int paramInt, String paramString)
  {
    if (a(paramInt))
    {
      kqf localkqf = new kqf(109);
      localkqf.b = paramString;
      localkqf.b(this.a);
    }
  }
  
  public final void b(int paramInt, String paramString)
  {
    if (a(paramInt))
    {
      kqf localkqf = new kqf(110);
      localkqf.b = paramString;
      localkqf.b(this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcr
 * JD-Core Version:    0.7.0.1
 */