import android.content.Context;
import com.google.android.apps.plus.service.EsService;

public final class bla
  extends bkx
{
  public bla(Context paramContext, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte)
  {
    super(paramContext, paramInt, 4, paramString, paramBoolean1, paramBoolean2, paramArrayOfByte);
  }
  
  public final void a()
  {
    lmp.a(this.j, this.h, this.a, this.b);
    if (this.b)
    {
      if (((jaq)mbb.a(this.j, jaq.class)).d()) {
        ((izy)mbb.a(this.j, izy.class)).a(this.h, true);
      }
    }
    else {
      return;
    }
    EsService.c(this.j, this.h);
  }
  
  protected final void a(oks paramoks)
  {
    if (paramoks != null) {
      lmp.a(this.j, this.h, this.a, paramoks.a);
    }
  }
  
  protected final void b()
  {
    Context localContext = this.j;
    int i = this.h;
    String str = this.a;
    if (!this.b) {}
    for (boolean bool = true;; bool = false)
    {
      lmp.a(localContext, i, str, bool);
      if (this.b) {
        EsService.c(this.j, this.h);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bla
 * JD-Core Version:    0.7.0.1
 */