import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.plus.content.EsProvider;

public final class clg
  extends hqj
{
  private final fv r = new fv(this);
  private final int s;
  private final String[] t;
  private Uri u;
  
  public clg(Context paramContext, int paramInt1, String[] paramArrayOfString, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, int paramInt2)
  {
    super(paramContext);
    this.d = EsProvider.f(paramContext);
    if (paramBoolean3) {}
    for (String str1 = "gaia_id IS NOT NULL";; str1 = null)
    {
      this.f = str1;
      this.s = paramInt1;
      this.t = paramArrayOfString;
      String str2 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("gaia_id");
      this.u = EsProvider.a(paramContext, this.s, str2, paramString1, paramBoolean1, paramBoolean2, paramString2, 10);
      return;
    }
  }
  
  public final Cursor o()
  {
    Context localContext = this.l;
    brn.d(localContext, this.s);
    Cursor localCursor = localContext.getContentResolver().query(this.u, this.t, this.f, null, null);
    if (localCursor != null) {
      localCursor.registerContentObserver(this.r);
    }
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clg
 * JD-Core Version:    0.7.0.1
 */