import android.content.Context;
import com.google.android.apps.plus.service.EsService;

public final class bms
  extends bkx
{
  private String c;
  
  public bms(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext, paramInt, 1, paramString2, paramBoolean1, paramBoolean2, null);
    this.c = paramString1;
  }
  
  public final void a()
  {
    lmp.a(this.j, this.h, this.c, this.b);
    if (this.b) {
      EsService.c(this.j, this.h);
    }
  }
  
  protected final void a(oks paramoks)
  {
    if (paramoks != null) {
      lmp.a(this.j, this.h, this.c, paramoks.a);
    }
  }
  
  protected final void b()
  {
    Context localContext = this.j;
    int i = this.h;
    String str = this.c;
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
 * Qualified Name:     bms
 * JD-Core Version:    0.7.0.1
 */