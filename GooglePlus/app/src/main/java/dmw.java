import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

public final class dmw
  implements lrl
{
  private static final mfl a = new mfl("debug.plus.profile_interval", String.valueOf(TimeUnit.HOURS.toMillis(24L)));
  private static final mfl b = new mfl("debug.plus.profile_ignore", String.valueOf(TimeUnit.HOURS.toMillis(48L)));
  private final Context c;
  private final giz d;
  
  public dmw(Context paramContext)
  {
    this.c = paramContext;
    this.d = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final lrm a()
  {
    lrg locallrg1 = new lrg();
    locallrg1.a = "profile";
    locallrg1.b = Integer.valueOf(12);
    locallrg1.c = Integer.valueOf(47);
    locallrg1.d = Integer.valueOf(48);
    lrg locallrg2 = locallrg1.a(Long.valueOf(a.a).longValue());
    lsd locallsd = new lsd(this.c);
    locallsd.b = Long.valueOf(b.a).longValue();
    return locallrg2.a(locallsd.a()).a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    SQLiteDatabase localSQLiteDatabase;
    if (this.d.a(paramInt).c("is_google_plus"))
    {
      Context localContext = this.c;
      String str2;
      long l;
      jyd localjyd;
      ContentValues localContentValues;
      ContentResolver localContentResolver;
      synchronized (brn.b)
      {
        localSQLiteDatabase = bqj.a(localContext, paramInt).getWritableDatabase();
        String str1 = ((giz)mbb.a(localContext, giz.class)).a(paramInt).b("gaia_id");
        str2 = jjf.a(str1);
        paramkck.b("MyProfile");
        biz localbiz = new biz(localContext, new kcg(localContext, paramInt, paramkck), paramInt, str1);
        localbiz.i();
        if (paramlrh != null) {
          paramlrh.a(localbiz);
        }
        localbiz.d("EsPeopleData");
        l = brn.a(localbiz.a);
        if (!brn.a(localSQLiteDatabase, str2, l))
        {
          paramkck.d();
          return;
        }
        localjyd = new jyd(localContext, new kcg(localContext, paramInt, paramkck), paramInt, str1);
        localjyd.i();
        if (paramlrh != null) {
          paramlrh.a(localjyd);
        }
        localjyd.d("EsPeopleData");
        localSQLiteDatabase.beginTransaction();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmw
 * JD-Core Version:    0.7.0.1
 */