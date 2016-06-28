import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class hlf
  extends gzf
{
  private final int a;
  private final String b;
  
  private hlf(int paramInt, String paramString)
  {
    super("GetCollexionByIdTask");
    this.a = paramInt;
    this.b = paramString;
  }
  
  public static void a(Context paramContext, gzj paramgzj, int paramInt, String paramString)
  {
    if (!((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).a(paramString), 1)) {
      return;
    }
    hlf localhlf = new hlf(paramInt, paramString);
    if (paramgzj == null)
    {
      gzj.a(paramContext, localhlf);
      return;
    }
    paramgzj.b(localhlf);
  }
  
  protected final hae a(Context paramContext)
  {
    hkc localhkc = new hkc(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localhkc.i();
    hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
    if (localhkc.n())
    {
      if ((localhkc.o == 404) || ((localhkc.q != null) && ((localhkc.q instanceof kdd)) && (((kdd)localhkc.q).c == 404)))
      {
        SQLiteDatabase localSQLiteDatabase2 = hsb.a(paramContext, this.a);
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.b;
        localSQLiteDatabase2.delete("cxns", "cxn_id =? ", arrayOfString);
      }
      String str3 = this.b;
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).a(str3), 2);
      return new hae(localhkc.o, localhkc.q, null);
    }
    qat localqat1;
    qat localqat2;
    label209:
    qat localqat3;
    label233:
    qat localqat4;
    label260:
    qat localqat5;
    label290:
    int i;
    if (localhkc.x)
    {
      localqat1 = localhkc.w;
      if (localqat1 == null) {
        break label490;
      }
      if (!localhkc.x) {
        break label450;
      }
      localqat2 = localhkc.w;
      if (((msw)localqat2).a == null) {
        break label490;
      }
      if (!localhkc.x) {
        break label456;
      }
      localqat3 = localhkc.w;
      if (((msw)localqat3).a.a == null) {
        break label490;
      }
      if (!localhkc.x) {
        break label462;
      }
      localqat4 = localhkc.w;
      if (((msw)localqat4).a.a.b == null) {
        break label490;
      }
      if (!localhkc.x) {
        break label468;
      }
      localqat5 = localhkc.w;
      if (((msw)localqat5).a.a.c == null) {
        break label490;
      }
      i = this.a;
      if (!localhkc.x) {
        break label474;
      }
    }
    SQLiteDatabase localSQLiteDatabase1;
    label450:
    label456:
    label462:
    label468:
    label474:
    for (qat localqat6 = localhkc.w;; localqat6 = null)
    {
      nei localnei = ((msw)localqat6).a.a;
      localSQLiteDatabase1 = hsb.a(paramContext, i);
      localSQLiteDatabase1.beginTransaction();
      try
      {
        efj.a(localSQLiteDatabase1, localnei, Long.valueOf(System.currentTimeMillis()));
        localSQLiteDatabase1.setTransactionSuccessful();
        localSQLiteDatabase1.endTransaction();
        String str2 = this.b;
        localhhn.a(((hho)mbb.a(paramContext, hho.class)).a(str2), 3);
        return new hae(200, null, null);
      }
      finally
      {
        localSQLiteDatabase1.endTransaction();
      }
      localqat1 = null;
      break;
      localqat2 = null;
      break label209;
      localqat3 = null;
      break label233;
      localqat4 = null;
      break label260;
      localqat5 = null;
      break label290;
    }
    label490:
    String str1;
    localhhn.a(((hho)mbb.a(paramContext, hho.class)).a(str1), 2);
    return new hae(0, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlf
 * JD-Core Version:    0.7.0.1
 */