import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.Pair;
import java.util.List;
import java.util.Locale;

public class jqw
  extends hqj
{
  private final String[] r;
  public final String s;
  public final int t;
  public final String u;
  public final String[] v;
  private final String w;
  private final boolean x;
  private final String y;
  private final String z;
  
  public jqw(Context paramContext, int paramInt1, String paramString1, String[] paramArrayOfString, String paramString2, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramContext, paramInt1, paramString1, paramArrayOfString, paramString2, paramInt2, null, paramBoolean1, false, 0);
  }
  
  public jqw(Context paramContext, int paramInt1, String paramString1, String[] paramArrayOfString, String paramString2, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, int paramInt3)
  {
    super(paramContext, jrf.a.buildUpon().appendEncodedPath(paramString1).build());
    this.t = paramInt1;
    this.s = paramString1;
    this.r = paramArrayOfString;
    this.w = paramString3;
    this.x = paramBoolean1;
    String str1 = String.valueOf(efj.m(paramInt3));
    int i;
    String str2;
    String str3;
    int j;
    label97:
    String str5;
    label124:
    String[] arrayOfString;
    if (efj.n(paramInt3))
    {
      i = 1;
      str2 = String.valueOf(i);
      str3 = String.valueOf(efj.l(paramInt3));
      if ((paramString3 == null) && (!paramBoolean1)) {
        break label312;
      }
      j = 1;
      if (paramString2 != null) {
        break label332;
      }
      this.y = "all_tiles";
      if (j == 0) {
        break label325;
      }
      if (!this.x) {
        break label318;
      }
      str5 = "view_id = ? AND (parent_id IS NULL OR media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND media_attr & 512 != 0";
      long l = 50000L + new jrh(this.l).c;
      Locale localLocale2 = Locale.US;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      String str6 = String.format(localLocale2, "((view_order >= 50000 AND view_order <= %d) OR type = '110' OR view_order > 50100)", arrayOfObject);
      if (!paramBoolean2) {
        break label394;
      }
      label181:
      this.u = (5 + String.valueOf(str5).length() + String.valueOf(str6).length() + str5 + " AND " + str6);
      if ((j == 0) || (this.x)) {
        break label450;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = this.s;
      arrayOfString[1] = str1;
      arrayOfString[2] = str2;
      arrayOfString[3] = str3;
      arrayOfString[4] = null;
      arrayOfString[5] = null;
      label284:
      this.v = arrayOfString;
      if (j == 0) {
        break label485;
      }
    }
    label312:
    label318:
    label325:
    label332:
    label485:
    for (String str8 = "SELECT tile_id FROM all_tiles WHERE view_id = ?  AND photo_id = ? AND media_attr & 512 != 0";; str8 = "SELECT tile_id FROM all_tiles WHERE view_id = ?  AND photo_id = ? AND media_attr & 512 == 0")
    {
      this.z = str8;
      return;
      i = 0;
      break;
      j = 0;
      break label97;
      str5 = "view_id = ? AND (parent_id IS NULL OR media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND ( ( tile_id = ?  AND media_attr & 512 != 0 )  OR ( tile_id != ?  AND media_attr & 512 == 0 ) )";
      break label124;
      str5 = "view_id = ? AND (parent_id IS NULL OR media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND media_attr & 512 == 0";
      break label124;
      this.y = "all_tiles";
      Locale localLocale1 = Locale.US;
      String str4;
      if (j != 0) {
        if (this.x) {
          str4 = "view_id = ? AND (parent_id IS NULL OR media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND media_attr & 512 != 0 AND %s";
        }
      }
      for (;;)
      {
        str5 = String.format(localLocale1, str4, new Object[] { paramString2 });
        break;
        str4 = "view_id = ? AND (parent_id IS NULL OR media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND ( ( tile_id = ?  AND media_attr & 512 != 0 )  OR ( tile_id != ?  AND media_attr & 512 == 0 ) ) AND %s";
        continue;
        str4 = "view_id = ? AND (parent_id IS NULL OR media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND media_attr & 512 == 0 AND %s";
      }
      String str7 = String.valueOf("view_order > 50100");
      str5 = 5 + String.valueOf(str5).length() + String.valueOf(str7).length() + str5 + " AND " + str7;
      break label181;
      arrayOfString = new String[4];
      arrayOfString[0] = this.s;
      arrayOfString[1] = str1;
      arrayOfString[2] = str2;
      arrayOfString[3] = str3;
      break label284;
    }
  }
  
  public static String a(String paramString, List<ipf> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramList != null) {
      for (int i = -1 + paramList.size(); i >= 0; i--)
      {
        String str = ((ipf)paramList.get(i)).a;
        if (str != null)
        {
          DatabaseUtils.appendEscapedSQLString(localStringBuilder, str);
          localStringBuilder.append(',');
        }
      }
    }
    if (localStringBuilder.length() > 0)
    {
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      if (paramString == null)
      {
        Locale localLocale2 = Locale.US;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localStringBuilder.toString();
        paramString = String.format(localLocale2, "tile_id NOT IN (%s)", arrayOfObject2);
      }
    }
    else
    {
      return paramString;
    }
    Locale localLocale1 = Locale.US;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = localStringBuilder.toString();
    return String.format(localLocale1, "( %s AND tile_id NOT IN (%s) )", arrayOfObject1);
  }
  
  public final String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      String str1 = this.z;
      String[] arrayOfString = new String[2];
      arrayOfString[0] = this.s;
      arrayOfString[1] = paramString;
      String str2 = DatabaseUtils.stringForQuery(paramSQLiteDatabase, str1, arrayOfString);
      return str2;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return null;
  }
  
  public Cursor o()
  {
    int i = this.t;
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.l, i);
    if ((this.w != null) && (!this.x))
    {
      String str = a(localSQLiteDatabase, this.w);
      if (str == null) {
        return null;
      }
      this.v[(-2 + this.v.length)] = str;
      this.v[(-1 + this.v.length)] = str;
    }
    Cursor localCursor = localSQLiteDatabase.query(this.y, this.r, this.u, this.v, null, null, "view_order ASC", null);
    Bundle localBundle = new Bundle();
    Pair localPair = jrf.c(this.l, i, this.s);
    if (localPair != null)
    {
      localBundle.putString("resume_token", (String)localPair.first);
      localBundle.putLong("last_refresh_time", ((Long)localPair.second).longValue());
    }
    hqh localhqh = new hqh(localCursor);
    localhqh.setExtras(localBundle);
    return localhqh;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqw
 * JD-Core Version:    0.7.0.1
 */