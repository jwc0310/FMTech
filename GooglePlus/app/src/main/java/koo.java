import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.sharekit.reshare.ReshareChooserActivity;

public final class koo
{
  public final Intent a;
  
  public koo(Context paramContext)
  {
    this.a = new Intent(paramContext, ReshareChooserActivity.class);
  }
  
  public final koo a(koz paramkoz)
  {
    this.a.putExtra(koz.class.getName(), new owu(null, paramkoz));
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     koo
 * JD-Core Version:    0.7.0.1
 */