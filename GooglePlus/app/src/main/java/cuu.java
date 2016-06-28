import android.content.Context;
import android.net.Uri;
import java.util.List;

public final class cuu
  implements jaq
{
  private Context a;
  private giz b;
  private boolean c = false;
  private boolean d = false;
  
  public cuu(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final jar a(int paramInt)
  {
    boolean bool1 = cux.d(this.a, paramInt);
    if (bool1) {}
    for (Uri localUri = cux.c(this.a, paramInt);; localUri = null)
    {
      boolean bool2 = cux.b(this.a, paramInt);
      boolean bool3 = cux.a(this.a, paramInt);
      return new jas().b(true).a(true).c(true).a(Integer.valueOf(efj.sc)).b(Integer.valueOf(aau.cf)).c(Integer.valueOf(efj.jY)).a(localUri).a(bool1).b(bool2).c(bool3).a();
    }
  }
  
  public final String a()
  {
    return "GPLUS_APP_COMPONENT";
  }
  
  public final String b()
  {
    return String.valueOf("GPLUS_APP_COMPONENT").concat("_android_component");
  }
  
  public final String c()
  {
    return "862067606707";
  }
  
  public final boolean d()
  {
    if (!this.d)
    {
      List localList = this.b.a();
      for (int i = 0; i < localList.size(); i++)
      {
        int j = ((Integer)localList.get(i)).intValue();
        if ((this.b.c(j)) && (this.b.a(j).c("is_google_plus")))
        {
          this.c = ((hyi)mbb.a(this.a, hyi.class)).b(bwb.i, j);
          if (this.c) {
            break;
          }
        }
      }
      this.d = true;
    }
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cuu
 * JD-Core Version:    0.7.0.1
 */