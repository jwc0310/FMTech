import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class fkl
  implements Parcelable.Creator<StreetViewPanoramaCamera>
{
  public static StreetViewPanoramaCamera a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    int i = efj.a(paramParcel);
    float f2 = 0.0F;
    int j = 0;
    float f3 = 0.0F;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        efj.b(paramParcel, k);
        break;
      case 1: 
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, k, 4);
        f2 = paramParcel.readFloat();
        break;
      case 3: 
        efj.a(paramParcel, k, 4);
        f3 = paramParcel.readFloat();
        break;
      case 4: 
        efj.a(paramParcel, k, 4);
        f1 = paramParcel.readFloat();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new StreetViewPanoramaCamera(j, f2, f3, f1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkl
 * JD-Core Version:    0.7.0.1
 */