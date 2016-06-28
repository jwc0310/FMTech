import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class hqf
  extends BaseAdapter
{
  private int a = 0;
  public final Context aM;
  public hqg[] aN;
  public int aO = 0;
  public boolean aP = true;
  public boolean aQ = true;
  private boolean b = true;
  private boolean c;
  
  public hqf(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  public hqf(Context paramContext, byte paramByte)
  {
    this.aM = paramContext;
    this.aN = new hqg[2];
  }
  
  public final void A()
  {
    if (this.aP) {
      return;
    }
    this.a = 0;
    int i = 0;
    if (i < this.aO)
    {
      Cursor localCursor = this.aN[i].c;
      if (localCursor != null) {}
      for (int j = localCursor.getCount();; j = 0)
      {
        if ((this.aN[i].b) && ((j != 0) || (this.aN[i].a))) {
          j++;
        }
        this.aN[i].e = j;
        this.a = (j + this.a);
        i++;
        break;
      }
    }
    this.aP = true;
  }
  
  public boolean J_()
  {
    return this.aQ;
  }
  
  public int a()
  {
    return 1;
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return 1;
  }
  
  public View a(int paramInt1, Cursor paramCursor, int paramInt2, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null) {}
    for (View localView = paramView;; localView = a(this.aM, paramInt1, paramCursor, paramInt2, paramViewGroup))
    {
      a(localView, paramInt1, paramCursor, paramInt2, paramViewGroup);
      return localView;
    }
  }
  
  public abstract View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup);
  
  public View a(Context paramContext, int paramInt, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return null;
  }
  
  public void a(int paramInt, Cursor paramCursor)
  {
    Cursor localCursor = this.aN[paramInt].c;
    if (a(localCursor, paramCursor))
    {
      if ((localCursor != null) && (!localCursor.isClosed()) && (J_())) {
        localCursor.close();
      }
      this.aN[paramInt].c = paramCursor;
      if (paramCursor != null) {
        this.aN[paramInt].d = paramCursor.getColumnIndex("_id");
      }
      this.aP = false;
      notifyDataSetChanged();
    }
  }
  
  public void a(View paramView, int paramInt, Cursor paramCursor) {}
  
  public abstract void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup);
  
  public final void a(String paramString1, String paramString2)
  {
    int i = -1 + this.aO;
    if (i >= 0)
    {
      hqg localhqg = this.aN[i];
      Cursor localCursor;
      if (localhqg != null)
      {
        localCursor = localhqg.c;
        label31:
        if (localCursor != null) {
          break label84;
        }
        new StringBuilder(34 + String.valueOf(paramString2).length()).append("partcheck s:").append(paramString2).append(" emptypart:").append(i);
      }
      for (;;)
      {
        i--;
        break;
        localCursor = null;
        break label31;
        label84:
        if (localCursor.isClosed()) {
          new StringBuilder(34 + String.valueOf(paramString2).length()).append("partcheck s:").append(paramString2).append(" stalepart:").append(i);
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    hqg localhqg = new hqg(paramBoolean1, paramBoolean2);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg2 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg2, 0, this.aO);
      this.aN = arrayOfhqg2;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i = this.aO;
    this.aO = (i + 1);
    arrayOfhqg1[i] = localhqg;
    this.aP = false;
    notifyDataSetChanged();
  }
  
  public boolean a(Cursor paramCursor1, Cursor paramCursor2)
  {
    return paramCursor1 != paramCursor2;
  }
  
  public boolean areAllItemsEnabled()
  {
    for (int i = 0; i < this.aO; i++) {
      if (this.aN[i].b) {
        return false;
      }
    }
    return true;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public final int e(int paramInt)
  {
    int i = 0;
    A();
    int k;
    for (int j = 0; i < this.aO; j = k)
    {
      k = j + this.aN[i].e;
      if ((paramInt >= j) && (paramInt < k)) {
        return i;
      }
      i++;
    }
    return -1;
  }
  
  public int e_(int paramInt)
  {
    A();
    if (this.aN[paramInt].c == null) {
      return 0;
    }
    return this.aN[paramInt].c.getCount();
  }
  
  public final int f(int paramInt)
  {
    int i = 0;
    A();
    int k;
    int m;
    for (int j = 0; i < this.aO; j = k)
    {
      k = j + this.aN[i].e;
      if ((paramInt >= j) && (paramInt < k))
      {
        m = paramInt - j;
        if (!this.aN[i].b) {
          break label73;
        }
        return m - 1;
      }
      i++;
    }
    return -1;
    label73:
    return m;
  }
  
  public final void f(boolean paramBoolean)
  {
    this.b = paramBoolean;
    if ((paramBoolean) && (this.c)) {
      notifyDataSetChanged();
    }
  }
  
  public final int g(int paramInt)
  {
    int i = 0;
    A();
    int j = 0;
    while (i < paramInt)
    {
      j += this.aN[i].e;
      i++;
    }
    return j;
  }
  
  public int getCount()
  {
    A();
    return this.a;
  }
  
  public Object getItem(int paramInt)
  {
    int i = 0;
    A();
    int k;
    for (int j = 0; i < this.aO; j = k)
    {
      k = j + this.aN[i].e;
      if ((paramInt >= j) && (paramInt < k))
      {
        int m = paramInt - j;
        if (this.aN[i].b) {
          m--;
        }
        if (m == -1) {
          return null;
        }
        Cursor localCursor = this.aN[i].c;
        localCursor.moveToPosition(m);
        return localCursor;
      }
      i++;
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    int i = 0;
    A();
    int k;
    for (int j = 0; i < this.aO; j = k)
    {
      k = j + this.aN[i].e;
      if ((paramInt >= j) && (paramInt < k))
      {
        int m = paramInt - j;
        if (this.aN[i].b) {
          m--;
        }
        if (m == -1) {
          return 0L;
        }
        if (this.aN[i].d == -1) {
          return 0L;
        }
        Cursor localCursor = this.aN[i].c;
        if ((localCursor == null) || (localCursor.isClosed()) || (!localCursor.moveToPosition(m))) {
          return 0L;
        }
        return localCursor.getLong(this.aN[i].d);
      }
      i++;
    }
    return 0L;
  }
  
  public int getItemViewType(int paramInt)
  {
    int i = 0;
    A();
    int k;
    for (int j = 0; i < this.aO; j = k)
    {
      k = j + this.aN[i].e;
      if ((paramInt >= j) && (paramInt < k))
      {
        int m = paramInt - j;
        if ((this.aN[i].b) && (m == 0)) {
          return -1;
        }
        return a(i, m);
      }
      i++;
    }
    throw new ArrayIndexOutOfBoundsException(paramInt);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 0;
    A();
    int k;
    for (int j = 0; i < this.aO; j = k)
    {
      k = j + this.aN[i].e;
      if ((paramInt >= j) && (paramInt < k))
      {
        int m = paramInt - j;
        if (this.aN[i].b) {
          m--;
        }
        Cursor localCursor;
        if (m == -1)
        {
          localCursor = this.aN[i].c;
          if (paramView != null) {
            a(paramView, i, localCursor);
          }
        }
        for (;;)
        {
          if (paramView != null) {
            return paramView;
          }
          throw new NullPointerException(69 + "View should not be null, partition: " + i + " position: " + m);
          paramView = a(this.aM, i, localCursor, paramViewGroup);
          break;
          if (!this.aN[i].c.moveToPosition(m)) {
            throw new IllegalStateException(44 + "Couldn't move cursor to position " + m);
          }
          paramView = a(i, this.aN[i].c, m, paramView, paramViewGroup);
        }
      }
      i++;
    }
    throw new ArrayIndexOutOfBoundsException(paramInt);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 1 + a();
  }
  
  public boolean isEnabled(int paramInt)
  {
    A();
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      int m;
      if (i < this.aO)
      {
        k = j + this.aN[i].e;
        if ((paramInt < j) || (paramInt >= k)) {
          break label72;
        }
        m = paramInt - j;
        if ((!this.aN[i].b) || (m != 0)) {}
      }
      else
      {
        return false;
      }
      return b(i, m);
      label72:
      i++;
    }
  }
  
  public void notifyDataSetChanged()
  {
    if (this.b)
    {
      this.c = false;
      super.notifyDataSetChanged();
      return;
    }
    this.c = true;
  }
  
  public final void y()
  {
    for (int i = 0; i < this.aO; i++) {
      this.aN[i].c = null;
    }
    this.aP = false;
    notifyDataSetChanged();
  }
  
  public final void z()
  {
    for (int i = 0; i < this.aO; i++)
    {
      Cursor localCursor = this.aN[i].c;
      if ((localCursor != null) && (!localCursor.isClosed()))
      {
        localCursor.close();
        this.aN[i].c = null;
      }
    }
    this.aO = 0;
    this.aP = false;
    notifyDataSetChanged();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqf
 * JD-Core Version:    0.7.0.1
 */