import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class knl
  implements kht
{
  private final kna a;
  
  public knl(Context paramContext)
  {
    this.a = new kna(paramContext);
  }
  
  private static kmu a(kog paramkog)
  {
    long l = System.currentTimeMillis();
    String str1 = paramkog.a;
    String str2 = paramkog.c.e;
    koi[] arrayOfkoi = paramkog.f;
    String str3 = paramkog.l;
    Object localObject1 = null;
    int j;
    int i;
    Object localObject3;
    if ((paramkog.n != null) && (paramkog.n.b != null) && ("polls".equals(paramkog.n.a)))
    {
      qdz localqdz = (qdz)paramkog.n.b.b(qdz.a);
      j = 0;
      i = 0;
      if (j < localqdz.e.length)
      {
        qdy localqdy = (qdy)localqdz.e[j].b(qdy.a);
        if (localqdy.e == null) {
          break label263;
        }
        qdw localqdw = (qdw)localqdy.e.b(qdw.a);
        i++;
        if ((localObject1 != null) || ((localqdw.i != null) && (!localqdw.i.equals(Long.toString(0L))))) {
          break label263;
        }
        localObject3 = localqdw.f;
      }
    }
    for (int k = i;; k = i)
    {
      j++;
      i = k;
      localObject1 = localObject3;
      break;
      Object localObject2 = localObject1;
      for (;;)
      {
        return new kmu(str1, str2, l, paramkog, i, (String)localObject2, str3);
        if ((arrayOfkoi != null) && (arrayOfkoi.length > 0))
        {
          i = paramkog.f.length;
          localObject2 = paramkog.f[0].b;
        }
        else
        {
          i = 0;
          localObject2 = null;
        }
      }
      label263:
      localObject3 = localObject1;
    }
  }
  
  public final int a(int paramInt)
  {
    return (int)this.a.a(null, -1L, 3, paramInt);
  }
  
  public final long a(kog paramkog, int paramInt)
  {
    kmu localkmu = a(paramkog);
    return this.a.a(localkmu, -1L, 0, paramInt);
  }
  
  public final boolean a(long paramLong, int paramInt)
  {
    return this.a.a(null, paramLong, 2, paramInt) > 0L;
  }
  
  public final boolean a(long paramLong, kog paramkog, int paramInt)
  {
    kmu localkmu = a(paramkog);
    return this.a.a(localkmu, paramLong, 1, paramInt) > 0L;
  }
  
  public final Cursor b(int paramInt)
  {
    return hsb.b(this.a.a, paramInt).query("drafts", kmy.a, null, null, null, null, "draft_last_update_timestamp DESC");
  }
  
  public final Cursor b(long paramLong, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a.a, paramInt);
    String[] arrayOfString1 = { "draft_data" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Long.toString(paramLong);
    return localSQLiteDatabase.query("drafts", arrayOfString1, "_id=?", arrayOfString2, null, null, null);
  }
  
  public final int c(int paramInt)
  {
    Cursor localCursor = hsb.b(this.a.a, paramInt).query("drafts", new String[] { "COUNT(*) AS count" }, null, null, null, null, null);
    localCursor.moveToFirst();
    return localCursor.getInt(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knl
 * JD-Core Version:    0.7.0.1
 */