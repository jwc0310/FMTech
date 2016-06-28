import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class ibu
  implements ikp
{
  public static final Parcelable.Creator<ibu> CREATOR = new ibv();
  private String a;
  
  ibu(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }
  
  public ibu(String paramString)
  {
    this.a = paramString;
  }
  
  public final int a(giz paramgiz)
  {
    List localList = paramgiz.a();
    int i = localList.size();
    int j = -1;
    int k = 0;
    while (k < i)
    {
      int m = ((Integer)localList.get(k)).intValue();
      gjb localgjb = paramgiz.a(m);
      if (this.a.equals(localgjb.b("email_gaia_id")))
      {
        if (localgjb.a()) {
          return m;
        }
      }
      else {
        m = j;
      }
      k++;
      j = m;
    }
    return j;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibu
 * JD-Core Version:    0.7.0.1
 */