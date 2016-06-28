import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import java.util.ArrayList;

final class acc
  extends abv
{
  private static final ArrayList<IntentFilter> k;
  final AudioManager i;
  int j = -1;
  private final ace l;
  
  static
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
    localIntentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
    ArrayList localArrayList = new ArrayList();
    k = localArrayList;
    localArrayList.add(localIntentFilter);
  }
  
  public acc(Context paramContext)
  {
    super(paramContext);
    this.i = ((AudioManager)paramContext.getSystemService("audio"));
    this.l = new ace(this);
    paramContext.registerReceiver(this.l, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
    a();
  }
  
  public final aaj a(String paramString)
  {
    if (paramString.equals("DEFAULT_ROUTE")) {
      return new acd(this);
    }
    return null;
  }
  
  final void a()
  {
    Resources localResources = this.a.getResources();
    int m = this.i.getStreamMaxVolume(3);
    this.j = this.i.getStreamVolume(3);
    aad localaad = new aad("DEFAULT_ROUTE", localResources.getString(efj.bE)).a(k);
    localaad.a.putInt("playbackStream", 3);
    localaad.a.putInt("playbackType", 0);
    localaad.a.putInt("volumeHandling", 1);
    localaad.a.putInt("volumeMax", m);
    int n = this.j;
    localaad.a.putInt("volume", n);
    aac localaac = localaad.a();
    a(new aal().a(localaac).a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acc
 * JD-Core Version:    0.7.0.1
 */