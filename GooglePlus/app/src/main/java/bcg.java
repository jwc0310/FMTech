import android.database.Cursor;
import android.os.Bundle;

final class bcg
  implements cw<Cursor>
{
  bcg(bce parambce) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    int i = paramBundle.getInt("account_id", -1);
    String str1 = paramBundle.getString("view_id");
    String str2 = paramBundle.getString("tile_id");
    return new cio(this.a.f(), i, str1, str2);
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bcg
 * JD-Core Version:    0.7.0.1
 */