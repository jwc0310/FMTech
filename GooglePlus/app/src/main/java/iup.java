import android.net.Uri;
import android.text.TextUtils;

public final class iup
{
  public Uri a;
  public String b;
  public String c;
  public String d;
  public String e;
  public boolean f = true;
  public int g;
  public boolean h;
  
  public final iuo a()
  {
    boolean bool1 = true;
    boolean bool2;
    if ((!TextUtils.isEmpty(this.d)) || (!TextUtils.isEmpty(null)) || (!TextUtils.isEmpty(this.e)))
    {
      bool2 = bool1;
      efj.d(bool2, "must specify an albumId, albumMediaKey or eventId");
      if ((this.a == null) || (this.a == Uri.EMPTY)) {
        break label74;
      }
    }
    for (;;)
    {
      efj.d(bool1, "must specify a mediaUri");
      return new iuo(this);
      bool2 = false;
      break;
      label74:
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iup
 * JD-Core Version:    0.7.0.1
 */