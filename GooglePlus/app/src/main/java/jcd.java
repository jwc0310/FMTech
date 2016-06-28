import android.content.Context;
import android.database.Cursor;

final class jcd
{
  private final Context a;
  
  jcd(Context paramContext)
  {
    this.a = paramContext;
  }
  
  final jal a(int paramInt)
  {
    Cursor localCursor = jdj.f(this.a, paramInt);
    if (localCursor == null) {
      return new jal(jam.a);
    }
    Long.valueOf(0L);
    Long.valueOf(0L);
    Long localLong1;
    for (;;)
    {
      try
      {
        localCursor.moveToFirst();
        localLong1 = Long.valueOf(localCursor.getLong(localCursor.getColumnIndex("sync_version")));
        Long localLong2 = Long.valueOf(localCursor.getLong(localCursor.getColumnIndex("viewed_sync_version")));
        localCursor.close();
        jdj.d(this.a, paramInt);
        if (localLong1.longValue() <= localLong2.longValue()) {
          break label217;
        }
        jce localjce = new jce(this.a, paramInt, localLong1.longValue());
        mbb.a(this.a, jdm.class);
        jdm.a(localjce, this.a);
        if (!localjce.n()) {
          break;
        }
        if (kbw.b(localjce.q))
        {
          localjam = jam.b;
          return new jal(localjam, localjce.q);
        }
      }
      finally
      {
        localCursor.close();
      }
      jam localjam = jam.c;
    }
    jdj.a(this.a, paramInt, localLong1.longValue());
    label217:
    return new jal(jam.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcd
 * JD-Core Version:    0.7.0.1
 */