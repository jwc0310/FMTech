import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class jzy
  extends gzf
{
  private final int a;
  private final String b;
  
  private jzy(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    gzj.a(paramContext, new jzy("headerDataTask", paramInt, paramString));
  }
  
  protected final hae a(Context paramContext)
  {
    jzx localjzx = new jzx(paramContext, new kch().a(paramContext, this.a).a(), this.a, this.b);
    localjzx.a.i();
    localjzx.a.c("headerDataOperation");
    if (localjzx.a.n()) {
      return new hae(localjzx.a.o, localjzx.a.q, null);
    }
    ContentValues localContentValues = new ContentValues(15);
    localContentValues.put("cover_photo", qat.a(localjzx.c()));
    localContentValues.put("gaia_id", this.b);
    localContentValues.put("name", qat.a(localjzx.a()));
    localContentValues.put("name_is_verified", qat.a(localjzx.d()));
    localContentValues.put("sync_timestamp", Long.valueOf(System.currentTimeMillis()));
    localContentValues.put("tagline", qat.a(localjzx.e()));
    localContentValues.put("photo", qat.a(localjzx.b()));
    localContentValues.put("owner_stats", qat.a(localjzx.f()));
    localContentValues.put("vanity_id", qat.a(localjzx.g()));
    localContentValues.put("domain", qat.a(localjzx.h()));
    localContentValues.put("fingerprint", qat.a(localjzx.i()));
    localContentValues.put("local_page", qat.a(localjzx.j()));
    localContentValues.put("gender", qat.a(localjzx.k()));
    localContentValues.put("is_plus_page", qat.a(localjzx.l()));
    localContentValues.put("can_edit_profile", qat.a(localjzx.m()));
    hsb.a(paramContext, this.a).insertWithOnConflict("profile_header", null, localContentValues, 5);
    paramContext.getContentResolver().notifyChange(((jyx)mbb.a(paramContext, jyx.class)).a(), null);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzy
 * JD-Core Version:    0.7.0.1
 */