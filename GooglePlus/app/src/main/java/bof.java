import android.content.Context;

public final class bof
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final int d;
  private final boolean l;
  
  public bof(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, "SearchActivitiesTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt2;
    this.l = paramBoolean;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    int i = this.a;
    if (!this.l) {}
    for (String str = efj.a(localContext, i, this.b, this.d);; str = null)
    {
      blm localblm = new blm(localContext, i, this.b, this.d, str, this.c);
      localblm.i();
      return new hae(localblm.o, localblm.q, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bof
 * JD-Core Version:    0.7.0.1
 */