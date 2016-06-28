import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

final class iur
{
  final String a;
  final Context b;
  final irc c;
  final String d;
  final ply e;
  final qmg f;
  final nrz g;
  long h;
  String i;
  boolean j;
  long k;
  Uri l;
  Uri m;
  irc n;
  
  iur(Context paramContext, Uri paramUri, String paramString1, String paramString2, ply paramply, qmg paramqmg, nrz paramnrz)
  {
    this.b = paramContext;
    this.l = paramUri;
    this.m = paramUri;
    this.d = paramString1;
    this.e = paramply;
    this.f = paramqmg;
    this.g = paramnrz;
    irc localirc;
    if (paramString2 != null)
    {
      this.a = paramString2;
      localirc = a(this.m);
      this.c = localirc;
      this.n = this.c;
      if (localirc != null) {
        break label159;
      }
    }
    label159:
    for (long l1 = 0L;; l1 = localirc.b)
    {
      this.k = l1;
      if (this.k > 0L) {
        break label169;
      }
      String str2 = String.valueOf(this.m);
      throw new itm(17 + String.valueOf(str2).length() + "Empty content at " + str2, (byte)0);
      paramString2 = efj.c(paramContext, paramUri);
      break;
    }
    label169:
    String str1;
    if (mfq.b(paramUri))
    {
      ius localius = a(paramUri, this.a);
      str1 = localius.a;
      this.h = localius.b;
    }
    for (;;)
    {
      if (str1 == null) {
        str1 = paramUri.toString();
      }
      int i1 = str1.lastIndexOf('/');
      if (i1 != -1) {
        str1 = str1.substring(i1 + 1);
      }
      this.i = str1;
      return;
      this.h = System.currentTimeMillis();
      str1 = null;
    }
  }
  
  private final irc a(Uri paramUri)
  {
    ContentResolver localContentResolver = this.b.getContentResolver();
    try
    {
      irc localirc = irc.b(localContentResolver.openInputStream(paramUri));
      return localirc;
    }
    catch (IOException localIOException)
    {
      return null;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return null;
  }
  
  private final ius a(Uri paramUri, String paramString)
  {
    String str2;
    if (mfq.b(paramString)) {
      str2 = "datetaken";
    }
    for (;;)
    {
      String[] arrayOfString = { str2, "_data" };
      try
      {
        Cursor localCursor2 = this.b.getContentResolver().query(paramUri, arrayOfString, null, null, null);
        localCursor1 = localCursor2;
        if (localCursor1 != null) {}
        try
        {
          if (localCursor1.moveToNext())
          {
            ius localius = new ius(localCursor1.getString(localCursor1.getColumnIndexOrThrow("_data")), localCursor1.getLong(localCursor1.getColumnIndexOrThrow(str2)));
            if (localCursor1 != null) {
              localCursor1.close();
            }
            return localius;
            if (mfq.c(paramString))
            {
              str2 = "datetaken";
            }
            else
            {
              String str1 = String.valueOf(paramUri);
              throw new itp(20 + String.valueOf(str1).length() + "Invalid content at: " + str1, true);
            }
          }
          else
          {
            String str3 = String.valueOf(paramUri);
            throw new itm(20 + String.valueOf(str3).length() + "No content for URI: " + str3, (byte)0);
          }
        }
        finally {}
      }
      finally
      {
        Cursor localCursor1 = null;
      }
    }
    if (localCursor1 != null) {
      localCursor1.close();
    }
    throw localObject1;
  }
  
  public final void a()
  {
    Uri localUri = efj.e(this.b, this.m);
    if (localUri != null)
    {
      this.m = localUri;
      irc localirc = a(this.m);
      this.n = localirc;
      this.k = localirc.b;
      this.j = true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iur
 * JD-Core Version:    0.7.0.1
 */