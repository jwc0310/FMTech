import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

public abstract class hs
  extends Binder
  implements hr
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
      return true;
    case 1: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str6 = paramParcel1.readString();
      Bundle localBundle6;
      if (paramParcel1.readInt() != 0)
      {
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label370;
        }
      }
      for (il localil = (il)il.CREATOR.createFromParcel(paramParcel1);; localil = null)
      {
        a(str6, localBundle6, localil);
        paramParcel2.writeNoException();
        return true;
        localBundle6 = null;
        break;
      }
    case 2: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      KeyEvent localKeyEvent;
      if (paramParcel1.readInt() != 0)
      {
        localKeyEvent = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
        boolean bool2 = a(localKeyEvent);
        paramParcel2.writeNoException();
        if (!bool2) {
          break label437;
        }
      }
      for (int k = 1;; k = 0)
      {
        paramParcel2.writeInt(k);
        return true;
        localKeyEvent = null;
        break;
      }
    case 3: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      a(hp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      b(hp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      boolean bool1 = a();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool1) {
        j = 1;
      }
      paramParcel2.writeInt(j);
      return true;
    case 6: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str5 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      return true;
    case 7: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str4 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 8: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      PendingIntent localPendingIntent = d();
      paramParcel2.writeNoException();
      if (localPendingIntent != null)
      {
        paramParcel2.writeInt(1);
        localPendingIntent.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      long l = e();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      return true;
    case 10: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      ip localip = f();
      paramParcel2.writeNoException();
      if (localip != null)
      {
        paramParcel2.writeInt(1);
        localip.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 11: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      b(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      g();
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
      {
        a(str3, localBundle5);
        paramParcel2.writeNoException();
        return true;
      }
    case 15: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle4 = null)
      {
        b(str2, localBundle4);
        paramParcel2.writeNoException();
        return true;
      }
    case 16: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      Uri localUri;
      if (paramParcel1.readInt() != 0)
      {
        localUri = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label926;
        }
      }
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
      {
        a(localUri, localBundle3);
        paramParcel2.writeNoException();
        return true;
        localUri = null;
        break;
      }
    case 17: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      a(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      h();
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      i();
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      j();
      paramParcel2.writeNoException();
      return true;
    case 21: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      k();
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      l();
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      m();
      paramParcel2.writeNoException();
      return true;
    case 24: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      b(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      if (paramParcel1.readInt() != 0) {}
      for (hk localhk = (hk)hk.CREATOR.createFromParcel(paramParcel1);; localhk = null)
      {
        a(localhk);
        paramParcel2.writeNoException();
        return true;
      }
    case 26: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str1 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        c(str1, localBundle2);
        paramParcel2.writeNoException();
        return true;
      }
    case 27: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      hh localhh = n();
      paramParcel2.writeNoException();
      if (localhh != null)
      {
        paramParcel2.writeInt(1);
        localhh.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 28: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      ir localir = o();
      paramParcel2.writeNoException();
      if (localir != null)
      {
        paramParcel2.writeInt(1);
        localir.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 29: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      List localList = p();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(localList);
      return true;
    case 30: 
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      CharSequence localCharSequence = q();
      paramParcel2.writeNoException();
      if (localCharSequence != null)
      {
        paramParcel2.writeInt(1);
        TextUtils.writeToParcel(localCharSequence, paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 31: 
      label370:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      label437:
      Bundle localBundle1 = r();
      label926:
      paramParcel2.writeNoException();
      if (localBundle1 != null)
      {
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    }
    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
    int i = s();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hs
 * JD-Core Version:    0.7.0.1
 */