import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

public class hai
  extends haa
  implements hwu
{
  private boolean d;
  private bk e;
  private String f;
  
  public hai(Context paramContext, bw parambw)
  {
    super(paramContext, parambw);
  }
  
  public final Context a()
  {
    return this.a;
  }
  
  public final void a(bk parambk, String paramString, boolean paramBoolean)
  {
    this.e = parambk;
    this.f = null;
    this.d = paramBoolean;
  }
  
  public final void a(String paramString)
  {
    bj localbj = (bj)this.b.a("bg_task_progress_dialog");
    if ((localbj != null) && (TextUtils.equals(paramString, localbj.m.getString("arg_task_tag")))) {
      localbj.a(false);
    }
  }
  
  @SuppressLint({"InlinedApi"})
  public final void a(String paramString1, String paramString2)
  {
    this.c = false;
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    lut locallut = lut.a(paramString1, paramString2, this.a.getString(17039370), null, 17301543, 16843605);
    if (this.e != null)
    {
      locallut.n = this.e;
      locallut.p = 0;
    }
    locallut.b(this.d);
    try
    {
      locallut.a(this.b, this.f);
      return;
    }
    catch (Exception localException)
    {
      Log.e("BackgroundTaskUiHelper", "AlertFragmentDialog.show threw exception", localException);
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((bj)this.b.a("bg_task_progress_dialog") == null)
    {
      luv localluv = luv.a(null, paramString1, paramString2, false, true, this.e);
      localluv.m.putString("arg_task_tag", paramString3);
      localluv.b(paramBoolean);
      localluv.a(this.b, "bg_task_progress_dialog");
    }
  }
  
  public boolean a(Context paramContext, hae paramhae, int paramInt)
  {
    boolean bool1 = false;
    if (paramhae != null)
    {
      boolean bool2 = TextUtils.isEmpty(paramhae.d);
      bool1 = false;
      if (!bool2)
      {
        this.c = false;
        Toast.makeText(paramContext, paramhae.d, 0).show();
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean a(hae paramhae)
  {
    if (hae.a(paramhae))
    {
      Exception localException = paramhae.c;
      Iterator localIterator = mbb.c(this.a, hwv.class).iterator();
      while (localIterator.hasNext()) {
        if (((hwv)localIterator.next()).a(localException, this)) {
          this.c = false;
        }
      }
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return a(this.a, paramhae, 0);
  }
  
  public final bw b()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hai
 * JD-Core Version:    0.7.0.1
 */