import android.content.ContentResolver;
import android.database.Cursor;
import android.os.AsyncTask;
import java.util.ArrayList;

final class cpn
  extends AsyncTask<String, Void, Void>
{
  private static final String[] a = { "media_url" };
  private final cpm b;
  
  cpn(cpm paramcpm)
  {
    this.b = paramcpm;
  }
  
  private final String[] a(ContentResolver paramContentResolver, String... paramVarArgs)
  {
    if (paramVarArgs == null)
    {
      ArrayList localArrayList = new ArrayList();
      Cursor localCursor = paramContentResolver.query(hbu.a(this.b.f()), a, null, null, null);
      for (;;)
      {
        if (localCursor != null) {}
        try
        {
          if (localCursor.moveToNext()) {
            localArrayList.add(localCursor.getString(0));
          }
        }
        finally
        {
          if (localCursor != null) {
            localCursor.close();
          }
        }
      }
      return (String[])localArrayList.toArray(new String[localArrayList.size()]);
    }
    return paramVarArgs;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpn
 * JD-Core Version:    0.7.0.1
 */