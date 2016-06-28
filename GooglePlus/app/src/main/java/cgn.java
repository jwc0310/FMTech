import android.text.style.URLSpan;

final class cgn
  extends dge
{
  public cgn(cge paramcge)
  {
    super(paramcge.bn, paramcge.at.c());
  }
  
  public final void a() {}
  
  public final void a(URLSpan paramURLSpan) {}
  
  public final void a(String paramString1, String paramString2)
  {
    bj localbj = ((kyu)this.c.bo.a(kyu.class)).a(paramString1, paramString2);
    localbj.n = this.c;
    localbj.p = 0;
    localbj.a(this.c.x, "hsf_moderation");
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    cge.a(this.c, jjf.a(paramString1), paramString2, true, null, null, null, paramString3, -2);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1;
    if ((this.c.aP) && (paramBoolean1)) {
      str1 = brn.a(this.c.bn, this.c.aO, true);
    }
    for (String str2 = brn.a(this.c.bn, true);; str2 = null)
    {
      cge.a(this.c, jjf.a(paramString1), paramString2, paramBoolean2, str1, str2, null, paramString3, paramInt);
      return;
      str1 = null;
    }
  }
  
  public final void b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    cge.a(this.c, jjf.a(paramString1), paramString2, true, null, null, null, paramString3, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgn
 * JD-Core Version:    0.7.0.1
 */