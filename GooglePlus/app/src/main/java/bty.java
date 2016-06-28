import android.content.Context;
import android.content.SyncResult;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.social.autobackup.AutoBackupEnvironment;
import java.util.List;

final class bty
{
  final int a;
  final bup b;
  final SyncResult c;
  final long d;
  final long e;
  final boolean f;
  long g;
  long h;
  btf i;
  long j;
  long k;
  long l;
  int m;
  int n;
  int o;
  int p;
  long q;
  private long r;
  private long s;
  private final ois t;
  private final long u;
  private final AutoBackupEnvironment v;
  
  public bty(btl parambtl, Context paramContext, int paramInt, bup parambup, SyncResult paramSyncResult, ois paramois, long paramLong)
  {
    this.a = paramInt;
    this.b = parambup;
    this.c = paramSyncResult;
    this.t = paramois;
    this.v = ((AutoBackupEnvironment)mbb.a(paramContext, AutoBackupEnvironment.class));
    this.u = paramLong;
    this.s = System.currentTimeMillis();
    if (System.currentTimeMillis() - parambtl.j > 900000L)
    {
      parambtl.i = ((ifj)mbb.a(parambtl.f, ifj.class)).f().d();
      parambtl.j = System.currentTimeMillis();
    }
    this.d = parambtl.i;
    this.j = btl.a(parambtl, paramContext);
    this.f = ((iwb)mbb.a(paramContext, iwb.class)).a(paramInt);
    int i1 = parambtl.a().size();
    this.e = ((this.d - b()) / i1);
    this.r = Math.min(104857600L, this.e);
    this.l = this.r;
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    this.h = btl.a(localSQLiteDatabase, 1);
    this.g = btl.a(localSQLiteDatabase, 10);
  }
  
  public final int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 1: 
      return this.m;
    case 2: 
      return this.n;
    }
    return this.o;
  }
  
  public final boolean a()
  {
    if ((!this.b.b()) && (this.l > 0L) && (this.w.b.i()) && (System.currentTimeMillis() - this.s <= 120000L)) {
      if (this.s - this.u < 21600000L) {
        break label91;
      }
    }
    label91:
    for (int i1 = 1;; i1 = 0)
    {
      boolean bool1 = false;
      if (i1 == 0)
      {
        boolean bool2 = this.v.a;
        bool1 = false;
        if (!bool2) {
          bool1 = true;
        }
      }
      return bool1;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == btz.b)
    {
      int i1;
      switch (paramInt2)
      {
      default: 
        throw new IllegalArgumentException(39 + "Unknown representation type=" + paramInt2);
      case 1: 
        if ((this.t != null) && (this.t.c != null) && (this.h >= this.t.c.intValue())) {
          i1 = 1;
        }
        break;
      }
      while (i1 != 0)
      {
        return true;
        i1 = 0;
        continue;
        if ((this.t != null) && (this.t.e != null) && (this.g >= this.t.e.intValue())) {
          i1 = 1;
        } else {
          i1 = 0;
        }
      }
    }
    return false;
  }
  
  public final long b()
  {
    if (this.f) {
      return this.w.h;
    }
    return this.w.g;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(iaw.b(this.w.a.a(this.w.k.a).b("account_name")));
    long l1 = this.j;
    int i1 = this.m;
    int i2 = this.n;
    int i3 = this.o;
    long l2 = this.k;
    int i4 = this.p;
    long l3 = this.q;
    long l4 = this.h;
    String str2 = String.valueOf(this.t.e);
    long l5 = this.g;
    String str3 = String.valueOf(this.t.e);
    long l6 = this.s;
    String str4 = String.valueOf(efj.a(System.currentTimeMillis() - l6));
    return 439 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + "account: " + str1 + ", totalSpaceUsed: " + l1 + ", thumbnails: " + i1 + ", largeImages: " + i2 + ", videos: " + i3 + ", bytes: " + l2 + ", cacheEvictions: " + i4 + ", cacheEvictionBytes: " + l3 + ", AllPhotos Thumbnails synced total: " + l4 + ", AllPhotos Settings max thumbnails on wifi: " + str2 + ", AllPhotos Large/Videos synced total: " + l5 + ", AllPhotos Settings max large/videos on wifi: " + str3 + ", duration: " + str4;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bty
 * JD-Core Version:    0.7.0.1
 */