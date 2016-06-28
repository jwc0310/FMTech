import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;

final class hhr
  extends aga<hhu>
{
  boolean c;
  boolean d;
  private final int e;
  private final agi f;
  private final hgz g;
  private final hha h;
  private final kxq i;
  private final Context j;
  private final dat k;
  private final djg l;
  private Cursor m;
  private boolean n;
  
  hhr(Context paramContext, dat paramdat, djg paramdjg)
  {
    this.j = paramContext;
    this.h = ((hha)mbb.a(paramContext, hha.class));
    this.i = ((kxq)mbb.a(paramContext, kxq.class));
    this.g = ((hgz)mbb.a(paramContext, hgz.class));
    this.e = ((git)mbb.a(paramContext, git.class)).c();
    this.k = paramdat;
    this.l = paramdjg;
    this.f = new agi(paramContext.getResources().getDimensionPixelSize(efj.Kg), -2);
    int i1 = paramContext.getResources().getDimensionPixelSize(efj.Kh);
    this.f.setMargins(i1, i1, i1, i1);
  }
  
  public final int a()
  {
    if ((this.n) || (this.d)) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (this.c) {
        i1++;
      }
      Cursor localCursor = this.m;
      int i2 = 0;
      if (localCursor == null) {}
      for (;;)
      {
        return i1 + i2;
        i2 = this.m.getCount();
      }
    }
  }
  
  public final int a(int paramInt)
  {
    if ((this.c) && (paramInt == 0)) {
      return 1;
    }
    if (paramInt == -1 + a())
    {
      if (this.n) {
        return 2;
      }
      if (this.d) {
        return 3;
      }
    }
    return 0;
  }
  
  public final void a(Cursor paramCursor)
  {
    if ((paramCursor == null) || (this.m == paramCursor))
    {
      this.a.b();
      return;
    }
    if (this.m != null) {
      this.m.close();
    }
    this.m = paramCursor;
    this.a.b();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.m == null) {}
    for (int i1 = 0;; i1 = this.m.getCount())
    {
      boolean bool = false;
      if (i1 > 0)
      {
        bool = false;
        if (paramBoolean) {
          bool = true;
        }
      }
      this.n = bool;
      this.a.b();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hhr
 * JD-Core Version:    0.7.0.1
 */