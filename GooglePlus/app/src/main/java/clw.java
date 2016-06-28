import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.plus.service.EsService;

public final class clw
  extends cos
{
  Integer a;
  
  public clw(Context paramContext, int paramInt, cow paramcow)
  {
    super(paramContext, paramInt, paramcow);
  }
  
  public final void a()
  {
    if (this.a != null) {
      return;
    }
    ojj localojj = new ojj();
    localojj.f = Boolean.valueOf(true);
    localojj.g = Boolean.valueOf(false);
    EsService.a(this.g, new clx(this));
    this.a = Integer.valueOf(EsService.a(this.g, this.f, localojj));
  }
  
  protected final void a(View paramView)
  {
    b(paramView, this.g.getString(aau.rK));
    int i = aau.rJ;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = efj.a(this.g, "google_drive", "https://support.google.com/plus/?hl=%locale%").toString();
    a(paramView, i, arrayOfObject);
  }
  
  public final boolean a(ojj paramojj)
  {
    if (!super.a(paramojj)) {
      return false;
    }
    boolean bool1 = ((giz)mbb.a(this.g, giz.class)).a(this.f).c("is_dasher_account");
    if ((paramojj != null) && (!bool1))
    {
      Boolean localBoolean = paramojj.f;
      if (localBoolean == null) {}
      for (boolean bool2 = false; !bool2; bool2 = localBoolean.booleanValue()) {
        return true;
      }
    }
    return false;
  }
  
  public final void b()
  {
    if (this.a != null) {
      return;
    }
    f();
  }
  
  public final int d()
  {
    return efj.vY;
  }
  
  public final coq e()
  {
    return coq.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clw
 * JD-Core Version:    0.7.0.1
 */