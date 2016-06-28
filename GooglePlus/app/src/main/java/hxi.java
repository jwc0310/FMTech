import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashSet;

public final class hxi
{
  public static final Uri a = Uri.parse("content://com.google.android.libraries.social.events/events");
  
  public static void a(Context paramContext, int paramInt)
  {
    if (paramInt == null) {}
    ContentValues localContentValues;
    String[] arrayOfString;
    Object localObject;
    do
    {
      okm localokm;
      do
      {
        return;
        localokm = (okm)paramInt.b(okm.a);
      } while ((localokm == null) || (localokm.b == null) || (TextUtils.isEmpty(localokm.b.d)));
      localContentValues = new ContentValues(4);
      localContentValues.put("data", qat.a(paramInt));
      localContentValues.put("tile_id", paramInt.a);
      localContentValues.put("fingerprint", Integer.valueOf(paramInt.hashCode()));
      ojd localojd = localokm.b.a;
      if ((localojd != null) && (!TextUtils.isEmpty(localojd.a))) {
        localContentValues.put("url", iqw.b(localojd.a));
      }
      arrayOfString = new String[1];
      arrayOfString[0] = localokm.b.d;
    } while ((paramContext.update("event_activities", localContentValues, "photo_id = ?", arrayOfString) <= 0) || (localObject == null));
    localObject.add(a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxi
 * JD-Core Version:    0.7.0.1
 */