import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.ThemeSettings;

public class ftt
  implements ftm
{
  evj a = new evj();
  
  public ftl a()
  {
    return new fts(this.a.a());
  }
  
  public final ftm a(Bitmap paramBitmap)
  {
    this.a.a = paramBitmap;
    return this;
  }
  
  public final ftm a(Bundle paramBundle)
  {
    evj localevj = this.a;
    if (paramBundle != null) {
      localevj.c.putAll(paramBundle);
    }
    return this;
  }
  
  public final ftm a(fun paramfun)
  {
    evj localevj = this.a;
    ThemeSettings localThemeSettings = new ThemeSettings();
    localThemeSettings.c = paramfun.a;
    localThemeSettings.b = paramfun.b;
    localevj.g = localThemeSettings;
    return this;
  }
  
  public final ftm a(String paramString)
  {
    this.a.b = paramString;
    return this;
  }
  
  public final ftm a(boolean paramBoolean)
  {
    this.a.f = true;
    return this;
  }
  
  public final ftm b(String paramString)
  {
    this.a.d = paramString;
    return this;
  }
  
  public final ftm c(String paramString)
  {
    this.a.e = paramString;
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ftt
 * JD-Core Version:    0.7.0.1
 */