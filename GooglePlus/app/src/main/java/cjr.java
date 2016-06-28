import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

final class cjr
  implements cw<Cursor>
{
  cjr(cjq paramcjq) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.a.am.e()) {
      return null;
    }
    bp localbp = this.a.f();
    Bundle localBundle = localbp.getIntent().getExtras();
    this.a.b = ((Intent)localBundle.getParcelable("destination_intent"));
    byte[] arrayOfByte = localBundle.getByteArray("circle_actor_data");
    return new hqj(localbp, this.a.am.c(), bpw.a(arrayOfByte));
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjr
 * JD-Core Version:    0.7.0.1
 */