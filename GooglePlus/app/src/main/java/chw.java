import android.database.Cursor;
import android.os.Bundle;

final class chw
  implements cw<Cursor>
{
  chw(chu paramchu) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    int i = this.a.at.c();
    if (paramInt == 6) {
      return new bxd(this.a.f(), i, dgm.a, this.a.c, 2, true, null);
    }
    if (paramInt == 7) {
      return new clg(this.a.aI_(), i, dgm.b, this.a.c, true, true, true, null, 10);
    }
    if (paramInt == 8) {
      return new ckd(this.a.aI_(), i, true, true);
    }
    return null;
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chw
 * JD-Core Version:    0.7.0.1
 */