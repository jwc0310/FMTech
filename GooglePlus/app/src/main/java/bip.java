import android.content.Context;
import com.google.android.apps.plus.service.EsService;

public final class bip
  extends bkx
{
  public bip(Context paramContext, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext, paramInt, 4, paramString, paramBoolean1, paramBoolean2, null);
  }
  
  public final void a()
  {
    bqo.b(this.j, this.h, this.a, this.b);
    if (this.b) {
      EsService.c(this.j, this.h);
    }
  }
  
  protected final void a(oks paramoks)
  {
    if ((paramoks != null) && (this.a != null)) {
      bqo.b(this.j, this.h, this.a, paramoks.a);
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
      bqo.b(localContext, i, str, bool);
      if (this.b) {
        EsService.c(this.j, this.h);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bip
 * JD-Core Version:    0.7.0.1
 */