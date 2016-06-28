import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public final class hlw
  extends gzf
{
  private final String a;
  private final int b;
  private final int c;
  
  public hlw(int paramInt1, String paramString, int paramInt2)
  {
    super("UpdateSubscribeStateTask");
    this.c = paramInt1;
    this.a = paramString;
    this.b = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    hku localhku = new hku(paramContext, new kch().a(paramContext, this.c).a(), this.a, this.b);
    localhku.i();
    if (localhku.n()) {
      return new hae(localhku.o, localhku.q, null);
    }
    qat localqat1;
    qat localqat2;
    label92:
    ContentValues localContentValues;
    if (localhku.x)
    {
      localqat1 = localhku.w;
      if (localqat1 == null) {
        break label263;
      }
      if (!localhku.x) {
        break label251;
      }
      localqat2 = localhku.w;
      if (((nci)localqat2).a == null) {
        break label263;
      }
      localContentValues = new ContentValues(1);
      if (!localhku.x) {
        break label257;
      }
    }
    label257:
    for (qat localqat3 = localhku.w;; localqat3 = null)
    {
      localContentValues.put("subscribe_state", Integer.valueOf(((nci)localqat3).a.a));
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.c);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.a;
      localSQLiteDatabase.update("cxns", localContentValues, "cxn_id = ?", arrayOfString);
      paramContext.getContentResolver().notifyChange(((hho)mbb.a(paramContext, hho.class)).a(this.a), null);
      hae localhae = new hae(localhku.o, localhku.q, null);
      localhae.a().putInt("SubscribeAction", this.b);
      return localhae;
      localqat1 = null;
      break;
      label251:
      localqat2 = null;
      break label92;
    }
    label263:
    return new hae(0, null, null);
  }
  
  public final String b(Context paramContext)
  {
    if (this.b == 1) {}
    for (int i = efj.Iw;; i = efj.Iv) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlw
 * JD-Core Version:    0.7.0.1
 */