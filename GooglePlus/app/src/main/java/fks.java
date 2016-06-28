import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;

public final class fks
  implements Parcelable.Creator<GoogleMapOptions>
{
  public static GoogleMapOptions a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    int j = 0;
    byte b1 = -1;
    byte b2 = -1;
    int k = 0;
    CameraPosition localCameraPosition = null;
    byte b3 = -1;
    byte b4 = -1;
    byte b5 = -1;
    byte b6 = -1;
    byte b7 = -1;
    byte b8 = -1;
    byte b9 = -1;
    byte b10 = -1;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      case 13: 
      default: 
        efj.b(paramParcel, m);
        break;
      case 1: 
        efj.a(paramParcel, m, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, m, 4);
        b1 = (byte)paramParcel.readInt();
        break;
      case 3: 
        efj.a(paramParcel, m, 4);
        b2 = (byte)paramParcel.readInt();
        break;
      case 4: 
        efj.a(paramParcel, m, 4);
        k = paramParcel.readInt();
        break;
      case 5: 
        localCameraPosition = (CameraPosition)efj.a(paramParcel, m, CameraPosition.CREATOR);
        break;
      case 6: 
        efj.a(paramParcel, m, 4);
        b3 = (byte)paramParcel.readInt();
        break;
      case 7: 
        efj.a(paramParcel, m, 4);
        b4 = (byte)paramParcel.readInt();
        break;
      case 8: 
        efj.a(paramParcel, m, 4);
        b5 = (byte)paramParcel.readInt();
        break;
      case 9: 
        efj.a(paramParcel, m, 4);
        b6 = (byte)paramParcel.readInt();
        break;
      case 10: 
        efj.a(paramParcel, m, 4);
        b7 = (byte)paramParcel.readInt();
        break;
      case 11: 
        efj.a(paramParcel, m, 4);
        b8 = (byte)paramParcel.readInt();
        break;
      case 12: 
        efj.a(paramParcel, m, 4);
        b9 = (byte)paramParcel.readInt();
        break;
      case 14: 
        efj.a(paramParcel, m, 4);
        b10 = (byte)paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new GoogleMapOptions(j, b1, b2, k, localCameraPosition, b3, b4, b5, b6, b7, b8, b9, b10);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fks
 * JD-Core Version:    0.7.0.1
 */