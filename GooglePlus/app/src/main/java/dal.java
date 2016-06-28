import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashSet;

public final class dal
  extends hqh
{
  public final HashSet<String> a = new HashSet();
  public boolean b = false;
  private ArrayList<Integer> c = new ArrayList();
  private int d = -1;
  private int e = 0;
  private final boolean f;
  private final int g;
  private final int h;
  private final boolean i;
  
  public dal(Cursor paramCursor)
  {
    super(paramCursor);
    a();
    this.f = false;
    this.g = 0;
    this.h = 0;
    this.i = false;
  }
  
  public dal(Cursor paramCursor, int paramInt1, int paramInt2)
  {
    super(paramCursor);
    this.f = true;
    this.g = paramInt1;
    this.i = true;
    this.h = paramInt2;
    a();
  }
  
  private final boolean a(int paramInt)
  {
    return ((this.h == 4) && (paramInt == 3)) || ((this.h == 2) && (paramInt != 3));
  }
  
  public final void a()
  {
    this.c.clear();
    if ((!this.b) && (super.moveToFirst()))
    {
      String str = super.getString(9);
      int j = super.getInt(11);
      int k = super.getInt(10);
      int m;
      label56:
      int n;
      if (!this.a.contains(str))
      {
        m = 1;
        if (this.f)
        {
          if (!this.i) {
            break label175;
          }
          if (m == 0) {
            break label169;
          }
          if (((this.g != 2) || (j == 0)) && ((this.g != 1) || (j != 0))) {
            break label163;
          }
          n = 1;
          label102:
          if ((n == 0) || (!a(k))) {
            break label169;
          }
          m = 1;
        }
      }
      for (;;)
      {
        if (m != 0) {
          this.c.add(Integer.valueOf(super.getPosition()));
        }
        if (super.moveToNext()) {
          break;
        }
        this.e = this.c.size();
        return;
        m = 0;
        break label56;
        label163:
        n = 0;
        break label102;
        label169:
        m = 0;
        continue;
        label175:
        if ((m != 0) && (a(k))) {
          m = 1;
        } else {
          m = 0;
        }
      }
    }
    this.e = 0;
  }
  
  public final int getCount()
  {
    return this.e;
  }
  
  public final int getPosition()
  {
    return this.d;
  }
  
  public final boolean isAfterLast()
  {
    if (getCount() == 0) {}
    while (this.d == getCount()) {
      return true;
    }
    return false;
  }
  
  public final boolean isBeforeFirst()
  {
    if (getCount() == 0) {}
    while (this.d == -1) {
      return true;
    }
    return false;
  }
  
  public final boolean isFirst()
  {
    return (this.d == 0) && (getCount() != 0);
  }
  
  public final boolean isLast()
  {
    int j = getCount();
    return (this.d == j - 1) && (j != 0);
  }
  
  public final boolean move(int paramInt)
  {
    return moveToPosition(paramInt + this.d);
  }
  
  public final boolean moveToFirst()
  {
    return moveToPosition(0);
  }
  
  public final boolean moveToLast()
  {
    return moveToPosition(-1 + getCount());
  }
  
  public final boolean moveToNext()
  {
    return moveToPosition(1 + this.d);
  }
  
  public final boolean moveToPosition(int paramInt)
  {
    if ((!super.isClosed()) && (this.c != null) && (paramInt < this.c.size())) {}
    for (boolean bool = super.moveToPosition(((Integer)this.c.get(paramInt)).intValue());; bool = false)
    {
      if (bool) {
        this.d = paramInt;
      }
      return bool;
    }
  }
  
  public final boolean moveToPrevious()
  {
    return moveToPosition(-1 + this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dal
 * JD-Core Version:    0.7.0.1
 */