import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.Log;
import android.util.TypedValue;

public class fwk
  implements fwu
{
  fdn a;
  
  fwk() {}
  
  public fwk(byte paramByte)
  {
    this();
    this.a = new fdn();
  }
  
  public Intent a(Activity paramActivity)
  {
    try
    {
      fdn localfdn = this.a;
      Resources.Theme localTheme = paramActivity.getTheme();
      TypedValue localTypedValue1 = new TypedValue();
      TypedValue localTypedValue2 = new TypedValue();
      if ((localTheme.resolveAttribute(16843827, localTypedValue1, true)) && (!localfdn.a.hasExtra("primary_color"))) {
        localfdn.a.putExtra("primary_color", localTypedValue1.data);
      }
      if ((localTheme.resolveAttribute(16843828, localTypedValue2, true)) && (!localfdn.a.hasExtra("primary_color_dark"))) {
        localfdn.a.putExtra("primary_color_dark", localTypedValue2.data);
      }
      eeo.b(paramActivity);
      Intent localIntent = localfdn.a;
      this.a = new fdn();
      return localIntent;
    }
    catch (eeq localeeq)
    {
      Log.e("GcorePlacePickerIntentBuilderImpl", "unable to build PlacePicker intent", localeeq);
      return null;
    }
    catch (eep localeep)
    {
      Log.e("GcorePlacePickerIntentBuilderImpl", "unable to build PlacePicker intent", localeep);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fwk
 * JD-Core Version:    0.7.0.1
 */