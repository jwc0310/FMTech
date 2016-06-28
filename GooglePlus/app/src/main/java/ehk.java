import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

public final class ehk
  implements Parcelable.Creator<DataHolder>
{
  public static DataHolder a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = efj.a(paramParcel);
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
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
        arrayOfString = efj.j(paramParcel, m);
        break;
      case 1000: 
        efj.a(paramParcel, m, 4);
        k = paramParcel.readInt();
        break;
      case 2: 
        arrayOfCursorWindow = (CursorWindow[])efj.b(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3: 
        efj.a(paramParcel, m, 4);
        i = paramParcel.readInt();
        break;
      case 4: 
        localBundle = efj.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    DataHolder localDataHolder = new DataHolder(k, arrayOfString, arrayOfCursorWindow, i, localBundle);
    localDataHolder.a();
    return localDataHolder;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehk
 * JD-Core Version:    0.7.0.1
 */