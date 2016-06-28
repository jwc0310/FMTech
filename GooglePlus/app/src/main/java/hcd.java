import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

public final class hcd
  implements hcc
{
  private static final String[] a = { "auto_upload_enabled", "auto_upload_account_id", "sync_on_wifi_only", "video_upload_wifi_only", "sync_on_roaming", "sync_on_battery", "upload_full_resolution", "max_mobile_upload_size", "quota_limit", "quota_used", "full_size_disabled", "quota_unlimited" };
  private static hcd b;
  private final Context c;
  private boolean d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private long k;
  private iuk l;
  
  private hcd(Context paramContext)
  {
    this.c = paramContext;
  }
  
  public static hcd a(Context paramContext)
  {
    try
    {
      if (b == null)
      {
        hcd localhcd1 = new hcd(paramContext);
        b = localhcd1;
        localhcd1.a(null);
      }
      hcd localhcd2 = b;
      return localhcd2;
    }
    finally {}
  }
  
  public final void a()
  {
    a(null);
  }
  
  final void a(Cursor paramCursor)
  {
    if (paramCursor == null) {
      paramCursor = i();
    }
    if (paramCursor != null) {}
    for (;;)
    {
      try
      {
        boolean bool1 = paramCursor.moveToFirst();
        if (!bool1) {
          return;
        }
        int m = paramCursor.getColumnIndexOrThrow("auto_upload_enabled");
        boolean bool2;
        if (paramCursor.getInt(m) != 0)
        {
          bool2 = true;
          int n = paramCursor.getColumnIndexOrThrow("auto_upload_account_id");
          int i1 = paramCursor.getInt(n);
          int i2 = paramCursor.getColumnIndexOrThrow("sync_on_wifi_only");
          if (paramCursor.getInt(i2) != 0)
          {
            bool3 = true;
            int i3 = paramCursor.getColumnIndexOrThrow("video_upload_wifi_only");
            if (paramCursor.getInt(i3) == 0) {
              continue;
            }
            bool4 = true;
            int i4 = paramCursor.getColumnIndexOrThrow("sync_on_roaming");
            if (paramCursor.getInt(i4) == 0) {
              continue;
            }
            bool5 = true;
            int i5 = paramCursor.getColumnIndexOrThrow("sync_on_battery");
            if (paramCursor.getInt(i5) == 0) {
              continue;
            }
            bool6 = true;
            int i6 = paramCursor.getColumnIndexOrThrow("upload_full_resolution");
            if (paramCursor.getInt(i6) == 0) {
              continue;
            }
            bool7 = true;
            int i7 = paramCursor.getColumnIndexOrThrow("max_mobile_upload_size");
            long l1 = paramCursor.getLong(i7);
            int i8 = paramCursor.getColumnIndexOrThrow("quota_limit");
            long l2 = paramCursor.getLong(i8);
            int i9 = paramCursor.getColumnIndexOrThrow("quota_used");
            long l3 = paramCursor.getLong(i9);
            int i10 = paramCursor.getColumnIndexOrThrow("quota_unlimited");
            if (paramCursor.getInt(i10) == 0) {
              continue;
            }
            bool8 = true;
            int i11 = paramCursor.getColumnIndexOrThrow("full_size_disabled");
            int i12 = paramCursor.getInt(i11);
            if (i12 == 0) {
              continue;
            }
            bool9 = true;
            iaw.a(paramCursor);
            if (i1 == -1) {
              bool2 = false;
            }
            if (Log.isLoggable("iu.UploadsManager", 4))
            {
              StringBuilder localStringBuilder1 = new StringBuilder();
              StringBuilder localStringBuilder2 = localStringBuilder1.append("#reloadSettings(); account: ").append(i1).append("; IU: ");
              if (!bool2) {
                break label833;
              }
              str1 = "enabled";
              localStringBuilder2.append(str1);
              StringBuilder localStringBuilder3 = localStringBuilder1.append("; photoWiFi: ").append(bool3).append("; videoWiFi: ").append(bool4).append("; roam: ").append(bool5).append("; battery: ").append(bool6).append("; size: ");
              if (!bool7) {
                break label840;
              }
              str2 = "FULL";
              localStringBuilder3.append(str2).append("; maxMobile: ").append(l1);
            }
            if (Log.isLoggable("iu.UploadsManager", 3))
            {
              if (bool2 != this.d) {
                new StringBuilder(31).append("   auto upload changed to ").append(bool2);
              }
              if (i1 != this.e)
              {
                int i13 = this.e;
                new StringBuilder(52).append("   account changed from: ").append(i13).append(" --> ").append(i1);
              }
              boolean bool10 = this.f;
              if (bool3 != bool10) {
                new StringBuilder(33).append("   wifiOnlyPhoto changed to ").append(bool3);
              }
              if (bool4 != this.g) {
                new StringBuilder(33).append("   wifiOnlyVideo changed to ").append(bool4);
              }
              if (bool5 != this.h) {
                new StringBuilder(33).append("   syncOnRoaming changed to ").append(bool5);
              }
              if (bool6 != this.i) {
                new StringBuilder(33).append("   syncOnBattery changed to ").append(bool6);
              }
              if (bool7 != this.j) {
                new StringBuilder(33).append("   uploadFullRes changed to ").append(bool7);
              }
              if (l1 != this.k) {
                new StringBuilder(54).append("   maxMobileUploadSize changed to ").append(l1);
              }
            }
            this.d = bool2;
            this.e = i1;
            this.f = bool3;
            this.g = bool4;
            this.h = bool5;
            this.i = bool6;
            this.j = bool7;
            this.k = l1;
            this.l = new iuk(l2, l3, bool8, bool9);
          }
        }
        else
        {
          bool2 = false;
          continue;
        }
        boolean bool3 = false;
        continue;
        boolean bool4 = false;
        continue;
        boolean bool5 = false;
        continue;
        boolean bool6 = false;
        continue;
        boolean bool7 = false;
        continue;
        boolean bool8 = false;
        continue;
        boolean bool9 = false;
        continue;
        String str1 = "disabled";
      }
      finally
      {
        iaw.a(paramCursor);
      }
      label833:
      continue;
      label840:
      String str2 = "STANDARD";
    }
  }
  
  public final boolean b()
  {
    return this.f;
  }
  
  public final boolean c()
  {
    return this.g;
  }
  
  public final boolean d()
  {
    return this.h;
  }
  
  public final boolean e()
  {
    return this.i;
  }
  
  public final boolean f()
  {
    return this.j;
  }
  
  public final long g()
  {
    return this.k;
  }
  
  public final iuk h()
  {
    return this.l;
  }
  
  public final Cursor i()
  {
    return this.c.getContentResolver().query(hbu.b(this.c), a, null, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcd
 * JD-Core Version:    0.7.0.1
 */