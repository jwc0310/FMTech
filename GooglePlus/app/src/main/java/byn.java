import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;

final class byn
  implements cw<Cursor>
{
  byn(byl parambyl) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    this.a.ad = true;
    if (TextUtils.equals(this.a.a, "15")) {
      return new bxo(this.a.bn, this.a.am.c(), jmd.a, this.a.Z);
    }
    return new ckd(this.a.bn, this.a.am.c(), this.a.a, "interaction_sort_key DESC", true);
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byn
 * JD-Core Version:    0.7.0.1
 */