import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

final class cli
  implements cw<Cursor>
{
  cli(clh paramclh) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    bp localbp = this.a.f();
    byte[] arrayOfByte = localbp.getIntent().getExtras().getByteArray("circle_actor_data");
    return new hqj(localbp, this.a.am.c(), bpw.a(arrayOfByte));
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cli
 * JD-Core Version:    0.7.0.1
 */