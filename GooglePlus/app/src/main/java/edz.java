import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class edz
  implements Parcelable.Creator<LogEventParcelable>
{
  public static LogEventParcelable a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    byte[] arrayOfByte = null;
    PlayLoggerContext localPlayLoggerContext = null;
    int j = 0;
    int[] arrayOfInt = null;
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
        localPlayLoggerContext = (PlayLoggerContext)efj.a(paramParcel, k, PlayLoggerContext.CREATOR);
        break;
      case 3: 
        arrayOfByte = efj.h(paramParcel, k);
        break;
      case 4: 
        arrayOfInt = efj.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new LogEventParcelable(j, localPlayLoggerContext, arrayOfByte, arrayOfInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edz
 * JD-Core Version:    0.7.0.1
 */