import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ir
  implements Parcelable
{
  public static final Parcelable.Creator<ir> CREATOR = new is();
  public final int a;
  public final long b;
  private final long c;
  private final long d;
  private final float e;
  private final CharSequence f;
  private final long g;
  private List<it> h;
  private final long i;
  private final Bundle j;
  
  private ir(int paramInt, long paramLong1, long paramLong2, float paramFloat, long paramLong3, CharSequence paramCharSequence, long paramLong4, List<it> paramList, long paramLong5, Bundle paramBundle)
  {
    this.a = paramInt;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramFloat;
    this.b = paramLong3;
    this.f = paramCharSequence;
    this.g = paramLong4;
    this.h = new ArrayList(paramList);
    this.i = paramLong5;
    this.j = paramBundle;
  }
  
  ir(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.c = paramParcel.readLong();
    this.e = paramParcel.readFloat();
    this.g = paramParcel.readLong();
    this.d = paramParcel.readLong();
    this.b = paramParcel.readLong();
    this.f = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.createTypedArrayList(it.CREATOR);
    this.i = paramParcel.readLong();
    this.j = paramParcel.readBundle();
  }
  
  public static ir a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    List localList = ((PlaybackState)paramObject).getCustomActions();
    ArrayList localArrayList = null;
    if (localList != null)
    {
      localArrayList = new ArrayList(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(it.a(localIterator.next()));
      }
    }
    if (Build.VERSION.SDK_INT >= 22) {}
    for (Bundle localBundle = ((PlaybackState)paramObject).getExtras();; localBundle = null) {
      return new ir(((PlaybackState)paramObject).getState(), ((PlaybackState)paramObject).getPosition(), ((PlaybackState)paramObject).getBufferedPosition(), ((PlaybackState)paramObject).getPlaybackSpeed(), ((PlaybackState)paramObject).getActions(), ((PlaybackState)paramObject).getErrorMessage(), ((PlaybackState)paramObject).getLastPositionUpdateTime(), localArrayList, ((PlaybackState)paramObject).getActiveQueueItemId(), localBundle);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=").append(this.a);
    localStringBuilder.append(", position=").append(this.c);
    localStringBuilder.append(", buffered position=").append(this.d);
    localStringBuilder.append(", speed=").append(this.e);
    localStringBuilder.append(", updated=").append(this.g);
    localStringBuilder.append(", actions=").append(this.b);
    localStringBuilder.append(", error=").append(this.f);
    localStringBuilder.append(", custom actions=").append(this.h);
    localStringBuilder.append(", active item id=").append(this.i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeLong(this.c);
    paramParcel.writeFloat(this.e);
    paramParcel.writeLong(this.g);
    paramParcel.writeLong(this.d);
    paramParcel.writeLong(this.b);
    TextUtils.writeToParcel(this.f, paramParcel, paramInt);
    paramParcel.writeTypedList(this.h);
    paramParcel.writeLong(this.i);
    paramParcel.writeBundle(this.j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ir
 * JD-Core Version:    0.7.0.1
 */