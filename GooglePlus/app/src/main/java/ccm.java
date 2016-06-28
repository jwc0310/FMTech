import android.content.Context;
import android.database.Cursor;
import java.util.Arrays;

public final class ccm
  extends hqj
{
  private static final String[] r = { "_id", "item_type", "header_type", "event_data", "event_type", "past_event", "author_gaia_id", "author_avatar_url" };
  private final int s;
  
  public ccm(Context paramContext, int paramInt)
  {
    super(paramContext, hxi.a);
    this.s = paramInt;
  }
  
  private final void a(hqr paramhqr, Cursor paramCursor, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, Object[] paramArrayOfObject)
  {
    int i;
    label86:
    label100:
    String str1;
    String str2;
    if (((paramInt1 >= 0) && (!paramBoolean2)) || ((paramInt1 < paramCursor.getCount()) && (paramBoolean2)))
    {
      Object[] arrayOfObject = new Object[r.length];
      arrayOfObject[0] = Integer.valueOf(paramhqr.getCount());
      arrayOfObject[1] = Integer.valueOf(0);
      arrayOfObject[2] = Integer.valueOf(paramInt2);
      paramhqr.a(arrayOfObject);
      if (paramBoolean2)
      {
        i = -1;
        paramCursor.moveToPosition(i + paramInt1);
        if (!paramBoolean2) {
          break label222;
        }
        if (!paramCursor.moveToNext()) {
          break label231;
        }
        byte[] arrayOfByte = paramCursor.getBlob(1);
        int j = paramCursor.getInt(2);
        str1 = paramCursor.getString(3);
        str2 = paramCursor.getString(4);
        paramArrayOfObject[0] = Integer.valueOf(paramhqr.getCount());
        paramArrayOfObject[1] = Integer.valueOf(1);
        paramArrayOfObject[3] = arrayOfByte;
        paramArrayOfObject[4] = Integer.valueOf(j);
        if (!paramBoolean1) {
          break label232;
        }
      }
    }
    label222:
    label231:
    label232:
    for (int k = 1;; k = 0)
    {
      paramArrayOfObject[5] = Integer.valueOf(k);
      paramArrayOfObject[6] = str1;
      paramArrayOfObject[7] = str2;
      paramhqr.a(paramArrayOfObject);
      Arrays.fill(paramArrayOfObject, null);
      break label86;
      i = 1;
      break;
      if (paramCursor.moveToPrevious()) {
        break label100;
      }
      return;
    }
  }
  
  public final Cursor o()
  {
    Context localContext = this.l;
    int i = this.s;
    System.currentTimeMillis();
    Cursor localCursor = bqo.a(localContext, i, ccn.a);
    if (localCursor != null)
    {
      hqr localhqr = new hqr(r);
      long l = System.currentTimeMillis();
      Object[] arrayOfObject = new Object[r.length];
      int j = localCursor.getCount();
      while (localCursor.moveToNext())
      {
        hxj localhxj = bqo.a(localCursor, 1, 2);
        if (localhxj != null) {
          if (!bqo.a(localhxj, l)) {
            j = localCursor.getPosition();
          }
        }
      }
      a(localhqr, localCursor, j, 2, false, true, arrayOfObject);
      a(localhqr, localCursor, j - 1, 1, true, false, arrayOfObject);
      localCursor.close();
      return localhqr;
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccm
 * JD-Core Version:    0.7.0.1
 */