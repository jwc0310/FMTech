import android.database.Cursor;
import android.os.Bundle;

final class axy
  implements cw<Cursor>
{
  axy(axw paramaxw) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    int i = paramBundle.getInt("account_id", -1);
    String str = paramBundle.getString("view_id");
    return new clr(this.a.f(), i, str, this.a.b);
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axy
 * JD-Core Version:    0.7.0.1
 */