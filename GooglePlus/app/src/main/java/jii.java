import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class jii
{
  public static final String[] a = { "gaia_id", "name", "avatar", "in_my_circles" };
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, List<ojv> paramList)
  {
    int i = 0;
    int j = paramList.size();
    int k;
    if (i < j)
    {
      k = i + 75;
      if (k <= j) {
        break label505;
      }
    }
    label505:
    for (int m = j;; m = k)
    {
      HashMap localHashMap = new HashMap();
      StringBuilder localStringBuilder = new StringBuilder();
      ArrayList localArrayList = new ArrayList();
      localStringBuilder.append("gaia_id IN(");
      for (int n = i; n < m; n++)
      {
        ojv localojv2 = (ojv)paramList.get(n);
        if ((!TextUtils.isEmpty(localojv2.b)) && (!TextUtils.equals("0", localojv2.b)) && (!TextUtils.isEmpty(localojv2.c)))
        {
          localStringBuilder.append("?,");
          localArrayList.add(localojv2.b);
        }
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      localStringBuilder.append(')');
      if (!localArrayList.isEmpty())
      {
        Cursor localCursor = paramSQLiteDatabase.query("contacts", a, localStringBuilder.toString(), (String[])localArrayList.toArray(new String[0]), null, null, null);
        for (;;)
        {
          try
          {
            if (!localCursor.moveToNext()) {
              break;
            }
            jij localjij = new jij();
            String str1 = localCursor.getString(0);
            localjij.a = localCursor.getString(1);
            localjij.b = localCursor.getString(2);
            boolean bool;
            if (localCursor.getInt(3) != 0)
            {
              bool = true;
              localjij.c = bool;
              localHashMap.put(str1, localjij);
            }
            else
            {
              bool = false;
            }
          }
          finally
          {
            localCursor.close();
          }
        }
        localCursor.close();
        int i1 = i;
        if (i1 < m)
        {
          ojv localojv1 = (ojv)paramList.get(i1);
          String str2 = localojv1.b;
          String str3 = localojv1.c;
          if ((TextUtils.isEmpty(str2)) || (TextUtils.equals("0", str2)) || (TextUtils.isEmpty(str3))) {
            if (Log.isLoggable("PeopleData", 3))
            {
              String str4 = String.valueOf(localojv1.b);
              String str5 = String.valueOf(localojv1.c);
              new StringBuilder(55 + String.valueOf(str4).length() + String.valueOf(str5).length()).append(">>>>> Person id: ").append(str4).append(", name: ").append(str5).append("; *** Skip. No gaia id or name");
            }
          }
          for (;;)
          {
            i1++;
            break;
            a(paramSQLiteDatabase, str2, str3, localojv1.d, (jij)localHashMap.get(str2));
          }
        }
      }
      i = m;
      break;
      return;
    }
  }
  
  public static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, jij paramjij)
  {
    ContentValues localContentValues = new ContentValues(4);
    String str1 = hdo.a(paramString3);
    String str3;
    boolean bool2;
    if (paramjij == null)
    {
      if (Log.isLoggable("PeopleData", 3)) {
        new StringBuilder(35 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> Inserting person id: ").append(paramString1).append(", name: ").append(paramString2);
      }
      String str2 = String.valueOf(paramString1);
      if (str2.length() != 0)
      {
        str3 = "g:".concat(str2);
        localContentValues.put("person_id", str3);
        localContentValues.put("gaia_id", paramString1);
        localContentValues.put("name", paramString2);
        localContentValues.put("avatar", str1);
        paramSQLiteDatabase.insertWithOnConflict("contacts", null, localContentValues, 4);
        bool2 = true;
      }
    }
    boolean bool3;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        str3 = new String("g:");
        break;
        if (!TextUtils.equals(paramString2, paramjij.a)) {
          break label209;
        }
        bool1 = paramjij.c;
        bool2 = false;
      } while (bool1);
      bool3 = TextUtils.equals(str1, paramjij.b);
      bool2 = false;
    } while (bool3);
    label209:
    if (Log.isLoggable("PeopleData", 3)) {
      new StringBuilder(34 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(">>>>> Updating person id: ").append(paramString1).append(", name: ").append(paramString2);
    }
    localContentValues.put("name", paramString2);
    if (!paramjij.c) {
      localContentValues.put("avatar", str1);
    }
    paramSQLiteDatabase.update("contacts", localContentValues, "gaia_id = ?", new String[] { paramString1 });
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jii
 * JD-Core Version:    0.7.0.1
 */