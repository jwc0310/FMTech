import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.apps.plus.service.EsService;

public final class caf
  extends cos
{
  int a;
  private boolean b;
  
  public caf(Context paramContext, int paramInt, cow paramcow)
  {
    super(paramContext, paramInt, paramcow);
  }
  
  public final void a()
  {
    if (this.b) {
      return;
    }
    this.b = true;
    ojj localojj = new ojj();
    localojj.c = Boolean.valueOf(true);
    localojj.d = Boolean.valueOf(true);
    EsService.a(this.g, new cag(this));
    this.a = EsService.a(this.g, this.f, localojj);
  }
  
  protected final void a(View paramView)
  {
    b(paramView, this.g.getString(aau.rN));
    int i = aau.rL;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = efj.a(this.g, "find_my_face", "https://support.google.com/plus/?hl=%locale%").toString();
    a(paramView, i, arrayOfObject);
  }
  
  public final boolean a(ojj paramojj)
  {
    if ((Build.VERSION.SDK_INT <= 15) || (!super.a(paramojj))) {
      return false;
    }
    boolean bool1 = ((giz)mbb.a(this.g, giz.class)).a(this.f).c("is_plus_page");
    if ((paramojj != null) && (!bool1))
    {
      Boolean localBoolean1 = paramojj.b;
      boolean bool2;
      Boolean localBoolean2;
      if (localBoolean1 == null)
      {
        bool2 = false;
        if (!bool2) {
          break label112;
        }
        localBoolean2 = paramojj.c;
        if (localBoolean2 != null) {
          break label102;
        }
      }
      label102:
      for (boolean bool3 = false;; bool3 = localBoolean2.booleanValue())
      {
        if (bool3) {
          break label112;
        }
        return true;
        bool2 = localBoolean1.booleanValue();
        break;
      }
    }
    label112:
    return false;
  }
  
  public final void b()
  {
    f();
  }
  
  public final int d()
  {
    return efj.tL;
  }
  
  public final coq e()
  {
    return coq.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     caf
 * JD-Core Version:    0.7.0.1
 */