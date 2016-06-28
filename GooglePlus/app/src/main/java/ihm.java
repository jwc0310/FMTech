import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.mtp.MtpDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@TargetApi(12)
public final class ihm
{
  public final Context a;
  public final ArrayList<iho> b = new ArrayList();
  public final HashMap<String, MtpDevice> c = new HashMap();
  final ArrayList<String> d = new ArrayList();
  final ArrayList<String> e = new ArrayList();
  public final BroadcastReceiver f = new ihn(this);
  private final UsbManager g;
  private final PendingIntent h;
  
  public ihm(Context paramContext)
  {
    this.a = paramContext;
    this.g = ((UsbManager)paramContext.getSystemService("usb"));
    this.h = PendingIntent.getBroadcast(this.a, 0, new Intent("com.google.android.libraries.social.ingest.action.USB_PERMISSION"), 0);
    IntentFilter localIntentFilter = new IntentFilter("com.google.android.libraries.social.ingest.action.USB_PERMISSION");
    localIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
    localIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
    localIntentFilter.addAction("com.google.android.libraries.social.ingest.action.USB_PERMISSION");
    paramContext.registerReceiver(this.f, localIntentFilter);
  }
  
  final MtpDevice a(UsbDevice paramUsbDevice)
  {
    int i = 1;
    String str = paramUsbDevice.getDeviceName();
    int j = paramUsbDevice.getInterfaceCount();
    int k = 0;
    if (k < j)
    {
      UsbInterface localUsbInterface = paramUsbDevice.getInterface(k);
      if ((localUsbInterface.getInterfaceClass() == 6) && (localUsbInterface.getInterfaceSubclass() == i) && (localUsbInterface.getInterfaceProtocol() == i)) {
        label59:
        if ((i != 0) && (!this.e.contains(str)) && (!this.d.contains(str)))
        {
          if (this.g.hasPermission(paramUsbDevice)) {
            break label130;
          }
          this.g.requestPermission(paramUsbDevice, this.h);
          this.d.add(str);
        }
      }
    }
    for (;;)
    {
      return null;
      k++;
      break;
      i = 0;
      break label59;
      label130:
      UsbDeviceConnection localUsbDeviceConnection = this.g.openDevice(paramUsbDevice);
      if (localUsbDeviceConnection != null)
      {
        MtpDevice localMtpDevice = new MtpDevice(paramUsbDevice);
        if (localMtpDevice.open(localUsbDeviceConnection))
        {
          this.c.put(paramUsbDevice.getDeviceName(), localMtpDevice);
          return localMtpDevice;
        }
        this.e.add(str);
      }
      else
      {
        this.e.add(str);
      }
    }
  }
  
  public final List<MtpDevice> a()
  {
    synchronized (this.c)
    {
      Iterator localIterator = this.g.getDeviceList().values().iterator();
      while (localIterator.hasNext())
      {
        UsbDevice localUsbDevice = (UsbDevice)localIterator.next();
        if (this.c.get(localUsbDevice.getDeviceName()) == null) {
          a(localUsbDevice);
        }
      }
    }
    ArrayList localArrayList = new ArrayList(this.c.values());
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihm
 * JD-Core Version:    0.7.0.1
 */