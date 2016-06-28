import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class irn
  implements ipa
{
  public static final Parcelable.Creator<irn> CREATOR = new iro();
  private final ipf a;
  private String b;
  
  public irn(Context paramContext, Uri paramUri, ipm paramipm)
  {
    this.a = ipf.a(paramContext, paramUri, paramipm);
  }
  
  irn(Parcel paramParcel)
  {
    this.a = ((ipf)paramParcel.readParcelable(ipf.class.getClassLoader()));
  }
  
  public irn(ipf paramipf)
  {
    this.a = paramipf;
  }
  
  public static ipm a(Context paramContext, Uri paramUri, ipm paramipm)
  {
    String str = mfq.b(paramContext.getContentResolver(), paramUri);
    if (str == null) {}
    do
    {
      return null;
      if (str.contains("video")) {
        return ipm.b;
      }
    } while (!str.contains("image"));
    return ipm.a;
  }
  
  public static irn a(Context paramContext, Uri paramUri)
  {
    ipm localipm = a(paramContext, paramUri, null);
    irn localirn = null;
    if (localipm != null) {
      localirn = new irn(paramContext, paramUri, localipm);
    }
    return localirn;
  }
  
  public final void a(String paramString)
  {
    this.b = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final ipf e()
  {
    return this.a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof irn)) {}
    ipf localipf;
    do
    {
      return false;
      localipf = ((ipa)paramObject).e();
      if ((localipf == null) && (this.a == null)) {
        return true;
      }
    } while ((localipf == null) || (this.a == null));
    return localipf.equals(this.a);
  }
  
  public final String f()
  {
    return this.b;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irn
 * JD-Core Version:    0.7.0.1
 */