import android.database.Cursor;
import android.os.Bundle;

final class klx
  implements cw<Cursor>
{
  private long a = -1L;
  
  klx(klg paramklg) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    this.a = paramBundle.getLong("extra_draft_id");
    return new knm(this.b.f, this.a, this.b.O);
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klx
 * JD-Core Version:    0.7.0.1
 */