import android.content.Intent;
import android.text.style.URLSpan;
import java.util.ArrayList;

final class chg
  extends dge
{
  public chg(cgr paramcgr)
  {
    super(paramcgr.bn, paramcgr.b.c());
  }
  
  public final void a()
  {
    cgr.d(this.c);
  }
  
  public final void a(URLSpan paramURLSpan)
  {
    this.c.bg.a(this.c.d, this.c.aA, this.c.Z, paramURLSpan.getURL(), null);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    bj localbj = ((kyu)this.c.bo.a(kyu.class)).a(this.c.al, this.c.d);
    localbj.n = this.c;
    localbj.p = 0;
    localbj.a(this.c.x, "moderation");
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    bp localbp = this.c.f();
    if ((localbp != null) && (this.c.ah == null))
    {
      if (!this.c.c.a()) {
        this.c.bn.startActivity(this.c.c.b());
      }
    }
    else {
      return;
    }
    int i = this.c.b.c();
    String str1 = String.valueOf(paramString1);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      Intent localIntent = efj.a(localbp, i, str2, paramString2, null, null, null, true);
      cgr.a(this.c, localIntent, 101);
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    bp localbp = this.c.f();
    if (localbp != null)
    {
      if (!this.c.c.a()) {
        this.c.bn.startActivity(this.c.c.b());
      }
    }
    else {
      return;
    }
    boolean bool = this.c.aT;
    String str1 = null;
    if (bool)
    {
      str1 = null;
      if (paramBoolean1) {
        str1 = brn.a(localbp, this.c.aU, paramBoolean2);
      }
    }
    if (str1 != null)
    {
      ArrayList localArrayList1 = new ArrayList(1);
      localArrayList1.add(str1);
      cgr localcgr = this.c;
      ArrayList localArrayList2 = new ArrayList(0);
      String str2 = String.valueOf(paramString1);
      if (str2.length() != 0) {}
      for (String str3 = "g:".concat(str2);; str3 = new String("g:"))
      {
        cgr.a(localcgr, localArrayList2, localArrayList1, str3, paramString2, true);
        return;
      }
    }
    int i = this.c.b.c();
    String str4 = String.valueOf(paramString1);
    if (str4.length() != 0) {}
    for (String str5 = "g:".concat(str4);; str5 = new String("g:"))
    {
      Intent localIntent = efj.a(localbp, i, str5, paramString2, null, null, null, true);
      cgr.a(this.c, localIntent, 101);
      return;
    }
  }
  
  public final void b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    bp localbp = this.c.f();
    int i;
    String str1;
    if ((localbp != null) && (this.c.ah == null))
    {
      i = this.c.b.c();
      str1 = String.valueOf(paramString1);
      if (str1.length() == 0) {
        break label89;
      }
    }
    label89:
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      Intent localIntent = efj.a(localbp, i, str2, paramString2, null, null, null, true);
      cgr.a(this.c, localIntent, 101);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chg
 * JD-Core Version:    0.7.0.1
 */