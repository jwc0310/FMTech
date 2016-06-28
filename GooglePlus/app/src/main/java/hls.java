import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.net.Uri;
import java.io.File;

public final class hls
  extends gzf
{
  private final String a;
  private final int b;
  private final int c;
  private final ipf d;
  
  public hls(int paramInt1, String paramString, int paramInt2, ipf paramipf)
  {
    super("UpdateCollexionCoverPhotoTask");
    this.c = paramInt1;
    this.a = paramString;
    this.b = paramInt2;
    this.d = paramipf;
  }
  
  protected final hae a(Context paramContext)
  {
    int m;
    String str1;
    String str2;
    if (this.d != null) {
      if (this.d.b.a != 0L)
      {
        m = 1;
        if (m == 0) {
          break label180;
        }
        str1 = Long.toString(this.d.b.a);
        str2 = null;
      }
    }
    for (;;)
    {
      hkr localhkr = new hkr(paramContext, new kch().a(paramContext, this.c).a(), this.a, this.b, str1, str2);
      localhkr.i();
      qat localqat1;
      label112:
      qat localqat2;
      if (!localhkr.n())
      {
        if (!localhkr.x) {
          break label359;
        }
        localqat1 = localhkr.w;
        if (localqat1 != null)
        {
          if (!localhkr.x) {
            break label365;
          }
          localqat2 = localhkr.w;
          label132:
          if (((ncc)localqat2).a != null) {
            break label377;
          }
        }
      }
      if (localhkr.n()) {}
      for (int i = localhkr.o;; i = 0)
      {
        return new hae(i, localhkr.q, null);
        m = 0;
        break;
        label180:
        if (this.d.c != null) {}
        for (int n = 1;; n = 0)
        {
          if (n == 0) {
            break label217;
          }
          str2 = this.d.c;
          str1 = null;
          break;
        }
        label217:
        if (this.d.d != null) {}
        for (int i1 = 1;; i1 = 0) {
          while (i1 != 0) {
            try
            {
              iup localiup = new iup();
              localiup.a = this.d.d;
              localiup.d = "instant";
              localiup.f = true;
              iuo localiuo = localiup.a();
              str1 = new iub(paramContext).a(this.c).a().a(localiuo).d;
              new File(this.d.d.getPath()).delete();
              str2 = null;
            }
            catch (Exception localException)
            {
              return new hae(0, localException, null);
            }
          }
        }
        throw new IllegalArgumentException("A photo must have an ID or URI.");
        label359:
        localqat1 = null;
        break label112;
        label365:
        localqat2 = null;
        break label132;
      }
      label377:
      qat localqat3;
      ndr localndr;
      qat localqat4;
      label420:
      String str3;
      int j;
      if (localhkr.x)
      {
        localqat3 = localhkr.w;
        localndr = ((ncc)localqat3).a.b;
        if (!localhkr.x) {
          break label516;
        }
        localqat4 = localhkr.w;
        str3 = ((ncc)localqat4).a.a;
        if ((this.b == -1) || ((localndr != null) && (localndr.a != null) && (localndr.c != null) && (localndr.b != null))) {
          break label522;
        }
        j = 1;
        label473:
        if (j == 0) {
          break label534;
        }
        if (((str2 == null) && (str1 == null)) || (str3 != null)) {
          break label528;
        }
      }
      label516:
      label522:
      label528:
      for (int k = 1;; k = 0)
      {
        if (k == 0) {
          break label534;
        }
        return new hae(0, null, null);
        localqat3 = null;
        break;
        localqat4 = null;
        break label420;
        j = 0;
        break label473;
      }
      label534:
      ContentValues localContentValues = new ContentValues(2);
      if (this.b != -1) {
        localContentValues.put("color", Integer.valueOf(Color.rgb(localndr.a.intValue(), localndr.b.intValue(), localndr.c.intValue())));
      }
      if ((str2 != null) || (str1 != null)) {
        localContentValues.put("cover_photo_url", str3);
      }
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.c);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.a;
      localSQLiteDatabase.update("cxns", localContentValues, "cxn_id = ?", arrayOfString);
      paramContext.getContentResolver().notifyChange(((hho)mbb.a(paramContext, hho.class)).a(), null);
      return new hae(localhkr.o, localhkr.q, null);
      str1 = null;
      str2 = null;
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.Is);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hls
 * JD-Core Version:    0.7.0.1
 */