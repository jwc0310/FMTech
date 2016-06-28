import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class dem
  extends jqw
  implements dfx<Cursor>
{
  private static String[] r = { "_id", "tile_id", "view_id", "all_tiles.image_url", "view_order", "media_attr", "user_actions", "NULL as virtual_photo_id", "NULL as virtual_gaia_id", "view_id as virtual_selection_cluster_id", "0 as virtual_media_type", "NULL as virtual_local_uri", "NULL as virtual_signature", "-1 as virtual_all_photos_row_id" };
  private ipf A;
  private String w;
  private final String x;
  private final String y;
  private final List<jpx> z;
  
  public dem(Context paramContext, int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean, List<jpx> paramList, int paramInt2)
  {
    super(paramContext, paramInt1, paramString1, r, a(paramList), 4, null, paramBoolean, false, paramInt2);
    this.z = null;
    this.A = null;
    this.w = paramString2;
    this.x = paramString3;
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.u;
    if (paramBoolean) {}
    for (String str = "SELECT view_order FROM all_tiles WHERE media_attr & 512 != 0 AND view_id = ?  AND tile_id = ?";; str = "SELECT view_order FROM all_tiles WHERE media_attr & 512 == 0 AND view_id = ?  AND tile_id = ?")
    {
      arrayOfObject[1] = str;
      this.y = String.format(localLocale, "SELECT count(*) FROM all_tiles WHERE %s AND view_order < ( %s )", arrayOfObject);
      return;
    }
  }
  
  public dem(Context paramContext, int paramInt1, String paramString, List<jpx> paramList1, ipf paramipf, List<jpx> paramList2, int paramInt2)
  {
    super(paramContext, paramInt1, null, r, a(paramList2), 4, null, false, false, paramInt2);
    this.z = paramList1;
    this.A = paramipf;
    this.x = null;
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.u;
    arrayOfObject[1] = "SELECT view_order FROM all_tiles WHERE media_attr & 512 == 0 AND view_id = ?  AND tile_id = ?";
    this.y = String.format(localLocale, "SELECT count(*) FROM all_tiles WHERE %s AND view_order < ( %s )", arrayOfObject);
  }
  
  private static String a(List<jpx> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramList != null) {
      for (int i = -1 + paramList.size(); i >= 0; i--)
      {
        String str = ((jpx)paramList.get(i)).e().a;
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
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localStringBuilder.toString();
      return String.format(localLocale, "( type == 4 AND tile_id NOT IN (%s) )", arrayOfObject);
    }
    return "type == 4";
  }
  
  public final void a(ipf paramipf)
  {
    this.A = paramipf;
  }
  
  public final Cursor o()
  {
    label122:
    Object localObject;
    if (this.z != null)
    {
      int j = 0;
      hqr localhqr = new hqr(r);
      int k = this.z.size();
      Object[] arrayOfObject = new Object[r.length];
      int m = 0;
      if (m < k)
      {
        jpx localjpx = (jpx)this.z.get(m);
        ipf localipf = localjpx.e();
        if (localipf.equals(this.A)) {
          j = m;
        }
        arrayOfObject[0] = Integer.valueOf(m);
        arrayOfObject[1] = localipf.a;
        int n;
        String str2;
        label134:
        int i1;
        label223:
        String str3;
        if (localipf.c != null)
        {
          n = 1;
          if (n == 0) {
            break label317;
          }
          str2 = localipf.c;
          arrayOfObject[3] = str2;
          arrayOfObject[4] = Integer.valueOf(m);
          arrayOfObject[5] = Long.valueOf(0x4000 | localjpx.i());
          arrayOfObject[7] = Long.valueOf(localipf.b.a);
          arrayOfObject[8] = localipf.b.b;
          arrayOfObject[10] = Integer.valueOf(localipf.e.e);
          if (localipf.d == null) {
            break label323;
          }
          i1 = 1;
          if (i1 == 0) {
            break label329;
          }
          str3 = localipf.d.toString();
          label238:
          arrayOfObject[11] = str3;
          arrayOfObject[12] = localipf.g;
          arrayOfObject[13] = Integer.valueOf(-1);
          if (!(localjpx instanceof jpu)) {
            break label335;
          }
          jpu localjpu = (jpu)localjpx;
          arrayOfObject[2] = localjpu.d;
          arrayOfObject[9] = localjpu.c;
        }
        for (;;)
        {
          localhqr.a(arrayOfObject);
          m++;
          break;
          n = 0;
          break label122;
          label317:
          str2 = null;
          break label134;
          label323:
          i1 = 0;
          break label223;
          label329:
          str3 = null;
          break label238;
          label335:
          if ((localjpx instanceof bpr)) {
            arrayOfObject[13] = Long.valueOf(((bpr)localjpx).a);
          }
        }
      }
      localhqr.getExtras().putInt("start_position", j);
      localObject = localhqr;
    }
    label558:
    label562:
    for (;;)
    {
      return localObject;
      localObject = super.o();
      if (localObject == null) {
        return null;
      }
      SQLiteDatabase localSQLiteDatabase = bqj.a(this.l, this.t).getReadableDatabase();
      String str1;
      String[] arrayOfString2;
      if ((this.w != null) || (this.x == null))
      {
        str1 = this.w;
        if (str1 == null) {
          break label558;
        }
        String[] arrayOfString1 = this.v;
        arrayOfString2 = (String[])Arrays.copyOf(arrayOfString1, 2 + arrayOfString1.length);
        arrayOfString2[arrayOfString1.length] = this.s;
        arrayOfString2[(1 + arrayOfString1.length)] = str1;
      }
      for (int i = (int)DatabaseUtils.longForQuery(localSQLiteDatabase, this.y, arrayOfString2);; i = 0)
      {
        if (!(localObject instanceof hqd)) {
          break label562;
        }
        hqd localhqd = (hqd)localObject;
        Bundle localBundle = localhqd.getExtras();
        if ((localBundle == Bundle.EMPTY) || (localBundle == null)) {
          localBundle = new Bundle();
        }
        localBundle.putInt("start_position", i);
        localhqd.setExtras(localBundle);
        return localObject;
        str1 = a(localSQLiteDatabase, this.x);
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dem
 * JD-Core Version:    0.7.0.1
 */