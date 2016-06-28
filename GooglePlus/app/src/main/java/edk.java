import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class edk
  extends Binder
  implements edj
{
  final AtomicReference<ecx> a;
  final Handler b;
  
  public edk()
  {
    attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
  }
  
  public edk(ecx paramecx)
  {
    this();
    this.a = new AtomicReference(paramecx);
    this.b = new Handler(paramecx.j);
  }
  
  static void a(ecx paramecx, long paramLong, int paramInt)
  {
    synchronized (ecx.f(paramecx))
    {
      eft localeft = (eft)ecx.f(paramecx).remove(Long.valueOf(paramLong));
      if (localeft != null) {
        localeft.a(new Status(paramInt));
      }
      return;
    }
  }
  
  static boolean a(ecx paramecx, int paramInt)
  {
    synchronized (ecx.h)
    {
      if (ecx.g(paramecx) != null)
      {
        ecx.g(paramecx).a(new Status(paramInt));
        ecx.b(paramecx, null);
        return true;
      }
      return false;
    }
  }
  
  public void a()
  {
    ecx.a.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
  }
  
  public void a(int paramInt)
  {
    ecx localecx = b();
    if (localecx == null) {}
    do
    {
      return;
      edm localedm = ecx.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localedm.a("ICastDeviceControllerListener.onDisconnected: %d", arrayOfObject);
    } while (paramInt == 0);
    localecx.a(2);
  }
  
  public void a(long paramLong)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    a(localecx, paramLong, 0);
  }
  
  public void a(long paramLong, int paramInt)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    a(localecx, paramLong, paramInt);
  }
  
  public void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    ecx.a(localecx, paramApplicationMetadata);
    ecx.a(localecx, paramApplicationMetadata.b);
    ecx.b(localecx, paramString2);
    synchronized (ecx.g)
    {
      if (ecx.b(localecx) != null)
      {
        ecx.b(localecx).a(new ecy(new Status(0), paramApplicationMetadata, paramString1, paramString2, paramBoolean));
        ecx.a(localecx, null);
      }
      return;
    }
  }
  
  public void a(ApplicationStatus paramApplicationStatus)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    ecx.a.a("onApplicationStatusChanged", new Object[0]);
    this.b.post(new edb(this, localecx, paramApplicationStatus));
  }
  
  public void a(DeviceStatus paramDeviceStatus)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    ecx.a.a("onDeviceStatusChanged", new Object[0]);
    this.b.post(new eda(this, localecx, paramDeviceStatus));
  }
  
  public void a(String paramString1, String paramString2)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    ecx.a.a("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
    this.b.post(new edc(this, localecx, paramString1, paramString2));
  }
  
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    if ((ecx)this.a.get() == null) {
      return;
    }
    edm localedm = ecx.a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramArrayOfByte.length);
    localedm.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", arrayOfObject);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public ecx b()
  {
    ecx localecx = (ecx)this.a.getAndSet(null);
    if (localecx == null) {
      return null;
    }
    ecx.a(localecx);
    return localecx;
  }
  
  public void b(int paramInt)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    synchronized (ecx.g)
    {
      if (ecx.b(localecx) != null)
      {
        ecx.b(localecx).a(new ecy(new Status(paramInt)));
        ecx.a(localecx, null);
      }
      return;
    }
  }
  
  public void c(int paramInt)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    a(localecx, paramInt);
  }
  
  public boolean c()
  {
    return this.a.get() == null;
  }
  
  public void d(int paramInt)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {
      return;
    }
    a(localecx, paramInt);
  }
  
  public void e(int paramInt)
  {
    ecx localecx = (ecx)this.a.get();
    if (localecx == null) {}
    do
    {
      return;
      ecx.a(localecx, null);
      ecx.b(localecx, null);
      a(localecx, paramInt);
    } while (ecx.c(localecx) == null);
    this.b.post(new ecz(this, localecx, paramInt));
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readInt());
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      int k = paramParcel1.readInt();
      ApplicationMetadata localApplicationMetadata = null;
      if (k != 0) {
        localApplicationMetadata = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(paramParcel1);
      }
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        a(localApplicationMetadata, str1, str2, bool);
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      b(paramParcel1.readInt());
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel1.readString();
      paramParcel1.readDouble();
      paramParcel1.readInt();
      a();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.createByteArray());
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      c(paramParcel1.readInt());
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      d(paramParcel1.readInt());
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      e(paramParcel1.readInt());
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel1.readString();
      a(paramParcel1.readLong(), paramParcel1.readInt());
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel1.readString();
      a(paramParcel1.readLong());
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      int j = paramParcel1.readInt();
      ApplicationStatus localApplicationStatus = null;
      if (j != 0) {
        localApplicationStatus = (ApplicationStatus)ApplicationStatus.CREATOR.createFromParcel(paramParcel1);
      }
      a(localApplicationStatus);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    int i = paramParcel1.readInt();
    DeviceStatus localDeviceStatus = null;
    if (i != 0) {
      localDeviceStatus = (DeviceStatus)DeviceStatus.CREATOR.createFromParcel(paramParcel1);
    }
    a(localDeviceStatus);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edk
 * JD-Core Version:    0.7.0.1
 */