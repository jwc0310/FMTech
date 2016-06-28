import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import com.google.android.apps.photos.service.PhotosService;
import com.google.android.apps.plus.phone.AutoBackupPromoActivity;
import com.google.android.apps.plus.settings.InstantUploadSettingsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aqn
  extends Binder
  implements aqm
{
  public PhotosService a;
  
  public aqn()
  {
    attachInterface(this, "com.google.android.apps.photos.api.IPhotosService");
  }
  
  public aqn(PhotosService paramPhotosService)
  {
    this();
    this.a = paramPhotosService;
  }
  
  public PendingIntent a(String paramString)
  {
    g();
    long l = Binder.clearCallingIdentity();
    try
    {
      Intent localIntent = new Intent(this.a, AutoBackupPromoActivity.class);
      ((fpo)mbb.a(this.a, fpo.class)).a(this.a, localIntent, new fpp(paramString, null));
      PendingIntent localPendingIntent = PendingIntent.getActivity(this.a, 0, localIntent, 134217728);
      return localPendingIntent;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public boolean a()
  {
    g();
    long l = Binder.clearCallingIdentity();
    hba localhba = (hba)mbb.a(this.a, hba.class);
    try
    {
      boolean bool = localhba.c();
      return bool;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  /* Error */
  public String b()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 26	aqn:g	()V
    //   4: invokestatic 30	android/os/Binder:clearCallingIdentity	()J
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield 22	aqn:a	Lcom/google/android/apps/photos/service/PhotosService;
    //   12: ldc 66
    //   14: invokestatic 44	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   17: checkcast 66	hba
    //   20: invokevirtual 77	hba:e	()Ljava/util/List;
    //   23: astore 4
    //   25: aload 4
    //   27: invokeinterface 83 1 0
    //   32: istore 5
    //   34: iload 5
    //   36: ifne +9 -> 45
    //   39: lload_1
    //   40: invokestatic 63	android/os/Binder:restoreCallingIdentity	(J)V
    //   43: aconst_null
    //   44: areturn
    //   45: aload_0
    //   46: getfield 22	aqn:a	Lcom/google/android/apps/photos/service/PhotosService;
    //   49: ldc 85
    //   51: invokestatic 44	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   54: checkcast 85	giz
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 89 2 0
    //   65: checkcast 91	java/lang/Integer
    //   68: invokevirtual 94	java/lang/Integer:intValue	()I
    //   71: invokeinterface 97 2 0
    //   76: astore 6
    //   78: aload 6
    //   80: ifnull +25 -> 105
    //   83: aload 6
    //   85: ldc 99
    //   87: invokeinterface 104 2 0
    //   92: astore 7
    //   94: aload 7
    //   96: astore 8
    //   98: lload_1
    //   99: invokestatic 63	android/os/Binder:restoreCallingIdentity	(J)V
    //   102: aload 8
    //   104: areturn
    //   105: aconst_null
    //   106: astore 8
    //   108: goto -10 -> 98
    //   111: astore_3
    //   112: lload_1
    //   113: invokestatic 63	android/os/Binder:restoreCallingIdentity	(J)V
    //   116: aload_3
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	aqn
    //   7	106	1	l	long
    //   111	6	3	localObject	Object
    //   23	35	4	localList	List
    //   32	3	5	i	int
    //   76	8	6	localgjb	gjb
    //   92	3	7	str1	String
    //   96	11	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   8	34	111	finally
    //   45	78	111	finally
    //   83	94	111	finally
  }
  
  public PendingIntent c()
  {
    g();
    long l = Binder.clearCallingIdentity();
    try
    {
      Intent localIntent = new Intent(this.a, InstantUploadSettingsActivity.class);
      PendingIntent localPendingIntent = PendingIntent.getActivity(this.a, 0, localIntent, 134217728);
      return localPendingIntent;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public List<Bundle> d()
  {
    g();
    long l = Binder.clearCallingIdentity();
    try
    {
      Bundle[] arrayOfBundle = new Bundle[1];
      arrayOfBundle[0] = hcu.a(this.a);
      List localList = Arrays.asList(arrayOfBundle);
      return localList;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public void e()
  {
    g();
    long l = Binder.clearCallingIdentity();
    try
    {
      hcu.b(this.a);
      return;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  @Deprecated
  public List<String> f()
  {
    return new ArrayList();
  }
  
  public void g()
  {
    PackageManager localPackageManager = this.a.getPackageManager();
    PhotosService localPhotosService = this.a;
    int i = Binder.getCallingUid();
    if ((i != Process.myUid()) && (!PhotosService.a(localPhotosService, i, "com.google.android.gms"))) {
      throw new SecurityException("Calling UID is not authorized.");
    }
    ((frz)mbb.a(this.a, frz.class)).a(localPackageManager, "com.google.android.gms");
  }
  
  public void h()
  {
    this.a = null;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.apps.photos.api.IPhotosService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      boolean bool = a();
      paramParcel2.writeNoException();
      int i = 0;
      if (bool) {
        i = 1;
      }
      paramParcel2.writeInt(i);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      String str = b();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      PendingIntent localPendingIntent2 = c();
      paramParcel2.writeNoException();
      if (localPendingIntent2 != null)
      {
        paramParcel2.writeInt(1);
        localPendingIntent2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      PendingIntent localPendingIntent1 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localPendingIntent1 != null)
      {
        paramParcel2.writeInt(1);
        localPendingIntent1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      List localList2 = d();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(localList2);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      e();
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
      List localList1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeStringList(localList1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.apps.photos.api.IPhotosService");
    paramParcel1.readString();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(0);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqn
 * JD-Core Version:    0.7.0.1
 */