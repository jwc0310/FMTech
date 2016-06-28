import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public final class lsc
  implements lrr
{
  private final Context a;
  private final long b;
  private final lsb c;
  
  lsc(lsd paramlsd)
  {
    this.a = paramlsd.a;
    this.b = paramlsd.b;
    this.c = ((lsb)mbb.a(this.a, lsb.class));
  }
  
  static boolean a(Intent paramIntent)
  {
    if (paramIntent == null) {
      return true;
    }
    int i = paramIntent.getIntExtra("plugged", -1);
    String str1;
    if (Log.isLoggable("OnChargerRequirement", 3)) {
      switch (i)
      {
      case 3: 
      default: 
        str1 = 21 + "UNKNOWN (" + i + ")";
        String str2 = String.valueOf(str1);
        if (str2.length() != 0) {
          "current battery state: ".concat(str2);
        }
        break;
      }
    }
    for (;;)
    {
      if (i != -1) {
        break label150;
      }
      return true;
      str1 = "BATTERY_PLUGGED_AC";
      break;
      str1 = "BATTERY_PLUGGED_USB";
      break;
      str1 = "BATTERY_PLUGGED_WIRELESS";
      break;
      str1 = "ON_BATTERY";
      break;
      new String("current battery state: ");
    }
    label150:
    return i > 0;
  }
  
  public final int a()
  {
    return 1;
  }
  
  public final boolean a(int paramInt)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    Intent localIntent = this.a.getApplicationContext().registerReceiver(null, localIntentFilter);
    if (localIntent != null) {
      localIntent.getIntExtra("plugged", -1);
    }
    if (a(localIntent)) {
      return true;
    }
    this.c.a(paramInt);
    return false;
  }
  
  public final long b()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsc
 * JD-Core Version:    0.7.0.1
 */