import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;

final class kma
  implements cw<Cursor>
{
  private final String[] a = { "square_id", "square_name", "photo_url", "restricted_domain", "square_streams", "post_visibility" };
  
  kma(klg paramklg) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.b.d.e()) {
      return null;
    }
    if ((this.b.t) || (this.b.u)) {}
    for (int i = 1;; i = 0)
    {
      kzp localkzp = new kzp(this.b.f.getBaseContext(), this.b.O, this.a);
      localkzp.a(1);
      if (this.b.s) {
        localkzp.r.appendWhere(" AND restricted_domain!=''");
      }
      if (i != 0) {
        localkzp.b(1);
      }
      return localkzp;
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kma
 * JD-Core Version:    0.7.0.1
 */