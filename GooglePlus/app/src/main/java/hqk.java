import android.database.Cursor;
import android.database.DataSetObserver;

public final class hqk
  implements hqs<Cursor, Long>
{
  private final Cursor a;
  private final int b;
  
  public hqk(Cursor paramCursor)
  {
    this.a = paramCursor;
    if (paramCursor != null) {}
    for (int i = paramCursor.getColumnIndexOrThrow("_id");; i = -1)
    {
      this.b = i;
      return;
    }
  }
  
  public final int a()
  {
    if (b()) {
      return this.a.getCount();
    }
    return 0;
  }
  
  public final void a(DataSetObserver paramDataSetObserver)
  {
    if (b()) {
      this.a.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public final boolean a(int paramInt)
  {
    return (b()) && (this.a.moveToPosition(paramInt));
  }
  
  public final void b(DataSetObserver paramDataSetObserver)
  {
    if (b()) {
      this.a.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
  
  public final boolean b()
  {
    return (this.a != null) && (!this.a.isClosed());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqk
 * JD-Core Version:    0.7.0.1
 */