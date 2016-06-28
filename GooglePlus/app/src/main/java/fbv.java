import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

public final class fbv
  implements Parcelable.Creator<ActivityRecognitionResult>
{
  public static ActivityRecognitionResult a(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int j = efj.a(paramParcel);
    ArrayList localArrayList = null;
    long l2 = l1;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        efj.b(paramParcel, m);
        break;
      case 1: 
        localArrayList = efj.c(paramParcel, m, DetectedActivity.CREATOR);
        break;
      case 1000: 
        efj.a(paramParcel, m, 4);
        k = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, m, 8);
        l2 = paramParcel.readLong();
        break;
      case 3: 
        efj.a(paramParcel, m, 8);
        l1 = paramParcel.readLong();
        break;
      case 4: 
        efj.a(paramParcel, m, 4);
        i = paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new ActivityRecognitionResult(k, localArrayList, l2, l1, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbv
 * JD-Core Version:    0.7.0.1
 */