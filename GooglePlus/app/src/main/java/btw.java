import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

abstract class btw
{
  private final int a;
  private final int b;
  private final int c;
  
  public btw(btl parambtl, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.b = paramInt3;
  }
  
  protected abstract String a();
  
  final void a(SQLiteDatabase paramSQLiteDatabase, btg parambtg, String paramString1, String paramString2, String paramString3)
  {
    String[] arrayOfString1 = btl.e;
    int i = arrayOfString1.length;
    String str1 = "";
    for (int j = 0; j < i; j++)
    {
      String str7 = arrayOfString1[j];
      String str8 = String.valueOf(str1);
      str1 = 1 + String.valueOf(str8).length() + String.valueOf(str7).length() + str8 + str7 + ",";
    }
    String str2 = str1.substring(0, -1 + str1.length());
    String str3 = 30 + String.valueOf(str2).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(paramString3).length() + "SELECT " + str2 + " FROM " + paramString1 + " WHERE " + paramString2 + " ORDER BY " + paramString3;
    String[] arrayOfString2 = c();
    String[] arrayOfString3 = a(this.a);
    String[] arrayOfString4 = (String[])Arrays.copyOf(arrayOfString2, 2 + arrayOfString2.length + arrayOfString3.length);
    arrayOfString4[arrayOfString2.length] = Integer.toString(this.c);
    arrayOfString4[(1 + arrayOfString2.length)] = Integer.toString(this.b);
    System.arraycopy(arrayOfString3, 0, arrayOfString4, 2 + arrayOfString2.length, arrayOfString3.length);
    Cursor localCursor = paramSQLiteDatabase.rawQuery(str3, arrayOfString4);
    boolean bool2;
    do
    {
      for (;;)
      {
        bth localbth;
        String str6;
        try
        {
          if (!localCursor.moveToLast()) {
            break label551;
          }
          String str4 = localCursor.getString(0);
          String str5 = localCursor.getString(1);
          long l = localCursor.getLong(2);
          int k = localCursor.getInt(3);
          localbth = new bth(parambtg.a, str4, k, str5, l);
          str6 = btg.a(localbth.b, localbth.c);
          if (parambtg.e.containsKey(str6))
          {
            boolean bool1 = parambtg.h;
            if (!bool1) {
              break;
            }
            return;
          }
          if (parambtg.h) {
            continue;
          }
          if ((!parambtg.c) && (parambtg.g + localbth.e > parambtg.b))
          {
            parambtg.h = true;
            continue;
          }
          m = parambtg.d.size();
        }
        finally
        {
          localCursor.close();
        }
        int m;
        parambtg.d.add(localbth);
        parambtg.e.put(str6, Integer.valueOf(m));
        parambtg.f = (1 + parambtg.f);
        parambtg.g += localbth.e;
        if (parambtg.g > parambtg.b) {
          parambtg.h = true;
        }
      }
      bool2 = localCursor.moveToPrevious();
    } while (bool2);
    label551:
    localCursor.close();
  }
  
  protected abstract String[] a(int paramInt);
  
  protected abstract String b();
  
  protected abstract String[] c();
  
  protected abstract String d();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btw
 * JD-Core Version:    0.7.0.1
 */