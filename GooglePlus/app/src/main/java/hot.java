import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

public class hot
{
  public final giz a;
  
  public hot(Context paramContext)
  {
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final gnb a(int paramInt)
  {
    String str = this.a.a(paramInt).b("default_collexion_acl");
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    byte[] arrayOfByte = Base64.decode(str, 0);
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
      localParcel.setDataPosition(0);
      localgnb = (gnb)gnb.CREATOR.createFromParcel(localParcel);
      localParcel.recycle();
      return localgnb;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("CollexionsSettingsStore", "Unable to read default collexion acl.", localException);
        gnb localgnb = null;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.b(paramInt1).b("spaces_followed_acl", paramInt2).d();
  }
  
  public final void a(int paramInt, long paramLong)
  {
    this.a.b(paramInt).b("default_collexion_acl_sync_time", paramLong).d();
  }
  
  public final boolean b(int paramInt)
  {
    return this.a.a(paramInt).a("space_follow_consent_state", false);
  }
  
  public final void c(int paramInt)
  {
    this.a.b(paramInt).b("space_follow_consent_state", true).d();
  }
  
  public final int d(int paramInt)
  {
    return this.a.a(paramInt).a("spaces_followed_acl", 0);
  }
  
  public final nfn e(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = this.a.b(paramInt, "spaces_header_data");
      nfn localnfn = (nfn)hqv.a(new nfn(), arrayOfByte);
      return localnfn;
    }
    catch (IOException localIOException)
    {
      if (Log.isLoggable("CollexionsSettingsStore", 3)) {
        localIOException.getMessage();
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hot
 * JD-Core Version:    0.7.0.1
 */