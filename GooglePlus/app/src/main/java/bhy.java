import android.content.Context;

public final class bhy
  extends bkx
{
  private final String c;
  private final String d;
  private final String e;
  
  public bhy(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    super(paramContext, paramInt, 5, paramString2, paramBoolean, false, null);
    this.c = paramString1;
    this.d = paramString3;
    this.e = paramString2;
  }
  
  public final void a()
  {
    if (this.c != null) {
      lmp.a(this.j, this.h, this.c, this.a, this.b);
    }
    if (this.d != null) {
      jqx.b(this.j, this.h, this.d, this.e, this.b);
    }
  }
  
  protected final void a(oks paramoks)
  {
    if ((paramoks != null) && (this.c != null)) {
      lmp.a(this.j, this.h, this.c, this.a, paramoks.a);
    }
  }
  
  protected final void b()
  {
    boolean bool1 = true;
    boolean bool2;
    Context localContext1;
    int i;
    String str1;
    String str2;
    if (this.c != null)
    {
      Context localContext2 = this.j;
      int j = this.h;
      String str3 = this.c;
      String str4 = this.a;
      if (!this.b)
      {
        bool2 = bool1;
        lmp.a(localContext2, j, str3, str4, bool2);
      }
    }
    else if (this.d != null)
    {
      localContext1 = this.j;
      i = this.h;
      str1 = this.d;
      str2 = this.e;
      if (this.b) {
        break label110;
      }
    }
    for (;;)
    {
      jqx.b(localContext1, i, str1, str2, bool1);
      return;
      bool2 = false;
      break;
      label110:
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bhy
 * JD-Core Version:    0.7.0.1
 */