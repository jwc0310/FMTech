import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class jcy
{
  private static final String a = jdr.a(jcy.class);
  private static final String[] b = { "name" };
  
  static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    int j = 1;
    while (j != 0)
    {
      int k = i + 1;
      if (i >= 5) {
        break;
      }
      Cursor localCursor = paramSQLiteDatabase.query("sqlite_master", b, "type='table'", null, null, null, null);
      if (localCursor != null)
      {
        j = 0;
        try
        {
          for (;;)
          {
            if (localCursor.moveToNext())
            {
              String str1 = localCursor.getString(0);
              if (str1.startsWith("android_")) {
                continue;
              }
              boolean bool = str1.startsWith("sqlite_");
              if (bool) {
                continue;
              }
              try
              {
                String str4 = String.valueOf("DROP TABLE IF EXISTS ");
                String str5 = String.valueOf(str1);
                if (str5.length() != 0) {}
                for (String str6 = str4.concat(str5);; str6 = new String(str4))
                {
                  paramSQLiteDatabase.execSQL(str6);
                  j = 1;
                  break;
                }
              }
              catch (SQLException localSQLException)
              {
                String str2 = a;
                String str3 = String.valueOf(localSQLException);
                jdr.b(str2, 22 + String.valueOf(str1).length() + String.valueOf(str3).length() + "unable to drop table " + str1 + " " + str3);
              }
            }
          }
        }
        finally
        {
          localCursor.close();
        }
        i = k;
      }
      else
      {
        i = k;
        j = 0;
      }
    }
  }
  
  static void b(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("sqlite_master", b, "type='view'", null, null, null, null);
    if (localCursor != null)
    {
      label155:
      for (;;)
      {
        try
        {
          if (!localCursor.moveToNext()) {
            break;
          }
          String str1 = localCursor.getString(0);
          String str4;
          try
          {
            str4 = String.valueOf("DROP VIEW IF EXISTS ");
            String str5 = String.valueOf(str1);
            if (str5.length() == 0) {
              break label155;
            }
            str6 = str4.concat(str5);
            paramSQLiteDatabase.execSQL(str6);
          }
          catch (SQLException localSQLException)
          {
            String str2 = a;
            String str3 = String.valueOf(localSQLException);
            jdr.b(str2, 21 + String.valueOf(str1).length() + String.valueOf(str3).length() + "unable to drop view " + str1 + " " + str3);
          }
          continue;
          String str6 = new String(str4);
        }
        finally
        {
          localCursor.close();
        }
      }
      localCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcy
 * JD-Core Version:    0.7.0.1
 */