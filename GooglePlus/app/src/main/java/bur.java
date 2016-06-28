import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class bur
  implements hsu
{
  public final void a(Context paramContext, int paramInt, Object paramObject)
  {
    okn[] arrayOfokn1 = null;
    hea localhea;
    SQLiteDatabase localSQLiteDatabase2;
    if ((paramObject instanceof hea))
    {
      localhea = (hea)paramObject;
      String str5 = jrf.a(3, new String[] { jrf.a(null, localhea.d, localhea.e, "ALBUM") });
      localSQLiteDatabase2 = hsb.a(paramContext, paramInt);
      if ((localhea == null) || (localhea.e == null) || (localhea.f == 0L) || (localhea.d == null) || (localhea.c == null))
      {
        Log.e("EsTileData", "Invalid DbEmbedMedia object; cannot insert into the database");
        jrf.a(paramContext, paramInt, str5, arrayOfokn1, localhea.a);
      }
    }
    hdx localhdx;
    String str1;
    do
    {
      do
      {
        return;
        ojv localojv2 = new ojv();
        localojv2.b = localhea.d;
        oir localoir2 = new oir();
        localoir2.c = localhea.e;
        localoir2.e = localojv2;
        localoir2.b = Integer.valueOf(1);
        localoir2.d = 3;
        localoir2.a = "";
        okk localokk2 = new okk();
        localokk2.b = localoir2;
        okn localokn3 = new okn();
        localokn3.j = 2;
        localokn3.a(okk.a, localokk2);
        String str6 = efj.a(localSQLiteDatabase2, localokn3);
        if (str6 == null) {
          str6 = jrf.a(localokn3);
        }
        localokn3.a = str6;
        okn[] arrayOfokn2 = new okn[1];
        okn localokn4 = efj.a(localSQLiteDatabase2, localhea, localoir2);
        if (localokn4 != null) {
          arrayOfokn2[0] = localokn4;
        }
        localokn3.i = arrayOfokn2;
        arrayOfokn1 = new okn[] { localokn3 };
        break;
      } while (!(paramObject instanceof hdx));
      localhdx = (hdx)paramObject;
      str1 = jrf.a(3, new String[] { jrf.a(null, localhdx.d, localhdx.e, "ALBUM") });
    } while (str1 == null);
    SQLiteDatabase localSQLiteDatabase1 = hsb.a(paramContext, paramInt);
    if ((localhdx == null) || (localhdx.e == null) || (localhdx.d == null) || (localhdx.b == 0)) {
      Log.e("EsTileData", "Invalid DbEmbedAlbum object; cannot insert into the database");
    }
    for (;;)
    {
      jrf.a(paramContext, paramInt, str1, arrayOfokn1, localhdx.a);
      return;
      int i = localhdx.b;
      ojv localojv1 = new ojv();
      localojv1.b = localhdx.d;
      oir localoir1 = new oir();
      localoir1.c = localhdx.e;
      localoir1.e = localojv1;
      String str2 = localhdx.f;
      if (str2 == null) {}
      okn localokn1;
      ArrayList localArrayList;
      for (String str3 = "";; str3 = str2)
      {
        localoir1.a = str3;
        localoir1.b = Integer.valueOf(localhdx.c);
        localoir1.d = 3;
        okk localokk1 = new okk();
        localokk1.b = localoir1;
        localokn1 = new okn();
        localokn1.j = 2;
        localokn1.b = str2;
        localokn1.a(okk.a, localokk1);
        String str4 = efj.a(localSQLiteDatabase1, localokn1);
        if (str4 == null) {
          str4 = jrf.a(localokn1);
        }
        localokn1.a = str4;
        localArrayList = new ArrayList(i);
        for (int j = 0; j < localhdx.b; j++)
        {
          okn localokn2 = efj.a(localSQLiteDatabase1, localhdx.g[j], localoir1);
          if (localokn2 != null) {
            localArrayList.add(localokn2);
          }
        }
      }
      localokn1.i = ((okn[])localArrayList.toArray(new okn[localArrayList.size()]));
      arrayOfokn1 = new okn[] { localokn1 };
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bur
 * JD-Core Version:    0.7.0.1
 */