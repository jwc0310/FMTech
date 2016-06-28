import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;

public final class lef
  extends aga<lei>
{
  public leb c;
  public leh d;
  public lec e;
  public Cursor f;
  public boolean g;
  public boolean h;
  public boolean i;
  public int j;
  public boolean k;
  private final agi l;
  private final lej m;
  private final kxq n;
  private final led o;
  private final djg p;
  private final Context q;
  private Drawable r;
  
  public lef(Context paramContext, led paramled, djg paramdjg)
  {
    this.q = paramContext;
    this.o = paramled;
    this.n = ((kxq)mbb.a(paramContext, kxq.class));
    this.m = ((lej)mbb.a(paramContext, lej.class));
    this.p = paramdjg;
    this.l = new agi(paramContext.getResources().getDimensionPixelSize(efj.Kg), -2);
    int i1 = paramContext.getResources().getDimensionPixelSize(efj.Kh);
    this.l.setMargins(i1, i1, i1, i1);
    this.r = paramContext.getResources().getDrawable(efj.XM);
    if (this.a.a()) {
      throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
    this.b = true;
  }
  
  public final int a()
  {
    if (this.f == null) {}
    for (int i1 = 0;; i1 = this.f.getCount())
    {
      if (this.g) {
        i1++;
      }
      if (this.i)
      {
        if ((this.f != null) && (this.f.getCount() > 0)) {
          i1++;
        }
        if (this.j > 0) {
          i1++;
        }
      }
      if (this.h) {
        i1++;
      }
      if (this.k) {
        i1++;
      }
      return i1;
    }
  }
  
  public final int a(int paramInt)
  {
    int i1 = 5;
    if (this.i)
    {
      if (paramInt == 0) {
        if (this.j > 0) {
          i1 = 4;
        }
      }
      do
      {
        return i1;
        if (paramInt < 1 + this.j) {
          return 3;
        }
      } while ((paramInt == 1 + this.j) && (this.j > 0));
    }
    if ((this.g) && (paramInt == 0)) {
      return 1;
    }
    int i2 = -1 + a();
    if ((this.h) && (paramInt == i2)) {
      return 2;
    }
    if ((this.k) && (paramInt == i2)) {
      return 6;
    }
    return 0;
  }
  
  public final void a(Cursor paramCursor)
  {
    if (this.f == paramCursor) {
      return;
    }
    if (this.f != null) {
      this.f.close();
    }
    this.f = paramCursor;
    this.a.b();
  }
  
  public final int b(int paramInt1, int paramInt2)
  {
    if ((this.g) && (paramInt2 == 0)) {
      paramInt1--;
    }
    do
    {
      do
      {
        return paramInt1;
      } while (!this.i);
      if ((paramInt2 == 3) || ((paramInt2 == 0) && (this.j == 0))) {
        return paramInt1 - 1;
      }
    } while ((paramInt2 != 0) || (this.j <= 0));
    return paramInt1 - 2;
  }
  
  public final long b(int paramInt)
  {
    long l1;
    if ((this.f == null) || (this.f.getCount() == 0))
    {
      l1 = paramInt;
      return l1;
    }
    int i1 = a(paramInt);
    switch (i1)
    {
    case 3: 
    default: 
      this.f.moveToPosition(b(paramInt, i1));
      String str = this.f.getString(this.f.getColumnIndex("square_id"));
      int i2 = str.length();
      l1 = 1125899906842597L;
      int i3 = 0;
      while (i3 < i2)
      {
        long l2 = l1 * 31L + str.charAt(i3);
        i3++;
        l1 = l2;
      }
    case 4: 
      return efj.XV;
    case 5: 
      return efj.XY;
    case 2: 
      return efj.XW;
    case 1: 
      return efj.XU;
    }
    return efj.XX;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lef
 * JD-Core Version:    0.7.0.1
 */