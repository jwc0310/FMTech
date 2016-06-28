import android.content.Context;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;

public final class cyu
  implements hed
{
  private final Context a;
  
  public cyu(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = jrf.a(null, paramString2, paramString1, "ALBUM");
    String str = jrf.a(3, arrayOfString);
    jqa localjqa = new jqa(this.a, HostStreamSingleAlbumTileActivity.class, ((git)mbb.a(this.a, git.class)).c());
    localjqa.a = str;
    localjqa.b = paramString3;
    this.a.startActivity(localjqa.a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyu
 * JD-Core Version:    0.7.0.1
 */