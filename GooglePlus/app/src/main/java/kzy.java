import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.List;

public final class kzy
  implements kyk
{
  private final giz a;
  
  public kzy(mbb parammbb)
  {
    this.a = ((giz)parammbb.a(giz.class));
  }
  
  public final ofg a(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = this.a.b(paramInt, "squares_on_profile_squares");
      ofg localofg = (ofg)qat.b(new ofg(), arrayOfByte, 0, arrayOfByte.length);
      return localofg;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final void a(int paramInt, oea paramoea)
  {
    if (paramoea != null) {}
    try
    {
      this.a.a(paramInt, "squares_on_profile_visibility", qat.a(paramoea));
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("SquaresSettingsStore", "Error writing community settings", localIOException);
    }
  }
  
  public final void a(int paramInt, ofg paramofg)
  {
    if (paramofg != null) {
      try
      {
        this.a.a(paramInt, "squares_on_profile_squares", qat.a(paramofg));
        return;
      }
      catch (IOException localIOException2)
      {
        Log.e("SquaresSettingsStore", "Error writing user communities", localIOException2);
        return;
      }
    }
    try
    {
      this.a.a(paramInt, "squares_on_profile_squares");
      return;
    }
    catch (IOException localIOException1)
    {
      Log.e("SquaresSettingsStore", "Failed to remove communities cache", localIOException1);
    }
  }
  
  public final void a(Context paramContext, gje paramgje) {}
  
  public final void a(List<gji> paramList) {}
  
  public final oea b(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = this.a.b(paramInt, "squares_on_profile_visibility");
      oea localoea = (oea)qat.b(new oea(), arrayOfByte, 0, arrayOfByte.length);
      return localoea;
    }
    catch (IOException localIOException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzy
 * JD-Core Version:    0.7.0.1
 */