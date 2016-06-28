import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public final class hlv
  extends gzf
{
  private final String a;
  private final int b;
  private final int c;
  private final Uri d;
  
  public hlv(int paramInt1, String paramString, int paramInt2, Uri paramUri)
  {
    super("UpdateFollowStateBackgroundTask");
    this.c = paramInt1;
    this.a = paramString;
    this.b = paramInt2;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    this.d = ((Uri)paramUri);
  }
  
  private final void a(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.c);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      int j;
      try
      {
        String[] arrayOfString1 = hog.a;
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = this.a;
        Cursor localCursor = localSQLiteDatabase.query("srchcxns", arrayOfString1, "cxn_id=?", arrayOfString2, null, null, null, null);
        int i = localCursor.getCount();
        j = 0;
        if (j < i)
        {
          rcj localrcj = efj.a(localCursor, j);
          if (localrcj != null)
          {
            localrcj.a.e = paramInt;
            ContentValues localContentValues = efj.a(localrcj);
            String[] arrayOfString3 = new String[1];
            arrayOfString3[0] = this.a;
            localSQLiteDatabase.update("srchcxns", localContentValues, "cxn_id=?", arrayOfString3);
          }
        }
        else
        {
          localCursor.close();
          localSQLiteDatabase.setTransactionSuccessful();
          return;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      j++;
    }
  }
  
  protected final hae a(Context paramContext)
  {
    hkt localhkt = new hkt(paramContext, new kch().a(paramContext, this.c).a(), this.a, this.b);
    localhkt.i();
    if (localhkt.n()) {
      return new hae(localhkt.o, localhkt.q, null);
    }
    qat localqat1;
    qat localqat2;
    label92:
    qat localqat3;
    label116:
    int i;
    SQLiteDatabase localSQLiteDatabase;
    int j;
    if (localhkt.x)
    {
      localqat1 = localhkt.w;
      if (localqat1 == null) {
        break label429;
      }
      if (!localhkt.x) {
        break label394;
      }
      localqat2 = localhkt.w;
      if (((nce)localqat2).a == null) {
        break label429;
      }
      if (!localhkt.x) {
        break label400;
      }
      localqat3 = localhkt.w;
      i = ((nce)localqat3).a.a;
      localSQLiteDatabase = hsb.a(paramContext, this.c);
      localSQLiteDatabase.beginTransaction();
      if (i != 4)
      {
        j = 0;
        if (i != 5) {}
      }
      else
      {
        j = 1;
      }
    }
    label394:
    label400:
    label423:
    for (;;)
    {
      try
      {
        ContentValues localContentValues = new ContentValues(1);
        localContentValues.put("follow_state", Integer.valueOf(i));
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = this.a;
        localSQLiteDatabase.update("cxns", localContentValues, "cxn_id=?", arrayOfString1);
        Object[] arrayOfObject = new Object[2];
        if (j != 0)
        {
          str1 = "1";
          arrayOfObject[0] = str1;
          arrayOfObject[1] = this.a;
          localSQLiteDatabase.execSQL("UPDATE cxns SET follow_count = MAX(0, IFNULL(follow_count, 0) + ?) WHERE cxn_id = ?", arrayOfObject);
          if ((i == 6) || (j != 0))
          {
            String str2 = ((giz)mbb.a(paramContext, giz.class)).a(this.c).b("gaia_id");
            String[] arrayOfString2 = new String[2];
            arrayOfString2[0] = str2;
            arrayOfString2[1] = Integer.toString(2);
            localSQLiteDatabase.delete("cnxs_sync_timestamps", "owner_gaia_id=? AND type=?", arrayOfString2);
          }
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          if (!localhkt.x) {
            break label423;
          }
          localqat4 = localhkt.w;
          a(paramContext, ((nce)localqat4).a.a);
          paramContext.getContentResolver().notifyChange(this.d, null);
          return new hae(localhkt.o, localhkt.q, null);
          localqat1 = null;
          break;
          localqat2 = null;
          break label92;
          localqat3 = null;
          break label116;
        }
        String str1 = "-1";
        continue;
        qat localqat4 = null;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    label429:
    return new hae(0, null, null);
  }
  
  public final String b(Context paramContext)
  {
    switch (this.b)
    {
    default: 
      int i = this.b;
      throw new IllegalStateException(32 + "Invalid follow state " + i);
    case 1: 
      return paramContext.getString(efj.In);
    }
    return paramContext.getString(efj.Ir);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlv
 * JD-Core Version:    0.7.0.1
 */