import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

final class cpq
  extends hqj
{
  private boolean r;
  private final fv s = new fv(this);
  
  public cpq(Context paramContext, Uri paramUri)
  {
    super(paramContext, paramUri);
  }
  
  protected final void g()
  {
    super.g();
    if (!this.r)
    {
      this.l.getContentResolver().registerContentObserver(hbu.a(this.l), false, this.s);
      this.r = true;
    }
  }
  
  protected final void l()
  {
    if (this.r)
    {
      this.l.getContentResolver().unregisterContentObserver(this.s);
      this.r = false;
    }
  }
  
  public final Cursor o()
  {
    Cursor localCursor = this.l.getContentResolver().query(hbu.a(this.l), cpt.a, null, null, "media_url DESC, upload_reason ASC");
    hqr localhqr = new hqr(cpt.a);
    Object[] arrayOfObject = new Object[cpt.a.length];
    if (localCursor != null) {
      for (;;)
      {
        try
        {
          if (!localCursor.moveToNext()) {
            break label303;
          }
          long l1 = localCursor.getLong(0);
          String str1 = localCursor.getString(2);
          long l2 = localCursor.getLong(1);
          int i = localCursor.getInt(3);
          int j = localCursor.getInt(4);
          int k = localCursor.getInt(6);
          long l3 = localCursor.getLong(7);
          long l4 = localCursor.getLong(8);
          long l5 = localCursor.getLong(9);
          if (arrayOfObject[0] != null)
          {
            String str2 = (String)arrayOfObject[2];
            if (((Integer)arrayOfObject[6]).intValue() != 0) {
              break label297;
            }
            m = 1;
            if ((l2 == -1L) || (!TextUtils.equals(str1, str2)) || (m == 0))
            {
              localhqr.a(arrayOfObject);
              Arrays.fill(arrayOfObject, null);
            }
          }
          arrayOfObject[0] = Long.valueOf(l1);
          arrayOfObject[1] = Long.valueOf(l2);
          arrayOfObject[2] = str1;
          arrayOfObject[3] = Integer.valueOf(i);
          arrayOfObject[4] = Integer.valueOf(j);
          arrayOfObject[6] = Integer.valueOf(k);
          arrayOfObject[7] = Long.valueOf(l3);
          arrayOfObject[8] = Long.valueOf(l4);
          arrayOfObject[9] = Long.valueOf(l5);
          break;
        }
        finally
        {
          if (localCursor != null) {
            localCursor.close();
          }
        }
        label297:
        int m = 0;
      }
    }
    label303:
    if (arrayOfObject[0] != null) {
      localhqr.a(arrayOfObject);
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return localhqr;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpq
 * JD-Core Version:    0.7.0.1
 */