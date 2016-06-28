import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.social.gallery3d.common.FileCache;
import com.google.android.libraries.social.gallery3d.common.FileCache.FileEntry;
import java.io.File;

public final class iar
  extends SQLiteOpenHelper
{
  public iar(FileCache paramFileCache, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    FileCache.FileEntry.a.a(paramSQLiteDatabase);
    File[] arrayOfFile = this.a.a.listFiles();
    int i = arrayOfFile.length;
    int j = 0;
    if (j < i)
    {
      File localFile = arrayOfFile[j];
      if (!localFile.delete())
      {
        String str = String.valueOf(localFile.getAbsolutePath());
        if (str.length() == 0) {
          break label76;
        }
        "fail to remove: ".concat(str);
      }
      for (;;)
      {
        j++;
        break;
        label76:
        new String("fail to remove: ");
      }
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    FileCache.FileEntry.a.b(paramSQLiteDatabase);
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iar
 * JD-Core Version:    0.7.0.1
 */