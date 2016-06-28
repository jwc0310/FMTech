import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;

abstract class btv
{
  final int a;
  final int b;
  
  public btv(btl parambtl, int paramInt)
  {
    this(parambtl, paramInt, -1);
  }
  
  public btv(btl parambtl, int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  protected abstract String a();
  
  protected final void a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor, int paramInt, Uri paramUri)
  {
    long l = System.currentTimeMillis();
    int i = this.c.k.a(paramInt);
    ContentValues localContentValues = new ContentValues();
    int j = g();
    try
    {
      int k;
      String str1;
      String str2;
      String str3;
      int m;
      String str4;
      String str5;
      String str6;
      return;
    }
    finally
    {
      paramCursor.close();
      k = this.c.k.a(paramInt) - i;
      if ((paramUri != null) && (k != 0)) {
        this.c.f.getContentResolver().notifyChange(paramUri, null);
      }
      if (Log.isLoggable("MediaSyncManager", 4))
      {
        str1 = String.valueOf(h());
        str2 = String.valueOf(btl.a(paramInt));
        str3 = String.valueOf(efj.a(System.currentTimeMillis() - l));
        new StringBuilder(39 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append("[").append(str1).append(" ").append(str2).append("] downloaded: ").append(k).append(", duration: ").append(str3);
      }
    }
  }
  
  protected abstract String[] b();
  
  protected abstract String c();
  
  protected abstract String[] d();
  
  protected abstract String e();
  
  protected abstract String f();
  
  protected abstract int g();
  
  protected abstract String h();
  
  protected Uri i()
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btv
 * JD-Core Version:    0.7.0.1
 */