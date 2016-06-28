import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class fao
  extends fah
{
  fao(Context paramContext, Uri paramUri, fag paramfag) {}
  
  public final void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    this.a.revokeUriPermission(this.b, 1);
    this.c.a(paramInt1, paramBundle, paramInt2, paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fao
 * JD-Core Version:    0.7.0.1
 */