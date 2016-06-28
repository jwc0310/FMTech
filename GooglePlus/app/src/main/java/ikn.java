import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class ikn
  implements ikl
{
  public static final Parcelable.Creator<ikn> CREATOR = new iko();
  public final List<String> a = new ArrayList();
  public final List<String> b = new ArrayList();
  
  public ikn() {}
  
  public ikn(Parcel paramParcel)
  {
    paramParcel.readStringList(this.a);
    paramParcel.readStringList(this.b);
  }
  
  public final boolean a(gjb paramgjb)
  {
    for (int i = 0; i < this.a.size(); i++) {
      if (!paramgjb.c((String)this.a.get(i))) {
        return false;
      }
    }
    for (int j = 0;; j++)
    {
      if (j >= this.b.size()) {
        break label88;
      }
      if (paramgjb.c((String)this.b.get(j))) {
        break;
      }
    }
    label88:
    return true;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringList(this.a);
    paramParcel.writeStringList(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ikn
 * JD-Core Version:    0.7.0.1
 */