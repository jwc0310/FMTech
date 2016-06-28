import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public final class gwc
{
  final hgs a;
  
  gwc(Context paramContext)
  {
    this.a = ((hgs)mbb.a(paramContext, hgs.class));
  }
  
  public static gwb a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    hsn localhsn = new hsn(paramSQLiteDatabase);
    localhsn.a = "album_upload_batch";
    localhsn.b = gwd.a;
    localhsn.c = "_id = ?";
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(paramLong);
    localhsn.d = arrayOfString;
    localhsn.f = "1";
    Cursor localCursor = localhsn.a();
    try
    {
      boolean bool = localCursor.moveToNext();
      gwb localgwb = null;
      if (bool) {
        localgwb = new gwb(paramLong, localCursor.getString(localCursor.getColumnIndex("album_id")), localCursor.getLong(localCursor.getColumnIndexOrThrow("created_time")));
      }
      return localgwb;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  static List<Long> a(Cursor paramCursor)
  {
    localArrayList = new ArrayList();
    try
    {
      if (paramCursor.moveToNext()) {
        localArrayList.add(Long.valueOf(paramCursor.getLong(paramCursor.getColumnIndex("_id"))));
      }
      return localArrayList;
    }
    finally
    {
      paramCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwc
 * JD-Core Version:    0.7.0.1
 */