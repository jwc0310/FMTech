import android.database.ContentObserver;
import android.net.Uri;

final class ctn
  extends ContentObserver
{
  public ctn(ctm paramctm)
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }
  
  public final void onChange(boolean paramBoolean, Uri paramUri)
  {
    ctm.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctn
 * JD-Core Version:    0.7.0.1
 */