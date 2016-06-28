import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

final class dbo
  extends hqj
{
  private int r = this.t.a.c();
  
  dbo(dbm paramdbm, Context paramContext1, Uri paramUri, Context paramContext2)
  {
    super(paramContext1, paramUri);
  }
  
  public final Cursor o()
  {
    return bqo.a(this.s, this.r, this.t.d, cce.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbo
 * JD-Core Version:    0.7.0.1
 */