import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class ra
  extends BaseAdapter
  implements Filterable, re
{
  public boolean a;
  public boolean b;
  public Cursor c;
  public Context d;
  public int e;
  private rb f;
  private DataSetObserver g;
  private rd h;
  
  @Deprecated
  public ra(Context paramContext, Cursor paramCursor)
  {
    a(paramContext, paramCursor, 1);
  }
  
  public ra(Context paramContext, Cursor paramCursor, int paramInt)
  {
    a(paramContext, null, 0);
  }
  
  public ra(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    a(paramContext, paramCursor, 2);
  }
  
  private void a(Context paramContext, Cursor paramCursor, int paramInt)
  {
    int i = 1;
    label25:
    int j;
    if ((paramInt & 0x1) == i)
    {
      paramInt |= 0x2;
      this.b = i;
      if (paramCursor == null) {
        break label141;
      }
      this.c = paramCursor;
      this.a = i;
      this.d = paramContext;
      if (i == 0) {
        break label147;
      }
      j = paramCursor.getColumnIndexOrThrow("_id");
      label56:
      this.e = j;
      if ((paramInt & 0x2) != 2) {
        break label153;
      }
      this.f = new rb(this);
    }
    for (this.g = new rc(this);; this.g = null)
    {
      if (i != 0)
      {
        if (this.f != null) {
          paramCursor.registerContentObserver(this.f);
        }
        if (this.g != null) {
          paramCursor.registerDataSetObserver(this.g);
        }
      }
      return;
      this.b = false;
      break;
      label141:
      i = 0;
      break label25;
      label147:
      j = -1;
      break label56;
      label153:
      this.f = null;
    }
  }
  
  public final Cursor a()
  {
    return this.c;
  }
  
  public Cursor a(CharSequence paramCharSequence)
  {
    return this.c;
  }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public void a(Cursor paramCursor)
  {
    Cursor localCursor = b(paramCursor);
    if (localCursor != null) {
      localCursor.close();
    }
  }
  
  public abstract void a(View paramView, Context paramContext, Cursor paramCursor);
  
  public Cursor b(Cursor paramCursor)
  {
    if (paramCursor == this.c) {
      return null;
    }
    Cursor localCursor = this.c;
    if (localCursor != null)
    {
      if (this.f != null) {
        localCursor.unregisterContentObserver(this.f);
      }
      if (this.g != null) {
        localCursor.unregisterDataSetObserver(this.g);
      }
    }
    this.c = paramCursor;
    if (paramCursor != null)
    {
      if (this.f != null) {
        paramCursor.registerContentObserver(this.f);
      }
      if (this.g != null) {
        paramCursor.registerDataSetObserver(this.g);
      }
      this.e = paramCursor.getColumnIndexOrThrow("_id");
      this.a = true;
      notifyDataSetChanged();
      return localCursor;
    }
    this.e = -1;
    this.a = false;
    notifyDataSetInvalidated();
    return localCursor;
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramCursor, paramViewGroup);
  }
  
  public CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return "";
    }
    return paramCursor.toString();
  }
  
  public int getCount()
  {
    if ((this.a) && (this.c != null)) {
      return this.c.getCount();
    }
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a)
    {
      this.c.moveToPosition(paramInt);
      if (paramView == null) {
        paramView = b(this.d, this.c, paramViewGroup);
      }
      a(paramView, this.d, this.c);
      return paramView;
    }
    return null;
  }
  
  public Filter getFilter()
  {
    if (this.h == null) {
      this.h = new rd(this);
    }
    return this.h;
  }
  
  public Object getItem(int paramInt)
  {
    if ((this.a) && (this.c != null))
    {
      this.c.moveToPosition(paramInt);
      return this.c;
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    long l = 0L;
    if ((this.a) && (this.c != null) && (this.c.moveToPosition(paramInt))) {
      l = this.c.getLong(this.e);
    }
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    if (!this.c.moveToPosition(paramInt)) {
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    }
    if (paramView == null) {
      paramView = a(this.d, this.c, paramViewGroup);
    }
    a(paramView, this.d, this.c);
    return paramView;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ra
 * JD-Core Version:    0.7.0.1
 */