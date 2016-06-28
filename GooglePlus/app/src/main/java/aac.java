import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aac
{
  final Bundle a;
  List<IntentFilter> b;
  
  aac(Bundle paramBundle, List<IntentFilter> paramList)
  {
    this.a = paramBundle;
    this.b = paramList;
  }
  
  final void a()
  {
    if (this.b == null)
    {
      this.b = this.a.getParcelableArrayList("controlFilters");
      if (this.b == null) {
        this.b = Collections.emptyList();
      }
    }
  }
  
  public final boolean b()
  {
    a();
    return (!TextUtils.isEmpty(this.a.getString("id"))) && (!TextUtils.isEmpty(this.a.getString("name"))) && (!this.b.contains(null));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("MediaRouteDescriptor{ ");
    localStringBuilder1.append("id=").append(this.a.getString("id"));
    localStringBuilder1.append(", name=").append(this.a.getString("name"));
    localStringBuilder1.append(", description=").append(this.a.getString("status"));
    localStringBuilder1.append(", isEnabled=").append(this.a.getBoolean("enabled", true));
    localStringBuilder1.append(", isConnecting=").append(this.a.getBoolean("connecting", false));
    StringBuilder localStringBuilder2 = localStringBuilder1.append(", controlFilters=");
    a();
    localStringBuilder2.append(Arrays.toString(this.b.toArray()));
    localStringBuilder1.append(", playbackType=").append(this.a.getInt("playbackType", 1));
    localStringBuilder1.append(", playbackStream=").append(this.a.getInt("playbackStream", -1));
    localStringBuilder1.append(", volume=").append(this.a.getInt("volume"));
    localStringBuilder1.append(", volumeMax=").append(this.a.getInt("volumeMax"));
    localStringBuilder1.append(", volumeHandling=").append(this.a.getInt("volumeHandling", 0));
    localStringBuilder1.append(", presentationDisplayId=").append(this.a.getInt("presentationDisplayId", -1));
    localStringBuilder1.append(", extras=").append(this.a.getBundle("extras"));
    localStringBuilder1.append(", isValid=").append(b());
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aac
 * JD-Core Version:    0.7.0.1
 */