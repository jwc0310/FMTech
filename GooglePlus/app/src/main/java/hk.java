import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public final class hk
  implements Parcelable
{
  public static final Parcelable.Creator<hk> CREATOR = new hl();
  private final int a;
  private final float b;
  
  hk(int paramInt, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public static hk a(Object paramObject)
  {
    float f1 = 1.0F;
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    int i = ((Rating)paramObject).getRatingStyle();
    if (((Rating)paramObject).isRated())
    {
      switch (i)
      {
      default: 
        return null;
      case 1: 
        if (((Rating)paramObject).hasHeart()) {}
        for (float f5 = f1;; f5 = 0.0F) {
          return new hk(1, f5);
        }
      case 2: 
        if (((Rating)paramObject).isThumbUp()) {}
        for (;;)
        {
          return new hk(2, f1);
          f1 = 0.0F;
        }
      case 3: 
      case 4: 
      case 5: 
        float f3 = ((Rating)paramObject).getStarRating();
        hk localhk;
        switch (i)
        {
        default: 
          Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
          localhk = null;
        }
        for (;;)
        {
          return localhk;
          float f4 = 3.0F;
          for (;;)
          {
            if ((f3 >= 0.0F) && (f3 <= f4)) {
              break label244;
            }
            Log.e("Rating", "Trying to set out of range star-based rating");
            localhk = null;
            break;
            f4 = 4.0F;
            continue;
            f4 = 5.0F;
          }
          label244:
          localhk = new hk(i, f3);
        }
      }
      float f2 = ((Rating)paramObject).getPercentRating();
      if ((f2 < 0.0F) || (f2 > 100.0F))
      {
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
      }
      return new hk(6, f2);
    }
    switch (i)
    {
    default: 
      return null;
    }
    return new hk(i, -1.0F);
  }
  
  public final int describeContents()
  {
    return this.a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Rating:style=").append(this.a).append(" rating=");
    if (this.b < 0.0F) {}
    for (String str = "unrated";; str = String.valueOf(this.b)) {
      return str;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeFloat(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hk
 * JD-Core Version:    0.7.0.1
 */