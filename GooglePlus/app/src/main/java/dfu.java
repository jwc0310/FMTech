import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

public final class dfu
  extends hqo<Cursor, Long>
{
  private final ipf h;
  private boolean i;
  private boolean j;
  private boolean k;
  
  public dfu(Context paramContext, bw parambw, ipf paramipf, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramContext, parambw, null);
    this.h = paramipf;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.k = paramBoolean3;
    hqr localhqr = new hqr(new String[] { "_id" });
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0);
    localhqr.a(arrayOfObject);
    a(new hqk(localhqr), 0);
  }
  
  public final bk a(Context paramContext, hqs<Cursor, Long> paramhqs, int paramInt)
  {
    Cursor localCursor = (Cursor)paramhqs.c();
    localCursor.moveToPosition(paramInt);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("photo_ref", this.h);
    localBundle.putBoolean("prevent_edit", this.i);
    localBundle.putBoolean("prevent_share", this.j);
    localBundle.putBoolean("prevent_delete", this.k);
    localBundle.putString("pager_identifier", Integer.toString(localCursor.getPosition()));
    bem localbem = new bem();
    localbem.f(localBundle);
    localbem.e(true);
    return localbem;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfu
 * JD-Core Version:    0.7.0.1
 */