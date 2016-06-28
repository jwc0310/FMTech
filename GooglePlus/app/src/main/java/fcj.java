import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

public class fcj
  extends eib<fcs>
{
  public final fdh<fcs> a = new fdh(this);
  private final String b;
  
  public fcj(Context paramContext, Looper paramLooper, efg paramefg, efi paramefi, String paramString, ehq paramehq)
  {
    super(paramContext, paramLooper, 23, paramehq, paramefg, paramefi);
    this.b = paramString;
  }
  
  protected final String c()
  {
    return "com.google.android.location.internal.GoogleLocationManagerService.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
  }
  
  protected final Bundle e()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("client_name", this.b);
    return localBundle;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcj
 * JD-Core Version:    0.7.0.1
 */