import android.content.Context;

public abstract class haa
{
  public final Context a;
  public final bw b;
  public boolean c;
  
  public haa(Context paramContext, bw parambw)
  {
    this.a = paramContext;
    this.b = parambw;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    String str1;
    String str2;
    if (paramInt1 == 0)
    {
      str1 = null;
      str2 = null;
      if (paramInt2 != 0) {
        break label33;
      }
    }
    for (;;)
    {
      a(str1, str2);
      return;
      str1 = this.a.getString(paramInt1);
      break;
      label33:
      str2 = this.a.getString(paramInt2);
    }
  }
  
  public abstract void a(bk parambk, String paramString, boolean paramBoolean);
  
  public final void a(gzf paramgzf, boolean paramBoolean)
  {
    String str = paramgzf.b(this.a);
    if (str == null) {
      str = paramgzf.b();
    }
    a(str, paramgzf.c(), paramgzf.f, paramBoolean);
  }
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean);
  
  public abstract boolean a(hae paramhae);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     haa
 * JD-Core Version:    0.7.0.1
 */