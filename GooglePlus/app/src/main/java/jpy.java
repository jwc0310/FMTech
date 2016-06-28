import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class jpy
  extends isn
{
  public static final Parcelable.Creator<jpy> CREATOR = new jpz();
  private final String a;
  
  protected jpy(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readString();
  }
  
  public jpy(String paramString)
  {
    super(1);
    this.a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof jpy)) && (super.equals(paramObject)) && (TextUtils.equals(((jpy)paramObject).a, this.a));
  }
  
  public final int hashCode()
  {
    int i = super.hashCode();
    if (this.a != null) {}
    for (int j = this.a.hashCode();; j = 0) {
      return j + i * 31;
    }
  }
  
  public final String toString()
  {
    return this.a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpy
 * JD-Core Version:    0.7.0.1
 */