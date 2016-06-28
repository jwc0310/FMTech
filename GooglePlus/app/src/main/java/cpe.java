import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.plus.service.EsService;

public class cpe
{
  public cpe(bbf parambbf) {}
  
  public void a(long paramLong, String paramString)
  {
    String str1 = this.a.m.getString("view_id");
    String str2;
    bbf localbbf;
    bp localbp;
    int i;
    String str3;
    long l;
    String str4;
    if (TextUtils.equals(paramString, this.a.al.b.j()))
    {
      str2 = null;
      localbbf = this.a;
      localbp = this.a.f();
      i = this.a.ar;
      str3 = this.a.al.b.j();
      l = this.a.al.b.o();
      str4 = this.a.al.b.k();
      if (paramString == null) {
        break label206;
      }
    }
    label206:
    for (boolean bool = true;; bool = false)
    {
      localbbf.ao = Integer.valueOf(EsService.a(localbp, i, str3, l, paramLong, str4, str1, true, paramString, bool, str2));
      bz localbz = this.a.x;
      coo.a(null, this.a.f().getString(aau.po), false).a(localbz, "ProgressDialogHelper:progress_dialog");
      return;
      str2 = this.a.al.b.l();
      break;
    }
  }
  
  public void a(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    String str1 = this.a.m.getString("view_id");
    if (paramString3.equals(this.a.al.b.j())) {}
    for (String str2 = null;; str2 = this.a.al.b.l())
    {
      this.a.ao = Integer.valueOf(EsService.a(this.a.f(), this.a.ar, this.a.al.b.o(), Long.valueOf(paramLong), this.a.al.b.j(), paramString1, paramString2, paramString3, this.a.al.b.k(), str1, str2, null));
      bz localbz = this.a.x;
      coo.a(null, this.a.f().getString(aau.po), false).a(localbz, "ProgressDialogHelper:progress_dialog");
      return;
    }
  }
  
  public void a(RectF paramRectF, String paramString1, String paramString2, String paramString3)
  {
    String str1 = this.a.m.getString("view_id");
    if (paramString3.equals(this.a.al.b.j())) {}
    for (String str2 = null;; str2 = this.a.al.b.l())
    {
      this.a.ao = Integer.valueOf(EsService.a(this.a.f(), this.a.ar, this.a.al.b.o(), null, this.a.al.b.j(), paramString1, paramString2, paramString3, this.a.al.b.k(), str1, str2, paramRectF));
      bz localbz = this.a.x;
      coo.a(null, this.a.f().getString(aau.po), false).a(localbz, "ProgressDialogHelper:progress_dialog");
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpe
 * JD-Core Version:    0.7.0.1
 */